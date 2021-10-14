package Two;

public class TelecomAddress extends Address{
    private String telecomAddress;

    public TelecomAddress() {
        telecomAddress = "NULL";
    }

    public TelecomAddress(String e) {
        telecomAddress = e;
    }
    public TelecomAddress(TelecomAddress e) {
        telecomAddress = e.telecomAddress;
    }

}
