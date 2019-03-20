package com.amalright.aboutme.journal;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(version = 1, entities = {Journal.class})
public abstract class JournalDatabase extends RoomDatabase {
  abstract public JournalDao journalDao();

  private static JournalDatabase journalDb;

  public static void createInstance(Context context) {
    System.out.println("Initializing database...");
    if (journalDb == null) {
      journalDb = Room.databaseBuilder(context, JournalDatabase.class, "journal-db").build();
    }
  }

  public static JournalDatabase getInstance() {
    if (journalDb == null) {
      throw new RuntimeException("JournalDatabase used before initialized");
    }
    return journalDb;
  }
}