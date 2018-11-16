package com.amalright.aboutme.journal;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for storing/fetching journal from on-device storage.
 */
public final class JournalManager {
  public static List<Journal> fetchAllJournal() {
    List<Journal> journals = new ArrayList<>();
    Journal journal = new Journal()
        .setTimeLogged(100L)
        .setTitle("test journal")
        .setHappinessScore(8);
    journals.add(journal);
    journal = new Journal()
        .setTimeLogged(200L)
        .setTitle("really really really reallyreallyreallyreallyreally long journal name")
        .setHappinessScore(8);
    journals.add(journal);
    for (int i=0; i<20; i++) {
      Journal journal2 = new Journal()
          .setTimeLogged(i)
          .setTitle("test journal 2")
          .setHappinessScore(i);
      journals.add(journal2);
    }
    return journals;
  }
}
