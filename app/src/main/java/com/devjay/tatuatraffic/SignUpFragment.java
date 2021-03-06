package com.devjay.tatuatraffic;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpFragment extends Fragment implements View.OnClickListener{

    private EditText mEmailField;
    private EditText mPasswordField;
    private EditText mConfirmPasswordField;
    private FirebaseAuth mAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        //onclick on view
        view.findViewById(R.id.login_if_member).setOnClickListener(this);
        view.findViewById(R.id.sign_up_btn).setOnClickListener(this);

        //get views
        mEmailField =view.findViewById(R.id.sign_up_email);
        mPasswordField=view.findViewById(R.id.sign_up_pass1);
        mConfirmPasswordField=view.findViewById(R.id.sign_up_pass2);

        //initialise firebase
        mAuth = FirebaseAuth.getInstance();

        return view;
    }

    // check user on start
    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }


    @Override
    public void onClick(View v) {
        int viewID= v.getId();
        if(viewID==R.id.login_if_member){
            Navigation.findNavController(v).navigate(R.id.action_signUpFragment2_to_loginFragment2);
        }
        else if(viewID==R.id.sign_up_btn){
            Toast.makeText(getActivity(), "sign up", Toast.LENGTH_SHORT).show();
        }
    }

    public void SignUp(){

    }
}
