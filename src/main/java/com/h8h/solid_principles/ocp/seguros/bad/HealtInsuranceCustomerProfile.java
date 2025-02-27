package com.h8h.solid_principles.ocp.seguros.bad;

import java.util.Random;

public class HealtInsuranceCustomerProfile {
    
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
