package com.example.a05demo

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recDirect)
        val recyclerView1 = findViewById<RecyclerView>(R.id.recAll)
        val header = findViewById<ConstraintLayout>(R.id.header)
        val button = findViewById<Button>(R.id.btnLogin)
        val nested = findViewById<NestedScrollView>(R.id.nestScroll)
        val imageView = findViewById<ImageView>(R.id.imageView)


        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerView1.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel>()
        val data1 = ArrayList<ItemDataModel>()



        data.add(
            ItemsViewModel(
                R.drawable.img1,
                getString(R.string.first_stop_health_visits_are_0_for_those_enrolled_in_either_medical_plan)
            )
        )
        data.add(ItemsViewModel(R.drawable.img1, getString(R.string._access_to_a_doctor_online)))
        data.add(
            ItemsViewModel(
                R.drawable.img1,
                getString(R.string.first_stop_health_visits_are_0_for_those_enrolled_in_either_medical_plan)
            )
        )
        data.add(
            ItemsViewModel(
                R.drawable.img1,
                getString(R.string.first_stop_health_visits_are_0_for_those_enrolled_in_either_medical_plan)
            )
        )
        data.add(
            ItemsViewModel(
                R.drawable.img1,
                getString(R.string.first_stop_health_visits_are_0_for_those_enrolled_in_either_medical_plan)
            )
        )
        data.add(
            ItemsViewModel(
                R.drawable.img1,
                getString(R.string.first_stop_health_visits_are_0_for_those_enrolled_in_either_medical_plan)
            )
        )


        val adapter = CustomAdapter(data)
        recyclerview.adapter = adapter


        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.medicitaion)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.body)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.cold)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.cough)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))
        data1.add(ItemDataModel(R.drawable.check, getString(R.string.allergies)))

        val adapter1 = ListAdapter(data1)
        recyclerView1.adapter = adapter1

        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:97686767676")
            startActivity(intent)
        }

        header.visibility = View.GONE

        nested.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { _, _, scrollY, _, _ ->

            if (scrollY > 0) {
                header.visibility = View.VISIBLE
                imageView.visibility=View.GONE


            } else {
                header.visibility = View.GONE
                imageView.visibility=View.VISIBLE

            }


        })


    }
}