package com.example.portfolio2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform