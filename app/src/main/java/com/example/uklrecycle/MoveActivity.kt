package com.example.uklrecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MoveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)
        tampilMyFriendsFragment()
    }

    private fun gantiFragment(
        fragmentManager: FragmentManager,
        fragment: Fragment, frameId: Int
    ) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(frameId, fragment)
        transaction.commit()
    }

    fun tampilMyFriendsFragment() {
        gantiFragment(
            supportFragmentManager,
            MyFriendsFragment.newInstance(), R.id.contentFrame
        )
    }

    fun tampilMyFriendsAddFragment() {
        gantiFragment(
            supportFragmentManager,
            MyFriendsAddFragment.newInstance(), R.id.contentFrame)
    }
}