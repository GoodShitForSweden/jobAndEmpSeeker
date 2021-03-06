/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package se.jobtech.sokannonser.service;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-15T17:50:24.737+01:00")

@Api(value = "vardeforrad", description = "the vardeforrad API")
public interface VardeforradApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "sokannonser", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class) })
    
    @RequestMapping(value = "/vardeforrad",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> getValuestore(@ApiParam(value = "" ,required=true) @RequestHeader(value="api-key", required=true) String apiKey,@ApiParam(value = "Börja lista resultat från denna position", defaultValue = "0") @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,@ApiParam(value = "Antal resultat att visa", defaultValue = "10") @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@ApiParam(value = "Fritextfråga mot taxonomin. (Kan t.ex. användas för autocomplete / type ahead)") @RequestParam(value = "q", required = false) String q,@ApiParam(value = "Begränsa sökning till taxonomivärden som har angiven kod som förälder (användbart tillsammans medtyp)") @RequestParam(value = "kod", required = false) String kod,@ApiParam(value = "Visa enbart taxonomivärden av typ (giltiga värden: ['yrkesroll', 'yrkesgrupp', 'yrkesomrade', 'kompetens', 'kommun', 'lan', 'land', 'arbetstidsomfattning', 'plats', 'sprak', 'anstallningstyp', 'korkort'])", allowableValues = "yrkesroll, yrkesgrupp, yrkesomrade, kompetens, sprak, kommun, lan, arbetstidsomfattning") @RequestParam(value = "typ", required = false) String typ,@ApiParam(value = "Visa antal annonser som matchar taxonomivärde (endast i kombination med val av typ)", defaultValue = "false") @RequestParam(value = "visa-antal", required = false, defaultValue="false") Boolean visaAntal);

}
