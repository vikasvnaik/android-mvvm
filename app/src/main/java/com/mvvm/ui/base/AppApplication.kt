package com.mvvm.ui.base

import androidx.multidex.MultiDexApplication
import com.mvvm.BuildConfig
import timber.log.Timber


class AppApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            //FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true)
            Timber.plant(LineNumberDebugTree())
        } else {
            //FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true)
        }
        //Places.initialize(this, "AIzaSyBL1KrGqEhVhhv6WejsXZfC-OK4YRWT-oo")
    }
}

class LineNumberDebugTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String? {
        return "${element.fileName}:${element.lineNumber}:${element.methodName}"
    }
}