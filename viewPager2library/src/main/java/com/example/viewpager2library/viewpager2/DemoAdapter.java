package com.example.viewpager2library.viewpager2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager2library.R;

import java.util.ArrayList;

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.ViewHolder> {

    private ArrayList<String> mList;
    private Context mContext;

    private int[] colors = {0xFFDC143C,0xFFFF1493,0xFFFF00FF,0xFF4B0082,0xFF0000FF,
            0xFF1E90FF,0xFF00CED1,0xFF7FFFAA,0xFF228B22,0xFFFFFF00};

    public DemoAdapter(ArrayList<String> list) {
        mList = list;
    }

    @NonNull @Override public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
//        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_demo_item, parent, false);
//        return new ViewHolder(inflate);
        return null;
    }

    @Override public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.mTextView.setText(
//                String.format(
//                        mContext.getResources().getString(R.string.adapter_demo_content)
//                        ,position));
//        holder.mTextView.setBackgroundColor(colors[position]);
    }

    @Override public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
//            mTextView = itemView.findViewById(R.id.adapter_demo_tv);
        }
    }
}
