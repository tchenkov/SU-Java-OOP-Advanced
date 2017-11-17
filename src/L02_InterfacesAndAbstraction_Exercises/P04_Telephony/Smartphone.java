package L02_InterfacesAndAbstraction_Exercises.P04_Telephony;

import java.util.Collections;
import java.util.List;

public class Smartphone implements Calling, Browsing {
    private List<String> phoneNumbers;
    private List<String> webSites;
    
    public Smartphone(List<String> phoneNumbers, List<String> webSites) {
        this.phoneNumbers = phoneNumbers;
        this.webSites = webSites;
    }
    
    public List<String> getPhoneNumbers() {
        return Collections.unmodifiableList(this.phoneNumbers);
    }
    
    public List<String> getWebSites() {
        return Collections.unmodifiableList(this.webSites);
    }
    
    @Override
    public String call(String phoneNumber) {
        if (phoneNumber.matches("^\\d+$")){
            return String.format("Calling... %s", phoneNumber);
        }
        return "Invalid number!";
    }
    
    @Override
    public String browse(String webSite) {
        if (webSite.matches(".*\\d.*")){
            return "Invalid URL!";
        }
        return String.format("Browsing: %s!", webSite);
    }
}
