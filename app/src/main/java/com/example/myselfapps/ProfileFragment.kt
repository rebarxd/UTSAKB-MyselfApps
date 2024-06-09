package com.example.myselfapps


import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
// 10121282 Reza A Mardiansyah
// PEM-ANDRO-3
// 9 Juni 2024

class ProfileFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val ivInstagram: ImageView = view.findViewById(R.id.ivInstagram)
        ivInstagram.setOnClickListener {
            openInstagramProfile()
        }

        return view
    }

    private fun openInstagramProfile() {
        val uri = Uri.parse("http://instagram.com/_u/rebar69xd") // Ganti your_instagram_username dengan username Anda
        val likeIng = Intent(Intent.ACTION_VIEW, uri)
        likeIng.setPackage("com.instagram.android")

        try {
            startActivity(likeIng)
        } catch (e: ActivityNotFoundException) {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/your_instagram_username"))) // Ganti your_instagram_username dengan username Anda
        }
    }
}