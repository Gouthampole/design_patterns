package com.goutham.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Mp3Player mp3Player=new Mp3Player();
        mp3Player.playMusic("Nights");

        MusicAdapter adapter=new MusicAdapter(new vlc());
        adapter.playMusic("Imagine Dragons");
    }
}
