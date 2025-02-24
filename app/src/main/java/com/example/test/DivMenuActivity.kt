package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class DivMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_main)

        // imgBtn_arrow 버튼을 찾습니다.
        val imgBtnArrow: ImageButton = findViewById(R.id.imgBtn_arrow)

        // 클릭 리스너를 설정합니다.
        imgBtnArrow.setOnClickListener {
            val intent = Intent(this, Start::class.java) // Start.kt 실행
            startActivity(intent)
        }
    }
}
