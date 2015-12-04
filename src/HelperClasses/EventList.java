package HelperClasses;

import java.util.ArrayList;

/**
 
 @author gundersonn
 */
public class EventList 
{
   ArrayList<Event> events;
   int size;
   
   public EventList()
   {  
      events = new ArrayList<>();
      size = 0;
   }
   
   public boolean add( Event e )
   {
      return events.add(e);
   }
   
   public boolean remove( Event e )
   {  
      return events.remove(e);
   }
}
