package com.example.sampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nightMode = AppCompatDelegate.getDefaultNightMode()
        setTheme(if (nightMode == AppCompatDelegate.MODE_NIGHT_YES)
            R.style.AppTheme_Dark
        else R.style.AppTheme_Light)
        setContentView(R.layout.activity_main)

        val darkModeSwitch = findViewById<SwitchMaterial>(R.id.DarkModeSwitch)
        val textHeading = findViewById<TextView>(R.id.textHeading2)
        val textDesignation = findViewById<TextView>(R.id.Designation)
        val buttonAchievement = findViewById<Button>(R.id.achievements)
        val buttonEducation = findViewById<Button>(R.id.education)
        val buttonExperience = findViewById<Button>(R.id.experience)
        val buttonContactMe = findViewById<Button>(R.id.contact)
        val buttonSkills = findViewById<Button>(R.id.skills)

        if (nightMode == AppCompatDelegate.MODE_NIGHT_YES){
            textHeading.setTextColor(ContextCompat.getColor(this, R.color.white))
            textDesignation.setTextColor(ContextCompat.getColor(this, R.color.white))
            buttonSkills.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColordark))
            buttonEducation.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColordark))
            buttonExperience.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColordark))
            buttonAchievement.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColordark))

        }
        else {
            textHeading.setTextColor(ContextCompat.getColor(this, R.color.black))
            textDesignation.setTextColor(ContextCompat.getColor(this, R.color.black))
            buttonSkills.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColorlight))
            buttonEducation.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColorlight))
            buttonExperience.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColorlight))
            buttonAchievement.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColorlight))
        }

            darkModeSwitch.setOnCheckedChangeListener {_, isChecked ->
                if(isChecked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
            }

        buttonSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        }


        buttonExperience.setOnClickListener {
            intent = Intent(this, ExperienceActivity::class.java)
            startActivity(intent)
        }


        buttonEducation.setOnClickListener {
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }



        buttonAchievement.setOnClickListener {
            intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        }

        buttonContactMe.setOnClickListener {
            intent = Intent(this, ContactMeActivity::class.java)
            startActivity(intent)
        }
    }
}

//                         @Amogh_2409      Instagram