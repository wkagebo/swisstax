package com.wkagebo.swisstax.controller;

import com.wkagebo.swisstax.model.TaxParams;
import com.wkagebo.swisstax.service.TaxParamsReader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxController {

    private final TaxParamsReader taxParamsReader;

    public TaxController(TaxParamsReader taxParamsReader) {
        this.taxParamsReader = taxParamsReader;
    }

    @GetMapping("/calculate")
    public TaxParams getTax(@RequestParam("filePath") String filePath) {
        return taxParamsReader.getTaxParams(filePath);
    }

}
