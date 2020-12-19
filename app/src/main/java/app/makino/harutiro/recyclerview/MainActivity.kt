package app.makino.harutiro.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseDate: List <CourseDate> = listOf(
            CourseDate(R.drawable.image1, "mohumohu","作者"),
            CourseDate(R.drawable.image2, "meripu","作者"),
            CourseDate(R.drawable.image3, "gyouza","作者")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = adapter

        //リサイクラービューアダプターで宣言したaddAllメソッドを呼んであげてデータも渡している
        adapter.addAll(courseDate)

//        button.setOnClickListener{
//            val txt = edit1.text.toString()
//
//            val data = CourseDate(aa, txt, cc)
//            adapter.add(data)
//        }


    }
}