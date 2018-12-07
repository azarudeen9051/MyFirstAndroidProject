package com.genix.demoapp.list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.genix.demoapp.R;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        RecyclerView list = findViewById(R.id.list);
        LinearLayoutManager lm = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        list.setLayoutManager(lm);
        RvListAdapter rvAdapter = new RvListAdapter(buildList());
        list.setAdapter(rvAdapter);
    }


    public ArrayList<String> buildList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Keynote pre-show");
        list.add("Firebase Remote Config");
        list.add("Android Bazel");
        list.add("Building website with AMP");
        list.add("Google Accessibility");
        list.add("Keynote pre-show");
        list.add("Firebase Remote Config");
        list.add("Android Bazel");
        list.add("Building website with AMP");
        list.add("Google Accessibility");
        list.add("Keynote pre-show");
        list.add("Firebase Remote Config");
        list.add("Android Bazel");
        list.add("Building website with AMP");
        list.add("Google Accessibility");
        list.add("Keynote pre-show");
        list.add("Firebase Remote Config");
        list.add("Android Bazel");
        list.add("Building website with AMP");
        list.add("Google Accessibility");
        list.add("Keynote pre-show");
        list.add("Firebase Remote Config");
        list.add("Android Bazel");
        list.add("Building website with AMP");
        list.add("Google Accessibility");
        return list;
    }

}
