package com.goutham.structural.flyweight;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String,Player> players=new HashMap<>();
    public static Player getPlayer(String type){
        Player p=null;
        if(players.containsKey(type))
            p=players.get(type);
        else {
            if(type.equalsIgnoreCase("Terrorist"))
                p=new Terrorist();
            else if(type.equalsIgnoreCase("counter terrorist"))
                p=new CounterTerrorist();
            players.put(type,p);
        }
        return p;
    }
}
