package com.smdte.squarematrixdetetmtreeelement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.smdte.squarematrixdetetmtreeelement.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var a11 = 0.0
    var a12 = 0.0
    var a13 = 0.0
    var a21 = 0.0
    var a22 = 0.0
    var a23 = 0.0
    var a31 = 0.0
    var a32 = 0.0
    var a33 = 0.0
    var detA = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonDeterminator.setOnClickListener(){
            determinator_calculus()
        }


    }
    fun determinator_calculus() {
    a11 = binding.editText1.text.toString().toDouble()
    a12 = binding.editText.text.toString().toDouble()
    a13 = binding.editText3.text.toString().toDouble()
    a21 = binding.editText4.text.toString().toDouble()
    a22 = binding.editText5.text.toString().toDouble()
    a23 = binding.editText6.text.toString().toDouble()
    a31 = binding.editText7.text.toString().toDouble()
    a32 = binding.editText8.text.toString().toDouble()
    a33 = binding.editText9.text.toString().toDouble()
    detA = a11*a22*a33+a12*a23*a31+a13*a21*a32-a13*a22*a31-a11*a23*a32-a12*a21*a33
    binding.buttonDeterminator.text = "Determinant = "+ detA.toString()

    }
}