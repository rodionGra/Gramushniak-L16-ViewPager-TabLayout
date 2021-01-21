package com.a8acdhmwviewpagerandtablayout

import android.os.Parcelable
import android.text.style.LineHeightSpan
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Country(
    val name: String,
    val population: Int,
    val area: Int,
    val populationDensity: Double,
    val flag: Int
) : Parcelable{
    companion object {
        val listOfCountry: MutableList<Country> = mutableListOf(
            Country("United Kingdom", 59_000_000, 244_100, 240.0, R.drawable.united_kingdom_flag),
            Country("France", 61_000_000, 551_695, 117.6, R.drawable.france_flag),
            Country("Germany", 83_000_000, 357_021, 231.5, R.drawable.germany_flag),
            Country("Spain", 40_491_051,  504_645, 92.5, R.drawable.spain_flag)
        )
    }
}