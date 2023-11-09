package com.applicationapi.domains;

import org.springframework.data.annotation.Id;
// import org.springframework.data.annotation.PersistenceConstructor;
// import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

// import java.util.Date;


@Document
public class Application {

  @Id
  private String id;
//   private Website provider_site;
//   company: Company,
//   private Date application_date;
//   private String phone_number;
 private String contact;
//   private String motivation_letter_location;
//   private Date start_date;
//   private Date relaunch_date;
//   private Date end_date;
//   status: ApplicationStatus,
public Application(String id, String contact) {
    this.id = id;
    this.contact = contact;
}
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getContact() {
    return contact;
}
public void setContact(String contact) {
    this.contact = contact;
}
@Override
public String toString() {
    return "Application [id=" + id + ", contact=" + contact + "]";
}





    // public Application(String id, Date application_date, String phone_number, String contact,
    //         String motivation_letter_location, Date start_date, Date relaunch_date, Date end_date) {
    //     this.id = id;
    //     this.application_date = application_date;
    //     this.phone_number = phone_number;
    //     this.contact = contact;
    //     this.motivation_letter_location = motivation_letter_location;
    //     this.start_date = start_date;
    //     this.relaunch_date = relaunch_date;
    //     this.end_date = end_date;
    // }
    
    // public String getId() {
    //     return id;
    // }

    // public void setId(String id) {
    //     this.id = id;
    // }
    // public Date getApplication_date() {
    //     return application_date;
    // }
    // public void setApplication_date(Date application_date) {
    //     this.application_date = application_date;
    // }
    // public String getPhone_number() {
    //     return phone_number;
    // }
    // public void setPhone_number(String phone_number) {
    //     this.phone_number = phone_number;
    // }
    // public String getContact() {
    //     return contact;
    // }
    // public void setContact(String contact) {
    //     this.contact = contact;
    // }
    // public String getMotivation_letter_location() {
    //     return motivation_letter_location;
    // }
    // public void setMotivation_letter_location(String motivation_letter_location) {
    //     this.motivation_letter_location = motivation_letter_location;
    // }
    // public Date getStart_date() {
    //     return start_date;
    // }
    // public void setStart_date(Date start_date) {
    //     this.start_date = start_date;
    // }
    // public Date getRelaunch_date() {
    //     return relaunch_date;
    // }
    // public void setRelaunch_date(Date relaunch_date) {
    //     this.relaunch_date = relaunch_date;
    // }
    // public Date getEnd_date() {
    //     return end_date;
    // }
    // public void setEnd_date(Date end_date) {
    //     this.end_date = end_date;
    // }

    // @Override
    // public String toString() {
    //     return "Application [id=" + id + ", application_date=" + application_date + ", phone_number=" + phone_number
    //             + ", contact=" + contact + ", motivation_letter_location=" + motivation_letter_location
    //             + ", start_date=" + start_date + ", relaunch_date=" + relaunch_date + ", end_date=" + end_date + "]";
    // }

}