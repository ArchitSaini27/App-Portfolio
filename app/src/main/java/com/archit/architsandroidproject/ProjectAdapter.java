package com.archit.architsandroidproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    private Project[] projects;
    ProjectAdapter(Project[] projects){
        this.projects=projects;

    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item,parent,false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);

    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder{

        ImageView appImage;
        TextView appTitle;
        TextView appDescription;
        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage=itemView.findViewById(R.id.image_view_appicon);
            appTitle=itemView.findViewById(R.id.text_view_app_title);
            appDescription=itemView.findViewById(R.id.text_view_app_description);
        }
        public void bind(Project project){
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
        }
    }
}
