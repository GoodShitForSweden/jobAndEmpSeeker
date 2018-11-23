package se.jobtech.sokannonser.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import se.jobtech.sokannonser.dto.Site;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnnonsSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-23T08:34:35.808+01:00")

public class AnnonsSource   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("site")
  private Site site = null;

  @JsonProperty("removedAt")
  private String removedAt = null;

  @JsonProperty("lastSeenAt")
  private String lastSeenAt = null;

  @JsonProperty("firstSeenAt")
  private String firstSeenAt = null;

  public AnnonsSource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AnnonsSource url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AnnonsSource site(Site site) {
    this.site = site;
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Site getSite() {
    return site;
  }

  public void setSite(Site site) {
    this.site = site;
  }

  public AnnonsSource removedAt(String removedAt) {
    this.removedAt = removedAt;
    return this;
  }

   /**
   * Get removedAt
   * @return removedAt
  **/
  @ApiModelProperty(value = "")


  public String getRemovedAt() {
    return removedAt;
  }

  public void setRemovedAt(String removedAt) {
    this.removedAt = removedAt;
  }

  public AnnonsSource lastSeenAt(String lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
    return this;
  }

   /**
   * Get lastSeenAt
   * @return lastSeenAt
  **/
  @ApiModelProperty(value = "")


  public String getLastSeenAt() {
    return lastSeenAt;
  }

  public void setLastSeenAt(String lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }

  public AnnonsSource firstSeenAt(String firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
    return this;
  }

   /**
   * Get firstSeenAt
   * @return firstSeenAt
  **/
  @ApiModelProperty(value = "")


  public String getFirstSeenAt() {
    return firstSeenAt;
  }

  public void setFirstSeenAt(String firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnonsSource annonsSource = (AnnonsSource) o;
    return Objects.equals(this.id, annonsSource.id) &&
        Objects.equals(this.url, annonsSource.url) &&
        Objects.equals(this.site, annonsSource.site) &&
        Objects.equals(this.removedAt, annonsSource.removedAt) &&
        Objects.equals(this.lastSeenAt, annonsSource.lastSeenAt) &&
        Objects.equals(this.firstSeenAt, annonsSource.firstSeenAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, site, removedAt, lastSeenAt, firstSeenAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnonsSource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    removedAt: ").append(toIndentedString(removedAt)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
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

