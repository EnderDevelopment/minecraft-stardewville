package com.enderdevelopment.stardewvalleymod.npc;

public class NPC {
    private String name;
    private String personality;
    private String[] dialogues;
    private String dailyRoutine;
    private String[] behaviors;

    public NPC(String name, String personality, String[] dialogues, String dailyRoutine, String[] behaviors) {
        this.name = name;
        this.personality = personality;
        this.dialogues = dialogues;
        this.dailyRoutine = dailyRoutine;
        this.behaviors = behaviors;
    }

    // Getters and setters
}