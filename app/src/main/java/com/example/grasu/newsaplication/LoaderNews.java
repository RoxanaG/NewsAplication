package com.example.grasu.newsaplication;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class LoaderNews extends AsyncTaskLoader<List<News>> {
    private String Url;

    public LoaderNews(Context context, String url) {
        super(context);
        Url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (Url == null)
            return null;
        List<News> news = QueryUtils.fetchNewsData(Url);
        return news;
    }
}
