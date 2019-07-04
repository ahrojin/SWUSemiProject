package com.example.swusemiproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Fragment_1 extends Fragment {
    public Fragment_1(){}

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)//inflater:UI생성
    {
        //Fragment UI생성
        View view = inflater.inflate(R.layout.activity_frag_memo,container,false);

        Button btnnewmemo=view.findViewById(R.id.btnnewmemo); //view를 통해서 함수 호출해야한다.

        btnnewmemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(),MemoTabActivity.class);
                startActivity(intent);
            }

        });

        return view;
    }
}
