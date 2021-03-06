package com.alorma.github.sdk.bean.dto.response;

import com.alorma.github.sdk.bean.info.RepoInfo;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Bernat on 13/07/2014.
 */
public class Repo extends ShaUrl implements Serializable {

  public boolean fork;
  @SerializedName("private") public boolean isPrivate;
  public Date created_at;
  public Date pushed_at;
  public Date updated_at;
  public int forks_count;
  public long id;
  public Repo parent;
  public Repo source;
  public String clone_url;
  public String description;
  public String homepage;
  public String git_url;
  public String language;
  public String default_branch;
  public String mirror_url;
  public String name;
  public String full_name;
  public String ssh_url;
  public String svn_url;
  public User owner;
  public int stargazers_count;
  public int subscribers_count;
  public int network_count;
  public int watchers_count;
  public int size;
  public int open_issues_count;
  public boolean has_issues;
  public boolean has_downloads;
  public boolean has_wiki;
  public Permissions permissions;
  public License license;
  public List<Branch> branches;

  public Repo() {
    super();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Repo{");
    sb.append("fork=").append(fork);
    sb.append(", isPrivate=").append(isPrivate);
    sb.append(", created_at=").append(created_at);
    sb.append(", pushed_at=").append(pushed_at);
    sb.append(", updated_at=").append(updated_at);
    sb.append(", forks_count=").append(forks_count);
    sb.append(", id=").append(id);
    sb.append(", parent=").append(parent);
    sb.append(", source=").append(source);
    sb.append(", clone_url='").append(clone_url).append('\'');
    sb.append(", description='").append(description).append('\'');
    sb.append(", homepage='").append(homepage).append('\'');
    sb.append(", git_url='").append(git_url).append('\'');
    sb.append(", html_url='").append(html_url).append('\'');
    sb.append(", language='").append(language).append('\'');
    sb.append(", default_branch='").append(default_branch).append('\'');
    sb.append(", mirror_url='").append(mirror_url).append('\'');
    sb.append(", name='").append(name).append('\'');
    sb.append(", full_name='").append(full_name).append('\'');
    sb.append(", ssh_url='").append(ssh_url).append('\'');
    sb.append(", svn_url='").append(svn_url).append('\'');
    sb.append(", url='").append(url).append('\'');
    sb.append(", owner=").append(owner);
    sb.append(", stargazers_count=").append(stargazers_count);
    sb.append(", subscribers_count=").append(subscribers_count);
    sb.append(", subscribers_count=").append(network_count);
    sb.append(", watchers_count=").append(watchers_count);
    sb.append(", size=").append(size);
    sb.append(", open_issues_count=").append(open_issues_count);
    sb.append(", has_issues=").append(has_issues);
    sb.append(", has_downloads=").append(has_downloads);
    sb.append(", has_wiki=").append(has_wiki);
    sb.append(", permissions=").append(permissions);
    sb.append('}');
    return sb.toString();
  }

  public boolean canPull() {
    return permissions != null && permissions.pull;
  }

  public boolean canPush() {
    return permissions != null && permissions.push;
  }

  public boolean canAdmin() {
    return permissions != null && permissions.admin;
  }

  public RepoInfo toInfo() {
    RepoInfo repoInfo = new RepoInfo();
    repoInfo.owner = owner.login;
    repoInfo.name = name;
    repoInfo.permissions = permissions;
    repoInfo.branch = default_branch;
    return repoInfo;
  }
}