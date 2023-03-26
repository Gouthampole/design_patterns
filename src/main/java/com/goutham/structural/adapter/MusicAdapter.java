package com.goutham.structural.adapter;

public class MusicAdapter implements MediaPlayer{
    private AdvancedMediaPlayer player;

    public MusicAdapter(AdvancedMediaPlayer player) {
        this.player = player;
    }

    @Override
    public void playMusic(String str) {
        player.playFile(str);
    }
}
