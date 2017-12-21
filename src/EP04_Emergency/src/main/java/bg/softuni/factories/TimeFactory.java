package bg.softuni.factories;

import bg.softuni.utils.RegistrationTime;

public class TimeFactory {
    public static RegistrationTime create(String input){
        return new RegistrationTime(input);
    }
}
