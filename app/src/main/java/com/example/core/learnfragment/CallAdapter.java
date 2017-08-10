package com.example.core.learnfragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.RecyclerHolder> {
    private List<CallData> list;
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
    public void onBindViewHolder(final RecyclerHolder holder, final int position) {

        CallData sData = list.get(position);
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
                Intent i = new Intent(Intent.ACTION_CALL);
                switch (position){
                    case 0:
                i.setData(Uri.parse("tel:01287430111"));
                        break;
                    case 1:
                        i.setData(Uri.parse("tel:01273841479"));
                break;
                    case 2:
                        i.setData(Uri.parse("tel:01287430111"));
                        break;
                    case 3:
                        i.setData(Uri.parse("tel:01273841479"));
                        break;   case 4:
                        i.setData(Uri.parse("tel:01287430111"));
                        break;
                    case 5:
                        i.setData(Uri.parse("tel:01273841479"));
                        break;   case 6:
                        i.setData(Uri.parse("tel:01287430111"));
                        break;
                    case 7:
                        i.setData(Uri.parse("tel:01273841479"));
                        break;
                    case 8:
                        i.setData(Uri.parse("tel:01287430111"));
                        break;
                    case 9:
                        i.setData(Uri.parse("tel:01273841479"));
                        break;
                    case 10:
                        i.setData(Uri.parse("tel:01287430111"));
                        break;
                    case 11:
                        i.setData(Uri.parse("tel:01273841479"));
                        break;



                }
                mContext.startActivity(i);}
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;

        private TextView description;


        public RecyclerHolder(View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.item_img);
            name = (TextView) view.findViewById(R.id.item_name);

            description = (TextView) view.findViewById(R.id.item_description);

        }
    }

}
