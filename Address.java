package Two;

import java.util.Objects;

public  class Address {
    private  String webPageAddress;
    private  String emailAddress;
    private  String telecomAddress;
    private  CivicAddress civicAddress;
    public Address(String webPageAddress, String emailAddress, String telecomAddress, CivicAddress civicAddress) {
        this.webPageAddress = webPageAddress;
        this.emailAddress = emailAddress;
        this.telecomAddress = telecomAddress;
        this.civicAddress = civicAddress;
    }
    public Address(){
    }

    public Address(Address a){
        webPageAddress = a.webPageAddress;
        emailAddress = a.emailAddress;
        telecomAddress = a.telecomAddress;
    }



    public void setWebPageAddress(String s) {
        webPageAddress = s;
    }
    public void setEmailAddress(String s) {
        emailAddress = s;
    }
    public void setTelecomAddress(String s) {
        telecomAddress = s;
    }
    public void setCivicAddress(CivicAddress s) {
        civicAddress = s;
    }
    public String getWebPageAddress() {
        return webPageAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getTelecomAddress() {
        return telecomAddress;
    }
    public CivicAddress getCivicAddress() {
        return civicAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "webPageAddress='" + webPageAddress + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", telecomAddress='" + telecomAddress + '\'' +
                ", civicAddress=" + civicAddress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(webPageAddress, address.webPageAddress) && Objects.equals(emailAddress, address.emailAddress) && Objects.equals(telecomAddress, address.telecomAddress) && Objects.equals(civicAddress, address.civicAddress);
    }

}
