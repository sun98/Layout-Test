package cn.nibius.layouttest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LikedArtsAdapter(private val dataset: Array<Double>) :
    RecyclerView.Adapter<LikedArtsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.likedCount)
        val imageView: ImageView = view.findViewById(R.id.likedThumb)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.art_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataset[position].toString() + "w"
        holder.imageView.setImageResource(R.mipmap.bg_mine)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}