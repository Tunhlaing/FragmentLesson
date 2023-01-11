package com.example.fragmentlesson;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_second, container, false);


//        TextView tvName = v.findViewById(R.id.tvName);  //to get value from First Fragment
//        Bundle b = this.getArguments();
//        String username = b.getString("name");
//        tvName.setText(username);

        ((TextView)v.findViewById(R.id.tvName)).setText(this.getArguments().getString("name")); //short

        v.findViewById(R.id.btSecond).setOnClickListener(view -> {
            ThirdFragment thirdFragment = new ThirdFragment();
            FragmentTransaction transaction =  requireActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fcMain,thirdFragment).addToBackStack("");
            transaction.commit();


        });

        return v;
    }
}