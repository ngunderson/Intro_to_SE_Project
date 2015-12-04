package HelperClasses;

import java.util.Vector;

/**
 
 @author gundersonn
 */
public class Ensemble 
{
   private Director director;
   private Vector<Person> members;
   public Vector<String> messages;
   private Vector<Event> events;
   private String name;
   
   public Ensemble( Director d, Vector<Event> e, String n )
   {
      members = new Vector<>();
      messages = new Vector<>();
      director = d;
      events = e;
      name = n;
   }
   
   public boolean createEvent( Event e )
   {  
      return events.add(e);
   }
   
   public Vector<Event> getEvents()
   {
      return events;
   }
   
   public boolean contains( Person p )
   {
      for( Person pList : members )
      {
         if( pList.equals(p))
            return true;
      }
      return false;
   }
   
   public boolean addMember( Person p )
   {
      return members.add(p);
   }
   
   @Override
   public String toString()
   {
      return name + ", Director: " + director.getName();
   }
}
