package com.example.arunlakhera.tablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView songsList;
    String songs[] = {"Album 1", "Album 2", "Album 3", "Album 4", "Album 5", "Album 6"};
    String duration[] = {"3:50", "5:09", "2:55", "4:00", "5:30", "3:36"};
    String yogaStyle[] = {"Triangle", "Triangle", "Triangle", "Triangle", "Triangle", "Triangle"};
    String dedicateTime[] = {"2:01", "1:22", "2:00", "3:34", "5:00", "3:36"};
    String benefits[] = {"Removes Fat waist and thighs", "Removes Fat waist and thighs", "Removes Fat waist and thighs", "Removes Fat waist and thighs", "Removes Fat waist and thighs", "Removes Fat waist and thighs"};
    String teacherNote[] = {"Teacher 1", "Teacher 2", "Teacher 3", "Teacher 4", "Teacher 5", "Teacher 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songsList = findViewById(R.id.list_songs);

        SongsAdapter songsAdapter = new SongsAdapter(getApplicationContext(),songs,duration,yogaStyle,dedicateTime,benefits,teacherNote);
        songsList.setAdapter(songsAdapter);

    }
}
