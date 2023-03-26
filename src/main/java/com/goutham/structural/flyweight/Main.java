package com.goutham.structural.flyweight;

import java.util.Random;

public class Main {
    static String[] playerTypes={"Terrorist","Counter Terrorist"};
    static String[] weapons={"AK47","machine gun","Flare Gun"};
    public static void main(String[] args) {
        for (int i=0;i<8;i++){
            Player player=PlayerFactory.getPlayer(getPlayerTypes());
            player.assignWeapon(getWeapons());
            player.mission();
        }


    }
    static String getPlayerTypes(){
        Random random=new Random();
        int index= random.nextInt(playerTypes.length);
        return playerTypes[index];

    }

    private static String getWeapons(){
        Random random=new Random();
        int index=random.nextInt(weapons.length);
        return weapons[index];
    }
}
