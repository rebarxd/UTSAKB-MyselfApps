package com.example.myselfapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.example.myselfapps.databinding.FragmentMusicBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MusicFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
// 10121282 Reza A Mardiansyah
// PEM-ANDRO-3
// 9 Juni 2024

class MusicFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentMusicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            // Retrieve arguments if needed
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMusicBinding.inflate(inflater, container, false)
        val view = binding.root

        val recyclerView: RecyclerView = binding.rv1
        val adapter = FavouriteMusicActivityAdapter(createShapeItems())
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        val youTubePlayerView: YouTubePlayerView = binding.youtubePlayerView
        lifecycle.addObserver(youTubePlayerView)

        val videoId = "7NL9b054Fek" // Replace with your YouTube video ID
        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(videoId, 0f)
            }
        })

        return view
    }

    private fun createShapeItems(): List<ShapeItem> {
        val shapeItems = ArrayList<ShapeItem>()
        shapeItems.add(ShapeItem(R.drawable.msc_heather, "Heather", "Conan Gray"))
        shapeItems.add(ShapeItem(R.drawable.msc_lontalius, "Sleep Thru Ur Alarms", "Lontalius"))
        shapeItems.add(ShapeItem(R.drawable.msc_octane, "Octane","Until I Wake"))
        shapeItems.add(ShapeItem(R.drawable.msc_lost, "LosT","Bring Me The Horizon"))
        shapeItems.add(ShapeItem(R.drawable.msc_koiiro, "Koiiro","Mosawo"))


        return shapeItems
    }

    data class ShapeItem(val shapeRes: Int, val title: String, val artist: String)

}