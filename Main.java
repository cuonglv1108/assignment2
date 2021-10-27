package com.company;
import One.Patient;
import One.Vaccine;
import Two.Address;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static String [] monthly = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private static Vaccine changetime;
    private static int kq1 = 0;
    public static void main(String[] args) {
        // write your code here
        welcome();
        System.out.println("How many patients? ");
        int numberofPatients = scanner.nextInt();
        Patient[] patientDatabase = new Patient[numberofPatients];
        Vaccine[] vaccines = new Vaccine[numberofPatients];
        boolean [] tracePatient= new boolean[numberofPatients];
        patientDatabase[0] = new Patient("Hoang", 23, "levietcuongdn98@gmail.com", "0985001998", null);
        patientDatabase[1] = new Patient("Dung", 24, "levietcuongdn98@gmail.com", "0985001998", null);
     //   Patient p1 = new Patient("Cuong", 23, "levietcuongdn98@gmail.com", "0985001998", null);
      //  Patient p2 = new Patient("Cuong", 23, "levietcuongdn98@gmail.com", "0985001998", null);
        vaccines[0] = new Vaccine("May 5, 2021", "June 6, 2021", Vaccine.type_vaccine.Pfizer, Vaccine.clinic_address.Stadium3);
        vaccines[1] = new Vaccine("August 5, 2021", "August 6, 2021", Vaccine.type_vaccine.Pfizer, Vaccine.clinic_address.Stadium2);
        for (int i = 0; i < numberofPatients; i++){
            kq1 = check_patient(vaccines[i].getDay2())-check_patient(vaccines[i].getDay1());
            if (kq1>=28 && kq1<=356) tracePatient[i] = true;
        }

        Vaccine.Clinic1();
        Vaccine.Clinic2();
        changetime();
    }

    public static int check_patient(String k){
        int dem =0;
    String q = "";
    String q1 = "";
        int year = 0, day = 0, month = 0;
        int kq = 0;
    for (int i = 0; i<=k.length()-1; i++){
        if (k.charAt(i) != ' ' && k.charAt(i) != ',') {
            q = q + k.charAt(i);
        } else{
            if (dem == 0 && q != " ")   {
                for (int j = 0 ; j<= monthly.length-1 ; j++){
                    if (q.equals(monthly[j])) {
                        month = j + 1;
                        dem += 1;
                        q="";
                        break;
                    }
                }
            }
            if (dem == 1 && q != "")
            {
                day = Integer.parseInt(q);
                dem += 1;
                q="";
            }
        }
    }
    if (dem == 2 && q != "") year = Integer.parseInt(q);
    dem = Vaccine.set_time(year,month,day);
    return dem;
    }

    public static void welcome(){
        System.out.println("        ------------------------------");
        System.out.println("          WELCOME TO VACCINE BOOKING");
        System.out.println("        ------------------------------");
    }

    public static void changetime(){
        System.out.println("DO YOU WANT TO CHANGE THE DATE OF VACCINATION? ");
        String t = scanner.nextLine();
        int kq1 = 1;
        do{
            if (t.equals("YES")) {
                int year=0,year1=0,month=0,month1=0,day=0,day1=0;
                int kq = 0;
                System.out.println("Day for 1st dose: ");
                year = scanner.nextInt();
                month = scanner.nextInt();
                day = scanner.nextInt();
                System.out.println("Day for 2nd dose: ");
                year1 = scanner.nextInt();
                month1 = scanner.nextInt();
                day1 = scanner.nextInt();
                kq = Vaccine.set_time(year1,month1,day1)-Vaccine.set_time(year,month,day);
                if (kq>28 && kq<=356) {
                    System.out.println("Valid day");
                    String day_1 = monthly[month - 1] + " " + String.valueOf(day) + ", " + String.valueOf(year);
                    String day_2 = monthly[month1 - 1] + " " + String.valueOf(day1) + ", " + String.valueOf(year1);
                    Vaccine v1 = new Vaccine(day_1, day_2, Vaccine.type_vaccine.Pfizer, Vaccine.clinic_address.Stadium3);
                    Vaccine v2 = new Vaccine(day_1, day_2, Vaccine.type_vaccine.Pfizer, Vaccine.clinic_address.Stadium2);
                    System.out.println(v1.toString1());
                    Vaccine.Clinic1();
                    System.out.println(v1.toString2());
                    Vaccine.Clinic2();
                }
                else System.out.println("Invalid day");
                break;
            } else
                System.out.println("DO YOU WANT TO CHANGE AGAIN? ");
            t = scanner.nextLine();
            if (t.equals("NO")){
                break;
            }
        } while (kq1>0);
    }
}
