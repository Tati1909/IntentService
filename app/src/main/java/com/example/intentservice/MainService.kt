package com.example.intentservice

import android.app.IntentService
import android.content.Intent
import android.util.Log

private const val TAG = "MainServiceTAG"
const val MAIN_SERVICE_STRING_EXTRA = "MainServiceExtra"

/**
 * Добавим в сервис возможность обрабатывать входящий интент,
 * переопределим методы жизненного цикла сервиса
 * и отобразим логи в консоль:
 * com.example.intentservice D/MainServiceTAG: onCreate
 * com.example.intentservice D/MainServiceTAG: onStartCommand
 * com.example.intentservice D/MainServiceTAG: onHandleIntent Hello from ServiceFragment
 * com.example.intentservice D/MainServiceTAG: onDestroy
 */
class MainService(name: String = "MainService") : IntentService(name) {

    override fun onCreate() {
        Log.d(TAG, "onCreate")
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onHandleIntent(intent: Intent?) {
        Log.d(TAG, "onHandleIntent ${intent?.getStringExtra(MAIN_SERVICE_STRING_EXTRA)}")
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }
}