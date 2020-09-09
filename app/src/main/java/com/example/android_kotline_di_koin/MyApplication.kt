package com.example.android_kotline_di_koin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module
import utils.HelloRepository
import utils.HelloRepositoryImpl
import utils.MySimplePresenter

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val appModule = module {

            // single instance of HelloRepository
            single{ HelloRepositoryImpl() as HelloRepository}

            // Simple Presenter Factory
            factory { MySimplePresenter(get()) }
        }

        startKoin{
            androidLogger()
            androidContext(this@MyApplication)
            modules(appModule)
        }
    }

}