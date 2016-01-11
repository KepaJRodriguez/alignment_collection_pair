package il.org.yadvashem.alignment_collection_pair;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class ReadEAD {

	public static ArchCollection readEADfile(String ead_file)
			throws FileNotFoundException, XMLStreamException {

		ArchCollection col = new ArchCollection();

		// File xmlFile = new File (ead_file);

		FileInputStream fileInputStream = new FileInputStream(ead_file);
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		XMLStreamReader xmlStreamReader = inputFactory
				.createXMLStreamReader(fileInputStream);

		boolean scopecontent = false;
		boolean bioghist = false;
		boolean odd = false;
		boolean langmaterial = false;

		boolean collection_level = true;
		String textContent = "";

		while (xmlStreamReader.hasNext()) {
			int event = xmlStreamReader.next();
			switch (event) {

			case XMLStreamConstants.START_ELEMENT:
				switch (xmlStreamReader.getLocalName()) {
				case "dsc":
					collection_level = false;
					break;
				case "scopecontent":
					scopecontent = true;
					break;
				case "bioghist":
					bioghist = true;
					break;
				case "odd":
					odd = true;
					break;
				case "langmaterial":
					langmaterial = true;
					break;

				case "language":
					if (langmaterial == true) {
						String lang = xmlStreamReader.getAttributePrefix(0);
						col.LANG_MAT.add(lang);
					}
					break;

				}
				break;

			case XMLStreamConstants.CHARACTERS:
				textContent = xmlStreamReader.getText();
				break;

			case XMLStreamConstants.END_ELEMENT:
				switch (xmlStreamReader.getLocalName()) {
				case "p":
					if (scopecontent == true) {
						col.SCOPE_CONTENT.add(textContent);
					}
					if (bioghist == true) {
						col.BIOGHIST = textContent;
					}
					if (odd == true) {
						col.ODD.add(textContent);
					}
					break;

				case "unittitle":
					if (collection_level == true) {
						col.TITLE_COLLECTION = textContent;
					} else {
						col.TITLES_RECORDS.add(textContent);
					}
					break;

				case "geogname":
					col.AP_PLACES.add(textContent);
					break;

				case "corpname":
					col.AP_ORGANIZATION.add(textContent);
					break;

				case "subject":
					col.AP_SUBJECTS.add(textContent);
					break;
				case "scopecontent":
					scopecontent = false;
					break;
				case "bioghist":
					bioghist = false;
					break;
				case "odd":
					odd = false;
					break;
				case "langmaterial":
					odd = false;
					break;

				case "physdesc":
					if (collection_level == true) {
						col.PHYSDESC = textContent;
					}
					break;

				case "custodhist":
					if (collection_level == true) {
						col.CUSTODHIST = textContent;
					}
					break;

				}

			}

		}

		return col;
	}

}
