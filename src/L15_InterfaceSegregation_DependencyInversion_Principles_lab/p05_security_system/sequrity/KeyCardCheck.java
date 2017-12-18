package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p05_security_system.sequrity;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p05_security_system.scanner.KeyCardUI;

public class KeyCardCheck extends SecurityCheck {

    private KeyCardUI secKeyCardUI;

    public KeyCardCheck(KeyCardUI secKeyCardUI) {
        this.secKeyCardUI = secKeyCardUI;
    }

    @Override
    public boolean validateUser() {
        String code = secKeyCardUI.requestKeyCard();
        if (isValid(code)) {
            return true;
        }

        return false;
    }

    private boolean isValid(String code) {
        return true;
    }
}
