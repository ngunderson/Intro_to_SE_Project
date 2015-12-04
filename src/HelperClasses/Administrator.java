package HelperClasses;

/**
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/

/**
 
 @author gundersonn
 */
public class Administrator extends Person
{
   Administrator( String p, String u )
   {
      super( p, u );
   }
   
   public boolean createPerson( int type, String name, String password )
   {
      if ( type == 0 )//Student
      {
        
      
      }
      else if ( type == 1 )//Director
      {
         
      }
      
      else if ( type == 2 )//Admin
      {
         
      }
      return false;
   }
   
   public boolean removePerson( String name )
   {
      
   }
   
}


