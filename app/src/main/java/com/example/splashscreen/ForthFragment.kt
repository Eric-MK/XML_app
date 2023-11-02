package com.example.splashscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.splashscreen.databinding.FragmentForthBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ForthFragment : Fragment() {

    private var _binding: FragmentForthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentForthBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button4second.setOnClickListener {
            findNavController().navigate(R.id.action_ForthFragment_to_SecondFragment)
        }

        binding.button4first.setOnClickListener {
            findNavController().navigate(R.id.action_ForthFragment_to_FirstFragment)
        }
        binding.button4third.setOnClickListener {
            findNavController().navigate(R.id.action_ForthFragment_to_ThirdFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}