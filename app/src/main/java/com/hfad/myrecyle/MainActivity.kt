package com.hfad.myrecyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList:ArrayList<News>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.android,
            R.drawable.flutter,
            R.drawable.js,
            R.drawable.nodejs,
            R.drawable.php,
            R.drawable.python


        )

        heading = arrayOf(
            "Android is a good language easy to learn in all forms and exercises",
            "Javascript is a good language easy to learn in all forms and exercises",
            "Python is a good language easy to learn in all forms and exercises",
            "Node.Js is a good language easy to learn in all forms and exercises",
            "Fultter is a good language easy to learn in all forms and exercises",
            "Php is a good language easy to learn in all forms and exercises"

        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()

        getUserData()


    }

    private fun getUserData() {
        for (i in imageId.indices ){
            val news =News(imageId[i], heading[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }


}