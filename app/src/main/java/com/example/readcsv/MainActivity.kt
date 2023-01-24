package com.example.readcsv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.readcsv.csv.CsvHelper

class MainActivity : AppCompatActivity() {
    // 이건 안됨....
    //    private val assetManager: AssetManager = this.assets
    private val test = CsvHelper(assets)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val test = CsvHelper(this.assets)
        // 안됨....
//        val test = CsvHelper(assetManager)



        Log.i("read csv", test.readAllCsvData("revers.csv").toString())


        // 블로그에서 본 asset에서 파일 읽기 하는 예제
//        val assetManager = resources.assets
//        val inputStream= assetManager.open("posts.json")
//        val jsonString = inputStream.bufferedReader().use { it.readText() }

    }
}