package com.example.recyclercontacts.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclercontacts.R
import com.example.recyclercontacts.data.ContactData
import com.example.recyclercontacts.databinding.ContactItemLayoutBinding

class ContactAdapter(val context: Context, val Contacts: ArrayList<ContactData>): RecyclerView.Adapter<ContactAdapter.VH>() {

    class VH(view: View): RecyclerView.ViewHolder(view){
      val binding = ContactItemLayoutBinding.bind(view)
      fun bind(item: ContactData) = with(binding){
      contactImage.setImageResource(item.image)
      contactName.text = item.name
      contactPhone.text = item.number
      }
      //val image: ImageView = view.findViewById(R.id.contact_image)
      //val name: TextView = view.findViewById(R.id.contact_name)
      //val phone: TextView = view.findViewById(R.id.contact_phone)
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
      val view = LayoutInflater.from(context).inflate(R.layout.contact_item_layout, parent, false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(Contacts[position])
        //holder.image.setImageResource(Contacts[position].image)
        //holder.name.text = (Contacts[position].name)
        //holder.phone.text = (Contacts[position].number)
    }

    override fun getItemCount(): Int {
       return Contacts.size
    }
}