package com.example.projectbp2681

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnMore:Button = findViewById(R.id.buttonMenu4)
        val btnBookKid:Button = findViewById(R.id.buttonMenu1)
        btnBookKid.setOnClickListener {
            val intentFragment = Intent(this, BookKidActivity::class.java)
            startActivity(intentFragment)
        }
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)
        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(this)
        //List data Buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure","loream ipsum loream ipsum loream ipsum loream ipsum"))
        data.add(BukuModel(R.drawable.book2,"Ade's Adventure","loream ipsum loream ipsum Dolor sit amet"))
        data.add(BukuModel(R.drawable.book4,"Mermaid To Rescue","loream ipsum loream ipsum loream ipsum"))

        //set Adapter
        val adapter = AdapterHome(data)
        //set adapter ke recycler View
        rvBuku.adapter = adapter

    }
}