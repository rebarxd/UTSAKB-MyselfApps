package com.example.myselfapps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_daily, container, false)
//
//        // Setup Daily Activity RecyclerView
//        val rvDailyActivity = view.findViewById<RecyclerView>(R.id.rvDailyActivity)
//        rvDailyActivity.layoutManager = LinearLayoutManager(context)
//        rvDailyActivity.adapter = DailyActivityAdapter(getDailyActivities())
//
//        // Setup Friends List RecyclerView
//        val rvFriendsList = view.findViewById<RecyclerView>(R.id.rvFriendsList)
//        rvFriendsList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//        rvFriendsList.adapter = FriendsListAdapter(getFriends())
//
//        return view
//    }
//
//    private fun getDailyActivities(): List<DailyActivity> {
//        // Replace with your data source
//        return listOf(
//            DailyActivity(R.drawable.ic_activity_1, "Activity 1"),
//            DailyActivity(R.drawable.ic_activity_2, "Activity 2")
//        )
//    }
//
//    private fun getFriends(): List<Friend> {
//        // Replace with your data source
//        return listOf(
//            Friend(R.drawable.ic_friend_1, "Friend 1"),
//            Friend(R.drawable.ic_friend_2, "Friend 2")
//        )
//    }
}