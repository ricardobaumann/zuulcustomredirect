package zuulcustomredirect;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ricardobaumann on 11/10/16.
 */
@EnableAutoConfiguration
@SpringBootApplication
@EnableZuulProxy
@RestController
public class Proxy {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Proxy.class).web(true).run(args);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        return "hello";
    }
}
