package com.example.ex06_3_tabhost;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TabHost tabHost = getTabHost();
//
//        TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
//        tabSpecSong.setContent(R.id.tabSong);
//        tabHost.addTab(tabSpecSong);
//
//        TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST")
//                .setIndicator("가수별");
//        tabSpecArtist.setContent(R.id.tabArtist);
//        tabHost.addTab(tabSpecArtist);
//
//        TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
//        tabSpecAlbum.setContent(R.id.tabAlbum);
//        tabHost.addTab(tabSpecAlbum);
//
//        tabHost.setCurrentTab(0);

        TabHost tabHost = getTabHost();

        TabSpec tab1 = tabHost.newTabSpec("TAG1").setIndicator("고양이");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        TabSpec tab2 = tabHost.newTabSpec("TAG2").setIndicator("강아지");
        tab2.setContent(R.id.tab2);
        tabHost.addTab(tab2);

        TabSpec tab3 = tabHost.newTabSpec("TAG3").setIndicator("토끼");
        tab3.setContent(R.id.tab3);
        tabHost.addTab(tab3);

        TabSpec tab4 = tabHost.newTabSpec("TAG4").setIndicator("말");
        tab4.setContent(R.id.tab4);
        tabHost.addTab(tab4);

        tabHost.setCurrentTab(1);
    }
}
