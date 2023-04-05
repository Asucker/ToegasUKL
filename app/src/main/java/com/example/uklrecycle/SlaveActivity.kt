package com.example.uklrecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SlaveActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvSlaves: RecyclerView
    private var list: ArrayList<Slave> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.slavepage)

        val btnMainActivity: Button = findViewById(R.id.btn_toko)
        btnMainActivity.setOnClickListener(this)

        rvSlaves = findViewById(R.id.rv_slave)
        rvSlaves.setHasFixedSize(true)

        list.addAll(SlaveData.listData)
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
        rvSlaves.layoutManager = LinearLayoutManager(this)
        val listSlaveAdapter = ZahlenSlaveAdapter(list)
        rvSlaves.adapter = listSlaveAdapter

        listSlaveAdapter.setOnItemClickCallback(object : ZahlenSlaveAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Slave) {
                showSelectedHero(data)
            }
        })
    }



    override fun onClick(v: View) {
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
            R.id.btn_toko -> {
                val mainIntent = Intent(this@SlaveActivity, StoreActivity::class.java)
                startActivity(mainIntent)
            }
        }
    }

    private fun showRecyclerGrid() {
        rvSlaves.layoutManager = GridLayoutManager(this, 2)
        val gridSlaveAdapterAdapter = GridSlaveAdapter(list)
        rvSlaves.adapter = gridSlaveAdapterAdapter

        gridSlaveAdapterAdapter.setOnItemClickCallback(object :
            GridSlaveAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Slave) {
                showSelectedHero(data)
            }
        })

    }

    private fun showRecyclerCardView() {
        rvSlaves.layoutManager = LinearLayoutManager(this)
        val cardViewSlaveAdapter = CardViewSlaveAdapter(list)
        rvSlaves.adapter = cardViewSlaveAdapter
    }


    private fun showSelectedHero(store: Slave) {
        Toast.makeText(this, "Sie wählen aus " + store.name, Toast.LENGTH_SHORT).show()
    }

    }
