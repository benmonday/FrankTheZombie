package com.ih8mondays57.FrankTheZombie.commands;

import java.util.Random;

public class Isaac {
    String character;
    String path;

    String[] characters = {"Isaac", "Tainted Isaac", "Magdalene", "Tainted Magdalene", "Cain", "Tainted Cain", "Judas", "Tainted Judas", "Azazel", "Tainted Azazel", "Blue Baby", "Tainted Blue Baby", "Lazarus",
    "Tainted Lazarus", "The Lost", "Tainted The Lost", "Apollyon", "Tainted Apollyon", "The Forgotten", "Tainted The Forgotten", "Bethany", "Tainted Bethany", "Jacob & Esau", "Tainted Jacob", "Eden", "Tainted Eden"};

    String[] paths = {"The Chest", "The Dark Room", "Mother", "The Beast", "Mega Satan"};


    public Isaac() {
        Random rand = new Random();
        character = characters[rand.nextInt(characters.length)];
        path = paths[rand.nextInt(paths.length)];
    }

    public String returnIsaacMessage(String user) {
        return user + ", you should play as " + character + " and go to " + path + "!";
    }
}
