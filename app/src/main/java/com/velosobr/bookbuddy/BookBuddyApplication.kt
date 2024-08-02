package com.velosobr.bookbuddy

import android.app.Application
import com.velosobr.bookbuddy.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class BookBuddyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BookBuddyApplication)
            modules(appModule)
        }
    }
}