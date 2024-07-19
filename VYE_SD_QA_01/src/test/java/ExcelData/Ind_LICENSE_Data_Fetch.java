package ExcelData;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Utilities.Postgress_connection2;


public class Ind_LICENSE_Data_Fetch extends Postgress_connection2{
	
	Postgress_connection2 connection;
	Connection conn=null;
	List<LICENSE_Data> Licenselist;
	List<LICENSE_Data> Licenselist_Own_Key;
	String dyp_taxonomy;
	String license_number=null;
	String license_state=null;
	String issue_date=null;
	String expiry_date=null;
	String ProviderName=null;
	String first_name,last_name;
	ResultSet rs=null;
	
	public Ind_LICENSE_Data_Fetch() {
		// TODO Auto-generated constructor stub
		connection= new Postgress_connection2();
		conn=Postgress_connection2.SSHTunnellingConnection();
		this.Licenselist=new ArrayList<>();
		this.Licenselist_Own_Key=new ArrayList<>();
		
		
	}
	public Ind_LICENSE_Data_Fetch(String dyp_taxonomy) {
		// TODO Auto-generated constructor stub
		connection= new Postgress_connection2();
		conn=Postgress_connection2.SSHTunnellingConnection();
		this.Licenselist=new ArrayList<>();
		this.dyp_taxonomy=dyp_taxonomy;
		
	}
	
	public List<LICENSE_Data> FetchLicenseFromDBForOwnerShipandKerPersonel() {
		
		
    	try {
    		
    		Statement stmt= conn.createStatement();
    		String query= "Select * from datasource.licenses_south_dakota where board='"+this.dyp_taxonomy+"' LIMIT 3";
    		this.rs= stmt.executeQuery(query);
    		while(rs.next()) {
    			first_name=rs.getString("first_name");
    			last_name=rs.getString("last_name");
    			issue_date=rs.getString("issue_date");
    			expiry_date=rs.getString("expiry_date");
    			license_number=rs.getString("license_number");
    			System.out.println("first_name ="+first_name);
    			System.out.println("Last_name ="+last_name);
    			System.out.println("License Issue Date="+issue_date);
    			System.out.println("License Expiry Date="+expiry_date);
    			System.out.println("License Number="+license_number);
    			
    			LICENSE_Data ob =new LICENSE_Data(first_name,last_name,issue_date,expiry_date,license_number);
    	    	Licenselist_Own_Key.add(ob);
    		}
    		
    		
    		conn.close();	
    		Postgress_connection2.tunnelSession.disconnect();
		
	}
    	
    	catch(Exception e) {
    		System.out.println("Not able to Fetch the License Data from datasource.License table");
			e.printStackTrace();
    	}
    	//String fn,String ln,String dob,String ssn,String npi,String buisness_name
    	
    	
    	return Licenselist_Own_Key;
	}

