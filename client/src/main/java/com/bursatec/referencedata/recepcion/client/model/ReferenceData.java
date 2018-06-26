package com.bursatec.referencedata.recepcion.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReferenceData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T17:23:59.016Z")
public class ReferenceData {
  @SerializedName("refDataId")
  private Long refDataId = null;

  @SerializedName("refData")
  private String refData = null;

  public ReferenceData() {

  }

  public ReferenceData(Long refDataId, String refData) {
      this.refDataId = refDataId;
      this.refData = refData;
  }

  public ReferenceData refDataId(Long refDataId) {
    this.refDataId = refDataId;
    return this;
  }

   /**
   * Id for this record, use this field as key to request retransmissions.
   * @return refDataId
  **/
  @ApiModelProperty(example = "1", value = "Id for this record, use this field as key to request retransmissions.")
  public Long getRefDataId() {
    return refDataId;
  }

  public void setRefDataId(Long refDataId) {
    this.refDataId = refDataId;
  }

  public ReferenceData refData(String refData) {
    this.refData = refData;
    return this;
  }

   /**
   * Reference Data String
   * @return refData
  **/
  @ApiModelProperty(example = "Zx2018XXXXXXXXXX", value = "Reference Data String")
  public String getRefData() {
    return refData;
  }

  public void setRefData(String refData) {
    this.refData = refData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceData referenceData = (ReferenceData) o;
    return Objects.equals(this.refDataId, referenceData.refDataId) &&
        Objects.equals(this.refData, referenceData.refData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refDataId, refData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceData {\n");
    
    sb.append("    refDataId: ").append(toIndentedString(refDataId)).append("\n");
    sb.append("    refData: ").append(toIndentedString(refData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

