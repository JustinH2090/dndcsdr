package com.dnd_cs_dr.dndcsdr.PlayerCharacter;

import java.util.ArrayList;
import java.util.List;

public class PlayerCharacter {

    private String playerName;
    private String characterName;
    private String race;
    private String classType;
    private String subClass;
    private String background;
    private String alignment;

    private int level;
    private int proficiencyBonus;
    private int experiencePoints;

    private int armorClass;
    private int initiative;
    private int speed;
    private int currentHp;
    private int maxHp;
    private int tempHp;

    private AbilityScores abilityScores;

    private int deathSaveSuccesses;
    private int deathSaveFailures;
    private int exhaustionLevel;

    private int pp;
    private int gp;
    private int ep;
    private int sp;
    private int cp;

    private List<String> equipment;
    private List<String> proficienciesLanguagesFeats;
    private List<String> treasureAndEquipment;
    private List<String> featuresAndTraits;

    private List<Weapon> weapons;
    private List<Armor> armors;

    public PlayerCharacter(String playerName, String characterName) {
        this.playerName = playerName;
        this.characterName = characterName;
        this.race = "";
        this.classType = "";
        this.subClass = "";
        this.background = "";
        this.alignment = "";
        this.level = 1;
        this.proficiencyBonus = 0;
        this.experiencePoints = 0;
        this.armorClass = 10;
        this.initiative = 0;
        this.speed = 30;
        this.currentHp = 0;
        this.maxHp = 0;
        this.tempHp = 0;
        this.abilityScores = new AbilityScores();
        this.deathSaveSuccesses = 0;
        this.deathSaveFailures = 0;
        this.exhaustionLevel = 0;
        this.pp = 0;
        this.gp = 0;
        this.ep = 0;
        this.sp = 0;
        this.cp = 0;
        this.equipment = new ArrayList<>();
        this.proficienciesLanguagesFeats = new ArrayList<>();
        this.treasureAndEquipment = new ArrayList<>();
        this.featuresAndTraits = new ArrayList<>();
        this.weapons = new ArrayList<>();
        this.armors = new ArrayList<>();
    }
    public PlayerCharacter() {
        this.playerName = "Strange Woman";
        this.characterName = "Bashley";
        this.race = "Dwarf";
        this.classType = "Barbarian";
        this.subClass = "Berserker";
        this.background = "Survivalist";
        this.alignment = "Chaotic Good";

        this.level = 5;
        this.proficiencyBonus = 3;
        this.experiencePoints = 6500;

        this.armorClass = 18;
        this.initiative = 2;
        this.speed = 30;

        this.currentHp = 42;
        this.maxHp = 42;
        this.tempHp = 0;

        this.abilityScores = new AbilityScores(
                18,
                14,
                16,
                10,
                12,
                16
        );

        this.deathSaveSuccesses = 0;
        this.deathSaveFailures = 0;
        this.exhaustionLevel = 0;

        this.pp = 0;
        this.gp = 100;
        this.ep = 0;
        this.sp = 25;
        this.cp = 10;

        this.equipment = new ArrayList<>();
        this.proficienciesLanguagesFeats = new ArrayList<>();
        this.treasureAndEquipment = new ArrayList<>();
        this.featuresAndTraits = new ArrayList<>();
        this.weapons = new ArrayList<>();
        this.armors = new ArrayList<>();
    }

    //region getters and setters

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String getClassType() {
        return classType;
    }
    public void setClassType(String classType) {
        this.classType = classType;
    }
    public String getSubClass() {
        return subClass;
    }
    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }
    public String getBackground() {
        return background;
    }
    public void setBackground(String background) {
        this.background = background;
    }
    public String getAlignment() {
        return alignment;
    }
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getProficiencyBonus() {
        return proficiencyBonus;
    }
    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }
    public int getExperiencePoints() {
        return experiencePoints;
    }
    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
    public int getArmorClass() {
        return armorClass;
    }
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }
    public int getInitiative() {
        return initiative;
    }
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getCurrentHp() {
        return currentHp;
    }
    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }
    public int getMaxHp() {
        return maxHp;
    }
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
    public int getTempHp() {
        return tempHp;
    }
    public void setTempHp(int tempHp) {
        this.tempHp = tempHp;
    }
    public AbilityScores getAbilityScores() {
        return abilityScores;
    }
    public void setAbilityScores(AbilityScores abilityScores) {
        this.abilityScores = abilityScores;
    }
    public int getDeathSaveSuccesses() {
        return deathSaveSuccesses;
    }
    public void setDeathSaveSuccesses(int deathSaveSuccesses) {
        this.deathSaveSuccesses = deathSaveSuccesses;
    }
    public int getDeathSaveFailures() {
        return deathSaveFailures;
    }
    public void setDeathSaveFailures(int deathSaveFailures) {
        this.deathSaveFailures = deathSaveFailures;
    }
    public int getExhaustionLevel() {
        return exhaustionLevel;
    }
    public void setExhaustionLevel(int exhaustionLevel) {
        this.exhaustionLevel = exhaustionLevel;
    }
    public int getPp() {
        return pp;
    }
    public void setPp(int pp) {
        this.pp = pp;
    }
    public int getGp() {
        return gp;
    }
    public void setGp(int gp) {
        this.gp = gp;
    }
    public int getEp() {
        return ep;
    }
    public void setEp(int ep) {
        this.ep = ep;
    }
    public int getSp() {
        return sp;
    }
    public void setSp(int sp) {
        this.sp = sp;
    }
    public int getCp() {
        return cp;
    }
    public void setCp(int cp) {
        this.cp = cp;
    }
    public List<String> getEquipment() {
        return equipment;
    }
    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }
    public List<String> getProficienciesLanguagesFeats() {
        return proficienciesLanguagesFeats;
    }
    public void setProficienciesLanguagesFeats(List<String> proficienciesLanguagesFeats) {
        this.proficienciesLanguagesFeats = proficienciesLanguagesFeats;
    }
    public List<String> getTreasureAndEquipment() {
        return treasureAndEquipment;
    }
    public void setTreasureAndEquipment(List<String> treasureAndEquipment) {
        this.treasureAndEquipment = treasureAndEquipment;
    }
    public List<String> getFeaturesAndTraits() {
        return featuresAndTraits;
    }
    public void setFeaturesAndTraits(List<String> featuresAndTraits) {
        this.featuresAndTraits = featuresAndTraits;
    }
    public List<Weapon> getWeapons() {
        return weapons;
    }
    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }
    public List<Armor> getArmors() {
        return armors;
    }
    public void setArmors(List<Armor> armors) {
        this.armors = armors;
    }

    //endregion

    //region weapon and armor adding and removing

    public void addWeapon(Weapon w){
        this.weapons.add(w);
    }
    public void addArmor(Armor a){
        this.armors.add(a);
    }
    public void removeWeapon(Weapon w){
        this.weapons.remove(w);
    }
    public void removeArmor(Armor a){
        this.armors.remove(a);
    }

    //endregion

    public String toString(){
        return playerName + " " + characterName;
    }
}

