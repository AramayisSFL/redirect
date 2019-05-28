package net.ddns.armen181.redirect.service.impl;


import net.ddns.armen181.redirect.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

import static net.ddns.armen181.redirect.service.utils.HttpRequestUtils.doGetRequest;
import static net.ddns.armen181.redirect.service.utils.UriBuilderUtils.buildUrl;

@Service
public class ApiServiceImpl implements ApiService {

    private String xbmcToken;

    @Value("${shipping.endpoint}")
    private String endpoint;

    private final RestTemplate restTemplate;

    public ApiServiceImpl(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Object doRequest(final String path, final Map<String, String> queryParamMap) {
        final String url = buildUrl(endpoint + path, queryParamMap);
        final Object returnObject = doGetRequest(restTemplate, url, String.class, queryParamMap);
        return returnObject;

    }
}
