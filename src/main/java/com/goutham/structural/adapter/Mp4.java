package com.goutham.structural.adapter;

public class Mp4 implements AdvancedMediaPlayer{
    @Override
    public void playFile(String str) {
        System.out.println("playing mp4 "+str+" file.");
    }
}
