package com.example.trainlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var relative = findViewById(R.id.relativePage) as Button;
        var table = findViewById(R.id.tablePage) as Button;
        var framePage = findViewById(R.id.framePage) as Button;
        var constraintPage = findViewById(R.id.constraintPage) as Button;

        relative.setOnClickListener{
            var i = Intent(this,RelativeLayout::class.java);
            startActivity(i);
        }

        table.setOnClickListener{
            var i = Intent(this,TableLayout::class.java);
            startActivity(i);
        }

        framePage.setOnClickListener{
            var i = Intent(this,FrameLayout::class.java);
            startActivity(i);
        }

        constraintPage.setOnClickListener{
            var i = Intent(this,ConstraintLayout::class.java);
            startActivity(i);
        }
    }
}