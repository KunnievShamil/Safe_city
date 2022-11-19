package com.example.safecity.presentation.home.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.graphics.drawable.toBitmap
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.safecity.databinding.FragmentHomeBinding
import com.example.safecity.presentation.home.HomeActivity
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.InputListener
import com.yandex.mapkit.map.Map
import com.yandex.mapkit.map.MapObjectCollection
import com.yandex.runtime.image.ImageProvider

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var map : MapObjectCollection


    private val  inputListener : InputListener = object : InputListener {
        override fun onMapTap(p0: Map, p1: Point) {
            map.addPlacemark(p1)
            Log.d("AAAA",p1.toString())
            activity?.let {
                (it as HomeActivity).showAddIncidentButton()
            }
        }

        override fun onMapLongTap(p0: Map, p1: Point) {



        }

    }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)



        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        homeViewModel.text.observe(viewLifecycleOwner) {

        }

        binding.mapview.map.move(
            CameraPosition(Point(55.751574, 37.573856),12f,0f,0f),
            Animation(Animation.Type.SMOOTH,0f),
            null
        )

        map = binding.mapview.map.mapObjects



        binding.mapview.map.addInputListener(inputListener)
        return root
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        MapKitFactory.initialize(requireContext())
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        binding.mapview.onStart()
        MapKitFactory.getInstance().onStart()
        super.onStart()
    }

    override fun onStop() {
        binding.mapview.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}