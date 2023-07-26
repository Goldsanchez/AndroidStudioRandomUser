package com.example.ruser.domain.model

import com.example.ruser.data.remote.response.Dob
import com.example.ruser.data.remote.response.Id
import com.example.ruser.data.remote.response.Location
import com.example.ruser.data.remote.response.Login
import com.example.ruser.data.remote.response.Name
import com.example.ruser.data.remote.response.Picture
import com.example.ruser.data.remote.response.Registered

data class RandomUser (
    val name: String,
    val email: String,
    val birthday: String,
    val age: Int,
    val address: String,
    val phone: String,
    val password: String,
    val photo: String
)