package com.dicoding.rifqi.githubuserapp2.api

import androidx.viewbinding.BuildConfig
import com.dicoding.rifqi.githubuserapp2.response.UserDetailResponse
import com.dicoding.rifqi.githubuserapp2.response.UserListItem
import com.dicoding.rifqi.githubuserapp2.response.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @Headers("Authorization: token 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")
    @GET("search/users")
    fun getUsers(
        @Query("q") username: String
    ): Call<UserResponse>

    @Headers("Authorization: token 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")
    @GET("users/{username}")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<UserDetailResponse>

    @Headers("Authorization: token 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")
    @GET("users/{username}/followers")
    fun getFollowers(
        @Path("username") username: String?
    ): Call<List<UserListItem>>

    @Headers("Authorization: token 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")
    @GET("users/{username}/following")
    fun getFollowing(
        @Path("username") username: String?
    ): Call<List<UserListItem>>
}