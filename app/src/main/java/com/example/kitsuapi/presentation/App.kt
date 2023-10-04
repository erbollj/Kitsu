package com.example.kitsuapi.presentation

import android.app.Application
import com.example.data.di.dataModule
import com.example.domain.di.domainModule
import com.example.kitsuapi.presentation.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                presentationModule,
                dataModule,
                domainModule
            )
        }
    }

}