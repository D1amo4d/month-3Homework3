package com.example.month_3homework_3.model;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.month_3homework_3.R;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);
    }

    public void onBind(String name) {
        if (tvName != null) {
            tvName.setText(name);
        }
    }
}
