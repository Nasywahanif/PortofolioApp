package com.example.hanifnsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Portofolio : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    val listPortofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listPortofolio.add(PortofolioData(
            R.drawable.web, "Project",
            "Jobsheet22", "https:github.com/Nasywahanif/JobSheet22"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.android,  "LKS Android",
            "Project Latihan LKS bidang Android", "https:github.com/Nasywahanif/ujianpraktek_paketC"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.web, "LKS Web",
            "Projek Latihan LKS bidang web", "https:github.com/Nasywahanif/web-berita"
        ))

        portofolioView = findViewById(R.id.rvPortofolio)
        portofolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = PortofolioAdapter(listPortofolio)
        portofolioAdapter.notifyDataSetChanged()
        portofolioView.adapter = portofolioAdapter

    }
}