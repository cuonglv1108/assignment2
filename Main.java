package com.company;
import One.Patient;
import One.Vaccine;
import Two.Address;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static String [] monthly = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private static Vaccine changetime;
    public static void main(String[] args) {
        // write your code here
        welcome();
        //  Patient p1 = new Patient("Cuong", 23, "levietcuongdn98@gmail.com", "0985001998", null);
        //  Patient p2 = new Patient("Cuong", 23, "levietcuongdn98@gmail.com", "0985001998", null);
        Vaccine v1 = new Vaccine("May 5, 2021", "August 6,2021", Vaccine.type_vaccine.Pfizer);
     //   Vaccine.DateDiff();
        changetime();
        System.out.println(v1);
        Vaccine.Clinic();
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
            if (kq>28 && kq<=256) System.out.println("Valid day");
            else System.out.println("Invalid day");
            String day_1 = monthly[month-1] + " " + String.valueOf(day) + ", " + String.valueOf(year);
            String day_2 = monthly[month1-1] + " " + String.valueOf(day1) + ", " + String.valueOf(year1);
            Vaccine v1 = new Vaccine(day_1,day_2, Vaccine.type_vaccine.Pfizer);

      //      System.out.println(day_1);
      //      System.out.println(kq);
        } else
            System.out.println("DO YOU WANT TO CHANGE AGAIN? ");
            t = scanner.nextLine();
            if (t.equals("NO")){
                break;
            }
        } while (kq1>0);
    }
}
