package com.amalright.aboutme.journal;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * This class corresponds to the data stored in Room persistence library.
 */
@Entity(tableName = "journal")
public class Journal {
  @PrimaryKey
  @NonNull
  @ColumnInfo(name = "journal_id")
  public long id;

  @ColumnInfo(name = "time_logged_us")
  public long timeLoggedUs;

  @ColumnInfo(name = "title")
  public String title;

  @ColumnInfo(name = "happiness_score")
  public int happinessScore;
}
