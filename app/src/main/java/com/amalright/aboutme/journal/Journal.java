package com.amalright.aboutme.journal;

public class Journal {
  private long timeLogged;
  private String title;
  private int happinessScore;
  private long id;

  public long getId() {
    return id;
  }

  public Journal setId(long id) {
    this.id = id;
    return this;
  }

  public long getTimeLogged() {
    return timeLogged;
  }

  public Journal setTimeLogged(long timeLogged) {
    this.timeLogged = timeLogged;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Journal setTitle(String title) {
    this.title = title;
    return this;
  }

  public int getHappinessScore() {
    return happinessScore;
  }

  public Journal setHappinessScore(int happinessScore) {
    this.happinessScore = happinessScore;
    return this;
  }
}
