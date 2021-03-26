package com.flexcode.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClassRecycler>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting data
        initData();
        initRecyclerView();

    }

    private void initData() {

        userList = new ArrayList<>();

        //1
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
        //2
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
        //3
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
        //4
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
        //5
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
        //6
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
        //7
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
        //8
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
        //9
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
        //10
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
        //11
        userList.add(new ModelClassRecycler(R.drawable.felix,
                "Felix", "10:45AM",
                "How are you?",
                "___________________________________________________________________________________"));
    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}