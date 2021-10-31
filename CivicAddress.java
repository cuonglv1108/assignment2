package Two;

import java.util.Objects;

public class CivicAddress extends Address{
    private String civicAddress;
    public enum corresponding{
        AB, BC, MB, NB, NL, NT, NS, NU, ON,
        PE, QC, SK, YT
    }
    public corresponding code;
    public String postal_code;
    public CivicAddress() {
        civicAddress = "NULL";
        code = corresponding.AB;
        postal_code = "NULL";

    }
    public CivicAddress(String e,corresponding code, String postal_code) {
        civicAddress = e;
        this.code = code;
        this.postal_code = postal_code;
    }
    public CivicAddress(CivicAddress e) {
        civicAddress = e.civicAddress;
    }

    public corresponding getCode() {
        return code;
    }

    public void setCode(corresponding code) {
        this.code = code;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    @Override
    public String toString() {
        return "CivicAddress{" +
                "civicAddress='" + civicAddress.toUpperCase() + '\'' +
                ", code=" + code +
                ", postal_code='" + postal_code + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CivicAddress that = (CivicAddress) o;
        return Objects.equals(civicAddress, that.civicAddress) && code == that.code && Objects.equals(postal_code, that.postal_code);
    }

}
