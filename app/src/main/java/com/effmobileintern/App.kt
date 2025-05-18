package com.effmobileintern

import android.app.Application
import com.effmobileintern.firsttheme.doLogging

class App : Application() {

    //логгируем здесь так как апп стартует раньше активити и живет до смерти процесса
    private val loggingTime: String by doLogging()

    override fun onCreate() {
        super.onCreate()

        loggingTime
    }
}

//при запуске приложения:

//App started:  Sun May 18 15:24:36 GMT 2025
//App is working: Sun May 18 15:24:39 GMT 2025
//App is working: Sun May 18 15:24:42 GMT 2025
//App is working: Sun May 18 15:24:45 GMT 2025
//App is working: Sun May 18 15:24:48 GMT 2025
//App is working: Sun May 18 15:24:51 GMT 2025
//....