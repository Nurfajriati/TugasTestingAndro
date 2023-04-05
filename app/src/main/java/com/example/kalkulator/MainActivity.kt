package com.example.kalkulator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clear(view: View){
        val input1 = text
        val input2 = text1
        val result = result

        text.text = null
        text1.text = null
        result.text = "0"
    }

    fun plus(view: View){
        val input1 = text.text.toString()
        val input2 = text1.text.toString()
        val result = result

        if (input1.isEmpty()){
            text.setError("Please fill the number")
        }else if (input2.isEmpty()){
            text.setError("Please fill the number")
        }else{
            var add = input1.toDouble() + input2.toDouble()
            result.text = add.toString()
        }
    }

    fun min(view: View){
        val input1 = text.text.toString()
        val input2 = text1.text.toString()
        val result = result

        if (input1.isEmpty()){
            text.setError("Please fill the number")
        }else if (input2.isEmpty()){
            text.setError("Please fill the number")
        }else{
            var subs = input1.toDouble() - input2.toDouble()
            result.text = subs.toString()
        }
    }

    fun multi(view: View){
        val input1 = text.text.toString()
        val input2 = text1.text.toString()
        val result = result

        if (input1.isEmpty()){
            text.setError("Please fill the number")
        }else if (input2.isEmpty()){
            text.setError("Please fill the number")
        }else{
            var multiple = input1.toDouble() * input2.toDouble()
            result.text = multiple.toString()
        }
    }

    fun slice(view: View){
        val input1 = text.text.toString()
        val input2 = text1.text.toString()
        val result = result

        if (input1.isEmpty()){
            text.setError("Please fill the number")
        }else if (input2.isEmpty()){
            text.setError("Please fill the number")
        }else{
            var division = input1.toDouble() / input2.toDouble()
            result.text = division.toString()
        }
    }
}