package HelperClasses;

import java.util.ArrayList;

/**
 
 @author gundersonn
 */
public class Ensemble 
{
   private Director director;
   private EventList events;
   private ArrayList<Person> members;
   private ArrayList<String> messages;
   private String name;
   
   public Ensemble( Director d, EventList e, String n )
   {
      director = d;
      events = e;
      name = n;
   }
   
   public boolean createEvent( Event e )
   {  
      return events.add(e);
   }
   
}
