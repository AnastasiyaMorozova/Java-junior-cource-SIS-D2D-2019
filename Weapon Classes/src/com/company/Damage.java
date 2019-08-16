package com.company;

abstract class Damage
{
    public int damageValue;
    public Damage(int damVal) {
        damageValue = damVal;
    }
    public abstract int getDamage();
}

class PhisicalDamage extends Damage
{
    public PhisicalDamage(int damVal) { super(damVal); }
    public int getDamage() {
        return damageValue;
    }
}

class HeatDamage extends Damage
{
    public HeatDamage(int damVal) { super(damVal); }
    public int getDamage() {
        return damageValue;
    }
}

class IceDamage extends Damage
{
    public IceDamage(int damVal) { super(damVal); }
    public int getDamage() {
        return damageValue;
    }
}