package edu.gwu.trivia.model.generated.petfinder

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Petfinder(@Json(name = "pets") val pets: Pets?): Parcelable