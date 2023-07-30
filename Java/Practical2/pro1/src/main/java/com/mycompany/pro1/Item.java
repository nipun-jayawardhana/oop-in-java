
package com.mycompany.pro1;


public class Item {
    private int location;
    private String description;
 
   //constructor
    public Item(int lo,String d){
       location    =lo;
       description =d;
       
   } 
   
   public void setlocation(int lo)
   {
       location=lo;
   }
    
   public int getlocation()
   {
       return location;
   } 
   
   public void setdescription(String d)
   {
        description= d;
   }

   public String getdescription()
   {
       return description;
   }




}





