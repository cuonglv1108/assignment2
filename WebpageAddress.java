package Two;

import java.util.Objects;

public class WebPageAddress extends Address {
    private String URL;
    public WebPageAddress() {
        URL = "NULL";
    }
    public WebPageAddress(String u) {
        super(u,"","",null);
        URL = u;
    }
    public WebPageAddress(WebPageAddress w) {
        URL = w.URL;
    }
    public void setWebPageAddress(String u) {
        URL = u;
    }
    public String getWebPageAddress() {
        return URL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebPageAddress that = (WebPageAddress) o;
        return Objects.equals(URL, that.URL);
    }

}
