package se.jobtech.sokannonser.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LocationTranslations
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-20T13:59:16.352+01:00")

public class LocationTranslations   {
  @JsonProperty("en-US")
  private String enUS = null;

  @JsonProperty("sv-SE")
  private String svSE = null;

  public LocationTranslations enUS(String enUS) {
    this.enUS = enUS;
    return this;
  }

   /**
   * Get enUS
   * @return enUS
  **/
  @ApiModelProperty(value = "")


  public String getEnUS() {
    return enUS;
  }

  public void setEnUS(String enUS) {
    this.enUS = enUS;
  }

  public LocationTranslations svSE(String svSE) {
    this.svSE = svSE;
    return this;
  }

   /**
   * Get svSE
   * @return svSE
  **/
  @ApiModelProperty(value = "")


  public String getSvSE() {
    return svSE;
  }

  public void setSvSE(String svSE) {
    this.svSE = svSE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationTranslations locationTranslations = (LocationTranslations) o;
    return Objects.equals(this.enUS, locationTranslations.enUS) &&
        Objects.equals(this.svSE, locationTranslations.svSE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enUS, svSE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationTranslations {\n");
    
    sb.append("    enUS: ").append(toIndentedString(enUS)).append("\n");
    sb.append("    svSE: ").append(toIndentedString(svSE)).append("\n");
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

