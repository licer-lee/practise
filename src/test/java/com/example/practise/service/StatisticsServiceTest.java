package com.example.practise.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StatisticsServiceTest {

    @Autowired
    StatisticsService statisticsService;

    @Test
    void getStatisticsData() {

        Map statisticsData = statisticsService.getStatisticsData();
        System.out.println("statisticsData = " + statisticsData);
        Assert.notNull(statisticsData, "ng");

    }

}