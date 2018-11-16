package com.amalright.aboutme;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.amalright.aboutme.journal.Journal;

public class JournalTimelineActivity extends AppCompatActivity
    implements JournalFragment.OnListFragmentInteractionListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_journal_timeline);

    // Set up toolbar/appbar
    Toolbar toolbar = (Toolbar) findViewById(R.id.journalTimeline_appbar);
    setSupportActionBar(toolbar);

    // Set up floating action button
    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, CreateJournalActivity.class);
        context.startActivity(intent);
      }
    });
  }

  @Override
  public void onListFragmentInteraction(Journal item) {

  }
}
