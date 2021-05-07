package com.github.rexfilius.viewgroupszuri.listView

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.github.rexfilius.viewgroupszuri.R

class ListItemAdapter(context: Context, funFact: List<FunFact>) :
    ArrayAdapter<FunFact>(context, 0, funFact) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        val fact = getItem(position)

        if (view == null) {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_list_item, parent, false)
        }

        val logo = view?.findViewById<ImageView>(R.id.listItemImage)
        val name = view?.findViewById<TextView>(R.id.listItemText)

        fact?.logo?.let { logo?.setImageResource(fact.logo) }
        name?.text = fact?.name

        view?.setOnClickListener {
            val intent = Intent(parent.context, DetailActivity::class.java)
            intent.putExtra(LOGO_EXTRAS, fact?.logo)
            intent.putExtra(NAME_EXTRAS, fact?.name)
            intent.putExtra(FACT_EXTRAS, fact?.fact)
            parent.context.startActivity(intent)
        }

        return view!!
    }

    companion object {
        const val LOGO_EXTRAS = "logo_extras"
        const val NAME_EXTRAS = "name_extras"
        const val FACT_EXTRAS = "fact_extras"
    }

}