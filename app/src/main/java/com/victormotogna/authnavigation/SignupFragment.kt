package com.victormotogna.authnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_signup.*


class SignupFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_signup_btn_login.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_signupFragment_to_loginFragment))
        fragment_signup_btn_signup.setOnClickListener {
            it.shuffleAnimate()
        }
    }
}
