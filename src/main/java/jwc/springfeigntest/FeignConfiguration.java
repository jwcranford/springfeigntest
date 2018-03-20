package jwc.springfeigntest;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Beans declared in this class override the default spring feign
 * configuration, as described at
 * https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html#spring-cloud-feign-overriding-defaults
 */
public class FeignConfiguration {

    @Bean
    public CloseableHttpClient feignClient() {
        System.out.println("Using Apache http client instead of Ribbon...");
        return HttpClients.createDefault();
    }
}
