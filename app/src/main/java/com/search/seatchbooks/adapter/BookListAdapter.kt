package com.search.seatchbooks.adapter

import com.search.seatchbooks.R
import com.search.seatchbooks.network.Doc
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


import kotlinx.android.synthetic.main.recycler_list_row.view.*

class BookListAdapter: RecyclerView.Adapter<BookListAdapter.MyViewHolder>() {

    var bookListData = ArrayList<Doc>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListAdapter.MyViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recycler_list_row, parent, false )
        return MyViewHolder(inflater)

    }

    override fun onBindViewHolder(holder: BookListAdapter.MyViewHolder, position: Int) {
        holder.bind(bookListData[position])
    }

    override fun getItemCount(): Int {
        return bookListData.size
    }

    class   MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val tvTitle = view.tvTitle
        val tvPublisher = view.tvPublisher
        val tvDescription = view.tvDescription
        val thumbImageView = view.thumbImageView

        fun bind(data : Doc){
            tvTitle.text = data.title
            tvPublisher.text = data.authorName[0]
            tvDescription.text = data.text[0]

            val url  = data .isbn
            Glide.with(thumbImageView)
                .load(url)
                .circleCrop()
                .into(thumbImageView)
        }
    }
}