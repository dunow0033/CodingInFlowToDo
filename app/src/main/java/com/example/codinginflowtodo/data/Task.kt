package com.example.codinginflowtodo.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Task (
   val name: String,
   val important: Boolean = false,
   val completed: Boolean = false,
   val created: Long = System.currentTimeMillis()
 ) : Parcelable {

}