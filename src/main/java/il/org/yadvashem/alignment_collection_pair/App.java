package il.org.yadvashem.alignment_collection_pair;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.stream.XMLStreamException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws XMLStreamException, IOException
    {
        

    	String ead_1 = args[0];
    	String ead_2 = args[1];
    	
    	ArchCollection col_1 = ReadEAD.readEADfile(ead_1);
    	ArchCollection col_2 = ReadEAD.readEADfile(ead_2);
    	
    	PrintTable.printComparisonTable(col_1, col_2);
    	
    }
}
