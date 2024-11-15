package com.api.bluetoothchatapp.presentation

import com.api.bluetoothchatapp.domain_chat.BluetoothDevice
import com.api.bluetoothchatapp.domain_chat.BluetoothMessage

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage: String? = null,
    val messages: List<BluetoothMessage> = emptyList()
)