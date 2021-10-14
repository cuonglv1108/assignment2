package One;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Two.*;

import java.util.Objects;


public class Vaccine {
    public enum type_vaccine {
        Moderna, Pfizer, AstraZeneca
    }
    protected Date day1;
    protected Date day2;
    private type_vaccine type;

    public Vaccine() {
    }

    public Vaccine(String day1, String day2, type_vaccine type) {
        this.day1 = convertDate(day1);
        this.day2 = convertDate(day2);
        this.type = type;
    }

    public String getDay1() {
        return convertDate(day1);
    }

    public void setDay1(String day1) {
        this.day1 = convertDate(day1);
    }

    public String getDay2() {
        return convertDate(day2);
    }

    public void setDay2(String day2) {
        this.day2 = convertDate(day2);
    }

    public type_vaccine getType() {
        return type;
    }

    public void setType(type_vaccine type) {
        this.type = type;
    }

    public Date convertDate (String date) {
        try {
            //      String date = "07/28/2011";
            Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse(date);
            return date1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Date();
    }
    public String convertDate (Date date){
        String[] date2 = date.toLocaleString().split(",");
       // System.out.println(date2[0] + "," + date2[1]);
        return date2[0] + "," + date2 [1];
    }

    public String toString() {
        return "Dose1: " +  type + ", "+  getDay1() + getDay2() + ", type=" + type + '}';
    }

    public static void Clinic(){
        CivicAddress c = new CivicAddress("8680 rue Saint Denis", CivicAddress.corresponding.AB);
        System.out.println(c.toString());
        Address test =  new Address("cuong","cuonglv","0985001998", c);
        WebpageAddress test1 = new WebpageAddress("www.healthcarecentre.com");
        EmailAddress test2 = new EmailAddress("heathcarecentre@gmail.com");
        TelecomAddress test3 = new TelecomAddress("0912343223");
     //   System.out.println(test1.toString());
      //  System.out.println(test2.toString());
      //  System.out.println(test3);
        System.out.println(test.toString());
    }

}
