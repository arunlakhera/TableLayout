package com.example.arunlakhera.tablelayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SongsAdapter extends BaseAdapter {

    Context context;
    String songsList[];
    String durationList[];
    String yogaStyleList[];
    String dedicateTimeList[];
    String benefitsList[];
    String teacherNoteList[];

    LayoutInflater songsInflater;

    public SongsAdapter(Context applicationContext, String[] songsList, String[] durationList,String[] yogaStyleList, String[] dedicateTimeList, String[] benefitsList, String[] teacherNoteList){
        this.context = applicationContext;
        this.songsList = songsList;
        this.durationList = durationList;
        this.yogaStyleList = yogaStyleList;
        this.dedicateTimeList = dedicateTimeList;
        this.benefitsList = benefitsList;
        this.teacherNoteList = teacherNoteList;
        songsInflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return songsList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = songsInflater.inflate(R.layout.listview_songs,null);

        TextView songsName_TextView = view.findViewById(R.id.textView_SongsName);
        TextView duration_TextView = view.findViewById(R.id.textView_Duration);
        TextView yogaStyle_TextView = view.findViewById(R.id.textView_YogaStyle);
        TextView dedicateTime_TextView = view.findViewById(R.id.textView_DedicateTime);
        TextView benefits_TextView = view.findViewById(R.id.textView_Benefits);
        TextView teacherNote_TextView = view.findViewById(R.id.textView_TeacherNote);
        ImageView playPause_ImageView = view.findViewById(R.id.imageView_PlayPause);

        songsName_TextView.setText(songsList[i]);
        duration_TextView.setText(durationList[i]);
        yogaStyle_TextView.setText(yogaStyleList[i]);
        dedicateTime_TextView.setText(dedicateTimeList[i]);
        benefits_TextView.setText(benefitsList[i]);
        teacherNote_TextView.setText(teacherNoteList[i]);

        return view;
    }

}
