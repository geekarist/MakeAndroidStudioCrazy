package com.example.myapplication

import android.app.Application

class MakeAndroidStudioCrazy(private val app: Application) {

    private fun toResId(): Int {
        return app.resources.getIdentifier(
                "ic_prefix${getSuffix()}",
                "drawable",
                app.packageName
        )
    }
    private fun getSuffix(): String {
        return "default"
    }
}