	public List<LICENSE_Data> LicenseFromDB() throws InterruptedException, FileNotFoundException, IOException {
		
		// TODO Auto-generated constructor stub		
    	
		System.out.println("DYP Taxonomy is ="+this.dyp_taxonomy);
    
		try {
    		
    	

    		String query="";
    					query = String.format(
    						    "SELECT " +
    						    "    datasource.licenses_south_dakota.license_number, " +
    						    "    datasource.license_board_mapping.dyp_taxonomy, " +
    						    "    datasource.licenses_south_dakota.issue_date, " +
    						    "    datasource.licenses_south_dakota.expiry_date " +
    						    "FROM " +
    						    "    datasource.license_board_mapping " +
    						    "INNER JOIN " +
    						    "    datasource.licenses_south_dakota " +
    						    "ON " +
    						    "    datasource.license_board_mapping.vyp_license_board = datasource.licenses_south_dakota.board " +
    						    "WHERE " +
    						    "    datasource.license_board_mapping.dyp_taxonomy = '%s' " +  // Insert placeholder for boardType
    						    "    AND datasource.licenses_south_dakota.issue_date IS NOT NULL " +
    						    "    AND datasource.licenses_south_dakota.expiry_date IS NOT NULL " +
    						    "ORDER BY " +
    						    "    datasource.licenses_south_dakota.issue_date " +
    						    "LIMIT 1;",
    						    this.dyp_taxonomy);  // Pass boardType as an argument to String.format()
    		
    		
    		
    		/**
    	
    		if(this.vyp_license_board.equalsIgnoreCase("FACILITY")) {
       		 query="SELECT dyp_taxonomy FROM datasource.license_board_mapping \r\n"
     				+ "where vyp_license_board='"+this.vyp_license_board+"' and state='SOUTH DAKOTA'\r\n"
     				+ "ORDER BY id ASC LIMIT 1 OFFSET 1";
    		}
    		
    		else {
    			
       		 query="SELECT dyp_taxonomy FROM datasource.license_board_mapping \r\n"
     				+ "where vyp_license_board='"+this.vyp_license_board+"' and state='SOUTH DAKOTA'\r\n"
     				+ "ORDER BY id ASC LIMIT 1";
    		}
    		
    	
    		**/
	
	
	
	
    		 Statement stmt = conn.createStatement();
 		    
 		    // Execute the query
 		    ResultSet rs = stmt.executeQuery(query);
 		    System.out.println(query);
 		    // Check if ResultSet has data
 		    if (!rs.next()) {
 		        System.out.println("No data found for query.");
 		    } else {
 		        // Process the ResultSet
 		        do {
 		        	
 		            String licenseNumber = rs.getString("license_number");
 		            System.out.println("License Number: " + licenseNumber);
 		            String dyp_taxonomy = rs.getString("dyp_taxonomy");
 		            String issueDate = rs.getString("issue_date");
 		            String expiryDate = rs.getString("expiry_date");
 		            
 		            // Output or process data as needed
 		            System.out.println("License Number: " + licenseNumber);
 		            System.out.println("Taxonomy: " + dyp_taxonomy);
 		            System.out.println("Issue Date: " + issueDate);
 		            System.out.println("Expiry Date: " + expiryDate);
 		            
 		            LICENSE_Data ob= new LICENSE_Data(dyp_taxonomy,issueDate,expiryDate,licenseNumber);
 	    			Licenselist.add(ob);
 	    			System.out.println("License List="+Licenselist.get(0).getTaxonomy_val());
 	    			
 	    			
 		        } while (rs.next());
 		        
 		        
 		    }
		    
		    // Close ResultSet and PreparedStatement
		    rs.close();
		    stmt.close();
		    
		} catch (SQLException ex) {
		    ex.printStackTrace();
		    // Handle SQL exception
		} finally {
		    // Close connection if necessary
		    try {
		        if (conn != null && !conn.isClosed()) {
		            conn.close();
		        }
		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }
		}
		
		

	
	
/**
    		System.out.println("Query is="+query);
    		PreparedStatement stmt= conn.prepareStatement(query);
    		stmt.setString(1, "PODIATRY");
    		this.rs= stmt.executeQuery(query);
    		System.out.println("Result Set="+this.rs);
    		
    		if (!rs.isBeforeFirst()) {
                System.out.println("ResultSet is empty");
            }
    		
    		else {
    			  System.out.println("ResultSet is not empty");
    		}
    		while(rs.next()) {
    			System.out.println("Hello World");
    			String dyp_taxonomy = rs.getString("dyp_taxonomy");
    			String issue_date = rs.getString("issue_date");
    			String expiry_date = rs.getString("expiry_date");
    			String license_number = rs.getString("license_number");
    			System.out.println("Taxonomy Speciality Name="+dyp_taxonomy);
    			System.out.println("Taxonomy License Number="+license_number);
    			System.out.println("Taxonomy Issue date="+issue_date);
    			System.out.println("Taxonomy Expiry date="+expiry_date);
    			LICENSE_Data ob= new LICENSE_Data(dyp_taxonomy,issue_date,expiry_date,license_number);
    			Licenselist.add(ob);
    			System.out.println("License List="+Licenselist.get(0).getTaxonomy_val());

    		}
    		
    		rs.close();
    		conn.close();	
           Postgres_connection2.tunnelSession.disconnect();
           
         
    	}
    	
    	catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Not able to Fetch the License Data from datasource.license_board_mapping table");
			e.printStackTrace();
		}
		
		**/
		return Licenselist;	
		
	}
	
	
	public List<LICENSE_Data> getLicenseList(){
		
		return Licenselist;
	}
	
	public List<LICENSE_Data> getLicenseKeyPersonelandOwnerShip(){
		
		return Licenselist_Own_Key;
	}
	public String getLicense_number() {
		return license_number;
	}
	public String getLicense_state() {
		return license_state;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public String getProviderName() {
		return ProviderName;
	}
	public ResultSet getRs() {
		return rs;
	}

}

