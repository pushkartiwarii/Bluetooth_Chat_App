package com.api.bluetoothchatapp.di

import android.content.Context
import com.api.bluetoothchatapp.data_chat.AndroidBluetoothController
import com.api.bluetoothchatapp.domain_chat.BluetoothController

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBluetoothController(@ApplicationContext context: Context): BluetoothController {
        return AndroidBluetoothController(context)
    }
}