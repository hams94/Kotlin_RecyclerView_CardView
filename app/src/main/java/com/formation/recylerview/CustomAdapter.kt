package com.formation.recylerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var pays:Array<String>) : RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {

    // Cette classe représente une vue sur la liste ainsi
    // que tous ses composants graphiques
    class MyViewHolder(vue:View):RecyclerView.ViewHolder(vue){
        var tvCountry = vue.findViewById<TextView>(R.id.tvCountry)
    }

    //Cette fonction est appelé lors de la création de la vue
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //désérialisation de la vue item_country.xml
        //(La désérialisation consiste à convertir un fichier xml en objet [variable] )
        var vue = LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false)
        return MyViewHolder(vue)
    }

    //Cette fonction permet de retourner le nombre d'éléments à afficher sur la liste
    override fun getItemCount(): Int {
        return pays.size
    }

    //Ces dans cette fonction qu'on va peupler les données dans les vues de la
    //liste à travers les positions de ces derniers, la position commence
    //a partir de 0 ...
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvCountry.setText(pays.get(position))
    }
}