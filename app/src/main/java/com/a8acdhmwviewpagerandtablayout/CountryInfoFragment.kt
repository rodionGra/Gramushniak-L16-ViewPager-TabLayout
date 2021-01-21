package com.a8acdhmwviewpagerandtablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.a8acdhmwviewpagerandtablayout.databinding.FragmentCountryInfoBinding


private const val COUNTRY = "COUNTRY"

class CountryInfoFragment : Fragment() {

    private lateinit var country: Country
    private lateinit var binding: FragmentCountryInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            country = it.getParcelable(COUNTRY) ?: Country("empty", 0, 0, 0.0, 0)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountryInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvCountryName.text = country.name
        binding.imageViewFlag.setImageResource(country.flag)
        binding.tvPopulation.text =
            context?.resources?.getString(R.string.population, country.population)
        binding.tvArea.text = context?.resources?.getString(R.string.area, country.area)
        binding.tvPopulationDensity.text =
            context?.resources?.getString(R.string.population_density, country.populationDensity)
    }

    companion object {
        fun newInstance(country: Country) =
            CountryInfoFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(COUNTRY, country)
                }
            }
    }
}