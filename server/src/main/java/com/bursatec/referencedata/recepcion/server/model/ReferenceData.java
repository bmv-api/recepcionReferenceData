package com.bursatec.referencedata.recepcion.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * ReferenceData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-21T18:22:12.534Z")

public class ReferenceData   {
  @JsonProperty("refDataId")
  private Long refDataId = null;

  @JsonProperty("refDataType")
  private String refDataType = null;

  @JsonProperty("refData")
  private String refData = null;

  public ReferenceData refDataId(Long refDataId) {
    this.refDataId = refDataId;
    return this;
  }

  /**
   * Id for this record, use this field as key to request retransmissions.
   * @return refDataId
   **/
  @ApiModelProperty(example = "1",  required = true, value = "Id for this record, use this field as key to request retransmissions.")
  @NotNull

  public Long getRefDataId() {
    return refDataId;
  }

  public void setRefDataId(Long refDataId) {
    this.refDataId = refDataId;
  }

  public ReferenceData refDataType(String refDataType) {
    this.refDataType = refDataType;
    return this;
  }

  /**
   * Reference Data type
   * @return refDataType
   **/
  @ApiModelProperty(example = "Zx", required = true, value = "Reference Data type")
  @NotNull


  public String getRefDataType() {
    return refDataType;
  }

  public void setRefDataType(String refDataType) {
    this.refDataType = refDataType;
  }

  public ReferenceData refData(String refData) {
    this.refData = refData;
    return this;
  }

  /**
   * Reference Data String
   * @return refData
   **/
  @ApiModelProperty(example = "2018XXXXXXXXXXXXXXXXX", required = true, value = "Reference Data String")
  @NotNull


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
            Objects.equals(this.refDataType, referenceData.refDataType) &&
            Objects.equals(this.refData, referenceData.refData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refDataId, refDataType, refData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceData {\n");

    sb.append("    refDataId: ").append(toIndentedString(refDataId)).append("\n");
    sb.append("    refDataType: ").append(toIndentedString(refDataType)).append("\n");
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

