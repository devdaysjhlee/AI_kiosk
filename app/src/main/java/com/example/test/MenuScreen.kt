package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MenuScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_sidetab) // activity_sidemenutab 레이아웃을 설정

        // 각 버튼에 대한 클릭 리스너 설정
        setupButtonClickListener(R.id.sideMenu_홈, "홈", true)
        setupButtonClickListener(R.id.sideMenu_추천메뉴, "추천메뉴", false)
        setupButtonClickListener(R.id.sideMenu_버거, "버거", false)
        setupButtonClickListener(R.id.sideMenu_사이드, "사이드", false)
        setupButtonClickListener(R.id.sideMenu_커피, "커피", false)
        setupButtonClickListener(R.id.sideMenu_디저트, "디저트", false)
        setupButtonClickListener(R.id.sideMenu_음료, "음료", false)
    }

    private fun setupButtonClickListener(buttonId: Int, title: String, isHomeButton: Boolean) {
        findViewById<Button>(buttonId).setOnClickListener {
            if (isHomeButton) {
                val intent = Intent(this, MenuScreen::class.java) // Menu 액티비티로 이동
                startActivity(intent)
            } else {
                showDialog(title)
            }
        }
    }

    private fun showDialog(title: String) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(title)
        builder.setMessage("이 탭의 이름은 \"$title\"입니다.")
        builder.setPositiveButton("확인") { dialog, _ -> dialog.dismiss() }
        builder.show()
    }
}
