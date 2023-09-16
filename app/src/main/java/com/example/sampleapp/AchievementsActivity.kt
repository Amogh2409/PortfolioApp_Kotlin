package com.example.sampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AchievementsActivity : AppCompatActivity() {

    private lateinit var  newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Achievements>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var date : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievements)

        imageId = arrayOf(
            R.drawable.cisco,
            R.drawable.googleimage,
            R.drawable.cisco,
            R.drawable.freecodecamp,
            R.drawable.cisco,
            R.drawable.freecodecamp,

        )

        heading = arrayOf(
            "Introduction to IOT",
            "Introduction to Data Studio",
            "Python Essential's",
            "Responsive Web Design",
            "Programming Essential C++",
            "Data Analysis with Python",


        )

        date = arrayOf(
            "December - 2022",
            "January - 2023",
            "March - 2023",
            "February - 2023",
            "January - 2023",
            "March - 2023",

        )


        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf()
        getUserData()

    }

    private fun getUserData(){
        for (i in imageId.indices){
            val achievements = Achievements(imageId[i], heading[i], date[i])
            newArrayList.add(achievements)
        }

        newRecyclerView.adapter = achievementsAdapter(newArrayList)
    }
}