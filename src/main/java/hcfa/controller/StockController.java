package hcfa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {


    @GetMapping("/getStockQty")
    public String getStockQty(){
        return "ok";
    }
}
