package com.vent.java.springbootexercise1.service.impl;

import com.vent.java.springbootexercise1.entity.Company;
import com.vent.java.springbootexercise1.entity.Stock;
import com.vent.java.springbootexercise1.infra.BcUtil;
import com.vent.java.springbootexercise1.infra.Scheme;
import com.vent.java.springbootexercise1.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class StockServiceHolder implements StockService {
    @Value("${api.jsonplaceholder.domain}")
    private String domain;

    @Value("${api.jsonplaceholder.endpoints.company}")
    private String companyUri;

    @Value("${api.jsonplaceholder.endpoints.stock}")
    private String stockUri;

    @Value("${api.jsonplaceholder.key}")
    private String key;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Company getCompany(String symbol) {
        String url = BcUtil.getUrl(Scheme.HTTPS, domain, companyUri,symbol,key);
        HashMap<String, String> paras = new HashMap();
        paras.put("symbol", symbol);
        paras.put("token", key);
        System.out.println("url=" + url);
        Company company = restTemplate.getForObject(url, Company.class, paras);
        return company;
    }

    @Override
    public Stock getStock(String symbol) {
        String url = BcUtil.getUrl(Scheme.HTTPS, domain, stockUri,symbol,key);
        HashMap<String, String> paras = new HashMap();
        paras.put("symbol", symbol);
        paras.put("token", key);
        System.out.println("url=" + url);
        Stock stock = restTemplate.getForObject(url, Stock.class, paras);
        return stock;
    }
}
