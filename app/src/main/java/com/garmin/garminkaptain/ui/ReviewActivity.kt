package com.garmin.garminkaptain.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.garmin.garminkaptain.R
import com.garmin.garminkaptain.TAG
import com.garmin.garminkaptain.data.poiList
import com.garmin.garminkaptain.data.reviewList

class ReviewActivity : Fragment(R.layout.reviews) {

    private val args: PoiDetailsFragmentArgs by navArgs()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach() called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() called")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView: called")
        return inflater.inflate(R.layout.poi_details_fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated: called")
        val poiId = args.poiId
        val poi = poiList.find { it.id == poiId }
        poi?.let {
            view.apply {
                for(review in poiList){
                    val list = findViewById<LinearLayout>(R.id.list)
                    for (x in 1..review.reviewSummary.numberOfReviews){
                        val id = findViewById<TextView>(R.id.id)
                        list.addView(id)
                        id.text= reviewList.get(x-1).text.toString();
                        val rating = findViewById<TextView>(R.id.rating)
                        list.addView(rating)
                        rating.text= reviewList.get(x-1).rating.toString();
                        val title = findViewById<TextView>(R.id.title)
                        list.addView(title)
                        title.text= reviewList.get(x-1).title.toString();
                        val text = findViewById<TextView>(R.id.text)
                        list.addView(text)
                        text.text= reviewList.get(x-1).text.toString();
                        val dateCreated = findViewById<TextView>(R.id.dateCreated)
                        list.addView(dateCreated)
                        dateCreated.text= reviewList.get(x-1).dateCreated.toString();
                    }
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach() called")
    }

}