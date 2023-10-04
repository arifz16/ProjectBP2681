package com.example.projectbp2681

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectbp2681.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {

    lateinit var binding:ActivityBookKidBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //event button untuk memanggil fragment
        binding.buttonFairy.setOnClickListener {
            replaceFrgament(FairyFragment())
        }
        binding.buttonFable.setOnClickListener {
            replaceFrgament(FableFragment())
        }
        binding.buttonScience.setOnClickListener {
            replaceFrgament(ScienceFragment())
        }
    }

    //ganti fragment
    fun replaceFrgament(frg: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook, frg)
        fragmentTrx.commit()

    }
}