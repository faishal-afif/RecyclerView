package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val memberList = listOf<Member>(
            Member(R.drawable.instagram,
                "Ana Balqis Sholehah",
                "205150200111063",
                "abc"
            ),
            Member(R.drawable.instagram,
                "Faishal Afif",
                "205150201111041",
                "abc"
            ),
            Member(R.drawable.instagram,
                "Ika Febrianti",
                "205150200111060",
                "abc"
            ),
            Member(R.drawable.instagram,
                "Lorem ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
                "abc"
            ),
            Member(R.drawable.instagram,
                "Lorem ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
                "abc"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_member)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MemberAdapter(this, memberList) {

        }

    }
}