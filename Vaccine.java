package One;

import Two.*;

import java.sql.SQLOutput;
import java.util.Objects;


public class Vaccine {
    public enum type_vaccine {
        Moderna, Pfizer, AstraZeneca, NULL
    }
    public enum clinic_address{
        Stadium1, Stadium2, Stadium3, Stadium4, NULL
    }
    protected static String day1;
    protected static String day2;
    private static type_vaccine type;
    private static clinic_address cl_a;

    public Vaccine() {
        day1 = "0";
        day2 = "0";
        type = type_vaccine.NULL;
        cl_a = clinic_address.NULL;
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

    public static String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public static String getDay2() {
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


    public static int set_time(int year, int month, int day){
        if (month < 3) {
            year--;
            month += 12;
        }
        return 365*year + year/4 - year/100 + year/400 + (153*month - 457)/5 + day - 306;
    }

    public String Clinic1(){
        CivicAddress c = new CivicAddress("8680 rue Saint Denis ST.Montreal", CivicAddress.corresponding.AB,"H2P2H2");
        Address test =  new Address("https:clinicaddress.com","levietcuongdn98@gmail.com","0985001998", c);
        return "Clinic: " + clinic_address.Stadium1 + " " + c.toString() + "\n" + test;

    }
    public String Clinic2(){
        CivicAddress c = new CivicAddress("8680 rue Saint Denis ST.Montreal", CivicAddress.corresponding.QC,"H2P2H2");
        Address test =  new Address("https:clinicaddress.com","levietcuongdn98@gmail.com","0985001998", c);
        return "Clinic: " + clinic_address.Stadium3 + " " + c.toString() + "\n" + test;
    }
    @Override
    public String toString() {
        String line = "Dose1: " +  type + ", " +  getDay1() + "\n" + Clinic1();
        String line1 = "Dose2: " +  type + ", " + getDay2() + "\n" + Clinic2();
        return "\n" + "Vaccine: " + line + "\n" + line1;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vaccine)) return false;
        Vaccine vaccine = (Vaccine) o;
        return Objects.equals(day1, vaccine.day1) && Objects.equals(day2, vaccine.day2) && type == vaccine.type && cl_a == vaccine.cl_a;
    }


}
