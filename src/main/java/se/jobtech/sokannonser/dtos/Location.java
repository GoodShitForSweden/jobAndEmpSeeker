package se.jobtech.sokannonser.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import se.jobtech.sokannonser.dtos.Coordinates;
import se.jobtech.sokannonser.dtos.LocationGoogleMaps;
import se.jobtech.sokannonser.dtos.LocationTranslations;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Location
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-20T13:59:16.352+01:00")

public class Location   {
  @JsonProperty("googleMaps")
  private LocationGoogleMaps googleMaps = null;

  @JsonProperty("translations")
  private LocationTranslations translations = null;

  @JsonProperty("geoKomp")
  private Coordinates geoKomp = null;

  public Location googleMaps(LocationGoogleMaps googleMaps) {
    this.googleMaps = googleMaps;
    return this;
  }

   /**
   * Get googleMaps
   * @return googleMaps
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocationGoogleMaps getGoogleMaps() {
    return googleMaps;
  }

  public void setGoogleMaps(LocationGoogleMaps googleMaps) {
    this.googleMaps = googleMaps;
  }

  public Location translations(LocationTranslations translations) {
    this.translations = translations;
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocationTranslations getTranslations() {
    return translations;
  }

  public void setTranslations(LocationTranslations translations) {
    this.translations = translations;
  }

  public Location geoKomp(Coordinates geoKomp) {
    this.geoKomp = geoKomp;
    return this;
  }

   /**
   * Get geoKomp
   * @return geoKomp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Coordinates getGeoKomp() {
    return geoKomp;
  }

  public void setGeoKomp(Coordinates geoKomp) {
    this.geoKomp = geoKomp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.googleMaps, location.googleMaps) &&
        Objects.equals(this.translations, location.translations) &&
        Objects.equals(this.geoKomp, location.geoKomp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(googleMaps, translations, geoKomp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    googleMaps: ").append(toIndentedString(googleMaps)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    geoKomp: ").append(toIndentedString(geoKomp)).append("\n");
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

