package com.ih8mondays57.FrankTheZombie.commands;

import java.io.File;
import java.util.Random;

public class Bugsnax {
    File directory = new File("src/main/resources/FrankBugsnax");
    File image;
    String snackName;


    public Bugsnax() {
        File[] files = directory.listFiles();
        Random rand = new Random();
        image = files[rand.nextInt(files.length)];
        snackName = image.getName();
    }

    public String returnBugsnaxMessage(String user) {
        return user + ", your Bugsnax is " + snackName.substring(0, snackName.length()-4) + "!";
    }

    public File returnBugsnaxImage() {
        return image;
    }
}
