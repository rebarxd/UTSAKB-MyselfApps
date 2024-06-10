package com.example.myselfapps


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.myselfapps.databinding.FragmentProfileBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import android.app.Dialog
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

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

    private lateinit var binding: FragmentProfileBinding
    private lateinit var googleMap: GoogleMap

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root

        val profileImageView: ImageView = binding.profileImageView
        val descriptionTextView: TextView = binding.descriptionTextView
        val callImageView: ImageView = binding.callImageView
        val emailImageView: ImageView = binding.emailImageView
        val whatsappImageView: ImageView = binding.whatsappImageView
        val instagramImageView: ImageView = binding.instagramImageView
        val findMeButton: Button = binding.findMeButton
//        val mapView: MapView = binding.mapView

        // Set profile image
        profileImageView.setImageResource(R.drawable.profile_picture_1)

        // Set description
        descriptionTextView.text =
            "10121282 - Reza A Mardiansyah. Mahasiswa Teknik Informatika."


        // Handle call button click
        callImageView.setOnClickListener {
            val phoneNumber = "+6289696135425"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(intent)
        }

        // Handle email button click
        emailImageView.setOnClickListener {
            val emailAddress = "rebarxd@gmail.com"
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$emailAddress"))
            startActivity(intent)
        }

        // Handle WhatsApp button click
        whatsappImageView.setOnClickListener {
            val phoneNumber = "+6282128485291"
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://api.whatsapp.com/send?phone=$phoneNumber")
            )
            startActivity(intent)
        }

        // Handle Instagram button click
        instagramImageView.setOnClickListener {
            val instagramUrl = "https://www.instagram.com/rebar69xd"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(instagramUrl))
            startActivity(intent)
        }

        // Handle Find Me button click
        findMeButton.setOnClickListener {
            val latitude = -6.986089274762031
            val longitude = 107.84715380125424
            val label = "Lokasi Saya"
            val uri = Uri.parse("geo:$latitude,$longitude?q=$latitude,$longitude($label)")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        val aboutButton: Button = view.findViewById(R.id.aboutButton)
        aboutButton.setOnClickListener {
            showAboutDialog()
        }



        return view
    }

    private fun showAboutDialog() {
        val aboutDialog = AboutDialog()
        aboutDialog.show(parentFragmentManager, "AboutDialog")
    }
}