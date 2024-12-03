package com.ih8mondays57.FrankTheZombie.commands;

public class Beamsmasher {
    // Vars
    int x;
    int y;
    int z;

    // Code
    int code1;
    int code2;
    int code3;

    public Beamsmasher(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

        code1 = 2 * x + 11;
        code2 = (2 * z + y) - 5;
        code3 = Math.abs((y + z) - x);
    }

    public String returnBeamsmasherMessage(String userAsAt) {
        return userAsAt + " your code is " + code1 + " " + code2 + " " + code3 + "!";
    }
}
