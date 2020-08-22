package com.example.leado.couse2Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.NonNull
import com.example.leado.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import kotlinx.android.synthetic.main.fragment_lesson1_2.*
import kotlinx.android.synthetic.main.fragment_lesson2_2.*
import kotlinx.android.synthetic.main.fragment_lesson3_2.*
import kotlinx.android.synthetic.main.fragment_lesson4_2.*
import kotlinx.android.synthetic.main.fragment_refrence_2.*


class VideoActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video2)

        initVideo(youtube_videoPlayer)
        initVideo(youtube_videoPlayer2)
        initVideo(youtube_videoPlayer3)
        initVideo(youtube_videoPlayer4)
        initVideo(youtube_videoPlayer5)
    }

    fun initVideo(youtube_view: YouTubePlayerView) {
        val videoid = "n0gNe0xVKo8"
        youtube_view.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(@NonNull youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(videoid, 0f)
            }
        })
    }
}