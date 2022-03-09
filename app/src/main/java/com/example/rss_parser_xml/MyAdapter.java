package com.example.rss_parser_xml;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    List<Info> lst;
    Context context;

    public MyAdapter(Context context,List<Info>l) {
        this.context = context;
        this.lst = l;

    }

    @NonNull


    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.display, parent, false);

        return new ViewHolder(view);
    }


    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        holder.getTv1().setText(lst.get(position).getTitre());
        //Log.i("hhh", "onBindViewHolder: "+lst.get(position).getImg());
        Picasso.get().load(lst.get(position).getImg()).into(holder.getIv());
    }

    @Override
    public int getItemCount() {
        return lst.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tv1;
        private final ImageView im;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            tv1 = (TextView) view.findViewById(R.id.tv);
            im=(ImageView) view.findViewById(R.id.iv);
        }

        public TextView getTv1() {
            return tv1;
        }

        public ImageView getIv() { return im; }

    }
}
