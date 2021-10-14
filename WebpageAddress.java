package Two;

public class WebpageAddress extends Address {
    private String URL;
    public WebpageAddress() {
        URL = "NULL";
    }
    public WebpageAddress(String u) {
        URL = u;
    }
    public WebpageAddress(WebpageAddress w) {
        URL = w.URL;
    }
    public void setWebPageAddress(String u) {
        URL = u;
    }
    public String getWebPageAddress() {
        return URL;
    }

}
