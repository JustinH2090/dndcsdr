package com.dnd_cs_dr.dndcsdr.PlayerCharacter;

public class Armor {
    private String name;
    private int armorClass;

    public Armor(String name, int armorClass){
        this.name = name;
        this.armorClass = armorClass;
    }
    public Armor() {
        this.name = "";
        this.armorClass = 0;
    }
    //region getters and setters
    public String getName(){
        return name;
    }
    public int getArmorClass(){
        return armorClass;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setArmorClass(int armorClass){
        this.armorClass = armorClass;
    }
    //endregion
    public String toString(){
        return name + " " + armorClass;
    }
}
