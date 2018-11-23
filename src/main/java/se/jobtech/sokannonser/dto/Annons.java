package se.jobtech.sokannonser.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import se.jobtech.sokannonser.dto.AnnonsApplication;
import se.jobtech.sokannonser.dto.AnnonsContent;
import se.jobtech.sokannonser.dto.AnnonsSource;
import se.jobtech.sokannonser.dto.AnnonsTitle;
import se.jobtech.sokannonser.dto.Employer;
import se.jobtech.sokannonser.dto.Location;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Annons
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-23T08:34:35.808+01:00")

public class Annons   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private AnnonsTitle title = null;

  @JsonProperty("header")
  private String header = null;

  @JsonProperty("source")
  private AnnonsSource source = null;

  @JsonProperty("content")
  private AnnonsContent content = null;

  @JsonProperty("employer")
  private Employer employer = null;

  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("updatedAt")
  private String updatedAt = null;

  @JsonProperty("application")
  private AnnonsApplication application = null;

  @JsonProperty("timestamp")
  private BigDecimal timestamp = null;

  @JsonProperty("skills")
  private List<String> skills = null;

  @JsonProperty("occupations")
  private List<String> occupations = null;

  public Annons id(String id) {
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

  public Annons title(AnnonsTitle title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AnnonsTitle getTitle() {
    return title;
  }

  public void setTitle(AnnonsTitle title) {
    this.title = title;
  }

  public Annons header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(value = "")


  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public Annons source(AnnonsSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AnnonsSource getSource() {
    return source;
  }

  public void setSource(AnnonsSource source) {
    this.source = source;
  }

  public Annons content(AnnonsContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AnnonsContent getContent() {
    return content;
  }

  public void setContent(AnnonsContent content) {
    this.content = content;
  }

  public Annons employer(Employer employer) {
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Employer getEmployer() {
    return employer;
  }

  public void setEmployer(Employer employer) {
    this.employer = employer;
  }

  public Annons location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Annons updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")


  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Annons application(AnnonsApplication application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AnnonsApplication getApplication() {
    return application;
  }

  public void setApplication(AnnonsApplication application) {
    this.application = application;
  }

  public Annons timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public Annons skills(List<String> skills) {
    this.skills = skills;
    return this;
  }

  public Annons addSkillsItem(String skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<String>();
    }
    this.skills.add(skillsItem);
    return this;
  }

   /**
   * Get skills
   * @return skills
  **/
  @ApiModelProperty(value = "")


  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  public Annons occupations(List<String> occupations) {
    this.occupations = occupations;
    return this;
  }

  public Annons addOccupationsItem(String occupationsItem) {
    if (this.occupations == null) {
      this.occupations = new ArrayList<String>();
    }
    this.occupations.add(occupationsItem);
    return this;
  }

   /**
   * Get occupations
   * @return occupations
  **/
  @ApiModelProperty(value = "")


  public List<String> getOccupations() {
    return occupations;
  }

  public void setOccupations(List<String> occupations) {
    this.occupations = occupations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annons annons = (Annons) o;
    return Objects.equals(this.id, annons.id) &&
        Objects.equals(this.title, annons.title) &&
        Objects.equals(this.header, annons.header) &&
        Objects.equals(this.source, annons.source) &&
        Objects.equals(this.content, annons.content) &&
        Objects.equals(this.employer, annons.employer) &&
        Objects.equals(this.location, annons.location) &&
        Objects.equals(this.updatedAt, annons.updatedAt) &&
        Objects.equals(this.application, annons.application) &&
        Objects.equals(this.timestamp, annons.timestamp) &&
        Objects.equals(this.skills, annons.skills) &&
        Objects.equals(this.occupations, annons.occupations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, header, source, content, employer, location, updatedAt, application, timestamp, skills, occupations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annons {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    occupations: ").append(toIndentedString(occupations)).append("\n");
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

