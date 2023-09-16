package com.example.sampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SkillsActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Skills>
//    lateinit var skillsSno : Array<Int>
    lateinit var skillsTitle : Array<String>
    lateinit var skillsExperience : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

//        skillsSno = arrayOf(1,2,3,4,5,6,7,8,9)

        skillsTitle = arrayOf(
            "MERN Stack Development",
            "Flutter Development",
            "Firebase Integration",
            "Machine Learning",
            "Problem Solving",
            "App Development",
            "User Interface Design",
            "User Experience Design",
            "API Integration"
        )
        skillsExperience = arrayOf("2 Years",
            "2 Years","3 Years","2 Years","3 Years","3 Years","2 Years","2 Years","3 Years",
            )


        newRecyclerView = findViewById(R.id.skillsRecyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf()
        getUserData()

        }

    private fun getUserData() {
        for(i in skillsExperience.indices){
            val skills = Skills(skillsTitle[i], skillsExperience[i])
            newArrayList.add(skills)
        }

        newRecyclerView.adapter = SkillsAdapter(newArrayList)
    }
}
