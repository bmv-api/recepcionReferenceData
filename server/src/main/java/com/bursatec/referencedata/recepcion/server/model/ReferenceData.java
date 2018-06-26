package com.bursatec.referencedata.recepcion.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ReferenceData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-21T18:22:12.534Z")

public class ReferenceData   {
  @JsonProperty("refDataId")
  private Long refDataId = null;

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

