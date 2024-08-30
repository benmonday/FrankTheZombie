package com.ih8mondays57.FrankTheZombie.commands;

public class CommandList {

    public String returnCommandListMessage() {
        return """
                ```List of commands:
                z!help - Displays basic info about the bot.
                z!commandlist - Displays all commands (what you are seeing now).
                z!bugsnax - Gives the user a random Bugsnack image.
                z!trap - Gives the user a random trap image from the history of zombies.
                z!sholmes - Gives the user a random Sholmes image.
                z!map <game> - Gives the user a random zombies map. Choices: waw, bo1, bo2, aw, bo3, iw, ww2, bo4, cw, vg, bo6, all.
                z!play <link> - Plays audio from a link in the voice channel.
                z!stop - Stops playing the current audio track.```""";
    }
}
