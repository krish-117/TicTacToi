package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import androidx.databinding.DataBindingUtil
import com.example.tictactoe.databinding.ActivityInfoBinding

class info : AppCompatActivity() {
    lateinit var binding : ActivityInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_info)



        binding.play.setOnClickListener{
            if (binding.player1.text.toString().isEmpty())
            {
                binding.player1.setError("Enter player name")
                return@setOnClickListener
            }
            else if (binding.player2.text.toString().isEmpty())
            {
                binding.player1.setError("Enter player name")
                return@setOnClickListener
            }
            else{
                singleUser = false
                var i = Intent(this,AiGamePlay::class.java)
                i.putExtra("player1",binding.player1.text.toString())
                i.putExtra("player2",binding.player2.text.toString())
                startActivity(i)
            }
        }
    }
}