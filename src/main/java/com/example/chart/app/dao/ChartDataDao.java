package com.example.chart.app.dao;

import com.example.chart.app.model.ChartData;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ChartDataDao {

    public List<List<Map<Object, Object>>> getCanvasjsChartData() {
        return ChartData.getCanvasjsDataList();
    }
}
