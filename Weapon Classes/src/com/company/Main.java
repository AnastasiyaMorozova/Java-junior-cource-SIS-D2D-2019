package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        List<Weapon> weaponList = new ArrayList<Weapon>();
        weaponList.add(new Weapon("Обычный меч", 10, 0, 0));
        weaponList.add(new Weapon("Подожженный меч",10, 20, 0));
        weaponList.add(new Weapon("Замороженный меч",10, 0, 15));
        weaponList.add(new Weapon("Обычный лук",15, 0, 0));
        weaponList.add(new Weapon("Лук с огняными стрелами",15, 30, 0));
        weaponList.add(new Weapon("Обычный молот",20, 0, 0));
        weaponList.add(new Weapon("Замороженный молот",20, 0, 20));

        boolean flag = true;
        int weaponIndex;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (flag)
        {
            System.out.println("\nВыберите оружие (0 для выхода):");
            weaponIndex = 1;
            for (Weapon someWeapon : weaponList) {
                System.out.println(weaponIndex + " - " + someWeapon.getName());
                weaponIndex++;
            }
            System.out.println("\n>>>\t");

            try {
                weaponIndex = Integer.parseInt(reader.readLine()) - 1;
                if ((weaponIndex < 0) || (weaponIndex > weaponList.size() - 1))
                    throw new NumberFormatException();
                System.out.println("Урон:  " + weaponList.get(weaponIndex).hitTarget());
            }
            catch (NumberFormatException exception) {
                System.out.println("Завершение работы с программой...");
                flag = false;
            }
        }
        reader.close();
    }
}
