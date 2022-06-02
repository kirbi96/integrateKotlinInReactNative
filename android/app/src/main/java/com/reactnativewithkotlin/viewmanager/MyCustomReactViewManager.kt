package com.reactnativewithkotlin.viewmanager

import androidx.annotation.Nullable
import com.facebook.react.common.MapBuilder
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp




class MyCustomReactViewManager: SimpleViewManager<CustomView>() {
    override fun getName (): String {
        return REACT_CLASS
    }

    override fun createViewInstance(reactContext: ThemedReactContext): CustomView {
        return CustomView(reactContext, message)
    }

    @ReactProp(name = "message")
    fun setMessage(view: CustomView, @Nullable message: String?) {
        view.setMessage(message!!)
    }

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> {
        return MapBuilder
            .builder<String, Any>()
            .put("nativeClick", MapBuilder.of("registrationName", "onClick"))
            .build()
    }

    companion object {
        private const val REACT_CLASS = "MyCustomReactViewManager"
        private const val message = "NOT SET"
    }
}