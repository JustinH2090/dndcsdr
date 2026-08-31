package com.dnd_cs_dr.dndcsdr.PlayerCharacter;

public class AbilityScores {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public AbilityScores(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }
    public AbilityScores() {
        this.strength = 0;
        this.dexterity = 0;
        this.constitution = 0;
        this.intelligence = 0;
        this.wisdom = 0;
        this.charisma = 0;
    }

    //region getters and setters
    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getConstitution() {
        return constitution;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getCharisma() {
        return charisma;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
    //endregion

    public int getModifier(int abilityScore){
        return Math.floorDiv(abilityScore - 10, 2);
    }

    public String toString(){
        return strength + " " + dexterity + " " + constitution + " "
                + intelligence + " " + wisdom + " " + charisma;
    }

}

