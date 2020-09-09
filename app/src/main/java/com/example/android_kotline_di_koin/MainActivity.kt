package com.example.android_kotline_di_koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import utils.MySimplePresenter

class MainActivity : AppCompatActivity() {
    val mySimplePresenter by inject<MySimplePresenter>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = mySimplePresenter.sayHello()
    }
}