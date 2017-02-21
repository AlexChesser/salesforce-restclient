/**
 * Copyright © 2017 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.salesforce.rest;

public class SalesforceRestClientConfig {
  public final boolean curlLogging;
  public final String consumerKey;
  public final String consumerSecret;
  public final String username;
  public final String passwordToken;
  public final String password;
  public final String instance;

  SalesforceRestClientConfig(boolean curlLogging, String consumerKey, String consumerSecret, String username, String passwordToken, String password, String instance) {
    this.curlLogging = curlLogging;
    this.consumerKey = consumerKey;
    this.consumerSecret = consumerSecret;
    this.username = username;
    this.passwordToken = passwordToken;
    this.password = password;
    this.instance = instance;
  }


  public static class Builder {
    private boolean curlLogging;
    private String consumerKey;
    private String consumerSecret;
    private String username;
    private String passwordToken;
    private String password;
    private String instance;

    public Builder curlLogging(boolean curlLogging) {
      this.curlLogging = curlLogging;
      return this;
    }

    public Builder consumerKey(String consumerKey) {
      this.consumerKey = consumerKey;
      return this;
    }

    public Builder consumerSecret(String consumerSecret) {
      this.consumerSecret = consumerSecret;
      return this;
    }

    public Builder username(String username) {
      this.username = username;
      return this;
    }

    public Builder passwordToken(String passwordToken) {
      this.passwordToken = passwordToken;
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      return this;
    }

    public Builder instance(String instance) {
      this.instance = instance;
      return this;
    }

    public boolean curlLogging() {
      return this.curlLogging;
    }

    public String consumerKey() {
      return this.consumerKey;
    }

    public String consumerSecret() {
      return this.consumerSecret;
    }

    public String username() {
      return this.username;
    }

    public String passwordToken() {
      return this.passwordToken;
    }

    public String password() {
      return this.password;
    }

    public String instance() {
      return this.instance;
    }

    public SalesforceRestClientConfig build() {
      return new SalesforceRestClientConfig(this.curlLogging, this.consumerKey, this.consumerSecret, this.username, this.passwordToken, this.password, this.instance);
    }
  }

  public static Builder builder() {
    return new Builder();
  }
}
