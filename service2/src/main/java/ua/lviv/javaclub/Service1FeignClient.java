package ua.lviv.javaclub;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service1")
public interface Service1FeignClient {

    @GetMapping("/hello")
    String hello();
}
