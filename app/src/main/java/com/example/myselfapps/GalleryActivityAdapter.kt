package com.example.myselfapps


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
// 10121282 Reza A Mardiansyah
// PEM-ANDRO-3
// 9 Juni 2024
class GalleryActivityAdapter(private val imageList: List<Int>) : RecyclerView.Adapter<GalleryActivityAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.gallery_card, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageRes = imageList[position]
        holder.bind(imageRes)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.shapeImageView)

        fun bind(imageRes: Int) {
            imageView.setImageResource(imageRes)
        }
    }
}