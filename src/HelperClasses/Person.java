package HelperClasses;

import java.util.Vector;

/**
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/

/**
 
 @author gundersonn
 */
public class Person 
{
   protected String password;
   protected String username;
   
   public Person( String u, String p )
   {
      username = u;
      password = p;
   }
   
   public void joinEnsemble( Ensemble en )
   {
      
   }
   
   public void joinEvent( Event ev )
   {
      
   }
   
   public boolean login( String u, String p )
   {
      return u == username && p == password;
   }
   
   public Vector<Ensemble> viewEnsembles( MusicNetwork network )
   {
      return network.ensemblesFor( this );
   }
   
   public Vector<Event> viewEvents( MusicNetwork network )
   {
      return network.eventsFor(this);
   }
   
   public String getName()
   {
      return username;
   }
   
   @Override
   public boolean equals( Object x )
   {
      if ( x instanceof Person )
      {
         Person p = (Person)x;
         if ( p.username.equals(username) && p.password.equals(password) )
            return true;
      }
      return false;
   }
}
