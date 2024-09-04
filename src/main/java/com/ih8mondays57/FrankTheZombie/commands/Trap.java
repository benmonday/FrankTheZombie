package com.ih8mondays57.FrankTheZombie.commands;

import java.io.File;
import java.util.Random;

public class Trap {
    File directory = new File("FrankTraps");
    File image;

    public Trap() {
        File[] files = directory.listFiles();
        Random rand = new Random();
        image = files[rand.nextInt(files.length)];
    }

    public String returnTrapMessage(String user) {
        return user + " Here is your trap!";
    }

    public File returnTrapImage() {
        return image;
    }
}
