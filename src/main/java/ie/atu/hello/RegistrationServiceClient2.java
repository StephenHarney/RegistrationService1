package ie.atu.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Confirmation-Service",url = "/localhost:8081")
public interface RegistrationServiceClient2 {


    @PostMapping("/Confirm")
    String someDetails2(@RequestBody UserDetails userDetails);








}
