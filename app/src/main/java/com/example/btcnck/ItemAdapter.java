package com.example.btcnck;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private List<Item> itemList;

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgItem, imgDelete;
        public TextView txtTitle, txtDescription;
        public Button btnBuy;

        public ItemViewHolder(View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.itemImange);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            btnBuy = itemView.findViewById(R.id.btnBuy);
            imgDelete = itemView.findViewById(R.id.imgDelete);
        }
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.txtTitle.setText(item.getTitle());
        holder.txtDescription.setText(item.getDescription());
        holder.imgItem.setImageResource(item.getImageResId());

        holder.btnBuy.setOnClickListener(v -> {
            // Xử lý sự kiện "Buy Now"
            Toast.makeText(v.getContext(), "Buy Now clicked: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        });

        holder.imgDelete.setOnClickListener(v -> {
            // Xử lý sự kiện xóa mục
            Toast.makeText(v.getContext(), "Delete clicked: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        });
    }
    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

