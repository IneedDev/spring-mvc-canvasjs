package com.example.chart.app.service;

import com.example.chart.app.dao.ChartDataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ChartService {

    @Autowired
    private ChartDataDao canvasjsChartDao;

    public void setCanvasjsChartDao(ChartDataDao canvasjsChartDao) {
        this.canvasjsChartDao = canvasjsChartDao;
    }

    public List<List<Map<Object, Object>>> getCanvasjsChartData() {
        return canvasjsChartDao.getCanvasjsChartData();
    }
}
