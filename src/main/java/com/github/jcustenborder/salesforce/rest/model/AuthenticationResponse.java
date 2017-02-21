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
package com.github.jcustenborder.salesforce.rest.model;

import com.google.api.client.util.Key;

public class AuthenticationResponse {
  @Key("access_token")
  String accessToken;
  @Key("instance_url")
  String instanceUrl;
  @Key("id")
  String id;
  @Key("token_type")
  String tokenType;
  @Key("issuedAt")
  String issuedAt;
  @Key("signature")
  String signature;


  public String accessToken() {
    return this.accessToken;
  }

  public AuthenticationResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public String instanceUrl() {
    return this.instanceUrl;
  }

  public AuthenticationResponse instanceUrl(String instanceUrl) {
    this.instanceUrl = instanceUrl;
    return this;
  }

  public String id() {
    return this.id;
  }

  public AuthenticationResponse id(String id) {
    this.id = id;
    return this;
  }

  public String tokenType() {
    return this.tokenType;
  }

  public AuthenticationResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  public String issuedAt() {
    return this.issuedAt;
  }

  public AuthenticationResponse issuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  public String signature() {
    return this.signature;
  }

  public AuthenticationResponse signature(String signature) {
    this.signature = signature;
    return this;
  }
}
