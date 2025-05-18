package com.effmobileintern.firsttheme

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Написать свой делегат, который будет кешировать время запуска приложения.
 * Раз в 3 секунды выводить закешированное значение в логи Не в UI потоке.
 */

class LoggingDelegate : ReadOnlyProperty<Any?, String> {
    private var loggingTime = "App started:  ${System.currentTimeMillis()} "
    private val scope = CoroutineScope(Dispatchers.IO)

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        scope.launch {
            while (isActive) {
                Log.i("MyLog", loggingTime)
                delay(3000)
                loggingTime = "App is working: ${System.currentTimeMillis()}"


            }
        }
        return loggingTime
    }
}

//Дергаем в App
fun doLogging() = LoggingDelegate()