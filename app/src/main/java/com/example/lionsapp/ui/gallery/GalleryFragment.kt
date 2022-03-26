package com.example.lionsapp.ui.gallery

import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lionsapp.R
import com.example.lionsapp.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
      //  val ImgId = arrayListOf<Int>(R.drawable.img1,R.drawable.img2,R.drawable.imge,R.drawable.img4,R.drawable.img5)

        //val gridView : GridView= binding.PhotoGrid
       // gridView.setAdapter(ImgAdapter())
       // gridView.setOnItemClickListener(AdapterView.On)


        val galleryViewModel =
                ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}