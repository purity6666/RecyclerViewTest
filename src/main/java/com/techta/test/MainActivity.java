package com.techta.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecyclerView = findViewById(R.id.recyclerView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Piffle", "piffle@gmail.com", "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));
        contacts.add(new Contact("TWAJS", "lordtwajs@gmail.com", "https://cdn.discordapp.com/attachments/737325870615625842/745245802204758066/SPOILER_xawewa.jpg"));
        contacts.add(new Contact("Cool TWAJS", "cooltwajs@hotmail.com", "https://media.discordapp.net/attachments/739892176267509811/739892260153458698/GAYTWAJS.jpg"));
        contacts.add(new Contact("Warrior TWAJS", "samuraitwajs@outlook.com", "https://cdn.discordapp.com/attachments/739892176267509811/739892316843802704/WARTWAJS.jpg"));

        ContactsRecyclerViewAdapter adapter = new ContactsRecyclerViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecyclerView.setAdapter(adapter);
        contactsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}