package com.example.myselfapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myselfapps.databinding.FragmentGalleryBinding

// 10121282 Reza A Mardiansyah
// PEM-ANDRO-3
// 9 Juni 2024
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GalleryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
// 10121282 Reza A Mardiansyah
// PEM-ANDRO-3
// 9 Juni 2024

class GalleryFragment : Fragment() {

    private lateinit var binding: FragmentGalleryBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val view = binding.root

        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2,RecyclerView.VERTICAL, false)
        recyclerView.adapter = GalleryActivityAdapter(getImageList())

        return view
    }

    private fun getImageList(): List<Int> {
        return listOf(
            R.drawable.ft_1,
            R.drawable.ft_2,
            R.drawable.ft_3,
            R.drawable.ft_7,
            R.drawable.ft_4,
            R.drawable.ft_5,
            R.drawable.ft_6,
            R.drawable.ft_8,
            R.drawable.ft_9,
            R.drawable.ft_10,
            R.drawable.profile_picture_1,
            R.drawable.profile_picture_2,
        )
    }
}