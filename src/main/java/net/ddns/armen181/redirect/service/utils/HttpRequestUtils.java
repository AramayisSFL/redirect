package net.ddns.armen181.redirect.service.utils;

import org.springframework.web.client.RestTemplate;

import java.util.Map;

import static net.ddns.armen181.redirect.service.utils.UriBuilderUtils.buildUrl;

public class HttpRequestUtils {
    private HttpRequestUtils() {
        throw new IllegalStateException("Utils class cannot be initialized");
    }

    public static <T> T doGetRequest(
            final RestTemplate restTemplate,
            final String uri,
            final Class<T> responseEntityType,
            final Map<String, String> queryParamMap
    ) {
        return restTemplate.getForObject(
                buildUrl(uri, queryParamMap),
                responseEntityType
        );
    }
}
