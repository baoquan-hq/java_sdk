package com.baoquan.sdk.pojos.response;

import com.baoquan.sdk.pojos.response.data.AddFactoidsData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by sbwdlihao on 6/17/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddFactoidsResponse extends BaseResponse {

  private AddFactoidsData data;

  public AddFactoidsData getData() {
    return data;
  }

  public void setData(AddFactoidsData data) {
    this.data = data;
  }
}