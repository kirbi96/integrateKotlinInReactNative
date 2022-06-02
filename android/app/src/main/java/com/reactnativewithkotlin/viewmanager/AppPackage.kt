package com.reactnativewithkotlin.viewmanager

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

class AppPackage: ReactPackage {
    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        val views = ArrayList<ViewManager<*, *>>()
        views.add(MyCustomReactViewManager())
        return views
    }

    override fun createNativeModules(
        reactContext: ReactApplicationContext): List<NativeModule> {
        return emptyList()
    }
}