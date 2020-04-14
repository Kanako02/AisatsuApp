package jp.techacademy.kanako.aisatsuapp

import android.app.TimePickerDialog
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val timePickerDialog = TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_PARTS", "$hour:$minute")

                if(2 <= hour && hour < 10 ){
                    textView.text="おはよう"}
                    else if (10 <= hour && hour < 18){
                    textView.text="こんにちは"}
                    else textView.text = "こんばんわ"


                },
                1, 0, true
            )

            timePickerDialog.show()

        }
    }

}

//画面内にButtonとTextViewを配置してください。
//ButtonをタッチするとTimePickerDialogを表示して，設定した時刻に応じてTextViewに表示されるあいさつを変化させてください。
//2:00 ~ 9:59 では「おはよう」
//10:00 ~ 17:59 では「こんにちは」
//18:00 ~ 1:59 では「こんばんは」
//ヒント
//TimePickerDialogのインスタンスのhourとminuteから時刻と分を取得