package com.steadev.plugins.amplitude

import androidx.appcompat.app.AppCompatActivity
import com.amplitude.api.Amplitude
import com.amplitude.api.AmplitudeClient

class CapacitorAmplitude(var activity: AppCompatActivity) {
    fun init(instanceName: String?, apiKey: String?) {
        Amplitude.getInstance(instanceName).initialize(activity, apiKey)
    }

    fun setUserProperties(instanceName: String?, userProperties: Any?) {
        val client = Amplitude.getInstance(instanceName)
//        client.setUserProperties(properties)
    }

    fun clearUserProperties(instanceName: String?) {
        val client = Amplitude.getInstance(instanceName)
        client.clearUserProperties()
    }

    fun setUserId(instanceName: String?, userId: String?) {
        val client = Amplitude.getInstance(instanceName)
        client.userId = userId
    }

    fun logEvent(instanceName: String?, eventType: String?) {
        val client = Amplitude.getInstance(instanceName)
        client.logEvent(eventType)
    }

    fun logEventWithProperties(instanceName: String?, eventType: String?, eventProperties: Any?) {
        val client = Amplitude.getInstance(instanceName)
//        client.logEvent(eventType, eventProperties)
    }
}