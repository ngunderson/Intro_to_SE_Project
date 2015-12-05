package HelperClasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

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
   
   public String getDate()
   {
      String formatted = new SimpleDateFormat("MM-dd-yyyy").format(time);
      return formatted;
   }
   
   public String getTime()
   {
      String formatted = new SimpleDateFormat("hh:mm a").format(time);
      return formatted;
   }
   
   @Override
   public String toString()
   {
      return name + ", Location: " + location;
   }
   
   
}
