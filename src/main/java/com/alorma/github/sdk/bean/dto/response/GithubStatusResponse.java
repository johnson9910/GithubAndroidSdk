package com.alorma.github.sdk.bean.dto.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by a557114 on 06/09/2015.
 */
public class GithubStatusResponse extends ShaUrl implements Serializable {
  public String state;
  public int total_count;
  public List<GithubStatus> statuses;
  public Repo repository;
  public String commit_url;
}
