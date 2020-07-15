package com.example.android.newsapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Activity context, List<News> list) {
        super(context, 0, list);

    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.view, parent, false);
        }


        final News item = getItem(position);

        TextView section = (TextView) listItemView.findViewById(R.id.sectionName);
        section.setText(item.getSectionName());

        TextView title = listItemView.findViewById(R.id.webTitle);
        title.setText(item.getTitle());

        TextView dateText = listItemView.findViewById(R.id.date);
        String date = item.getDate();
        if (date.contains("T")) {
            String[] parts = date.split("T");
            String dateFirstPart = parts[0];
            dateText.setText(dateFirstPart);
        }

        TextView authorName = listItemView.findViewById(R.id.authorName);
        if (item.getAuthor() != "") {
            authorName.setText(item.getAuthor());
            authorName.setVisibility(View.VISIBLE);
        } else {
            authorName.setVisibility(View.GONE);
        }

        return listItemView;
    }


}
