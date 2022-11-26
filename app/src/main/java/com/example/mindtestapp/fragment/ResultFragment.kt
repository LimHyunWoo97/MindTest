package com.example.mindtestapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mindtestapp.R
import kotlinx.android.synthetic.main.fragment_result.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {
    // TODO: Rename and change types of parameters
    var option = -1
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        option = arguments?.getInt("index") ?:-1 //전체가 null 일때 -1을 반환하는 엘비스 연산

        return inflater.inflate(R.layout.fragment_result, container, false)

    }

    override fun onViewCreated(view: View,savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)
        navController =Navigation.findNavController(view)

        setResult(option)
        btn_home.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }
    fun setResult(option : Int){
        when(option){
            1 -> {
                tv_main.text = "You are a Quitter!"
                tv_sub.text = "Maybe you give up on love too easily."
            }
            2 -> {
                tv_main.text = "You should focus\non youerself"
                tv_sub.text = "You become really clingy to your ex."
            }
            3 -> {
                tv_main.text = "You should take it easy"
                tv_sub.text = "You can do crazy things no matter what it takes."
            }
            4 -> {
                tv_main.text = "You are pretty mature"
                tv_sub.text = "You can easily accept the break-up."
            }
        }
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ResultFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ResultFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}