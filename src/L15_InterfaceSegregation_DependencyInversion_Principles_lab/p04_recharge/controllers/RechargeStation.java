package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.controllers;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.interfaces.Rechargeable;

public class RechargeStation {

    public void recharge(Rechargeable rechargeable) {
        rechargeable.recharge();
    }
}
