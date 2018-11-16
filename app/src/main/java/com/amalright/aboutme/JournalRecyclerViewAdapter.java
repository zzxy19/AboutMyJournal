package com.amalright.aboutme;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.amalright.aboutme.JournalFragment.OnListFragmentInteractionListener;
import com.amalright.aboutme.journal.Journal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Journal} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class JournalRecyclerViewAdapter extends RecyclerView.Adapter<JournalRecyclerViewAdapter.ViewHolder> {

  private final List<Journal> mValues;
  private final OnListFragmentInteractionListener mListener;

  public JournalRecyclerViewAdapter(List<Journal> items, OnListFragmentInteractionListener listener) {
    mValues = items;
    mListener = listener;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.fragment_journal, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(final ViewHolder holder, int position) {
    holder.mJournal = mValues.get(position);
    holder.mTimeLogged.setText(
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
            .format(
                new Date(mValues.get(position).getTimeLogged())));
    holder.mScoreView.setText(String.valueOf(mValues.get(position).getHappinessScore()));
    holder.mTitleView.setText(mValues.get(position).getTitle());

    holder.mView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (null != mListener) {
          // Notify the active callbacks interface (the activity, if the
          // fragment is attached to one) that an item has been selected.
          mListener.onListFragmentInteraction(holder.mJournal);
        }
      }
    });
  }

  @Override
  public int getItemCount() {
    return mValues.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {
    public final View mView;
    public final TextView mTimeLogged;
    public final TextView mScoreView;
    public final TextView mTitleView;
    public Journal mJournal;

    public ViewHolder(View view) {
      super(view);
      mView = view;
      mTimeLogged = (TextView) view.findViewById(R.id.journal_timeLogged);
      mScoreView = (TextView) view.findViewById(R.id.journal_score);
      mTitleView = (TextView) view.findViewById(R.id.journal_title);
    }

    @Override
    public String toString() {
      return super.toString() + " '" + mTitleView.getText() + "'";
    }
  }
}
