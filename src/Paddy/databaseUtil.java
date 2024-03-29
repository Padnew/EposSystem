//Patrick Newton - 30317939 - EPOS Assignment
package Paddy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class databaseUtil {
    
    private static Connection theConnection=null;
    private static final String DATAFOLDER="data"; 
    private static final String DATAFILENAME="Epos.accdb"; 
    private static final String CONNECTIONSTRING = "jdbc:ucanaccess://" + DATAFOLDER + "\\" + DATAFILENAME; 
    private static final String DATABASEDRIVERCLASS="net.ucanaccess.jdbc.UcanaccessDriver";
    
    public static boolean isDatabaseDriversExist(){
    //Check to see if the drivers exist
      boolean exist=false;
       
        try 
            {
                Class.forName(DATABASEDRIVERCLASS);
                exist=true;
                System.out.println("ucanaccess drivers found ");
            } 
        catch(ClassNotFoundException e) 
            {
                System.out.println("ucanaccess drivers NOT found "+ e.getMessage());
            }
       return exist;

    
}
    
    
    
    public static Connection getConnection()
    //gets the connection object if it exists otherwise gets a new one.
    {
        if (theConnection != null) return theConnection; 
        return getANewConnection();
    }

    private static Connection getANewConnection() 
    //creates and returns a new connection to the database
    {
        try
        {
            Class.forName(DATABASEDRIVERCLASS);
            theConnection = DriverManager.getConnection (CONNECTIONSTRING); 
        }
      
        catch (SQLException ex) 
        {
            System.out.println("SQL exception occured\n" + ex);
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Class not found exception occured\n" + ex);
        }

        return theConnection;        
    }
}

