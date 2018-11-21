package se.jobtech.sokannonser.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VardeFaradSvarResultat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-20T13:59:16.352+01:00")

public class VardeFaradSvarResultat   {
  @JsonProperty("kod")
  private String kod = null;

  @JsonProperty("term")
  private String term = null;

  @JsonProperty("typ")
  private String typ = null;

  public VardeFaradSvarResultat kod(String kod) {
    this.kod = kod;
    return this;
  }

   /**
   * Get kod
   * @return kod
  **/
  @ApiModelProperty(value = "")


  public String getKod() {
    return kod;
  }

  public void setKod(String kod) {
    this.kod = kod;
  }

  public VardeFaradSvarResultat term(String term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(value = "")


  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public VardeFaradSvarResultat typ(String typ) {
    this.typ = typ;
    return this;
  }

   /**
   * Get typ
   * @return typ
  **/
  @ApiModelProperty(value = "")


  public String getTyp() {
    return typ;
  }

  public void setTyp(String typ) {
    this.typ = typ;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VardeFaradSvarResultat vardeFaradSvarResultat = (VardeFaradSvarResultat) o;
    return Objects.equals(this.kod, vardeFaradSvarResultat.kod) &&
        Objects.equals(this.term, vardeFaradSvarResultat.term) &&
        Objects.equals(this.typ, vardeFaradSvarResultat.typ);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kod, term, typ);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VardeFaradSvarResultat {\n");
    
    sb.append("    kod: ").append(toIndentedString(kod)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    typ: ").append(toIndentedString(typ)).append("\n");
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

