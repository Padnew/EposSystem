//Patrick Newton - 30317939 - EPOS Assignment
package Paddy;

/**
 *
 * @author Paddy
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class userDataHandler {
    
    public user getValidUser(user ACUser)
    {
        databaseUtil.isDatabaseDriversExist();
        
        try 
            {
                Connection con=databaseUtil.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery ("SELECT * FROM Users WHERE password='" + ACUser.getPassword()+ "'");
               
                rs.next();
                
                ACUser.setFirstName(rs.getString("firstname"));
                ACUser.setLastName(rs.getString("lastname"));
                ACUser.setPassword(rs.getString("password"));
                ACUser.setRole(rs.getString("Role"));
                ACUser.setEmployeeNumber(rs.getInt("employeeNumber"));
            }
         catch(SQLException e)
            {
                System.out.println("getValidUser : Error");
                System.out.println("SQL exception occured" + e);
            }
        return ACUser;
    }
    
    public boolean checkUserExists(user tempUser){
        
        boolean userExists = false;
      
         try 
            {
                Connection con=databaseUtil.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery ("SELECT * FROM Users WHERE logIn='" + tempUser.getLogIn()+ "'");
                while (rs.next()) 
                {        
                  userExists=true; 
                }
                
            }
         catch(SQLException ex)
            {
                System.out.println("checkUserIsValid : Error");
                System.out.println("SQL exception occured\n" + ex);
            }

    
    return userExists;
    }
    
    
   public void insertUser(user EXUser)
    {

         try 
            {
                Connection con=databaseUtil.getConnection();
                Statement stmt = con.createStatement();
                EXUser.getLogIn();
               
                String mySql = "INSERT INTO Users";
                mySql = mySql +  ("(firstname  , lastname , password , Role, logIn)");
                mySql = mySql +  ("VALUES (") ;
                mySql = mySql +  ("'" +    EXUser.getFirstName()    + "',") ;
                mySql = mySql +  ("'" +    EXUser.getLastName()   + "',") ;
                mySql = mySql +  ("'"  +   EXUser.getPassword() + "'," ) ; 
                mySql = mySql +  ("'" +   EXUser.getRole()   + "',") ;   
                mySql = mySql +  ("'" +  EXUser.getLogIn()   + "'") ;  
                mySql = mySql +  (")") ;     
                System.out.println("the sql  - " + mySql);
                stmt.executeUpdate(mySql);
              

            }
         catch(SQLException ex)
            {
                System.out.println("checkUserIsValid : Error");
                System.out.println("SQL exception occured\n" + ex);
            }

   
    } 
    
    public static ArrayList collectUsersName()
    {
     ArrayList<String> tempData = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://data\\Epos.accdb");
            Statement stmt = con.createStatement();
            ResultSet userResult = stmt.executeQuery("SELECT * FROM Users");
            
            while (userResult.next()) {
               tempData.add(userResult.getString("employeeNumber") + ": " + userResult.getString("logIn"));
               
               String firstname = userResult.getString("firstname");
               String lastname = userResult.getString("lastname");
               
            }
        } catch (SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
        return tempData;
    }
    
    
   
    
}
