package com.project.greenmind.api

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface testRequest1 {
    @POST("/routes/index")
    fun requestTest1(
        @Body requestTest1:test1
    ): Call<test1Response>
}

data class test1(
    @SerializedName("A1")
    val A1: String,
    @SerializedName("A2")
    val A2: String,
    @SerializedName("A3")
    val A3: String,
    @SerializedName("A4")
    val A4: String,
    @SerializedName("A5")
    val A5: String,
    @SerializedName("A6")
    val A6: String,
    @SerializedName("A7")
    val A7: String,
    @SerializedName("A8")
    val A8: String,
    @SerializedName("A9")
    val A9: String,
    @SerializedName("A10")
    val A10: String,
    @SerializedName("A11")
    val A11: String,
    @SerializedName("A12")
    val A12: String,
    @SerializedName("A13")
    val A13: String,
    @SerializedName("A14")
    val A14: String,
    @SerializedName("A15")
    val A15: String,
    @SerializedName("A16")
    val A16: String,
    @SerializedName("A17")
    val A17: String,
    @SerializedName("A18")
    val A18: String,
    @SerializedName("A19")
    val A19: String,
    @SerializedName("A20")
    val A20: String,
    @SerializedName("A21")
    val A21: String,
    @SerializedName("A22")
    val A22: String,
    @SerializedName("A23")
    val A23: String,
    @SerializedName("A24")
    val A24: String
)

//응답
data class test1Response(
    val status: Int,
    val message: String
)