package com.example.cosain.maps;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class PlayMedia extends AppCompatActivity {

    Button neat;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_media);

            neat = (Button) findViewById(R.id.music);
        neat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = new MediaPlayer();
                String media_path="sdcard/Music";
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

                Uri uri = Uri.parse(media_path);
                try {
                    mediaPlayer.setDataSource(getApplicationContext(),uri);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(),"ambot",Toast.LENGTH_LONG).show();
                neat.setEnabled(false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
           mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
               @Override
               public void onCompletion(MediaPlayer mediaPlayer) {
                   neat.setEnabled(true);
                   mediaPlayer.release();
                   mediaPlayer = null;
                   Toast.makeText(getApplicationContext(),"dead",Toast.LENGTH_LONG).show();


               }
           });
            }
        });

    }

}
