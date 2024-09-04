package com.ih8mondays57.FrankTheZombie.commands;

import java.io.File;
import java.util.Random;

public class Sholmes {
    File directory = new File("FrankSholmes");
    File image;

    public Sholmes() {
        File[] files = directory.listFiles();
        Random rand = new Random();
        image = files[rand.nextInt(files.length)];
    }

    public String returnSholmesMessage(String user) {
        return user + " Here is your Herlock!";
    }

    public File returnSholmesImage() {
        return image;
    }
}
