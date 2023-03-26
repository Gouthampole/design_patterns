package com.goutham.structural.adapter;

public class Mp3Player implements MediaPlayer{
    @Override
    public void playMusic(String str) {
        System.out.println("playing the music...🎶"+str+".mp3");
    }
}
