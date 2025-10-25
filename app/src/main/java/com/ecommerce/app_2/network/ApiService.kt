package com.ecommerce.app_2.network

import com.ecommerce.app_2.models.AuthResponse
import com.ecommerce.app_2.models.LoginRequest
import com.ecommerce.app_2.models.RegisterResponse
import com.ecommerce.app_2.models.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("api/auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<AuthResponse>


    @POST("api/auth/register")
    suspend fun register(@Body user: User): Response<RegisterResponse>
}

