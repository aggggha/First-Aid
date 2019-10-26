package org.bekadesain.firstaid;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCasesAdapter extends RecyclerView.Adapter<ListCasesAdapter.ListViewHolder> {
    private ArrayList<Cases> listCase;

    public ListCasesAdapter(ArrayList<Cases> list) {
        this.listCase = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_firstaid_list, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Cases cases = listCase.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cases.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.itemName.setText(cases.getCasesName());
        holder.itemDetail.setText("Pelajari lebih lanjut");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailIntent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                detailIntent.putExtra(DetailActivity.EXTRA_NAME, cases.getCasesName());
                detailIntent.putExtra(DetailActivity.EXTRA_PHOTO, cases.getPhoto());
                detailIntent.putExtra(DetailActivity.EXTRA_SUGGESTION, cases.getCasesSuggestion());
                detailIntent.putExtra(DetailActivity.EXTRA_AVOID, cases.getCasesAvoid());
                holder.itemView.getContext().startActivity(detailIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCase.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView itemName, itemDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            itemName = itemView.findViewById(R.id.item_name);
            itemDetail = itemView.findViewById(R.id.item_detail);
        }
    }
}
