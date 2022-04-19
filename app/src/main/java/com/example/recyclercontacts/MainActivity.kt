package com.example.recyclercontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclercontacts.adapters.ContactAdapter
import com.example.recyclercontacts.data.Contacts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler: RecyclerView = findViewById(R.id.recycler)
        recycler.adapter = ContactAdapter(this, Contacts().spisok)
    }
}