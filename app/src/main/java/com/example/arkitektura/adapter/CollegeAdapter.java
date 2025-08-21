package com.example.arkitektura.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arkitektura.R;
import com.example.arkitektura.model.CollegeModel;
import com.example.arkitektura.fragments.Content;

import java.util.List;

public class CollegeAdapter extends RecyclerView.Adapter<CollegeAdapter.CollegeViewHolder> {

    private List<CollegeModel> collegeList;

    public CollegeAdapter(List<CollegeModel> collegeList) {
        this.collegeList = collegeList;
    }

    @NonNull
    @Override
    public CollegeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_college, parent, false);
        return new CollegeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CollegeViewHolder holder, int position) {
        CollegeModel college = collegeList.get(position);
        holder.collegeImage.setImageResource(college.getImageRes());
        holder.collegeLogo.setImageResource(college.getLogoRes());
        holder.collegeName.setText(college.getName());

        holder.collegeCard.setOnClickListener(v -> {
            Content content = Content.newInstance(college.getName(), "Some other param");

            ((androidx.fragment.app.FragmentActivity)v.getContext()).getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, content)
                    .addToBackStack(null)
                    .commit();
        });
    }

    @Override
    public int getItemCount() {
        return collegeList.size();
    }

    static class CollegeViewHolder extends RecyclerView.ViewHolder {

        CardView collegeCard;
        ImageView collegeImage, collegeLogo;

        TextView collegeName;

        public CollegeViewHolder(@NonNull View itemView) {
            super(itemView);
            collegeCard = itemView.findViewById(R.id.collegeCard);
            collegeImage = itemView.findViewById(R.id.collegeImage);
            collegeLogo = itemView.findViewById(R.id.collegeLogo);
            collegeName = itemView.findViewById(R.id.collegeName);
        }
    }
}

