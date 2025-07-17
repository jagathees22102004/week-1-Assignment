package com.cognizant.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountController {
    @GetMapping("/accounts/{number}")
    public  Map<String, Object> getAccountDetails(@PathVariable String number){
        
    Map<String, Object> response=new HashMap<>();
    response.put("nuumber",number);
    response.put("type","savings");
    response.put("balance",45000);
    return response;
}

}
