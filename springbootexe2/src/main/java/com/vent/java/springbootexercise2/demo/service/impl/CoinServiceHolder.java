package com.vent.java.springbootexercise2.demo.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vent.java.springbootexercise2.demo.entity.Coin;
import com.vent.java.springbootexercise2.demo.infra.BcUtil;
import com.vent.java.springbootexercise2.demo.infra.Scheme;
import com.vent.java.springbootexercise2.demo.service.CoinService;
import com.vent.java.springbootexercise2.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CoinServiceHolder implements CoinService {

    @Value("${api.jsonplaceholder.domain}")
    private String domain;

    @Value("${api.jsonplaceholder.endpoints.coin}")
    private String coinsUri;

    @Value("${api.jsonplaceholder.key}")
    private String key;


    @Value("${api.jsonplaceholder.rediskey}")
    private String redisKey;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RedisService redisService;

    @Override
    public List<Coin> getCoins(String currency, String ids) {
        String url = BcUtil.getUrl(Scheme.HTTPS, domain, coinsUri, currency, ids, key);
        // System.out.println("coin url="+url);
        Coin[] coins = restTemplate.getForObject(url, Coin[].class);
        // System.out.println("coins length="+coins.length);
        if (Objects.nonNull(coins)) {
            String rediskey = redisKey.concat(":").concat(currency).concat(":").concat(ids);
            try {
                Duration duration=Duration.ofMinutes(1L);
               //  System.out.println("rediskey="+rediskey);
                redisService.saveCoins(rediskey, Arrays.stream(coins).collect(Collectors.toList()),duration);
            } catch (JsonProcessingException e) {
                //no need to handle
               // e.printStackTrace();
            }

        }
        return Arrays.stream(coins).collect(Collectors.toList());

    }
}
