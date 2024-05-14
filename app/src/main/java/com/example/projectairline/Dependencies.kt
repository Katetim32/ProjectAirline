package com.example.projectairline

import android.content.Context
import androidx.room.Room


object Dependencies {

    private lateinit var applicationContext: Context

    fun init(context: Context) {
        applicationContext = context
    }

    private val appDatabase: AppDataBase by lazy {
        Room.databaseBuilder(applicationContext, AppDataBase::class.java, "database.db")
            .build()
    }
    val Repository: Repos by lazy { Repos(appDatabase.getFlightsDao(),
        appDatabase.getTicketsDao()) }

}