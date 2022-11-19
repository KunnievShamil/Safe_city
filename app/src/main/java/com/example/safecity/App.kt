package com.example.safecity

import android.app.Application
import com.yandex.mapkit.MapKitFactory

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey("74c5bda3-44c8-491c-87f0-221e9d9e5374")
    }
}