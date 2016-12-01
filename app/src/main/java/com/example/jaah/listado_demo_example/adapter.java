package com.example.jaah.listado_demo_example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JAAH on 14/11/16.
 */

public class adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<String> lsData;
    private int position;

    public adapter(ArrayList<String> lstData) {
        this.lsData = lstData;
    }

    public static class itemViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public itemViewHolder(View itemView) {
            super(itemView);

            this.textView = (TextView) itemView.findViewById(R.id.txtMain);
        }
    }


        @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlits,parent,false);
            return new itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        itemViewHolder itemHolder = (itemViewHolder) holder;
        this.position = position;
        itemHolder.textView.setText(lsData.get(position));
    }

    @Override
    public int getItemCount() {
        return lsData.size();
    }

    public void remove(int position) {
        lsData.remove(position);
        notifyItemRemoved(position);
    }

    public void add(String text, int position) {
        lsData.add(position, text);
        notifyItemInserted(position);
    }

    public void removeAll(int positionStar, int itemCount) {
        lsData.clear();
        notifyItemRangeRemoved(positionStar,itemCount);
    }
}
