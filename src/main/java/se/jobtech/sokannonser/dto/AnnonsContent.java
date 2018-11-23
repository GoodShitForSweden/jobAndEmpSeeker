package se.jobtech.sokannonser.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnnonsContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-23T08:34:35.808+01:00")

public class AnnonsContent   {
  @JsonProperty("xml")
  private String xml = null;

  @JsonProperty("text")
  private String text = null;

  public AnnonsContent xml(String xml) {
    this.xml = xml;
    return this;
  }

   /**
   * Get xml
   * @return xml
  **/
  @ApiModelProperty(value = "")


  public String getXml() {
    return xml;
  }

  public void setXml(String xml) {
    this.xml = xml;
  }

  public AnnonsContent text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnonsContent annonsContent = (AnnonsContent) o;
    return Objects.equals(this.xml, annonsContent.xml) &&
        Objects.equals(this.text, annonsContent.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xml, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnonsContent {\n");
    
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

