package ie.atu.examyr3customerservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CustomerController {

    @PostMapping("confirm")
    public String confirmCustomer(@RequestBody TodoResponse todoResponse)
    {
        
    }
}
