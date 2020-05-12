//Patrick Newton - 30317939 - EPOS Assignment
package Paddy;

/**
 *
 * @author Paddy
 */
public class user {
    
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String Password;
    private String LogIn;
    private String role;

    
    public user(){
   
    }
    
    public user (int employeeNumberIn, String firstNameIn, String lastNameIn, String logInIn, String passwordIn, String roleIn) 
    {
  
    Password = passwordIn;
    firstName = firstNameIn; 
    lastName = lastNameIn;
    LogIn = logInIn;
    role = roleIn;
    employeeNumber = employeeNumberIn;
    }
    //Setters
      public void setRole(String roleIn){
        
          role = roleIn;
        
      }   
        
        
       public void setPassword(String passwordIn){
        
           Password = passwordIn;
        
    }
    
    public void setFirstName(String firstNameIn){
        
        firstName = firstNameIn;
  
    }
        public void setLastName(String lastNameIn){
        
            lastName = lastNameIn;

        }
        
        public void setLogIn(String logInIn){
        
            LogIn = logInIn;

        }
        
        public void setEmployeeNumber(int employeeNumberIn)
        {           
            employeeNumber = employeeNumberIn;
        
     }

    
    
      //Getters
    
       public String getFirstName(){
            return firstName;
    }
              public String getLastName(){
            return lastName;
    }
         public String getLogIn(){
            return LogIn;
    }
              public String getPassword(){
            return Password;
    }
              
       public String getRole(){
            return role;
    }
       public int getEmployeeNumber()
       {
           return employeeNumber;
       }
       
           
    
}
