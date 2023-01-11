package com.example.fragmentlesson;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        v.findViewById(R.id.btFirst).setOnClickListener(view -> {
            SecondFragment secondFragment = new SecondFragment();
            EditText etFirst = v.findViewById(R.id.etFirst);
            Bundle b = new Bundle();                       //data put to second fragment
            b.putString("name" , etFirst.getText().toString());
            secondFragment.setArguments(b);




            FragmentTransaction transaction =  requireActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fcMain,secondFragment).addToBackStack("");
            transaction.commit();
        });

        return v;
    }
}