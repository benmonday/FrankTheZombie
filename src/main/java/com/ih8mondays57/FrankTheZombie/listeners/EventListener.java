package com.ih8mondays57.FrankTheZombie.listeners;

import com.ih8mondays57.FrankTheZombie.commands.*;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.FileUpload;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class EventListener extends ListenerAdapter {

    public boolean isCommand(String message) {
        return message.startsWith("z!");
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!isCommand(event.getMessage().getContentRaw())) {
            return;
        }
        String message = event.getMessage().getContentRaw().toLowerCase();
        String userAsAt = event.getAuthor().getAsMention();
        String[] messageSegmented = message.split(" ");

        String contentToSend = "";
        File imageFile = null;
        switch (messageSegmented[0]) {
            case "z!help":
                contentToSend = new Help().returnHelpMessage();
                event.getChannel().sendMessage(contentToSend).queue();
                break;
            case "z!commandlist":
                contentToSend = new CommandList().returnCommandListMessage();
                event.getChannel().sendMessage(contentToSend).queue();
                break;
            case "z!bugsnax":
                Bugsnax bugsnax = new Bugsnax();
                contentToSend = bugsnax.returnBugsnaxMessage(userAsAt);
                imageFile = bugsnax.returnBugsnaxImage();
                event.getChannel().sendMessage(contentToSend).addFiles(FileUpload.fromData(imageFile)).queue();
                break;
            case "z!trap":
                Trap trap = new Trap();
                contentToSend = trap.returnTrapMessage(userAsAt);
                imageFile = trap.returnTrapImage();
                event.getChannel().sendMessage(contentToSend).addFiles(FileUpload.fromData(imageFile)).queue();
                break;
            case "z!sholmes":
                Sholmes sholmes = new Sholmes();
                contentToSend = sholmes.returnSholmesMessage(userAsAt);
                imageFile = sholmes.returnSholmesImage();
                event.getChannel().sendMessage(contentToSend).addFiles(FileUpload.fromData(imageFile)).queue();
                break;
            case "z!map":
                Map map = new Map(messageSegmented[1]);
                contentToSend = userAsAt + ", you should play " + map.returnMapName() + " in " + map.returnMapGame() + "!";
                event.getChannel().sendMessage(contentToSend).queue();
                break;
            case "z!isaac":
                Isaac isaac = new Isaac();
                contentToSend = isaac.returnIsaacMessage(userAsAt);
                event.getChannel().sendMessage(contentToSend).queue();
                break;
            case "z!beamsmasher":
                int x;
                int y;
                int z;

                if (messageSegmented.length != 4) {
                    event.getChannel().sendMessage("Incorrect number of arguments. Please use format \"z!beamsmasher x y z\"").queue();
                } else {
                    try {
                        x = Integer.parseInt(messageSegmented[1]);
                        y = Integer.parseInt(messageSegmented[2]);
                        z = Integer.parseInt(messageSegmented[3]);
                    } catch (Error e) {
                        event.getChannel().sendMessage("Could not parse integers. Please only use numbers.").queue();
                        break;
                    }
                    Beamsmasher beamsmasher = new Beamsmasher(x, y, z);
                    contentToSend = beamsmasher.returnBeamsmasherMessage(userAsAt);
                    event.getChannel().sendMessage(contentToSend).queue();
                }
                break;
            default:
                event.getChannel().sendMessage("```Command not recognized! Type z!commandlist for a full list of valid commands.```").queue();
        }
    }
}
