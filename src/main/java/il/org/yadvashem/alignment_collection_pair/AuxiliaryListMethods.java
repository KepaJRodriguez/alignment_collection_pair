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
	
}
