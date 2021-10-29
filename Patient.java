package One;

import java.util.Objects;
import One.Vaccine;

public class Patient extends Vaccine{
    private String patient_name;
    private long healthcare_num;
    private String email_address;
    private String phone_number;
    private static int number_patients = 0;
    private Vaccine vaccine;

    public Patient() {
    }

    public Patient(String patient_name, long healthcare_num, String email_address, String phone_number, Vaccine vaccine) {
        super(vaccine.getDay1(), vaccine.getDay2(), vaccine.getType(), vaccine.getCl_a());
        this.patient_name = patient_name;
        this.healthcare_num = healthcare_num;
        this.email_address = email_address;
        this.phone_number = phone_number;
        this.vaccine = vaccine;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public long getHealthcare_num() {
        return healthcare_num;
    }

    public void setHealthcare_num(long healthcare_num) {
        this.healthcare_num = healthcare_num;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public static int getNumber_patients() {
        return number_patients;
    }

    public static void setNumber_patients(int number_patients) {
        Patient.number_patients = number_patients;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    @Override
    public String toString() {
        return "Patient:    " +
                "patient_name='" + patient_name + '\'' +
                ", healthcare_num=" + healthcare_num +
                ", email_address='" + email_address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", vaccine=" + vaccine.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return healthcare_num == patient.healthcare_num && Objects.equals(patient_name, patient.patient_name) && Objects.equals(email_address, patient.email_address) && Objects.equals(phone_number, patient.phone_number) && this.equals(vaccine);
    }
}
