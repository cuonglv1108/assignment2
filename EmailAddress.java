package Two;

public class EmailAddress extends Address {
    private String emailAddress;

    public EmailAddress() {
        emailAddress = "NULL";
    }

    public EmailAddress(String e) {
        emailAddress = e;
    }
    public EmailAddress(EmailAddress e) {
        emailAddress = e.emailAddress;
    }
}
