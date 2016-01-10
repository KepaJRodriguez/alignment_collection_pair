package il.org.yadvashem.alignment_collection_pair;

import java.util.ArrayList;
import java.util.List;

public class ArchCollection {

	// Provisional data structure. 
	// Later in the system it will be improved with named entity extraction
	// and topic recognition
	
	String TITLE_COLLECTION = "";
	List<String> TITLES_RECORDS = new ArrayList<String>();
	List<String> AP_PLACES = new ArrayList<String>();
	List<String> AP_PERSON = new ArrayList<String>();
	List<String> AP_ORGANIZATION = new ArrayList<String>();
	List<String> AP_SUBJECTS = new ArrayList<String>();
	List<String> SCOPE_CONTENT = new ArrayList<String>();
	String CUSTODHIST = "";
	String PHYSDESC = "";
	
	// setters
	public void setTitleCollection(String tc){
		TITLE_COLLECTION =  tc;
	}
	public void setTitlesRecords (ArrayList<String> tr){
		TITLES_RECORDS = tr;
	}
	public void setAccessPlaces (ArrayList<String> ap){
		AP_PLACES = ap;
	}
	public void setAccessPerson (ArrayList<String> ap){
		AP_PERSON = ap;
	}
	public void setAccessOrganization (ArrayList<String> ap){
		AP_ORGANIZATION = ap;
	}
	public void setSubjects (ArrayList<String> sub){
		AP_SUBJECTS = sub;
	}
	public void setScopeContent (ArrayList<String> sc){
		SCOPE_CONTENT = sc;
	}
	public void setCustodHist(String ch){
		CUSTODHIST =  ch;
	}
	public void setPhysDesc(String tc){
		PHYSDESC =  tc;
	}
	
	
	//getters
	public String getTitleCollection(){
		return TITLE_COLLECTION;
	}
	public List<String> getTitlesRecords(){
		return TITLES_RECORDS;
	}
	public List<String> getAccessPlaces(){
		return AP_PLACES;
	}
	public List<String> getAccessPerson(){
		return AP_PERSON;
	}
	public List<String> getAccessOrganization(){
		return AP_ORGANIZATION;
	}
	public List<String> getAccessSubjects(){
		return AP_SUBJECTS;
	}
	public List<String> getScopeContent(){
		return SCOPE_CONTENT;
	}
	public String getCustodHist(){
		return CUSTODHIST;
	}
	public String getPhysDesc(){
		return PHYSDESC;
	}


	
}
