package ExcelData;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import Utilities.Postgress_connection2;

public class meddataform_DB {
	private ArrayList<String> First_name;
	private ArrayList<String> Last_name;
	private ArrayList<String> Business_name;
	private ArrayList<String> Dob ;
	private ArrayList<String> Ssn ;
	private ArrayList<String> Npi ;
	private ArrayList<String> SsnP ;
	private ArrayList<String> NpiP ;
//	private String First_name;
//	private String Last_name;
//	private String Dob;
//	private String Ssn;
//	private String Npi;
//	private String Business_name;
//	private String SsnP;
//	private String NpiP;
	ResultSet rs = null;
	
	public meddataform_DB() {
		
		First_name = new ArrayList<String>();
		Last_name = new ArrayList<String>();
		Business_name = new ArrayList<String>();
		Dob = new ArrayList<String>();
		Ssn = new ArrayList<String>();
		Npi = new ArrayList<String>();
		SsnP = new ArrayList<String>();
		NpiP = new ArrayList<String>();
		
		// TODO Auto-generated constructor stub
		Postgress_connection2 connection = new Postgress_connection2();
		Connection conn = connection.SSHTunnellingConnection();

		try {

			Statement stmt = conn.createStatement();
			String query = "Select * from datasource_private.med where first_name is  NOT null ORDER BY id ASC";
			this.rs = stmt.executeQuery(query);
			while (rs.next()) {
//				First_name = rs.getString("first_name");
//			Last_name=rs.getString("last_name");
////				//Business_name=rs.getString("business_name");
//              	Dob=rs.getString("dob");
//				Ssn=rs.getString("ssn");
//				Npi=rs.getString("npi");
				
				First_name.add(rs.getString("first_name"));
				Last_name.add(rs.getString("last_name"));
				//Business_name.add(rs.getString("business_name"));
				Dob.add(rs.getString("dob"));
				Ssn.add(rs.getString("ssn"));
				Npi.add(rs.getString("npi"));
				
//				
//				
			}
				
				String query1 = "Select * from datasource_private.med \r\n"
						+ "	where first_name is  null\r\n"
						+ "	ORDER BY id ASC";
				this.rs = stmt.executeQuery(query1);
				while (rs.next()) {
				
			
					Business_name.add(rs.getString("business_name"));
					SsnP.add(rs.getString("ssn"));
					NpiP.add(rs.getString("npi"));
					
				
				
			}
			conn.close();
			Postgress_connection2.tunnelSession.disconnect();
		}

		catch (Exception e) {
			// TODO: handle exception

			System.out.println("Not able to Fetch the med Data from datasource.med table");
			e.printStackTrace();
		}

	}

	public ArrayList<String> getFirst_name() {

		return First_name;

	}
          
//	 public String getName(int index) {
//		return name;
//	}
	public ArrayList<String> getLast_name() {
		return Last_name;
	}

	public ArrayList<String> getBusiness_name() {
		return Business_name;
	}

	public ArrayList<String> getDob() {
		return Dob;
	}

	public ArrayList<String> getSsn() {
		return Ssn;
	}

	public ArrayList<String> getNpi() {
		return Npi;
	}
	public ArrayList<String> getNpiP() {
		return NpiP;
	}
	public ArrayList<String> getSsnP() {
		return SsnP;
	}
	public ResultSet getRs() {
		return rs;
	}

	/**
	 * public void LicenseData() {
	 * 
	 * Postgres_connection2 connection= new Postgres_connection2(); Connection conn=
	 * connection.SSHTunnellingConnection();
	 * 
	 * try {
	 * 
	 * Statement stmt= conn.createStatement(); String query= "Select * from
	 * datasource.licenses"; this.rs= stmt.executeQuery(query); while(rs.next()) {
	 * ProviderName=rs.getString("full_name");
	 * license_number=rs.getString("license_number");
	 * license_state=rs.getString("license_state");
	 * issue_date=rs.getString("issue_date");
	 * expiry_date=rs.getString("issue_date"); System.out.println("Provider
	 * Name="+ProviderName); System.out.println("License Number="+license_number);
	 * System.out.println("License state="+license_state);
	 * System.out.println("License Issue Date="+issue_date);
	 * System.out.println("License Expiry Date="+expiry_date); }
	 * 
	 * 
	 * conn.close(); Postgres_connection2.tunnelSession.disconnect(); }
	 * 
	 * catch (Exception e) { // TODO: handle exception
	 * 
	 * System.out.println("Not able to Fetch the License Data from
	 * datasource.License table"); e.printStackTrace(); }
	 * 
	 * } public static void main(String[] args) {
	 * 
	 * //LicenseFromDB ob= new LicenseFromDB(); //ob.LicenseData(); }
	 * 
	 **/

}
