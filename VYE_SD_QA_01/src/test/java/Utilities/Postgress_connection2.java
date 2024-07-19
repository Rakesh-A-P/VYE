package Utilities;
import com.jcraft.jsch.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Postgress_connection2 {

	public static Session tunnelSession = null;

    public static Connection SSHTunnellingConnection() {
        Connection conn = null;
        int localDbPort = 53569; // Local port for the database
        String localDbURL = "jdbc:postgresql://localhost:" + localDbPort + "/vye2-qa01";
        String dbUser = "postgres";
        String dbPassword = "db7YmfKPCTOjuQtC0ysd";
      
		String dbDriver = "org.postgresql.Driver";
        int dbPort = 5432; // PostgreSQL default port
        String sshRemoteHost = "vye-2-0-qa.c0ggfxqwligm.us-east-2.rds.amazonaws.com";
        String sshTunnelHost = "ec2-13-59-79-236.us-east-2.compute.amazonaws.com";
        int sshTunnelPort = 22;
        String sshTunnelUser = "ec2-user";
        String sshKey = "C:/Users/RakeshA/Downloads/eks-dyp2-qa.pem"; // Path to your SSH private key

        try {
            JSch jsch = new JSch();
            jsch.addIdentity(sshKey);
            tunnelSession = jsch.getSession(sshTunnelUser, sshTunnelHost, sshTunnelPort);
            tunnelSession.setConfig("StrictHostKeyChecking", "no");
            tunnelSession.connect();
            
            System.out.println(tunnelSession);
            System.out.println("SSH Tunnel Established="+tunnelSession.isConnected());
            
            

            // Set up port forwarding through the tunnel
         
			int assignedPort = tunnelSession.setPortForwardingL(localDbPort, sshRemoteHost, dbPort);

            // Connect to the database via the SSH tunnel
            conn = DriverManager.getConnection(localDbURL, dbUser, dbPassword);

            System.out.println("Connected to the PostgreSQL database via SSH tunnel");

        } catch (JSchException | SQLException e) {
        	  System.out.println("Failed Connection to the PostgreSQL database via SSH tunnel");

            e.printStackTrace();
        }

        return conn;
    }
}

