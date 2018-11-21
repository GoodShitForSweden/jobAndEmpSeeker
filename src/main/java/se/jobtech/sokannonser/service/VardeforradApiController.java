package se.jobtech.sokannonser.service;


import io.swagger.annotations.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-15T17:50:24.737+01:00")

@Controller
public class VardeforradApiController implements VardeforradApi {

    private static final Logger log = LoggerFactory.getLogger(VardeforradApiController.class);

    @Value( "${sokannonser.url}" )
    private String platsAnnonsUrl;


    public ResponseEntity<Void> getValuestore(@ApiParam(value = "" ,required=true) @RequestHeader(value="api-key", required=true) String apiKey,
        @ApiParam(value = "Börja lista resultat från denna position", defaultValue = "0") @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,
        @ApiParam(value = "Antal resultat att visa", defaultValue = "10") @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,
        @ApiParam(value = "Fritextfråga mot taxonomin. (Kan t.ex. användas för autocomplete / type ahead)") @RequestParam(value = "q", required = false) String q,
        @ApiParam(value = "Begränsa sökning till taxonomivärden som har angiven kod som förälder (användbart tillsammans medtyp)") @RequestParam(value = "kod", required = false) String kod,
        @ApiParam(value = "Visa enbart taxonomivärden av typ (giltiga värden: ['yrkesroll', 'yrkesgrupp', 'yrkesomrade', 'kompetens', 'kommun', 'lan', 'land', 'arbetstidsomfattning', 'plats', 'sprak', 'anstallningstyp', 'korkort'])", allowableValues = "yrkesroll, yrkesgrupp, yrkesomrade, kompetens, sprak, kommun, lan, arbetstidsomfattning") @RequestParam(value = "typ", required = false) String typ,
        @ApiParam(value = "Visa antal annonser som matchar taxonomivärde (endast i kombination med val av typ)", defaultValue = "false") @RequestParam(value = "visa-antal", required = false, defaultValue="false") Boolean visaAntal) {



        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
