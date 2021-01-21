package com.nubari;

public class AirlineReservationSystem {
    private boolean[] seats = new boolean[10];
    private boolean firstClassFull = false;
    private boolean economyFull = false;
    private String boardingPass = "";

    public enum status {
        RESERVED, FULL;

        @Override
        public String toString() {
            switch (this) {
                case RESERVED -> {
                    return "RESERVED";
                }
                case FULL -> {
                    return "FULL";
                }
                default -> {
                    return null;
                }
            }
        }
    }

    private boolean assignSeat(int classLevel) {
        boolean firstClassSeat = classLevel == 1;
        boolean economySeat = classLevel == 2;
        if (firstClassSeat) {
            for (int i = 0; i < (seats.length / 2); i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    boardingPass = "Seat No: " + (i + 1) + " First Class";
                    return true;
                }
                if (seats[seats.length / 2]) {
                    firstClassFull = true;
                }
            }
        }
        if (economySeat) {
            for (int i = 5; i < seats.length; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    boardingPass = "Seat No: " + (i + 1) + " Economy";
                    return true;
                }
                if (seats[seats.length - 1]) {
                    economyFull = true;
                }
            }
        }
        return false;
    }


    public status assignSeatInASection(int classLevel) {
        boolean firstClassSeat = classLevel == 1;
        boolean economySeat = classLevel == 2;
        if (firstClassSeat) {
            if (!firstClassFull) {
                if (assignSeat(1) == true) {
                    return status.RESERVED;
                } else {
                    return status.FULL;
                }
            }
        }
        if (economySeat) {
            if (!economyFull) {
                if (assignSeat(2) == true) {
                    return status.RESERVED;
                } else {
                    return status.FULL;
                }
            }
        }
        return status.FULL;

    }

    public String getSeatFullMessage() {
        return "Next flight leaves in 3 hours";
    }

    public boolean[] getSeats() {
        return seats;
    }

    public String getBoardingPass() {
        return boardingPass;
    }
}
