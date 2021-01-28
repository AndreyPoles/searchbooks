package com.search.seatchbooks.network


import com.google.gson.annotations.SerializedName

data class Books(
    val docs: List<Doc>,
    val numFound: Int,
    @SerializedName("num_found")
    val start: Int
)