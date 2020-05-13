package com.baoquan.sdk.pojos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SignResultResponse {
  private String result;
  private String attestationId;

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getAttestationId() {
    return attestationId;
  }

  public void setAttestationId(String attestationId) {
    this.attestationId = attestationId;
  }
}