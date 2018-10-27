package edu.gwu.trivia.model.generated.petfinder

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Breeds(@Json(name = "breed") val breed: List<StringWrapper>): Parcelable