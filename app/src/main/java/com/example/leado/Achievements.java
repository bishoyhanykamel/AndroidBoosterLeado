package com.example.leado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.anhttvn.customrecyclerview.R;
import com.example.leado.adapter.ListAdapter;
import com.example.leado.model.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class Achievements extends AppCompatActivity {

    private RecyclerView mRecycleview;
    private List<ItemAdapter> mList = new ArrayList<>();
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);
        init();
        addList();
        adapter();
    }

    private void init() {
        mRecycleview = findViewById(R.id.listView);
    }

    private void addList() {
        ItemAdapter itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.person);
        itemAdapter.setText("Person");
        mList.add(itemAdapter);

        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.person);
        itemAdapter.setText("Person");
        mList.add(itemAdapter);

        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.person);
        itemAdapter.setText("Person");
        mList.add(itemAdapter);

        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.person);
        itemAdapter.setText("Person");
        mList.add(itemAdapter);

        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.person);
        itemAdapter.setText("Person");

        mList.add(itemAdapter);
        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.person);
        itemAdapter.setText("Person");
        mList.add(itemAdapter);

        mList.add(itemAdapter);
        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.person);
        itemAdapter.setText("Person");
        mList.add(itemAdapter);
    }

    private void adapter() {
        Log.d("anhtt", "mlist : " + mList.size());
        mAdapter = new ListAdapter(mList, this);
        mRecycleview.setAdapter(mAdapter);
        mRecycleview.setLayoutManager(new LinearLayoutManager(this));
        mAdapter.notifyDataSetChanged();

    }
}
