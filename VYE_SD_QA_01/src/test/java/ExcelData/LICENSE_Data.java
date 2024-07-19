package ExcelData;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import Utilities.License_Taxonomy_Logic;



public class LICENSE_Data {
	
	public  String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getDob() {
		return dob;
	}
	public String getSsn() {
		return ssn;
	}
	
	public String getNpi() {
		return npi;
	}
	public String getBuisness_name() {
		return buisness_name;
	}
	
	
	String dyp_taxonomy;
	String last_name;
	String first_name;
	String dob;
	String ssn=null;
	String npi=null;
	String buisness_name=null;
	String taxonomy_val;
	String expiry_date,issue_date;
	String license_number=null;
	HashMap<String,String> taxonomy= new HashMap<String,String>();
	HashMap<String,String> ProgramParticipation= new HashMap<String,String>();
	LICENSE_Data(String fn,String ln,String dob,String ssn,String npi,String buisness_name){
		this.first_name=fn;
		this.last_name=ln;
		this.dob=dob;
		this.ssn=ssn;
		this.npi=npi;
		this.buisness_name=buisness_name;
		
	}
	
	
	
	
	LICENSE_Data(String first_name,String last_name,String issue_date,String expiry_date,String license_number){
		this.first_name=first_name;
		this.last_name=last_name;
		this.issue_date=issue_date;
		this.expiry_date=expiry_date;
		this.license_number=license_number;
		
	}
	
	
	
	public String getDyp_taxonomy() {
		return dyp_taxonomy;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public HashMap<String, String> getTaxonomy() {
		return taxonomy;
	}
	LICENSE_Data(String dyp_taxonomy,String issue_date,String expiry_date,String license_number) throws InterruptedException, FileNotFoundException, IOException{
		taxonomy.put("CHIROPRACTIC", "Chiropractic");
		taxonomy.put("MENTAL_HEALTH", "MENTAL_HEALTH");
		taxonomy.put("Hospital", "Hospitals & Units");
		taxonomy.put("Audiology", "Audiology");
		taxonomy.put("Podiatry", "Podiatry");
		taxonomy.put("Home Health and Hospice", "Clinics");
		
		ProgramParticipation.put("Hospitals & Units","Medicaid/CHIP");
		ProgramParticipation.put("Clinics","Health Home");
		
		
		
		
		
		
		//this.dyp_taxonomy=dyp_taxonomy;
		System.out.println(dyp_taxonomy);
		String selectSpeciality=taxonomy.get(dyp_taxonomy);
		String selectpp= ProgramParticipation.get(selectSpeciality);
		System.out.println("Value is="+selectSpeciality);
		this.taxonomy_val=selectSpeciality;
		License_Taxonomy_Logic ob =new License_Taxonomy_Logic(selectSpeciality,selectpp,issue_date,expiry_date,license_number);
		ob.License_Taxonomy_DataPass(selectSpeciality, selectpp,issue_date, expiry_date, license_number);
		
	}
	
	

	public String getTaxonomy_val() {
		return taxonomy_val;
	}
	
	
	
	
	

	

}



