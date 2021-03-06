package com.alorma.github.sdk.bean.dto.response;

import java.io.Serializable;

/**
 * Created by Bernat on 18/02/2015.
 */
public class Notification extends ShaUrl implements Serializable {
  public long id;
  public Repo repository;
  public NotificationSubject subject;
  public String reason;
  public boolean unread;
  public String updated_at;
  public String last_read_at;
  public Long adapter_repo_parent_id;

}
