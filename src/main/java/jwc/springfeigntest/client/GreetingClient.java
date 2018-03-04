package jwc.springfeigntest.client;

import jwc.springfeigntest.domain.Greeting;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// NOTE: It turns out that interface inheritance doesn't work with Spring MVC,
// according to
// https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html#spring-cloud-feign-inheritance,
// so we copy the interface instead of inheriting it.
@FeignClient(name = "greeting", url = "http://localhost:8080")
public interface GreetingClient {

    @RequestMapping("/greeting")
    Greeting greeting(@RequestParam(value="name", defaultValue="World") String name);
}
