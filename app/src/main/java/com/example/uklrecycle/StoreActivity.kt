package com.example.uklrecycle

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StoreActivity : AppCompatActivity(), View.OnClickListener {
    private  lateinit var rvHeroes : RecyclerView
    private var list:ArrayList<Store> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.storepage)

        val btnMainActivity: Button = findViewById(R.id.btn_slave)
        btnMainActivity.setOnClickListener(this)

        rvHeroes = findViewById(R.id.rv_hero)
        rvHeroes.setHasFixedSize(true)

        list.addAll(StoreData.listData)
        showRecyclerList()

        val btnListView: ImageButton =
            findViewById(R.id.buttonlist)
        btnListView.setOnClickListener(this)

        val btnGridView: ImageButton =
            findViewById(R.id.buttongrid)
        btnGridView.setOnClickListener(this)

        val btnCardView: ImageButton =
            findViewById(R.id.buttoncard)
        btnCardView.setOnClickListener(this)

    }
    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListStoreAdapter(list)
        rvHeroes.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListStoreAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Store) {
                showSelectedHero(data)
            }
        })
    }

     override fun onClick(v: View){
        when (v.id) {
            R.id.buttonlist -> {
                title = "Mode List"
                showRecyclerList()
            }

            R.id.buttongrid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }

            R.id.buttoncard -> {
                title = "Mode CardView"
                showRecyclerCardView()
            }
            R.id.btn_slave -> {
                val mainIntent = Intent(this@StoreActivity, SlaveActivity::class.java)
                startActivity(mainIntent)
            }
        }
    }
    private fun showRecyclerGrid() {
        rvHeroes.layoutManager = GridLayoutManager(this, 2)
        val gridStoreAdapter = GridStoreAdapter(list)
        rvHeroes.adapter = gridStoreAdapter

        gridStoreAdapter.setOnItemClickCallback(object : GridStoreAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Store) {
                showSelectedHero(data)
            }
        })

    }
    private fun showRecyclerCardView() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewStoreAdapter(list)
        rvHeroes.adapter = cardViewHeroAdapter
    }



    private fun showSelectedHero(store: Store) {
        Toast.makeText(this, "Sie wählen aus " + store.name, Toast.LENGTH_SHORT).show()
    }




        }

