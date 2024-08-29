package com.ih8mondays57.FrankTheZombie.commands;

public class CommandList {

    public String returnCommandListMessage() {
        return "```List of commands:\nz!help - Displays basic info about the bot.\nz!commandlist - Displays all commands (what you are seeing now).\nz!bugsnax - Gives the user a random Bugsnack image." +
                "\nz!trap - Gives the user a random trap image from the history of zombies.\nz!sholmes - Gives the user a random Sholmes image." +
                "\nz!play <link> - Plays audio from a link in the voice channel.\nz!stop - Stops playing the current audio track.```";
    }
}
