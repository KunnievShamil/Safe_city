package com.example.safecity.presentation.home.ui.home.addincident

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.safecity.R

import com.example.safecity.databinding.IncidentAddFragmentDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


const val ARG_ITEM_COUNT = "item_count"


class IncidentAddFragmentDialog : BottomSheetDialogFragment() {

    private var _binding: IncidentAddFragmentDialogBinding? = null

    override fun getTheme() = R.style.AppBottomSheetDialogTheme

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = IncidentAddFragmentDialogBinding.inflate(inflater, container, false)
        return binding.root

    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        dialog!!.window!!.attributes.windowAnimations = R.style.BottomSheetDialogAnimation
//    }


//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        dialog!!.window!!.attributes.windowAnimations = android.R.style.BottomSheetDialogAnimation
//    }

    companion object {

        fun newInstance(itemCount: Int): IncidentAddFragmentDialog =
            IncidentAddFragmentDialog().apply {
                arguments = Bundle().apply {
                    putInt(ARG_ITEM_COUNT, itemCount)
                }
            }

    }
}