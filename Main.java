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
    private static Vaccine changetime;
    public static void main(String[] args) {
	// write your code here
        welcome();
      //  Patient p1 = new Patient("Cuong", 23, "levietcuongdn98@gmail.com", "0985001998", null);
      //  Patient p2 = new Patient("Cuong", 23, "levietcuongdn98@gmail.com", "0985001998", null);
        Vaccine v1 = new Vaccine("12/02/2021", "09/12/2012", Vaccine.type_vaccine.Pfizer);
        Vaccine.DateDiff();
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
        if (t.equals("YES")) {
            System.out.println("Day for 1st dose: ");
            String t1 = scanner.nextLine();
            System.out.println("Day for 2nd dose: ");
            String t2 = scanner.nextLine();
            Vaccine check1 = new Vaccine(t1, t2, Vaccine.type_vaccine.Moderna);
            System.out.println(check1);
        } else
            System.out.println("OK");
    }
}

