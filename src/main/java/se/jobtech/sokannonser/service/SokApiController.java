package se.jobtech.sokannonser.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import se.jobtech.sokannonser.dtos.Annonssvar;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import se.jobtech.sokannonserapi.client.api.SokannonserApi;
import se.jobtech.sokannonserapi.client.model.AnnonssvarModel;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-15T17:50:24.737+01:00")

@Controller
public class SokApiController implements SokApi {

    private static final Logger log = LoggerFactory.getLogger(SokApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Value( "${sokannonser.url}" )
    private String platsAnnonsUrl;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SokannonserApi sokannonserApi;

    @Autowired
    public SokApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Annonssvar> getSearch(@ApiParam(value = "Nyckel som krävs för att använda API:et" ,required=true, defaultValue="apa") @RequestHeader(value="api-key", required=true) String apiKey,
         @Min(0) @Max(2000)@ApiParam(value = "Börja lista resultat från denna position (0-2000)", defaultValue = "0") @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset,
         @Min(0) @Max(1000)@ApiParam(value = "Antal resultat att visa (0-1000)", defaultValue = "10") @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,
        @ApiParam(value = "Sortering. pubdate-desc: publiceringsdatum, nyast först pubdate-asc: publiceringsdatum, äldst först applydate-desc: sista ansökningsdatum, nyast först applydate-asc: sista ansökningsdatum, äldst först relevance: Relevans (poäng)", allowableValues = "relevance, pubdate-desc, pubdate-asc, applydate-desc, applydate-asc") @RequestParam(value = "sortera", required = false) String sortera,
        @ApiParam(value = "Visa annonser publicerade innan angivet datum (på formen YYYY-mm-ddTHH:MM:SS)") @RequestParam(value = "publicerad-innan", required = false) String publiceradInnan,
        @ApiParam(value = "Visa annonser publicerade efter angivet datum (på formen YYYY-mm-ddTHH:MM:SS)") @RequestParam(value = "publicerad-efter", required = false) String publiceradEfter,
        @ApiParam(value = "Fritextfråga") @RequestParam(value = "q", required = false) String q,
        @ApiParam(value = "Ge förslag på sökord utifrån nuvarande sökning (type head)") @RequestParam(value = "typehead", required = false) String typehead,
        @ApiParam(value = "En eller flera yrkesbenämningskoder enligt taxonomi") @RequestParam(value = "yrkesroll", required = false) List<String> yrkesroll,
        @ApiParam(value = "En eller flera yrkesgruppskoder enligt taxonomi") @RequestParam(value = "yrkesgrupp", required = false) List<String> yrkesgrupp,
        @ApiParam(value = "En eller flera yrkesområdeskoder enligt taxonomi") @RequestParam(value = "yrkesomrade", required = false) List<String> yrkesomrade,
        @ApiParam(value = "En eller flera kompetenskoder enligt taxonomi") @RequestParam(value = "kompetens", required = false) List<String> kompetens,
        @ApiParam(value = "En eller flera arbetstidsomfattningskoder enligt taxonomi") @RequestParam(value = "arbetstidsomfattning", required = false) List<String> arbetstidsomfattning,
        @ApiParam(value = "Typ av körkort som efterfrågas (taxonomikod)") @RequestParam(value = "korkort", required = false) List<String> korkort,
        @ApiParam(value = "Anställningstyp enligt taxonomi") @RequestParam(value = "anstallningstyp", required = false) List<String> anstallningstyp,
        @ApiParam(value = "Visa enbart jobb som inte kräver erfarenhet", defaultValue = "false") @RequestParam(value = "utan-erfarenhet", required = false, defaultValue="false") Boolean utanErfarenhet,
        @ApiParam(value = "En eller flera kommunkoder") @RequestParam(value = "kommun", required = false) List<String> kommun,
        @ApiParam(value = "En eller flera länskoder") @RequestParam(value = "lan", required = false) List<String> lan,
        @ApiParam(value = "Resultatmodell", allowableValues = "pbapi, simple") @RequestParam(value = "resultatmodell", required = false) String resultatmodell,
        @ApiParam(value = "Sök bland AF:s annonser eller alla på marknaden (auranest)", allowableValues = "arbetsförmedlingen, auranest", defaultValue = "arbetsförmedlingen") @RequestParam(value = "dataset", required = false, defaultValue="arbetsförmedlingen") String dataset) {

        log.info("Annonssvar");
        //TODO: Put this in application.properties
        sokannonserApi.getApiClient().setBasePath(platsAnnonsUrl);

        AnnonssvarModel jobAdsResponse = sokannonserApi.getSearch(apiKey
                ,offset
                ,limit
                ,sortera
                ,publiceradInnan
                ,publiceradEfter
                ,q
                ,typehead
                , yrkesroll
                , yrkesgrupp
                ,yrkesomrade
                , kompetens
                , arbetstidsomfattning
                , korkort
                , anstallningstyp
                , utanErfarenhet
                , kommun
                , lan
                ,resultatmodell
                ,dataset);

        return  ResponseEntity.status(HttpStatus.OK).body(convertToDto(jobAdsResponse));
    }

    private Annonssvar convertToDto(AnnonssvarModel annonssvar) {
        Annonssvar postDto = modelMapper.map(annonssvar, Annonssvar.class);
        return postDto;
    }

}
