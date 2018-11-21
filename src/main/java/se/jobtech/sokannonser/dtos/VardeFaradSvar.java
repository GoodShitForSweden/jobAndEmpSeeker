package se.jobtech.sokannonser.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import se.jobtech.sokannonser.dtos.VardeFaradSvarResultat;
import se.jobtech.sokannonser.dtos.VardeFaradSvarSokning;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VardeFaradSvar
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-20T13:59:16.352+01:00")

public class VardeFaradSvar   {
  @JsonProperty("sokning")
  private VardeFaradSvarSokning sokning = null;

  @JsonProperty("resultat")
  private List<VardeFaradSvarResultat> resultat = null;

  public VardeFaradSvar sokning(VardeFaradSvarSokning sokning) {
    this.sokning = sokning;
    return this;
  }

   /**
   * Get sokning
   * @return sokning
  **/
  @ApiModelProperty(value = "")

  @Valid

  public VardeFaradSvarSokning getSokning() {
    return sokning;
  }

  public void setSokning(VardeFaradSvarSokning sokning) {
    this.sokning = sokning;
  }

  public VardeFaradSvar resultat(List<VardeFaradSvarResultat> resultat) {
    this.resultat = resultat;
    return this;
  }

  public VardeFaradSvar addResultatItem(VardeFaradSvarResultat resultatItem) {
    if (this.resultat == null) {
      this.resultat = new ArrayList<VardeFaradSvarResultat>();
    }
    this.resultat.add(resultatItem);
    return this;
  }

   /**
   * Get resultat
   * @return resultat
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<VardeFaradSvarResultat> getResultat() {
    return resultat;
  }

  public void setResultat(List<VardeFaradSvarResultat> resultat) {
    this.resultat = resultat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VardeFaradSvar vardeFaradSvar = (VardeFaradSvar) o;
    return Objects.equals(this.sokning, vardeFaradSvar.sokning) &&
        Objects.equals(this.resultat, vardeFaradSvar.resultat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sokning, resultat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VardeFaradSvar {\n");
    
    sb.append("    sokning: ").append(toIndentedString(sokning)).append("\n");
    sb.append("    resultat: ").append(toIndentedString(resultat)).append("\n");
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

