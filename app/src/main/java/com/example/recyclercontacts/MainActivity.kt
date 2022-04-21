package com.example.recyclercontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclercontacts.adapters.ContactAdapter
import com.example.recyclercontacts.adapters.OnContactClickListener
import com.example.recyclercontacts.data.ContactData

class MainActivity : AppCompatActivity(), OnContactClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contactList = generate_list(110)
        val recycler: RecyclerView = findViewById(R.id.recycler)
        recycler.adapter = ContactAdapter(this, contactList, this)
        recycler.layoutManager = LinearLayoutManager(this)
    }

    /**
     * Версия с локальными картинками.
        private fun generate_list(count: Int): List<ContactData>{
        val myList = ArrayList<ContactData>()
        for (i in 0 until count){
        var pict: Int
        if (i%2 == 0){pict = R.drawable.plant1}
        else {pict = R.drawable.plant4}
        val item = ContactData(pict, "Контакт $i", "891267510$i")
        myList += item
        }
        return myList
    }*/

    private fun generate_list(count: Int): List<ContactData>{
        val myList = ArrayList<ContactData>()
        for (i in 0 until count){
            val item = ContactData("https://picsum.photos/200/200/?temp=$i", "Контакт $i", "891267510$i")
            myList += item
        }
        return myList
    }

    override fun onContactItemClicked(position: Int) {
        Toast.makeText(this, "Контакт " + position + " кликнут", Toast.LENGTH_LONG).show()
    }
}
