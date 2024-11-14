package com.example.miapp.data

import com.example.miapp.R
import com.example.miapp.model.Favorite
import com.example.miapp.model.Recent
import com.example.miapp.model.Trending

object DummyData {
    val miTrending = listOf (
        Trending(
            id = 1,
            name = "#Trending 1",
            photo = R.drawable.bg
        ),
        Trending(
            id = 2,
            name = "#Trending 2",
            photo = R.drawable.bg
        ),
        Trending(
            id = 3,
            name = "#Trending 3",
            photo = R.drawable.bg
        ),
        Trending(
            id = 4,
            name = "#Trending 4",
            photo = R.drawable.bg
        ),
        Trending(
            id = 5,
            name = "#Trending 5",
            photo = R.drawable.bg
        ),
        Trending(
            id = 6,
            name = "#Trending 6",
            photo = R.drawable.bg
        ),
        Trending(
            id = 7,
            name = "#Trending 7",
            photo = R.drawable.bg
        ),
        Trending(
            id = 8,
            name = "#Trending 8",
            photo = R.drawable.bg
        ),
        Trending(
            id = 9,
            name = "#Trending 9",
            photo = R.drawable.bg
        ),
        Trending(
            id = 10,
            name = "#Trending 10",
            photo = R.drawable.bg
        ),
    )

    val miRecent = listOf(
        Recent(
            id = 1,
            name = "Last Child",
            time = "1 Hours",
            photo = R.drawable.band,
        ),
        Recent(
            id = 2,
            name = "Bernadya",
            time = "3 Hours",
            photo = R.drawable.solo_satu,
        ),
        Recent(
            id = 3,
            name = "Shiela On 7",
            time = "1.2  Hours",
            photo = R.drawable.solo_dua,
        ),
        Recent(
            id = 4,
            name = "Feby Putri",
            time = "34 Minutes",
            photo = R.drawable.solo_tiga,
        ),
        Recent(
            id = 5,
            name = "Ed Shereen",
            time = "56 Minutes",
            photo = R.drawable.solo_empat,
        ),
        Recent(
            id = 6,
            name = "Slank",
            time = "1 Hours",
            photo = R.drawable.solo_lima,
        ),
        Recent(
            id = 7,
            name = "Neck Deep",
            time = "43 Minutes",
            photo = R.drawable.solo_enam,
        ),
        Recent(
            id = 8,
            name = "Fest",
            time = "2 Hours",
            photo = R.drawable.solo_tujuh,
        ),
        Recent(
            id = 9,
            name = "Viera",
            time = "1.4 Hours",
            photo = R.drawable.duo,
        ),
        Recent(
            id = 10,
            name = "Dewa 19",
            time = "1.4 Hours",
            photo = R.drawable.band_satu,
        ),
    )

    val favorites = listOf(
        Favorite(
            id = 1,
            name = "Digital Marketing",
            photo = R.drawable.digital_marketing
        ),
        Favorite(
            id = 2,
            name = "Menjadi Designer",
            photo = R.drawable.designer
        ),
        Favorite(
            id = 3,
            name = "Modern Android in 2024",
            photo = R.drawable.modern_android
        ),
        Favorite(
            id = 4,
            name = "Iftar Inners",
            photo = R.drawable.iftar
        ),
        Favorite(
            id = 5,
            name = "Container Technology",
            photo = R.drawable.container_technologi
        ),
        Favorite(
            id = 6,
            name = "Filosofi Ilo",
            photo = R.drawable.filosofi_ilo
        ),
        Favorite(
            id = 7,
            name = "Tips Lulus MSIB",
            photo = R.drawable.lulus_msib
        ),
        Favorite(
            id = 8,
            name = "Fresh Graduate jadi Manager",
            photo = R.drawable.manager
        ),
        Favorite(
            id = 9,
            name = "Kenapa IBM Academy?",
            photo = R.drawable.ibm_academy
        ),
        Favorite(
            id = 10,
            name = "Unreal Engine",
            photo = R.drawable.unreal_engine
        ),
        Favorite(
            id = 11,
            name = "Masih Stuck di Chat GPT?",
            photo = R.drawable.stuck_chatgpt
        ),
    )
}