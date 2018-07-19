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

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        TextView section = (TextView) listItemView.findViewById(R.id.selection);
        Date dateObject = new Date(currentNews.getPublicationDate());
        TextView publicationDate = listItemView.findViewById(R.id.publicationDate);
        String formattedDate = formatDate(dateObject);
        publicationDate.setText(formattedDate);
        TextView publicationTime = listItemView.findViewById(R.id.publicationTime);
        String formattedTime = formatTime(dateObject);
        publicationTime.setText(formattedTime);

        title.setText(currentNews.getTitle());
        section.setText(currentNews.getSection());


        return listItemView;


        }
    private String formatDate(Date dateObject){
        SimpleDateFormat dateFormat=new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);}
        private String formatTime(Date dateObject){
        SimpleDateFormat timeFormat=new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
        }
    }


