package com.example.redditnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.redditnews.entityOutput.PublicationInfo;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PublicationAdapter extends RecyclerView.Adapter<PublicationAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<PublicationInfo> publications;

    PublicationAdapter(Context context, List<PublicationInfo> publications) {
        this.publications = publications;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public PublicationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_publication, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PublicationAdapter.ViewHolder holder, int position) {
        try {
            PublicationInfo publicationInfo = publications.get(position);
            Picasso.get().load(publicationInfo.getSourceHref()).into(holder.imageView);
            holder.authorNameView.setText(publicationInfo.getAuthorName());
            holder.createdHoursAgoView.setText(publicationInfo.getCreatedMillis());
            holder.numberOfCommentsView.setText(publicationInfo.getNumberOfComments());
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return publications.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView authorNameView, createdHoursAgoView, numberOfCommentsView;

        ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.publication_image);
            authorNameView = view.findViewById(R.id.author_name);
            createdHoursAgoView = view.findViewById(R.id.created_hours_ago);
            numberOfCommentsView = view.findViewById(R.id.number_of_comments);
        }
    }
}
