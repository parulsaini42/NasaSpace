package com.example.parul.mapwithfloat;

import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Tsunami extends AppCompatActivity {
    private static final String SAMPLE1 = "tsu";
    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsunami);

        mVideoView = findViewById(R.id.videoview);
        MediaController controller = new MediaController(this);
        controller.setMediaPlayer(mVideoView);
        mVideoView.setMediaController(controller);



    }
    private Uri getMedia(String mediaName) {
        return Uri.parse("android.resource://" + getPackageName() +
                "/raw/" + mediaName);
    }
    @Override
    protected void onStart() {
        super.onStart();

        initializePlayer();
    }
    private void initializePlayer() {
        Uri videoUri = getMedia(SAMPLE1);
        mVideoView.setVideoURI(videoUri);
        mVideoView.start();
    }
    @Override
    protected void onStop() {
        super.onStop();

        releasePlayer();
    }

    private void releasePlayer() {
        mVideoView.stopPlayback();
    }
    @Override
    protected void onPause() {
        super.onPause();

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            mVideoView.pause();
        }



    }
}
