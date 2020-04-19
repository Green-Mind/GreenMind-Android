package com.project.greenmind.api

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface testRequest2 {
    @POST("/routes/index")
    fun requestTest2(
        @Body requestTest2:test2
    ): Call<test1Response>
}

data class test2(
    @SerializedName("B1")
    val B1: String,
    @SerializedName("B2")
    val B2: String,
    @SerializedName("B3")
    val B3: String,
    @SerializedName("B4")
    val B4: String,
    @SerializedName("B5")
    val B5: String,
    @SerializedName("B6")
    val B6: String,
    @SerializedName("B7")
    val B7: String,
    @SerializedName("B8")
    val B8: String,
    @SerializedName("B9")
    val B9: String,
    @SerializedName("B10")
    val B10: String,
    @SerializedName("B11")
    val B11: String,
    @SerializedName("B12")
    val B12: String,
    @SerializedName("B13")
    val B13: String,
    @SerializedName("B14")
    val B14: String,
    @SerializedName("B15")
    val B15: String,
    @SerializedName("B16")
    val B16: String,
    @SerializedName("B17")
    val B17: String,
    @SerializedName("B18")
    val B18: String,
    @SerializedName("B19")
    val B19: String,
    @SerializedName("B20")
    val B20: String,
    @SerializedName("B21")
    val B21: String,
    @SerializedName("B22")
    val B22: String,
    @SerializedName("B23")
    val B23: String,
    @SerializedName("B24")
    val B24: String
)

//응답
data class test2Response(
    val status: Int,
    val message: String
)