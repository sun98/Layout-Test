package cn.nibius.layouttest

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ArtsAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
//        Log.d("ArtsAdapter", "createFragment: ")
        return when (position) {
            0 -> LikedArtsFragment()
            1 -> LikedArtsFragment()
            2 -> LikedArtsFragment()
            else -> LikedArtsFragment()
        }
    }

}