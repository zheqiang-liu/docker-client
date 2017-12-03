/*-
 * -\-\-
 * docker-client
 * --
 * Copyright (C) 2016 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */

package com.spotify.docker.client.messages;

public class RegistryAuthV2 extends RegistryAuth {

  private String username;
  private String password;
  private String email;
  private String serverAddress;
  private String identityToken;


  public RegistryAuthV2(String username, String password, String serverAddress) {
    this.username = username;
    this.password = password;
    this.serverAddress = serverAddress;
  }

  @Override
  public String username() {
    return username;
  }

  @Override
  public String password() {
    return password;
  }

  @Override
  public String email() {
    return email;
  }

  @Override
  public String serverAddress() {
    return serverAddress;
  }

  @Override
  public String identityToken() {
    return identityToken;
  }

  @Override
  public Builder toBuilder() {
    return null;
  }
}
