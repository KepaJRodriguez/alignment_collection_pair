package il.org.yadvashem.alignment_collection_pair;

import java.util.HashSet;
import java.util.List;

public class AuxiliaryListMethods {

	/*
	 * remove duplicate members of a list of strings
	 */
	static List<String> removeDuplicates(List<String> arrayList) {
		HashSet<String> set = new HashSet<String>(arrayList);
		arrayList.clear();
		arrayList.addAll(set);
		return arrayList;
	}

	static String list2string (List<String> arrayList) {
		String tobeprinted = "";
		
		for (int i=0; i < arrayList.size(); i++){
			tobeprinted = tobeprinted + arrayList.get(i) + "\n";
		}
		
		return tobeprinted;
				
	}
	
	
}
