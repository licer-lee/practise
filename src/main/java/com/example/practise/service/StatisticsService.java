package com.example.practise.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StatisticsService {


    public Map getStatisticsData(){

        Map<String, Object> result = new HashMap<>();
        Integer fans = getFans();
        Integer uv = getUv();


        result.put("fans", fans);
        result.put("uv", uv);
        return result;
    }

    private Integer getFans() {

        return null;
    }

    private Integer getUv() {
        return null;
    }
}
