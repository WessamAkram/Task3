package com.example.core.learnfragment;

import android.content.Context;
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
 * Created by core on 09/08/2017.
 */

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.RecyclerHolder> { private List<CallData> list;
    private Context mContext;
    public CallAdapter(List<CallData> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    public CallAdapter(FragmentActivity activity, List<CallData> list) {
        this.list = list;
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.call_recycler, parent, false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {

        CallData sData=list.get(position);
        holder.description.setText(sData.getDescription());
        holder.name.setText(sData.getName());

        Picasso.with(mContext)
                .load(sData.getImg())
                .error(R.drawable.whats)
                .placeholder(R.drawable.webview)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;
        private TextView date;
        private TextView description;
        public RecyclerHolder(View view) {
            super(view);
            image= (ImageView) view.findViewById(R.id.item_img);
            name= (TextView) view.findViewById(R.id.item_name);

            description=(TextView) view.findViewById(R.id.item_description);

        }
    }

}
