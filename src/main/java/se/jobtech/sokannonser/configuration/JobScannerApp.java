package se.jobtech.sokannonser.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import se.jobtech.sokannonserapi.client.ApiClient;
import se.jobtech.sokannonserapi.client.api.SokannonserApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:application.properties")
public class JobScannerApp {

    @Bean
    public ModelMapper modelMapper(){return new ModelMapper();}

    @Bean
    public ApiClient apiClient(){
        return new ApiClient(restTemplate());
    }

    @Bean
    public SokannonserApi sokannonserApi(){
        return new SokannonserApi(apiClient());
    }

    @Bean
    public RestTemplate restTemplate(){
        final RestTemplate retTempl = new RestTemplate();
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
        //TODO: Have to do this caused to API do not accept MediaType.JSON !!!!!
        interceptors.add(new ClientHttpRequestInterceptor() {
            @Override
            public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] body, ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {
                HttpHeaders headers = httpRequest.getHeaders();
                headers.setContentType(MediaType.TEXT_HTML);
                return clientHttpRequestExecution.execute(httpRequest, body);
            }
        });
        retTempl.setInterceptors(interceptors);

        return retTempl;
    }
}
