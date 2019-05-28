package net.ddns.armen181.redirect.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        final RestTemplate restTemplate = new RestTemplate();
//        final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        converter.setSupportedMediaTypes(Lists.newArrayList(
//                MediaType.APPLICATION_JSON,
//                MediaType.APPLICATION_OCTET_STREAM,
//                MediaType.TEXT_HTML,
//                MediaType.APPLICATION_XML
//        ));
//        restTemplate.getMessageConverters().add(converter);
        return restTemplate;
    }
    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
