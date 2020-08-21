package com.example.leado.couse1Activities

import android.os.Bundle
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import com.example.leado.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import kotlinx.android.synthetic.main.fragment_lesson1.*
import kotlinx.android.synthetic.main.fragment_lesson2.*
import kotlinx.android.synthetic.main.fragment_lesson3.*
import kotlinx.android.synthetic.main.fragment_lesson4.*
import kotlinx.android.synthetic.main.fragment_refrence.*


class VideoActivity : AppCompatActivity() {

    val videoid = "n0gNe0xVKo8"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        initVideo(youtube_videoPlayer)
        initVideo(youtube_videoPlayer2)
        initVideo(youtube_videoPlayer3)
        initVideo(youtube_videoPlayer4)
        initVideo(youtube_videoPlayer5)
    }

    fun initVideo(youtube_view: YouTubePlayerView) {
        youtube_view.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(@NonNull youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(videoid, 0f)
            }
        })
    }
}