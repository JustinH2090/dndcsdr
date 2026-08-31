package com.dnd_cs_dr.dndcsdr.PlayerCharacter;

public class Weapon {
    private String name;
    private int damage;
    private int bonusDamage;

    public Weapon(String name, int damage, int bonusDamage){
        this.name = name;
        this.damage = damage;
        this.bonusDamage = bonusDamage;
    }
    public Weapon() {
        this.name = "";
        this.damage = 0;
        this.bonusDamage = 0;
    }

    //region getters and setters
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public int getBonusDamage(){
        return bonusDamage;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setBonusDamage(int bonusDamage){
        this.bonusDamage = bonusDamage;
    }
    //endregion

    public String toString(){
        return name + " " + damage + " " + bonusDamage;
    }
}
