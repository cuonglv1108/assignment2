package com.company;
import One.Patient;
import One.Vaccine;
import Two.*;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static String [] monthly = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private static Vaccine changetime;
    private static Vaccine v3 = new Vaccine();
    static String day_1;
    static String day_2;
    static int p = 0;
    static boolean result = false;
    public static void main(String[] args) {
        int kq1 = 0;
        welcome();
        int numberofPatients = 0;
        System.out.println("How many patients? ");
        numberofPatients = scanner.nextInt();
        Patient[] patientDatabase = new Patient[numberofPatients];
        Vaccine[] vaccines = new Vaccine[numberofPatients];
        boolean[] tracePatient = new boolean[numberofPatients];

        vaccines[0] = new Vaccine("June 5, 2021", "June 6, 2021", Vaccine.type_vaccine.Pfizer, Vaccine.clinic_address.Stadium2);
        vaccines[1] = new Vaccine("June 5, 2021", "June 6, 2021", Vaccine.type_vaccine.Pfizer, Vaccine.clinic_address.Stadium2);
        vaccines[2] = new Vaccine("June 5, 2021", "June 6, 2021", Vaccine.type_vaccine.Pfizer, Vaccine.clinic_address.Stadium2);
        vaccines[3] = new Vaccine("June 5, 2021", "June 6, 2021", Vaccine.type_vaccine.Pfizer, Vaccine.clinic_address.Stadium2);
        vaccines[4] = new Vaccine("June 5, 2021", "June 6, 2021", Vaccine.type_vaccine.Pfizer, Vaccine.clinic_address.Stadium2);

        patientDatabase[0] = new Patient("Hoang", 23, "levietcuongdn98@gmail.com", "0985001998", vaccines[0]);
        patientDatabase[1] = new Patient("Hoang", 23, "levietcuongdn98@gmail.com", "0985001998", vaccines[1]);
        patientDatabase[2] = new Patient("Hoang", 23, "levietcuongdn98@gmail.com", "0985001998", vaccines[2]);
        patientDatabase[3] = new Patient("Hoang", 23, "levietcuongdn98@gmail.com", "0985001998", vaccines[3]);
        patientDatabase[4] = new Patient("Hoang", 23, "levietcuongdn98@gmail.com", "0985001998", vaccines[4]);
        // vaccines[1] = new Vaccine("August 5, 2021", "August 6, 2021", Vaccine.type_vaccine.Pfizer, Vaccine.clinic_address.Stadium2);
        for (int i = 0; i < numberofPatients; i++) {
            kq1 = check_patient(vaccines[i].getDay2()) - check_patient(vaccines[i].getDay1());
            if (kq1 >= 28 && kq1 <= 356) tracePatient[i] = true;
        }

        TelecomAddress t1 = new TelecomAddress("8680 RUE SAINT DENIS");
        TelecomAddress t2 = new TelecomAddress("7620 RUE SAINT DENIS");
        EmailAddress e1 = new EmailAddress("levietcuongdn98@gmail.com");
        EmailAddress e2 = new EmailAddress("hoangton@gmail.com");
        WebPageAddress w1 = new WebPageAddress("https:hospitalcenter.com");
        WebPageAddress w2 = new WebPageAddress("https:hospitalNorth.com");
        CivicAddress c1 = new CivicAddress("8680 rue Saint Denis ST.Montreal", CivicAddress.corresponding.QC, "H2P2H2");
        CivicAddress c2 = new CivicAddress("1202 rue Saint Denis ST.Montreal", CivicAddress.corresponding.AB, "2H9HA5");

        Address[] addrrestArray = new Address[8];
        addrrestArray[0] = t1;
        addrrestArray[1] = t2;
        addrrestArray[2] = e1;
        addrrestArray[3] = e2;
        addrrestArray[4] = w1;
        addrrestArray[5] = w2;
        addrrestArray[6] = c1;
        addrrestArray[7] = c2;

        int loop1 = 1;
        int otp = 0;
        int i = 0;
        do {
            System.out.println("Choose the option you want to do: ");
            System.out.println("    1. Show the information of the patient. ");
            System.out.println("    2. Do the change of the date vaccination of patient. ");
            System.out.println("    3. Check all the day vaccination of patient ( Valid or Invalid)");
            System.out.println("    4. Compare the information of patient to another patient");
            System.out.println("    5. Exit the program!");
            int opt = scanner.nextInt();
            switch (opt) {
                case 1:

                    for (i = 0; i <= patientDatabase.length - 1; i++){
                        System.out.println("Number" + i + " " + patientDatabase[i] + "\n");
                    }
                    break;
                case 2:
                    changetime();
                    if (result == true) {
                        vaccines[p].setDay1(day_1);
                        vaccines[p].setDay2(day_2);
                        patientDatabase[p].setDay1(day_1);
                        patientDatabase[p].setDay2(day_2);
                        tracePatient[p] = true;
                        System.out.println(patientDatabase[p].toString());
                    }
                    break;
                case 3:
                    for (i = 0; i < numberofPatients; i++) {
                        if (tracePatient[i] == false) System.out.println("The patient number " + i + " did not take fully vaccinated");
                        else System.out.println("The patient number " + i + " did take fully vaccinated");
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println(" Number of the first patient: ");
                    int st1 = scanner.nextInt();
                    System.out.println(" Number of the second patient: ");
                    int st2 = scanner.nextInt();
                    if (patientDatabase[st1].equals(patientDatabase[st2]))
                        System.out.println("They have the same information");
                    else System.out.println("they do not have the same information");
                    System.out.println(patientDatabase[st1] + "\n" +patientDatabase[st2]);
                    break;
                case 5:
                    loop1 = 0;
            }
        }   while (loop1 > 0);
        System.out.println("Thank you for using our program!");
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
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine();
        int kq1 = 1;
        do{
            if (t.equals("YES")) {
                System.out.println("Which patient do you want to change? ");
                p = scanner.nextInt();
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
                    day_1 = monthly[month - 1] + " " + String.valueOf(day) + ", " + String.valueOf(year);
                    day_2 = monthly[month1 - 1] + " " + String.valueOf(day1) + ", " + String.valueOf(year1);
                    result = true;
                    break;
                }
                else {
                    System.out.println("Invalid day");
                }
                break;
            }
            if (t.equals("NO")) break;
        } while (kq1>0);
    }

    public static Address[] copyAddresses(Address[] a) {
        Address[] newAddresses = new Address[a.length];
        for (int i = 0; i < a.length; i++) {
            newAddresses[i] = new Address(a[i]);
        }
        return newAddresses;
    }
}
