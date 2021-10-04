package com.example.jeephysics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class StudyMaterialFragment extends Fragment implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5;
    String[] urls=new String[5];

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_studymaterial, container, false);


        return view;

    }
    @Override
    public void onClick(View v) {
        //do what you want to do when button is clicked
        Intent int1=new Intent(getActivity(),web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }
}
