package cn.bcbook.kaixuetest

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * 1. 使用 Android Studio 创建一个基于 Kotlin 的新项目（Empty Activity），添加一个新的属性（类型是非空的 View），
 * 在 onCreate 函数中初始化它
 * 2. 声明一个参数为 View? 类型的方法，传入刚才的 View 类型属性，并在该方法中打印出该 View? 的 id
 */
class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tv_text)
        printViewId(textView)
    }

    private fun printViewId(view: View?) {
        log(view?.id.toString())
    }
}
