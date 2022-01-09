import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s11.roxas.michael.exercise2.Save_VH

class CustomListAdapter (private val list: MutableList<Int>)
    :  RecyclerView.Adapter<Save_VH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Save_VH {
        val inflater = LayoutInflater.from(parent.context)
        return Save_VH(inflater, parent)
    }

    override fun onBindViewHolder(holder: Save_VH, save_num: Int) {
        val save: Int = list[save_num]
        holder.bind(save)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}