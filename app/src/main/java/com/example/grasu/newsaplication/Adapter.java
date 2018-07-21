package com.example.grasu.newsaplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Adapter extends ArrayAdapter<News> {
    public Adapter(Context context, List<News> newsItems) {
        super(context, 0, newsItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }

        News currentNews = getItem(position);
        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());
        TextView section = listItemView.findViewById(R.id.section);
        section.setText(currentNews.getSection());
        TextView publicationDate = listItemView.findViewById(R.id.publicationDate);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        String date = sdf.format(new Date());
        publicationDate.setText(date);
        return listItemView;
    }
}


