package il.org.yadvashem.alignment_collection_pair;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class PrintTable {

	public static void printComparisonTable(ArchCollection col_1,
			ArchCollection col_2) throws IOException {

		String new_csv = "comparison_tables.csv";

		CSVWriter writer = new CSVWriter(new FileWriter(new_csv), '\t');
		String header = "Field#YV_Collection#NIOD_Collection";

		String[] header_line = header.split("#");
		writer.writeNext(header_line);

		String line = "";
		String[] nextRow;

		line = "Title collection" + "#" + col_1.TITLE_COLLECTION + "#"
				+ col_2.TITLE_COLLECTION;
		nextRow = line.split("#");
		writer.writeNext(nextRow);
		
		line = "Custodhist" + "#" + col_1.CUSTODHIST + "#"
				+ col_2.CUSTODHIST;
		nextRow = line.split("#");
		writer.writeNext(nextRow);
		
		line = "Bioghist" + "#" + col_1.BIOGHIST + "#"
				+ col_2.BIOGHIST;
		nextRow = line.split("#");
		writer.writeNext(nextRow);
		
		line = "Physdesc" + "#" + col_1.PHYSDESC + "#"
				+ col_2.PHYSDESC;
		nextRow = line.split("#");
		writer.writeNext(nextRow);
		
		line = "ODD" + "#"
				+ AuxiliaryListMethods.list2string(AuxiliaryListMethods.removeDuplicates(col_1.ODD)) + "#"
				+ AuxiliaryListMethods.list2string(AuxiliaryListMethods.removeDuplicates(col_2.ODD));
		nextRow = line.split("#");
		writer.writeNext(nextRow);

		line = "Languages of material" + "#"
				+ AuxiliaryListMethods.list2string(AuxiliaryListMethods.removeDuplicates(col_1.LANG_MAT)) + "#"
				+ AuxiliaryListMethods.list2string(AuxiliaryListMethods.removeDuplicates(col_2.LANG_MAT));
		nextRow = line.split("#");
		writer.writeNext(nextRow);


		line = "Access Points PLACES" + "#"
				+ AuxiliaryListMethods.list2string(AuxiliaryListMethods.removeDuplicates(col_1.AP_PLACES)) + "#"
				+ AuxiliaryListMethods.list2string(AuxiliaryListMethods.removeDuplicates(col_2.AP_PLACES));
		nextRow = line.split("#");
		writer.writeNext(nextRow);

		line = "Access Points PEOPLE" + "#"
				+ AuxiliaryListMethods.list2string(col_1.AP_PERSON) + "#"
				+ AuxiliaryListMethods.list2string(col_2.AP_PERSON);
		nextRow = line.split("#");
		writer.writeNext(nextRow);
		
		line = "Access Points ORGANIZATIONS" + "#"
				+ AuxiliaryListMethods.list2string(AuxiliaryListMethods.removeDuplicates(col_1.AP_ORGANIZATION)) + "#"
				+ AuxiliaryListMethods.list2string(AuxiliaryListMethods.removeDuplicates(col_2.AP_ORGANIZATION));
		nextRow = line.split("#");
		writer.writeNext(nextRow);
		
		line = "Access Points SUBJECTS" + "#"
				+ AuxiliaryListMethods.list2string(AuxiliaryListMethods.removeDuplicates(col_1.AP_SUBJECTS)) + "#"
				+ AuxiliaryListMethods.list2string(AuxiliaryListMethods.removeDuplicates(col_2.AP_SUBJECTS));
		nextRow = line.split("#");
		writer.writeNext(nextRow);
		
		line = "Titles lower levels" + "#"
				+ AuxiliaryListMethods.list2string(col_1.TITLES_RECORDS) + "#"
				+ AuxiliaryListMethods.list2string(col_2.TITLES_RECORDS);
		nextRow = line.split("#");
		writer.writeNext(nextRow);
		
		
		
		writer.close();
	}

}
