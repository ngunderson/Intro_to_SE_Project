package HelperClasses;

import java.util.Vector;
import java.util.Date;

/**
 
 @author gundersonn
 */
public class Event 
{
   private String location;
   private String name;
   private Date time;
   public Vector<String> messages;


   
   
   public Event( String location, String name, Date time )
   {  
      this.location = location;
      this.name = name;
      this.time = time;
      this.messages = new Vector<>();
   }
   
   public String getLocation()
   {  
      return location;
   }
   
   public String getName()
   {  
      return name;
   }
   
   public String getTime()
   {
      return time.toString();
   }
   @Override
   public String toString()
   {
      return name + "Location: " + location;
   }
   
   
}
