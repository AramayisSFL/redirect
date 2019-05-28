package net.ddns.armen181.redirect.facade;

import net.ddns.armen181.redirect.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/**")
public class ApiEndpoint {

    @Autowired
    private ApiService apiService;

    @GetMapping
    public Object doGet(@RequestParam final Map<String, String> queryParamMap, final HttpServletRequest request) {
        return apiService.doRequest(request.getRequestURI(), queryParamMap);
    }
}
