package net.ddns.armen181.redirect.service;

import java.util.Map;

public interface ApiService {

    Object doRequest(final String path, final Map<String, String> queryParamMap);
}
