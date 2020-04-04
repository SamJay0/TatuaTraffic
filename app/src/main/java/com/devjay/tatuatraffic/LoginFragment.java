package com.devjay.tatuatraffic;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginFragment extends Fragment implements View.OnClickListener {
    TextView sign_up;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        // set onclick on views
        view.findViewById(R.id.sign_up_if_not_member).setOnClickListener(this);
        view.findViewById(R.id.login_btn).setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View v) {
        int viewID= v.getId();
        if(viewID==R.id.login_btn){
            Navigation.findNavController(v).navigate(R.id.action_loginFragment2_to_home2);
        }
        if(viewID==R.id.sign_up_if_not_member){
            Navigation.findNavController(v).navigate(R.id.action_loginFragment2_to_signUpFragment2);
        }

    }
}
