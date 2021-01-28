package com.search.seatchbooks.network


import com.google.gson.annotations.SerializedName

data class Doc(
    @SerializedName("author_alternative_name")
    val authorAlternativeName: List<String>,
    @SerializedName("author_key")
    val authorKey: List<String>,
    @SerializedName("author_name")
    val authorName: List<String>,
    val contributor: List<String>,
    @SerializedName("cover_edition_key")
    val coverEditionKey: String,
    @SerializedName("cover_i")
    val coverI: Int,
    val ddc: List<String>,
    @SerializedName("ebook_count_i")
    val ebookCountI: Int,
    @SerializedName("edition_count")
    val editionCount: Int,
    @SerializedName("edition_key")
    val editionKey: List<String>,
    @SerializedName("first_publish_year")
    val firstPublishYear: Int,
    @SerializedName("has_fulltext")
    val hasFulltext: Boolean,
    val ia: List<String>,
    @SerializedName("ia_box_id")
    val iaBoxId: List<String>,
    @SerializedName("ia_collection_s")
    val iaCollectionS: String,
    @SerializedName("ia_loaded_id")
    val iaLoadedId: List<String>,
    @SerializedName("id_goodreads")
    val idGoodreads: List<String>,
    @SerializedName("id_librarything")
    val idLibrarything: List<String>,
    val isbn: List<String>,
    val key: String,
    val language: List<String>,
    @SerializedName("last_modified_i")
    val lastModifiedI: Int,
    val lcc: List<String>,
    val lccn: List<String>,
    @SerializedName("lending_edition_s")
    val lendingEditionS: String,
    @SerializedName("lending_identifier_s")
    val lendingIdentifierS: String,
    val oclc: List<String>,
    val person: List<String>,
    val place: List<String>,
    @SerializedName("printdisabled_s")
    val printdisabledS: String,
    @SerializedName("public_scan_b")
    val publicScanB: Boolean,
    @SerializedName("publish_date")
    val publishDate: List<String>,
    @SerializedName("publish_place")
    val publishPlace: List<String>,
    @SerializedName("publish_year")
    val publishYear: List<Int>,
    val publisher: List<String>,
    val seed: List<String>,
    val subject: List<String>,
    val text: List<String>,
    val time: List<String>,
    val title: String,
    @SerializedName("title_suggest")
    val titleSuggest: String,
    val type: String
)