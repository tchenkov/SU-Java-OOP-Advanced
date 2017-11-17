package L02_InterfacesAndAbstraction_Exercises.P04_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        List<String> phoneNumbers = Arrays.asList(br.readLine().split(" "));
        List<String> sites = Arrays.asList(br.readLine().split(" "));
        
        Smartphone smartphone = new Smartphone(phoneNumbers, sites);
        
        for (String phoneNumber : smartphone.getPhoneNumbers()) {
            System.out.println(smartphone.call(phoneNumber));
        }
    
        for (String site : smartphone.getWebSites()) {
            System.out.println(smartphone.browse(site));
        }
    }
}
