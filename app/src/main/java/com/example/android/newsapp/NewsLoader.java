package com.example.android.newsapp;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    private String umUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        umUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        // Don't perform the request if there are no URLs, or the first URL is null.
        if (umUrl == null) {
            return null;
        }

        List<News> newsReceived = Queries.fetchNewsData(umUrl);
        return newsReceived;
    }
}
