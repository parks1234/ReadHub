package com.chihopang.readhub.model;

import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;

@Parcel public class Topic {
  String id;
  long order;
  String title;
  String siteName;
  String authorName;
  String url;
  String summary;
  ArrayList<ArticlePage> newsArray;
  String publishDate;

  public Topic() {
  }

  @Override public String toString() {
    return "Topic{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", siteName='" + siteName + '\'' +
        ", authorName='" + authorName + '\'' +
        ", url='" + url + '\'' +
        ", summary='" + summary + '\'' +
        ", newsArray=" + newsArray +
        ", publishDate='" + publishDate + '\'' +
        '}';
  }

  public String getSiteName() {
    return siteName;
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getUrl() {
    return url;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getSummary() {
    return summary;
  }

  public List<ArticlePage> getNewsArray() {
    return newsArray;
  }

  public String getPublishDate() {
    return publishDate;
  }

  public long getOrder() {
    return order;
  }
}
