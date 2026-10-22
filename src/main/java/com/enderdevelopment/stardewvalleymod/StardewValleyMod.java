package com.enderdevelopment.stardewvalleymod;

import org.bukkit.plugin.java.JavaPlugin;

public class StardewValleyMod extends JavaPlugin {

    @Override
    public void onEnable() {
        // Initialize systems
        getServer().getPluginManager().registerEvents(new CalendarSystem(), this);
        getServer().getPluginManager().registerEvents(new FarmingSystem(), this);
        getServer().getPluginManager().registerEvents(new NPCManager(), this);
        getServer().getPluginManager().registerEvents(new RelationshipSystem(), this);
        getServer().getPluginManager().registerEvents(new ReputationSystem(), this);
        getServer().getPluginManager().registerEvents(new MissionSystem(), this);
        getServer().getPluginManager().registerEvents(new SkillSystem(), this);
        getServer().getPluginManager().registerEvents(new FriendshipSystem(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}