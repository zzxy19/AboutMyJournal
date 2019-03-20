package com.amalright.aboutme.journal;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface JournalDao {
  @Insert(onConflict = OnConflictStrategy.FAIL)
  void insertJournals(Journal... journals);

  @Insert(onConflict = OnConflictStrategy.FAIL)
  void insertJournal(Journal journal);

  @Update
  void updateJournal(Journal journal);

  @Delete
  void deleteJournal(Journal journal);

  @Query("SELECT * FROM journal " +
         "WHERE journal_id = :id ")
  LiveData<Journal> queryJournalById(long id);

  @Query("SELECT * FROM journal " +
      "ORDER BY time_logged_us DESC ")
  LiveData<List<Journal>> listJournal();
}
