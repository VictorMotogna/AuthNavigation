package com.victormotogna.authnavigation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_main_btn_login.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_LoginFragment))
        fragment_main_btn_signup.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_SignupFragment))
    }
}
