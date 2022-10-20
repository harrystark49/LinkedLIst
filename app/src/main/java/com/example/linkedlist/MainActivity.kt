package com.example.linkedlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ll=LinkedList<String>()

        ll.apply {
            insert("harry")
            insert("stark")
            insert("chinnu")
            insert("maam")
        }
        ll.print()
        ll.delete()
        ll.print()
        ll.getAt(5)
    }
}