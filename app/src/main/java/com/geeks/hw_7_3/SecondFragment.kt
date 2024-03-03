package com.geeks.hw_7_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.hw_7_3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private val list = arrayListOf(
        Playlist("Blank Space", "Taylor Swift", "3:22"),
        Playlist("Watch Me","Silento","4:44",),
        Playlist("Earned it","Eminem","2:01"),
        Playlist("The Hills","twopac","3:55"),
        Playlist("Writing's On The Wall","Eminem","3:03"),
        Playlist("lose Yourself","Eminem","2:51"),
        Playlist("See You Again","Bakr","3:00"),
        Playlist("так и понимай","ulukmanapo","2:45"),
    )
    private val adapter = PlaylistAdapter(list)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.playlistRv.adapter = adapter
    }

}