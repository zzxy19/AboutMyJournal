package com.amalright.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class CreateJournalActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_create_journal);
    Toolbar toolbar = (Toolbar) findViewById(R.id.createJournal_appbar);
    setSupportActionBar(toolbar);
  }
}
