package jp.techacademy.hirotaka.iwasaki.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("田中", 20, "写真")
        human1.say()
        human1.think()

        val human2 = Human("鈴木", 30, "野球")
        human2.say()
        human2.think()
    }
}
