package cn.nibius.layouttest

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MineFragment : Fragment(R.layout.mine_fragment) {
    private lateinit var artsAdapter: ArtsAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        artsAdapter = ArtsAdapter(this)
        viewPager = view.findViewById(R.id.pager)
        viewPager.adapter = artsAdapter
        tabLayout = view.findViewById(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "作品"
                }
                1 -> {
                    tab.text = "私密"
                    tab.setIcon(R.drawable.ic_baseline_lock_24)
                }
                2 -> {
                    tab.text = "喜欢"
                    tab.setIcon(R.drawable.ic_baseline_lock_24)
                }
                else -> tab.text = ""
            }
        }.attach()
    }
}