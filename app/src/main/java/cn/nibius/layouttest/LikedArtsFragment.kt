package cn.nibius.layouttest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class LikedArtsFragment : Fragment() {
    val dataset = arrayOf(
        96.1,
        37.3,
        645.2,
        612.3,
        96.1,
        37.3,
        645.2,
        612.3,
        96.1,
        37.3,
        645.2,
        612.3,
        96.1,
        37.3,
        645.2,
        612.3
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        Log.d("LikedArtsFragment", "onCreateView: ")
        return layoutInflater.inflate(R.layout.liked_arts_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val likedArtsAdapter = LikedArtsAdapter(dataset)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.adapter = likedArtsAdapter
        recyclerView.layoutManager = GridLayoutManager(activity, 3)
//        Log.d("LikedArtsFragment", "onViewCreated: ")
    }
}