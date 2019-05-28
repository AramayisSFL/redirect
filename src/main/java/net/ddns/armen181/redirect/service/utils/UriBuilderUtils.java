package net.ddns.armen181.redirect.service.utils;

import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

public class UriBuilderUtils {
    private UriBuilderUtils() {
        throw new IllegalStateException("Utils class cannot be initialized");
    }

    public static String buildUrl(final String uri, final Map<String, String> queryParamMap) {
        return addQueryParams(uri, queryParamMap).toUriString();
    }

    public static UriComponentsBuilder addQueryParams(final String uri, final Map<String, String> queryParamMap) {

        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(uri);
        for (Map.Entry<String, String> entry : queryParamMap.entrySet()) {
            builder = builder.queryParam(entry.getKey(), entry.getValue());
        }
        return builder;
    }
}
