package Two;

import java.util.Objects;

public class TelecomAddress extends Address{
    private String telecomAddress;

    public TelecomAddress() {
        telecomAddress = "NULL";
    }

    public TelecomAddress(TelecomAddress e) {
        telecomAddress = e.telecomAddress;
    }

    public TelecomAddress(String e) {
        super("","",e,null);
        telecomAddress = e;
    }

    public String getTelecomAddress() {
        return telecomAddress;
    }

    public void setTelecomAddress(String telecomAddress) {
        this.telecomAddress = telecomAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelecomAddress that = (TelecomAddress) o;
        return Objects.equals(telecomAddress, that.telecomAddress);
    }

}
