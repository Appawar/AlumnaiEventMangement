package studentEventConfig;

import java.io.*;
import java.util.*;

 

import java.sql.*;

 

public class DBConfig {
	private static Connection conn;
	 private static PreparedStatement stmt;
	 private static ResultSet rs;
	 private static DBConfig db=null;

 
	 

	private DBConfig() {
		try {
			Properties p = new Properties();
			p.load(PathHelper.fis);
           // System.out.println(PathHelper.fis);            // Access path hare
			
			
		/*----------------------------Database Properties----------------------------*/	
			System.out.println("______________________________________________________");
			
            System.out.println("---------------Database properties here---------------\n");
            String DriverClassName = p.getProperty("driver.classname");
			String Username = p.getProperty("db.username");
			String Password = p.getProperty("db.password");
			String Url = p.getProperty("db.url");
			System.out.println("Driver class name is-->  "+DriverClassName+"\n"+"Database username is-->  "+Username+"\n"+"Database password is-->  "+Password+"\n"+"Database Url is------->  "+Url);
           
			System.out.println("______________________________________________________");
			
			
         /*---------------------------Database connection-----------------------------*/ 
           
            System.out.println("--------------Database Connection Status--------------\n");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(Url, Username, Password);
            if(conn != null) {
            	System.out.println("Database is connected....");
            }
            else {
            	System.out.println("Database is not connected please cheak connection....");
            }
            System.out.println("______________________________________________________");
            
            
		} catch (Exception e) {
			System.out.println("Database configration exception " + e);
		}
	}
/*********************************************************************************/
     public static DBConfig getDBConfigration() {
    	 if(db == null) {
    		 db = new DBConfig();
    	 }
    	 return db;
     }
     
     public static Connection getConnection() {
 		return conn;
 	}
 	public static PreparedStatement getPreparedStatement()
 	{
 		return stmt;
 	}
 	public static ResultSet getResultSet() {
 		return rs;
 	}

/*********************************************************************************/
     
     
}
