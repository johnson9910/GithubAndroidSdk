package com.alorma.github.sdk.services.client;

import com.alorma.github.sdk.security.GitHub;
import com.alorma.gitskarios.core.ApiClient;
import com.alorma.gitskarios.core.client.BaseClient;
import com.alorma.gitskarios.core.client.LogProvider;
import com.alorma.gitskarios.core.client.UrlProvider;

public abstract class GithubClient<K> extends BaseClient<K> {

  public GithubClient() {
    super(getApiClient());
  }

  private static ApiClient getApiClient() {
    String url = UrlProvider.getInstance().getUrl();
    return new GitHub(url);
  }

  @Override
  public void intercept(RequestFacade request) {
    request.addHeader("Accept", getAcceptHeader());
    request.addHeader("User-Agent", "Gitskarios");
    request.addHeader("Authorization", "token " + getToken());
  }

  @Override
  public void log(String message) {
    if (LogProvider.getInstance() != null) {
      LogProvider.getInstance().log(message);
    }
  }

  public String getAcceptHeader() {
    return "application/vnd.github.v3.json";
  }
}
