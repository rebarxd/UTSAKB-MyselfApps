package com.example.myselfapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myselfapps.databinding.FragmentDailyBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DailyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
// 10121282 Reza A Mardiansyah
// PEM-ANDRO-3
// 9 Juni 2024
class DailyFragment : Fragment() {

    private lateinit var binding: FragmentDailyBinding

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
        binding = FragmentDailyBinding.inflate(inflater, container, false)
        val view = binding.root

        val recyclerView: RecyclerView = binding.recyclerView
        val adapter = DailyActivityAdapter(createShapeItems())
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter


        val recyclerView2: RecyclerView = binding.recyclerView2
        val adapter2 = FriendActivityAdapter(createShapeItems2())
        recyclerView2.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = adapter2

        return view
    }

    private fun createShapeItems(): List<ShapeItem> {
        val shapeItems = ArrayList<ShapeItem>()
        shapeItems.add(ShapeItem(R.drawable.daily_workout, "Olahraga jam 5 Sore"))
        shapeItems.add(ShapeItem(R.drawable.daily_rest, "Istirahat jam 6 Petang"))
        shapeItems.add(ShapeItem(R.drawable.daily_sleep, "Tidur jam 10 Malam"))
        shapeItems.add(ShapeItem(R.drawable.daily_wakeup, "Bangun jam 4 Pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_mandi, "Mandi jam 5 pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_sarapan2, "Sarapan jam 6 pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_repeat, "Daily Repeat"))
        shapeItems.add(ShapeItem(R.drawable.daily_workout, "Olahraga jam 5 Sore"))
        shapeItems.add(ShapeItem(R.drawable.daily_rest, "Istirahat jam 6 Petang"))
        shapeItems.add(ShapeItem(R.drawable.daily_sleep, "Tidur jam 10 Malam"))
        shapeItems.add(ShapeItem(R.drawable.daily_wakeup, "Bangun jam 4 Pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_mandi, "Mandi jam 5 pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_sarapan2, "Sarapan jam 6 pagi"))
        shapeItems.add(ShapeItem(R.drawable.daily_repeat, "Daily Repeat"))


        return shapeItems
    }

    private fun createShapeItems2(): List<ShapeItem> {
        val shapeItems = ArrayList<ShapeItem>()
        shapeItems.add(ShapeItem(R.drawable.profile, "Rafly"))
        shapeItems.add(ShapeItem(R.drawable.profile, "David"))
        shapeItems.add(ShapeItem(R.drawable.profile, "Ghifar"))
        shapeItems.add(ShapeItem(R.drawable.profile, "Dimas"))
        shapeItems.add(ShapeItem(R.drawable.profile, "Hanung"))
        shapeItems.add(ShapeItem(R.drawable.profile, "Zulfikar"))
        shapeItems.add(ShapeItem(R.drawable.profile, "Gading"))
        shapeItems.add(ShapeItem(R.drawable.profile, "Yanwar"))
        shapeItems.add(ShapeItem(R.drawable.profile, "Cindy"))
        shapeItems.add(ShapeItem(R.drawable.profile, "Kayla"))
        shapeItems.add(ShapeItem(R.drawable.profile, "Rivaldy"))


        return shapeItems
    }

    data class ShapeItem(val shapeRes: Int, val text: String)

}