package com.alif.alifchat.messenger.fragment.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alif.alifchat.R
import android.widget.ImageView

class FullScreenImageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_full_screen_image, container, false)

        val fullScreenImageView = view.findViewById<ImageView>(R.id.fullScreenImageView)
        val imageResource = arguments?.getInt("imageResource") ?: R.drawable.ic_launcher_background // По умолчанию, если ресурс изображения не был передан

        fullScreenImageView.setImageResource(imageResource)

        return view
    }


    companion object {
        // You can pass any necessary parameters to this method
        fun newInstance(imageResource: Int): FullScreenImageFragment {
            val fragment = FullScreenImageFragment()
            // You can pass parameters to fragment using arguments bundle
            val args = Bundle()
            args.putInt("imageResource", imageResource)
            fragment.arguments = args
            return fragment
        }
    }
}
