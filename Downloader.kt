package com.example.memeapp

import android.content.Context
import java.io.File
import java.net.URL

object Downloader {

    fun download(context: Context, url: String): File {
        val file = File(context.filesDir, "output.mp4")
        val stream = URL(url).openStream()

        file.outputStream().use { output ->
            stream.copyTo(output)
        }

        return file
    }
}
