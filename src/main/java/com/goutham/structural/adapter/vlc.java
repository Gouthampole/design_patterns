package com.goutham.structural.adapter;

public class vlc implements AdvancedMediaPlayer{
    @Override
    public void playFile(String str) {
        System.out.println("playing vlc "+str+" file.");
    }
}
