package com.app.fitgenie

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform