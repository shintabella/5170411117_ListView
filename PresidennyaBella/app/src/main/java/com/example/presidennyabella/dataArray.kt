package com.example.presidennyabella
import getset
object dataArray {

    private val languages =
        listOf("Suekarno", "Soeharto", "Habibie", "Gusdur", "Megawati", "Susilo Bambang Yudhoyono", "Joko wiDodo")

    val desk = listOf(
        "Soekarno yang pertama kali mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.",
        "Soeharto Sebelum menjadi presiden, Soeharto adalah pemimpin militer pada masa pendudukan Jepang dan Belanda, dengan pangkat terakhir Mayor Jendera",
        "Habibie pernah bekerja di Messerschmitt-Bölkow-Blohm, sebuah perusahaan penerbangan yang berpusat di Hamburg, Jerman.",
        "Gusdur secara terbuka pernah menyatakan bahwa ia memiliki darah Tionghoa",
        "Karier politik Megawati Soekarnoputri yang penuh lika-liku dan warna seakan searah dengan garis kisah kehidupan perjalanan bahtera rumah tangganya yang pernah mengalami kegagalan",
        "Susilo Bambang Yudhoyono lulus dari Akademi Angkatan Bersenjata Republik Indonesia dengan penghargaan Adhi Makayasa sebagai murid lulusan terbaik dan Tri Sakti Wiratama yang merupakan prestasi tertinggi gabungan mental, fisik, dan kecerdasan intelektual",
        "Joko Widodo berasal dari keluarga sederhana, bahkan rumahnya pernah digusur sebanyak tiga kali ketika dia masih kecil,tetapi ia mampu menyelesaikan pendidikannya di Fakultas Kehutanan Universitas Gajah Mada"
    )

    private val pictDat = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listData: ArrayList<getset>
        get() {
            val list = arrayListOf<getset>()
            for (position in languages.indices) {
                val listDat = getset()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list
        }
}