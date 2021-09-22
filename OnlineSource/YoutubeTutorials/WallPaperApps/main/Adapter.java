package com.example.wallpaperapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

// create adapter to show all data on our recycleView

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    ArrayList<ImageModel> wallpaperlist;

    public Adapter(Context context, ArrayList<ImageModel> wallpaperlist) {
        this.context = context;
        this.wallpaperlist = wallpaperlist;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, null,false);     // attach to root and then false
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                holder.textView.setMovementMethod(LinkMovementMethod.getInstance());
                // so why is the set movement method? because I have a text view on just above the card view
                // so if I click on the card view then I have to open the new activity to show that image.
                // but if i have to click on text view then i have to open the link so that's why it is necessary
                // to separate the item so that's why i type here holder.textView.setMovementMethod
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent browserintent = new Intent(Intent.ACTION_VIEW);
                        browserintent.setData(Uri.parse("https://www.pexels.com/"));
                        browserintent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(browserintent);
                    }
                });

            }
        });

        Glide.with(context).load(wallpaperlist.get(position).getSrc().getPortrait()).into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SetWallPapaer.class);
                intent.putExtra("image", wallpaperlist.get(position).getSrc().getPortrait());
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return wallpaperlist.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.textview);

        }
    }
}
