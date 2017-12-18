package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p05_security_system;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p05_security_system.scanner.KeyCardUI;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p05_security_system.scanner.PinCardUI;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p05_security_system.sequrity.KeyCardCheck;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p05_security_system.sequrity.PinCodeCheck;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p05_security_system.scanner.ScannerUI;

import java.io.IOException;
import java.util.Scanner;

public class SecurityManager {

    private KeyCardCheck keyCardCheck;
    private PinCodeCheck pinCodeCheck;

    public SecurityManager(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck) {
        this.keyCardCheck = keyCardCheck;
        this.pinCodeCheck = pinCodeCheck;
    }

    public void check() {
        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                System.out.println(keyCardCheck.validateUser());
                break;
            case 2:
                System.out.println(pinCodeCheck.validateUser());
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        KeyCardUI keyCardUI = new ScannerUI();
        PinCardUI pinCardUI = new ScannerUI();
        KeyCardCheck keyCardCheck = new KeyCardCheck(keyCardUI);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(pinCardUI);
        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.check();
    }
}
