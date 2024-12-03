package com.ih8mondays57.FrankTheZombie.commands;

import java.io.File;
import java.util.Random;

public class Map {
    String game = "";
    String map = "";
    // List of games
    String[] games = {"waw", "bo1", "bo2", "aw", "bo3", "iw", "ww2", "bo4", "cw", "vg", "bo6"};
    // World at War maps
    String[] wawMaps = {"Nacht Der Untoten", "Verrückt", "Shi No Numa", "Der Riese"};
    // Black Ops 1 maps
    String[] bo1Maps = {"Kino Der Toten", "Five", "Ascension", "Call of the Dead", "Shangri-La", "Moon", "Nacht Der Untoten", "Verrückt", "Shi No Numa", "Der Riese"};
    // Black Ops 2 maps
    String[] bo2Maps = {"TranZit", "Bus Depot", "Farm", "Town", "Nuketown", "Die Rise", "Mob of the Dead", "Buried", "Origins"};
    // Advanced Warfare maps
    String[] awMaps = {"Outbreak", "Infection", "Carrier", "Descent"};
    // Black Ops 3 maps
    String[] bo3Maps = {"Shadows of Evil", "The Giant", "Der Eisendrache", "Zetsubou No Shima", "Gorod Krovi", "Revelations", "Nacht Der Untoten","Verrückt", "Shi No Numa", "Kino Der Toten", "Ascension", "Shangri-La", "Moon", "Origins"};
    // Infinite Warfare maps
    String[] iwMaps = {"Zombies in Spaceland", "Rave in the Redwoods", "Shaolin Shuffle", "Attack of the Radioactive Thing", "The Beast From Beyond"};
    // World War II maps
    String[] ww2Maps = {"The Final Reich", "Gröesten Haus", "The Darkest Shore", "The Shadowed Throne", "The Tortured Path", "Bodega Cervantes", "U.S.S. Mount Olympus", "Altar of Blood", "The Frozen Dawn"};
    // Black Ops 4 maps
    String[] bo4Maps = {"IX", "Voyage of Despair", "Classified", "Blood of the Dead", "Dead of the Night", "Ancient Evil", "Alpha Omega", "Tag Der Toten"};
    // Cold War maps
    String[] cwMaps = {"Die Maschine", "Firebase Z", "Outbreak", "Mauer Der Toten", "Forsaken"};
    // VanGOATED maps
    String[] vgMaps = {"Der Anfang", "Terra Maledicta", "Shi No Numa", "The Archon"};
    // Black Ops 6 maps
    String[] bo6Maps = {"Terminus", "Liberty Falls", "Citadelle Des Morts"};

    public Map (String game) {
        Random rand = new Random();
        if (game.equals("all")) {
            game = games[rand.nextInt(games.length)];
        }

        switch (game) {
            case "waw":
                this.game = "World at War";
                this.map = wawMaps[rand.nextInt(wawMaps.length)];
                break;
            case "bo1":
                this.game = "Black Ops 1";
                this.map = bo1Maps[rand.nextInt(bo1Maps.length)];
                break;
            case "bo2":
                this.game = "Black Ops 2";
                this.map = bo2Maps[rand.nextInt(bo2Maps.length)];
                break;
            case "aw":
                this.game = "Advanced Warfare";
                this.map = awMaps[rand.nextInt(awMaps.length)];
                break;
            case "bo3":
                this.game = "Black Ops 3";
                this.map = bo3Maps[rand.nextInt(bo3Maps.length)];
                break;
            case "iw":
                this.game = "Infinite Warfare";
                this.map = iwMaps[rand.nextInt(iwMaps.length)];
                break;
            case "ww2":
                this.game = "World War II";
                this.map = ww2Maps[rand.nextInt(ww2Maps.length)];
                break;
            case "bo4":
                this.game = "Black Ops 4";
                this.map = bo4Maps[rand.nextInt(bo4Maps.length)];
                break;
            case "cw":
                this.game = "Black Ops Cold War";
                this.map = cwMaps[rand.nextInt(cwMaps.length)];
                break;
            case "vg":
                this.game = "Vanguard";
                this.map = vgMaps[rand.nextInt(vgMaps.length)];
                break;
            case "bo6":
                this.game = "Black Ops 6";
                this.map = bo6Maps[rand.nextInt(bo6Maps.length)];
                break;
        }
    }

    public String returnMapGame() {
        return this.game;
    }

    public String returnMapName() {
        return this.map;
    }
}
