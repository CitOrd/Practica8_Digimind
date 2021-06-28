package ordunio.maribel.mydigimind.ui.home

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ordunio.maribel.mydigimind.R
import ordunio.maribel.mydigimind.databinding.FragmentHomeBinding
import ordunio.maribel.mydigimind.ui.Task

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    var tasks = ArrayList<Task>()
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun filltask(){
        tasks.add(Task("Practice 1", arrayListOf("Monday","Sunday"),"17:30"))
        tasks.add(Task("Crying in my misery", arrayListOf("Tuesday"),"10:30"))
        tasks.add(Task("Workout with Jazmin", arrayListOf("Monday","Tuesday","Wednesday","Friday"),"19:00"))
        tasks.add(Task("Practice 4", arrayListOf("Wednesday"),"11:00"))
        tasks.add(Task("Lecture club with Joel", arrayListOf("Saturday"),"10:00"))
        tasks.add(Task("Go out with Bere", arrayListOf("Thursday"),"20:00"))
        tasks.add(Task("Go to mall", arrayListOf("Sunday"),"9:30"))
    }

    private class AdapterTask: BaseAdapter {
        var tasks = ArrayList<Task>()
        var context : Context? = null

        constructor(context: Context, tasks:ArrayList<Task>){
            this.context= context
            this.tasks= tasks
        }

        override fun getCount(): Int {
            return tasks.size
        }

        override fun getItem(position: Int): Any {
            return tasks[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        @SuppressLint("ViewHolder")
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
          var task= tasks[position]
            var inflator = LayoutInflater.from(context)
            var vista = inflator.inflate(R.layout.task_view, null)

            var tv_title = vista.findViewById(R.id.)
        }


    }

}