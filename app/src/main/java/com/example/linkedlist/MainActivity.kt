package com.example.linkedlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ll=LinkedList<String>()

        ll.apply {
            insert("harry")
            insert("stark")
            insert("c")
            insert("s")
            insert("a")
            insert("k")
        }

        ll.print()
        ll.delete()
        ll.print()
        ll.getAt(5)

    }
}
