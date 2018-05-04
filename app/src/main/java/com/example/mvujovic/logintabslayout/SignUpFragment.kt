package com.example.mvujovic.logintabslayout

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.sign_up_fragment.*

/**
 * Created by mvujovic on 24.4.2018..
 */
class SignUpFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Get the string array
        //val countries = resources.getStringArray(R.array.countries_array)
        return inflater!!.inflate(R.layout.sign_up_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val countries = resources.getStringArray(R.array.countries_array)
        val cities = resources.getStringArray(R.array.cities_array)
        // Create the adapter and set it to the AutoCompleteTextView
        val adapter_countries = ArrayAdapter<String>(this.context, android.R.layout.simple_list_item_1, countries)
        val adapter_cities = ArrayAdapter<String>(this.context, android.R.layout.simple_list_item_1, cities)

        sign_up_countries.setAdapter(adapter_countries)
        sign_up_countries.threshold = 1

        sign_up_cities.setAdapter(adapter_cities)
        sign_up_cities.threshold = 1
    }

}