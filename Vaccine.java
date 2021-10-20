package One;

import Two.*;


public class Vaccine {
    public enum type_vaccine {
        Moderna, Pfizer, AstraZeneca
    }
    protected static String day1;
    protected static String day2;
    private type_vaccine type;

    public Vaccine() {
    }

    public Vaccine(String day1, String day2, type_vaccine type) {
        this.day1 = day1;
        this.day2 = day2;
        this.type = type;
    }

    public String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public String getDay2() {
        return day2;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public type_vaccine getType() {
        return type;
    }

    public void setType(type_vaccine type) {
        this.type = type;
    }

    

    public String toString() {
        return "Dose1: " +  type + ", " +  getDay1() + " " + getDay2() + ", type=" + type ;
    }

    public static int set_time(int year, int month, int day){
        if (month < 3) {
            year--;
            month += 12;
        }
        return 365*year + year/4 - year/100 + year/400 + (153*month - 457)/5 + day - 306;
    }

    public static void Clinic(){
        CivicAddress c = new CivicAddress("8680 rue Saint Denis", CivicAddress.corresponding.AB,"H2P2H2");
        System.out.println(c.toString());
        Address test =  new Address("cuong","cuonglv","0985001998", c);
        WebPageAddress test1 = new WebPageAddress("www.healthcarecentre.com");
        EmailAddress test2 = new EmailAddress("heathcarecentre@gmail.com");
        TelecomAddress test3 = new TelecomAddress("0912343223");
        //   System.out.println(test1.toString());
        //  System.out.println(test2.toString());
        //  System.out.println(test3);
        System.out.println(test.toString());
    }
}
