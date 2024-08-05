package com.PageObjectManager.Trading_Partner;

import com.Pages.TP.*;

import org.openqa.selenium.WebElement;




public class PageObjectManager {

	
    private TP_01_Identifying_Information_Page TP_01_Identifying_Information_Page;
    private TP_02_Classification_Page TP_02_Classification_Page;
    private TP_03_Provider_Identifiers_Page TP_03_Provider_Identifiers_Page;
     private TP_04_Ownership_Page TP_04_Ownership_Page;
    private TP_05_KeyPersonal_Page TP_05_KeyPersonal_Page;
    private TP_06_Exclusion_Sanction_page TP_06_Exclusion_Sanction_page;
    private TP_07_Upload_Document_page TP_07_Upload_Document_page;
    private TP_08_Authorized_Signature_Page TP_08_Authorized_Signature_Page;
    private TP_09_Affiliation_Page TP_09_Affiliation_Page;
    private TP_10_Provider_Agreement_Page TP_10_Provider_Agreement_Page;
    private TP_11_Summary_Page TP_11_Summary_Page;
    private TP_12_Proceed_to_signin_page TP_12_Proceed_to_signin_page;

 
	
	
	public TP_01_Identifying_Information_Page getTP_01_Identifying_Information_Page() {
		return (TP_01_Identifying_Information_Page==null)? TP_01_Identifying_Information_Page=new TP_01_Identifying_Information_Page():TP_01_Identifying_Information_Page;
	}
	public TP_02_Classification_Page getTP_02_Classification_Page() {
		return (TP_02_Classification_Page==null)? TP_02_Classification_Page=new TP_02_Classification_Page():TP_02_Classification_Page;
	}
	public TP_03_Provider_Identifiers_Page getTP_03_Provider_Identifiers_Page() {
		return (TP_03_Provider_Identifiers_Page==null)? TP_03_Provider_Identifiers_Page=new TP_03_Provider_Identifiers_Page():TP_03_Provider_Identifiers_Page;
	}
	public TP_04_Ownership_Page getTP_04_Ownership_Page() {
   		return (TP_04_Ownership_Page==null)? TP_04_Ownership_Page=new TP_04_Ownership_Page():TP_04_Ownership_Page;
   	} 
	public TP_05_KeyPersonal_Page getTP_05_KeyPersonal_Page() {
   		return (TP_05_KeyPersonal_Page==null)? TP_05_KeyPersonal_Page=new TP_05_KeyPersonal_Page():TP_05_KeyPersonal_Page;
   	} 
	public TP_06_Exclusion_Sanction_page getTP_06_Exclusion_Sanction_page() {
   		return (TP_06_Exclusion_Sanction_page==null)? TP_06_Exclusion_Sanction_page=new TP_06_Exclusion_Sanction_page():TP_06_Exclusion_Sanction_page;
   	} 
	public TP_07_Upload_Document_page getTP_07_Upload_Document_page() {
   		return (TP_07_Upload_Document_page==null)? TP_07_Upload_Document_page=new TP_07_Upload_Document_page():TP_07_Upload_Document_page;
   	} 
	public TP_08_Authorized_Signature_Page getTP_08_Authorized_Signature_Page() {
   		return (TP_08_Authorized_Signature_Page==null)? TP_08_Authorized_Signature_Page=new TP_08_Authorized_Signature_Page():TP_08_Authorized_Signature_Page;
   	} 
	public TP_09_Affiliation_Page getTP_09_Affiliation_Page() {
   		return (TP_09_Affiliation_Page==null)? TP_09_Affiliation_Page=new TP_09_Affiliation_Page():TP_09_Affiliation_Page;
   	} 
	public TP_10_Provider_Agreement_Page getTP_10_Provider_Agreement_Page() {
   		return (TP_10_Provider_Agreement_Page==null)? TP_10_Provider_Agreement_Page=new TP_10_Provider_Agreement_Page():TP_10_Provider_Agreement_Page;
   	} 
	public TP_11_Summary_Page getTP_11_Summary_Page() {
   		return (TP_11_Summary_Page==null)? TP_11_Summary_Page=new TP_11_Summary_Page():TP_11_Summary_Page;
   	} 
	public TP_12_Proceed_to_signin_page getTP_12_Proceed_to_signin_page() {
   		return (TP_12_Proceed_to_signin_page==null)? TP_12_Proceed_to_signin_page=new TP_12_Proceed_to_signin_page():TP_12_Proceed_to_signin_page;
   	} 

	
}