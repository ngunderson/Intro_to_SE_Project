package HelperClasses;

import java.util.ArrayList;
import java.util.Date;

/**
 
 @author gundersonn
 */
public class Event 
{
   private String location;
   private String name;
   private Date time;
   public ArrayList<String> messages;
   
   public Event( String location, String name, Date time )
   {  
      this.location = location;
      this.name = name;
      this.time = time;
      this.messages = new ArrayList<>();
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
   
   
   
}
