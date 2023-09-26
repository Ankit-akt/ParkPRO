package com.test.parkpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.test.parkpro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? =  null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.btnLogin?.setOnClickListener {
            val username : String = (binding?.nameDialog?.text).toString()
            val password : String = (binding?.passwordDialog?.text).toString()
            if(username == "Pratham" && password == "test123"){
                val intent = Intent(this,HomeActivity::class.java)
                intent.putExtra("Username",username)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Wrong Username or Password entered",Toast.LENGTH_SHORT).show()
            }
        }
    }
}