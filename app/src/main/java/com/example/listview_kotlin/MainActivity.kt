package com.example.listview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var listview = findViewById<ListView>(R.id.listview)

        var list = mutableListOf<food>()
        list.add(food("Food_item","food",R.drawable.chicken_skewers))
        list.add(food("Juice","Juice",R.drawable.fresh_orange_juice_glass ))
        list.add(food("Food_item","Food",R.drawable.grilled_chicken_wings_flaming_grill_with_grilled))


        listview.adapter = myAdapter(this,R.layout.row,list)
    }
}