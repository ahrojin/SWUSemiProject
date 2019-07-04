package com.example.swusemiproject;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class WriteMemoActivity extends Fragment {
    public WriteMemoActivity(){}

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)//inflater:UI생성
    {
        //Fragment UI생성
        View view = inflater.inflate(R.layout.activity_write_memo,container,false);

        Button btnsave=view.findViewById(R.id.btnsave); //view를 통해서 함수 호출해야한다.

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(),TabActivity.class);
                startActivity(intent);
            }

        });

        return view;
    }
}
