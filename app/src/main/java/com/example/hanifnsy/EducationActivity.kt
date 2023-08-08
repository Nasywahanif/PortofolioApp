package com.example.hanifnsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rvEducation)
        educationView.layoutManager = LinearLayoutManager(this)

        list.add(SchoolData("SD Negeri Ngemplak", "Kec.Mranggen, Kab.Demak"))
        list.add(SchoolData("MTs Negeri 1 Demak", "Kec.Mranggen, Kab.Demak"))
        list.add(SchoolData("SMK Negeri 1 sayung", "Jl.Raya Semarang-Demak"))

        educationAdapter = SchoolAdapter(list)
        educationView.adapter = educationAdapter

    }
}