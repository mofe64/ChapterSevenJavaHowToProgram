package com.nubari;

import java.security.SecureRandom;

public class Die {
    private final SecureRandom secureRandom = new SecureRandom();
    private int side;

    public int rollDie() {
        return side = 1 + secureRandom.nextInt(6);
    }

}
