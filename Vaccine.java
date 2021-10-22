package One;

import Two.*;

import java.sql.SQLOutput;


public class Vaccine {
    public enum type_vaccine {
        Moderna, Pfizer, AstraZeneca
    }
    public enum clinic_address{
        Stadium1, Stadium2, Stadium3, Stadium4
    }
    protected static String day1;
    protected static String day2;
    private type_vaccine type;
    private clinic_address cl_a;

    public Vaccine() {

    }

    public Vaccine(String day1, String day2, type_vaccine type, clinic_address cl_a) {
        this.day1 = day1;
        this.day2 = day2;
        this.type = type;
        this.cl_a = cl_a;
    }

    public clinic_address getCl_a() {
        return cl_a;
    }

    public void setCl_a(clinic_address cl_a) {
        this.cl_a = cl_a;
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



    public String toString1() {
        return "Dose1: " +  type + ", " +  getDay1() ;
    }

    public String toString2() {
        return "Dose2: " +  type + ", " + getDay2() ;
    }

    public static int set_time(int year, int month, int day){
        if (month < 3) {
            year--;
            month += 12;
        }
        return 365*year + year/4 - year/100 + year/400 + (153*month - 457)/5 + day - 306;
    }

    public static void Clinic1(){
        CivicAddress c = new CivicAddress("8680 rue Saint Denis ST.Montreal", CivicAddress.corresponding.AB,"H2P2H2");
        Address test =  new Address("https:clinicaddress.com","levietcuongdn98@gmail.com","0985001998", c);
        System.out.println("Clinic: " + clinic_address.Stadium1 + " " + c.toString());
        System.out.println(test);
    }
    public static void Clinic2(){
        CivicAddress c = new CivicAddress("8680 rue Saint Denis ST.Montreal", CivicAddress.corresponding.QC,"H2P2H2");
        Address test =  new Address("https:clinicaddress.com","levietcuongdn98@gmail.com","0985001998", c);
        System.out.println("Clinic: " + clinic_address.Stadium2 + " " + c.toString());
        System.out.println(test);
    }
}
