package se.jobtech.sokannonser.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import se.jobtech.sokannonser.dtos.Annons;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Annonssvar
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-20T13:59:16.352+01:00")

public class Annonssvar   {
  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("positions")
  private Integer positions = null;

  @JsonProperty("hits")
  private List<Annons> hits = null;

  public Annonssvar total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Annonssvar positions(Integer positions) {
    this.positions = positions;
    return this;
  }

   /**
   * Get positions
   * @return positions
  **/
  @ApiModelProperty(value = "")


  public Integer getPositions() {
    return positions;
  }

  public void setPositions(Integer positions) {
    this.positions = positions;
  }

  public Annonssvar hits(List<Annons> hits) {
    this.hits = hits;
    return this;
  }

  public Annonssvar addHitsItem(Annons hitsItem) {
    if (this.hits == null) {
      this.hits = new ArrayList<Annons>();
    }
    this.hits.add(hitsItem);
    return this;
  }

   /**
   * Get hits
   * @return hits
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Annons> getHits() {
    return hits;
  }

  public void setHits(List<Annons> hits) {
    this.hits = hits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annonssvar annonssvar = (Annonssvar) o;
    return Objects.equals(this.total, annonssvar.total) &&
        Objects.equals(this.positions, annonssvar.positions) &&
        Objects.equals(this.hits, annonssvar.hits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, positions, hits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annonssvar {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
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

