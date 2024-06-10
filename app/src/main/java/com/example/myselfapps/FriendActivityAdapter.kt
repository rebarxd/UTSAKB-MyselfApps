package com.example.myselfapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
// 10121282 Reza A Mardiansyah
// PEM-ANDRO-3
// 9 Juni 2024
class FriendActivityAdapter(private val shapeItems: List<DailyFragment.ShapeItem>) :
    RecyclerView.Adapter<FriendActivityAdapter.ShapeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShapeViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.friendlist_card, parent, false)
        return ShapeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShapeViewHolder, position: Int) {
        val shapeItem = shapeItems[position]
        holder.bind(shapeItem)
    }

    override fun getItemCount(): Int {
        return shapeItems.size
    }

    inner class ShapeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val shapeImageView: ImageView = itemView.findViewById(R.id.shapeImageView)
        private val shapeTextView: TextView = itemView.findViewById(R.id.shapeTextView)

        fun bind(shapeItem: DailyFragment.ShapeItem) {
            shapeImageView.setImageResource(shapeItem.shapeRes)
            shapeTextView.text = shapeItem.text
        }
    }
}