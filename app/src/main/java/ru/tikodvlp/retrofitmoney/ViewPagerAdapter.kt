package ru.tikodvlp.retrofitmoney

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ru.tikodvlp.retrofitmoney.screens.second.SecondFragment
import ru.tikodvlp.retrofitmoney.screens.start.StartFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> StartFragment()
            else -> SecondFragment()
        }
    }

}