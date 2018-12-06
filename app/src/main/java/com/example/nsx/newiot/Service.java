package com.example.nsx.newiot;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Service extends Fragment {
    Button  btn1on, btn1off,btn2on, btn2off,btn3on, btn3off,btn4on, btn4off,
            btn5on, btn5off;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btn1on = getView().findViewById(R.id.on1);
        btn1off = getView().findViewById(R.id.off1);

        btn2on = getView().findViewById(R.id.on2);
        btn2off = getView().findViewById(R.id.off2);

        btn3on = getView().findViewById(R.id.on3);
        btn3off = getView().findViewById(R.id.off3);

        btn4on = getView().findViewById(R.id.on4);
        btn4off = getView().findViewById(R.id.off4);

        btn5on = getView().findViewById(R.id.on5);
        btn5off = getView().findViewById(R.id.off5);




        btn1on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference led1 = database.getReference("LED_1");
                led1.setValue(1);
            }
        });

        btn1off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference led1 = database.getReference("LED_1");
                led1.setValue(0);
            }
        });
        btn2on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference led1 = database.getReference("LED_2");
                led1.setValue(1);
            }
        });

        btn2off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference led1 = database.getReference("LED_2");
                led1.setValue(0);
            }
        });
        btn3on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference led1 = database.getReference("LED_3");
                led1.setValue(1);
            }
        });

        btn3off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference led1 = database.getReference("LED_3");
                led1.setValue(0);
            }
        });
        btn4on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference led1 = database.getReference("LED_4");
                led1.setValue(1);
            }
        });

        btn4off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference led1 = database.getReference("LED_4");
                led1.setValue(0);
            }
        });
        btn5on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference led1 = database.getReference("LED_5");
                led1.setValue(1);
            }
        });

        btn5off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference led1 = database.getReference("LED_5");
                led1.setValue(0);
            }
        });


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_service, container, false);
        return view;
    }
}