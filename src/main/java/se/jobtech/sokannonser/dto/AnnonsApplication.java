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
 * AnnonsApplication
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-23T08:34:35.808+01:00")

public class AnnonsApplication   {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("site")
  private Site site = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("deadline")
  private String deadline = null;

  @JsonProperty("reference")
  private String reference = null;

  public AnnonsApplication url(String url) {
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

  public AnnonsApplication site(Site site) {
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

  public AnnonsApplication email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AnnonsApplication deadline(String deadline) {
    this.deadline = deadline;
    return this;
  }

   /**
   * Get deadline
   * @return deadline
  **/
  @ApiModelProperty(value = "")


  public String getDeadline() {
    return deadline;
  }

  public void setDeadline(String deadline) {
    this.deadline = deadline;
  }

  public AnnonsApplication reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnonsApplication annonsApplication = (AnnonsApplication) o;
    return Objects.equals(this.url, annonsApplication.url) &&
        Objects.equals(this.site, annonsApplication.site) &&
        Objects.equals(this.email, annonsApplication.email) &&
        Objects.equals(this.deadline, annonsApplication.deadline) &&
        Objects.equals(this.reference, annonsApplication.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, site, email, deadline, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnonsApplication {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

