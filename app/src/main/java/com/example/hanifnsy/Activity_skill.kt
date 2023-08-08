package com.example.hanifnsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity_skill : AppCompatActivity() {

    lateinit var skillView: RecyclerView
    lateinit var skillAdapter: SkillAdapter
    val list = ArrayList<SkillData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        skillView = findViewById(R.id.rvSkill)
        skillView.layoutManager = LinearLayoutManager(this)

        list.add(SkillData("Kotlin", "Pemograman Android"))
        list.add(SkillData("Laravel", "Pemograman Web"))

        skillAdapter = SkillAdapter(list)
        skillView.adapter = skillAdapter
    }
}