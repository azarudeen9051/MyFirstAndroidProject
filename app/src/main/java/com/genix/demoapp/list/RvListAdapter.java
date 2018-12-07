package com.genix.demoapp.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.genix.demoapp.R;

import java.util.ArrayList;

public class RvListAdapter extends RecyclerView.Adapter<RvListAdapter.RvViewHolder> {

    private ArrayList<String> list;


    public RvListAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new RvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder rvViewHolder, int i) {
        String title = list.get(i);
        rvViewHolder.item.setText(title);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RvViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView item;

        public RvViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            item = itemView.findViewById(R.id.item);
        }


        @Override
        public void onClick(View v) {
        }
    }

}
