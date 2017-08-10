package com.example.core.learnfragment;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by core on 10/08/2017.
 */

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.RecyclerHolder>  {
    private List<ChatData> chat;
    private Context mContext;


    public ChatAdapter(List<ChatData> chat, Context mContext) {
        this.chat = chat;
        this.mContext = mContext;
    }
    public ChatAdapter(FragmentActivity activity, List<ChatData> chat) {
        this.chat = chat;
    }

    @Override
    public ChatAdapter.RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.chat_recycler, parent, false);

        return new ChatAdapter.RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(ChatAdapter.RecyclerHolder holder, int position) {
        ChatData sData = chat.get(position);
        holder.description.setText(sData.getDescription());
        holder.name.setText(sData.getName());

        Picasso.with(mContext)
                .load(sData.getImg())
                .error(R.drawable.whats)
                .placeholder(R.drawable.webview)
                .into(holder.image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i=new Intent(getActivity(),ThirdActivity.class);
//                startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return chat.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;
        private TextView description;
        public RecyclerHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.item_img);
            name = (TextView) itemView.findViewById(R.id.item_name);

            description = (TextView) itemView.findViewById(R.id.item_description);
        }
    }
}
