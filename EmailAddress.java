package Two;

import java.util.Objects;

public class EmailAddress extends Address {
    private String emailAddress;

    public EmailAddress() {
        emailAddress = "NULL";
    }

    public EmailAddress(String e) {
        super("",e,"",null);
        emailAddress = e;
    }
    public EmailAddress(EmailAddress e){
        emailAddress = e.emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailAddress that = (EmailAddress) o;
        return Objects.equals(emailAddress, that.emailAddress);
    }

}
