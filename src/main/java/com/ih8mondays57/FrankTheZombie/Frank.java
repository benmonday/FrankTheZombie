package com.ih8mondays57.FrankTheZombie;

import com.ih8mondays57.FrankTheZombie.listeners.EventListener;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.exceptions.InvalidTokenException;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

public class Frank {

    //private final Dotenv config;
    private final ShardManager shardManager;

    public Frank() throws InvalidTokenException {
        // Load token from .env
        //config = Dotenv.configure().load();
        String token = "TOKEN_HERE";
        // Create the shard builder object
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        // Set bot status to online
        builder.setStatus(OnlineStatus.ONLINE);
        // Enable intents
        builder.enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES);
        // Build the shard builder object
        shardManager = builder.build();

        // Register Listeners
        shardManager.addEventListener(new EventListener());
    }

    // Get Config (contains env variables)
   // public Dotenv getConfig() {
    //    return config;
    //}

    // Get the built shard manager
    public ShardManager getShardManager() {
        return shardManager;
    }

    // Main
    public static void main(String[] args) {
        // Attempt to log in to the bot
        try {
            Frank bot = new Frank();
        } catch (InvalidTokenException e) {
            System.out.println("Error, Token not valid.");
        }
    }
}