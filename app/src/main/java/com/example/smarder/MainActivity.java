package com.example.smarder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView bgApp;
    LinearLayout texthome, menus;
    private CardView notes_card, about_card, settings_card;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);

        bgApp = findViewById(R.id.bgApp);
        texthome = findViewById(R.id.texthome);
        menus = findViewById(R.id.menus);
        notes_card = findViewById(R.id.NoteList_card);
        about_card = findViewById(R.id.About_card);
        settings_card = findViewById(R.id.Settings_card);

        settings_card.setOnClickListener(this);
        about_card.setOnClickListener(this);
        notes_card.setOnClickListener(this);

        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.About_card :
                Intent moveAbout = new Intent(this,AboutActivity.class);
                startActivity(moveAbout);
                break;
            case R.id.Settings_card :
                Intent moveSettings = new Intent(this,SettingsActivity.class);
                startActivity(moveSettings);
                break;
            case R.id.NoteList_card :
                Intent moveNoteList = new Intent(this, ReminderList.class);
                startActivity(moveNoteList);
                break;
            default:
                break;
        }
    }
}