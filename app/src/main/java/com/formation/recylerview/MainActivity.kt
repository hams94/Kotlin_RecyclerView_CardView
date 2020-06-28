package com.formation.recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //Les données sous forme d'un tableau
    var pays = arrayOf("Guinee","Senegal","Mali","Liberia","Côte d'ivoire",
            "Guinee Bissau","Sierra Leone","Benin","Angola","Maroc","Egypte",
            "Tunisie","Mauritanie","Afrique du Sud","Rwanda","Nigeria","Ghana",
            "Gambie","Madagascar")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialisation de la recyclerview
        var recyclerView =  findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        //instanciation de notre adaptateur tout en transférant les données
        var adapter = CustomAdapter(pays)

        //définition de notre adaptateur pour la recyclerview
        recyclerView.adapter = adapter
    }
}
