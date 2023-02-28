package org.example;


import java.util.logging.Logger;

class Grade {
    private final String temp;
    Logger l=Logger.getLogger(Grade.class.getName());

    Grade(String temp) {
        this.temp = temp;
    }

    public double gradeing() {
        double gradetemp = 0;
        switch (temp) {
            case "A" -> gradetemp = 4;
            case "B" -> gradetemp = 3;
            case "C" -> gradetemp = 2;
            case "D" -> gradetemp = 1;
            case "F" -> gradetemp = 0;
            default -> l.info("Enter the correct Grade");
        }

        return gradetemp;

    }
}