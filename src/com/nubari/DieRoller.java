package com.nubari;

import java.util.ArrayList;
import java.util.List;

public class DieRoller {
    private List<Die> dice;

    public DieRoller(int numOfDice) {
        dice = new ArrayList<>();
        for (int i = 0; i < numOfDice; i++) {
            dice.add(new Die());
        }
    }

    public List<Integer> rollDice() {
        List<Integer> results = new ArrayList<>();
        for (Die die : dice) {
            results.add(die.rollDie());
        }
        return results;
    }
}
