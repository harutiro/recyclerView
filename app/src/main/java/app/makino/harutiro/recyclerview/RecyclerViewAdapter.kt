package app.makino.harutiro.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val context: Context):
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    //リサイクラービューに表示するリストを宣言する
    val items: MutableList<CourseDate> = mutableListOf()

    //データをcourseDateと結びつける？？
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val charaImage: ImageView = view.findViewById(R.id.characterImageView)
        val charaNameTextView: TextView = view.findViewById(R.id.courseNameTextView)
        val charaDetailTextView: TextView = view.findViewById(R.id.descriptionTextView)
    }

    //はめ込むものを指定
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_course_date_call,parent,false)
        return ViewHolder(view)
    }

    //itemsのposition番目の要素をviewに表示するコード
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.charaImage.setImageResource(item.characterImageResource)
        holder.charaNameTextView.text = item.courseName
        holder.charaDetailTextView.text = item.description

    }

    //引数にとったリストをadapterに追加するメソッド
    fun addAll(items: List<CourseDate>){
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    //リストの要素数を返すメソッド
    override fun getItemCount(): Int {

        return items.size
    }
}