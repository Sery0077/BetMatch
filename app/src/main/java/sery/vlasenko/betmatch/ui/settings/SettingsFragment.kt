package sery.vlasenko.betmatch.ui.settings

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import sery.vlasenko.betmatch.R
import sery.vlasenko.betmatch.databinding.FragmentSettingsBinding
import sery.vlasenko.betmatch.utils.BackgroundHelper

class SettingsFragment : Fragment() {

    companion object {
        fun newInstance() = SettingsFragment()
    }

    private val viewModel: SettingsViewModel by viewModels()

    private lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setClickers()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setClickers() {
        binding.swNightTheme.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        binding.btnNightThemeChange.setOnClickListener {
            val backgroundId = BackgroundHelper.getRandomBackgroundId()

            activity?.window?.setBackgroundDrawableResource(
                backgroundId
            )

            saveBackgroundId(backgroundId)
        }
    }

    private fun saveBackgroundId(backgroundId: Int) {
        val pf = activity?.getSharedPreferences(
            getString(R.string.prefs),
            Context.MODE_PRIVATE
        )

        pf?.edit()?.putInt(getString(R.string.pref_background_id), backgroundId)?.apply()
    }
}