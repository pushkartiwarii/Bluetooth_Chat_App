package com.api.bluetoothchatapp.data_chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.api.bluetoothchatapp.domain_chat.BluetoothDeviceDomain


@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}