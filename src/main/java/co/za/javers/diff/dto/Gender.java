package co.za.javers.diff.dto;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */


public class Gender {
   private long id;
   private String gender;

   public Gender(long id, String gender) {
       this.id = id;
       this.gender = gender;
   }

   public long getId() {
       return id;
   }

   public void setId(long id) {
       this.id = id;
   }

   public String getGender() {
       return gender;
   }

   public void setGender(String gender) {
       this.gender = gender;
   }
}
