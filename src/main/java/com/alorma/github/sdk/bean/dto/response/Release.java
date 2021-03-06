package com.alorma.github.sdk.bean.dto.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Bernat on 20/07/2014.
 */
public class Release implements Serializable{

  public String body;
  public String upload_url;
  public String assets_url;
  public String tag_name;
  public String url;
  public String published_at;
  public String html_url;
  public String id;
  public String target_commitish;
  public List<ReleaseAsset> assets;
  public boolean draft;
  public User author;
  public String zipball_url;
  public boolean prerelease;
  public String tarball_url;
  public String name;
  public Date created_at;

  public Release() {

  }

}
