package com.example.sampleapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Skills(
//    var skillSno: Int,
    var skillHeading: String,
    var skillExperience: String
)

class SkillsAdapter(private val skillList: ArrayList<Skills>) :
    RecyclerView.Adapter<SkillsAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.skill_items, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = skillList[position]
//        holder.skillsSno.text = currentItem.skillSno.toString()
        holder.skillsTitle.text = currentItem.skillHeading
        holder.skillsExperience.text = currentItem.skillExperience
    }

    override fun getItemCount(): Int {
        return skillList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val skillsSno: TextView = itemView.findViewById(R.id.skillSno)
        val skillsTitle: TextView = itemView.findViewById(R.id.skillTitle)
        val skillsExperience: TextView = itemView.findViewById(R.id.skillExperience)
    }
}
