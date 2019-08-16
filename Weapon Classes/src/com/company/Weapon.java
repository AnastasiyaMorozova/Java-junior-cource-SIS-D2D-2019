package com.company;

public class Weapon
{
    private String weaponName;
    private PhisicalDamage phisicalDamage;
    private HeatDamage heatDamage;
    private IceDamage iceDamage;

    public Weapon(String weaponNameString, int phisicalDamageValue, int heatDamageValue, int iceDamageValue) {
        weaponName = weaponNameString;
        phisicalDamage = new PhisicalDamage(phisicalDamageValue);
        heatDamage = new HeatDamage(heatDamageValue);
        iceDamage = new IceDamage(iceDamageValue);
    }
    public String getName() {
        return weaponName;
    }
    public int hitTarget() {
        return  phisicalDamage.getDamage() +
                heatDamage.getDamage() +
                iceDamage.getDamage();
    }
}