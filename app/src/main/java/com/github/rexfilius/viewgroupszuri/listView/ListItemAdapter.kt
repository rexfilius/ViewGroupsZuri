package com.github.rexfilius.viewgroupszuri.listView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.github.rexfilius.viewgroupszuri.R

class ListItemAdapter(context: Context, item: List<ListItem>) :
    ArrayAdapter<ListItem>(context, 0, item) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        val listItem = getItem(position)

        if (view == null) {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_list_item, parent, false)
        }

        val itemTextView = view?.findViewById<TextView>(R.id.listItemTextView)
        itemTextView?.text = listItem?.text

        return view!!
    }
}