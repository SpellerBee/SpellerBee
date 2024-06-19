package com.example.spellerbee.fragment

import com.example.spellerbee.databinding.FragmentHomeBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.spellerbee.R

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.masal.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_masalFragment)
        }

        binding.tekerleme.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_tekerlemeFragment)
        }

        binding.bilmece.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fragmentBilmece)
        }

        binding.eslestirme.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fragmentEslestirme)
        }


        return binding.root
    }


}
