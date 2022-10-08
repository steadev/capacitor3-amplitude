package com.steadev.plugins.amplitude

import com.getcapacitor.Plugin
import com.getcapacitor.annotation.CapacitorPlugin
import com.steadev.plugins.amplitude.CapacitorAmplitude
import com.getcapacitor.PluginMethod
import com.getcapacitor.PluginCall
import androidx.appcompat.app.AppCompatActivity

@CapacitorPlugin(name = "CapacitorAmplitude")
class CapacitorAmplitudePlugin : Plugin() {
    private lateinit var implementation: CapacitorAmplitude

    override fun load() {
        super.load()
        implementation = CapacitorAmplitude(activity)
    }

    @PluginMethod
    fun init(call: PluginCall) {
        val instanceName = call.getString("instanceName")
        val apiKey = call.getString("apiKey")
        implementation.init(instanceName, apiKey)
        call.resolve()
    }

    @PluginMethod
    fun setUserProperties(call: PluginCall) {
        val instanceName = call.getString("instanceName")
        val userProperties: Any = call.getObject("userProperties")
        implementation.setUserProperties(instanceName, userProperties)
        call.resolve()
    }

    @PluginMethod
    fun clearUserProperties(call: PluginCall) {
        val instanceName = call.getString("instanceName")
        implementation.clearUserProperties(instanceName)
        call.resolve()
    }

    @PluginMethod
    fun setUserId(call: PluginCall) {
        val instanceName = call.getString("instanceName")
        val userId = call.getString("userId")
        implementation.setUserId(instanceName, userId)
    }

    @PluginMethod
    fun logEvent(call: PluginCall) {
        val instanceName = call.getString("instanceName")
        val eventType = call.getString("eventType")
        implementation.logEvent(instanceName, eventType)
        call.resolve()
    }

    @PluginMethod
    fun logEventWithProperties(call: PluginCall) {
        val instanceName = call.getString("instanceName")
        val eventType = call.getString("eventType")
        val eventProperties: Any = call.getObject("eventProperties")
        implementation.logEventWithProperties(instanceName, eventType, eventProperties)
        call.resolve()
    }
}