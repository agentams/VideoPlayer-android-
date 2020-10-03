package com.ams.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setTitle("Wellcome")

        val  videoview=findViewById<VideoView>(R.id.videoplayer)
        val mediaController= MediaController(this)
        mediaController.setAnchorView(videoview)

        val path="android.resource://"+packageName+"/"+R.raw.vid

        val  uri= Uri.parse(path)
        videoview.setMediaController(mediaController)
        videoview.setVideoURI(uri)
        videoview.requestFocus()
        videoview.start()
    }
}