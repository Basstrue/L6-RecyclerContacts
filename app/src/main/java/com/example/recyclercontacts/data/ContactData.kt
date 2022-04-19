package com.example.recyclercontacts.data

import com.example.recyclercontacts.R

data class ContactData(val image: Int, val name: String, val number: String)

class Contacts{val spisok = arrayListOf(
    ContactData(R.drawable.plant1, "Человек из Кемерова", "89126751010"),
    ContactData(R.drawable.plant2, "Рома Джебель", "89126751011"),
    ContactData(R.drawable.plant3, "Настя Пиздыськина", "89126751012"),
    ContactData(R.drawable.plant4, "Галина Ивановна", "89126751013"),
    ContactData(R.drawable.plant5, "Вася Штрибен", "89126751014"))}