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
   Administrator( String u, String p )
   {
      super( u, p );
   }
   
   public boolean createPerson( int type, String name, String password, MusicNetwork network )
   {
      if ( type == 0 )//Student
      {
         Person p = new Student(name, password);
         return network.addPerson(p);
      }
      else if ( type == 1 )//Director
      {
         Person p = new Director(name, password);
         return network.addPerson(p);
      }
      
      else if ( type == 2 )//Admin
      {
         Person p = new Administrator(name, password);
         return network.addPerson(p);
      }
      return false;
   }
   
   public boolean removePerson( Person p, MusicNetwork network )
   {
      return network.removePerson(p);
   }
   
}


