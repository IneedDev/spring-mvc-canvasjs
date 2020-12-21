package com.example.chart.app.controller;

import com.example.chart.app.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/c")
public class ChartController {


    @Autowired
    ChartService chartService;

    @RequestMapping(method = RequestMethod.GET)
    public String springMVC(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = chartService.getCanvasjsChartData();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        System.out.printf("test");
        System.out.printf("Model data " + canvasjsDataList.get(0));
        System.out.println("\n Long to date "  + new Date(1483209000000L));
        System.out.println("\n Long to date "  + new Date(1512066600000L));

        List<Price> priceList = new ArrayList<>();
        Price price = new Price();
        price.setDate(new Date(2007, 1, 1));
        price.setPrice("3330");

        Price price2 = new Price();
        price2.setDate(new Date(2007, 1, 1));
        price2.setPrice("3330");

        priceList.add(price);
        priceList.add(price2);


        List<List<Map<Object,Object>>> list = new ArrayList<List<Map<Object,Object>>>();
        List<Map<Object,Object>> dataPoints1 = new ArrayList<Map<Object,Object>>();

        Map<Object,Object> map = new HashMap<Object,Object>();
        map.put("x", 1483209000000L);
        map.put("y", 3000);
        dataPoints1.add(map);

        Map<Object,Object> map2 = new HashMap<Object,Object>();
        map2.put("x", 1485887400000L);
        map2.put("y", 3500);
        dataPoints1.add(map2);


        list.add(dataPoints1);


        modelMap.addAttribute("priceList", list);

        return "chart";
    }

    @RequestMapping(value = "/cc", method = RequestMethod.GET)
    public String getDataPlot(ModelMap model) throws IOException {

        List<Ponto> pontos = new ArrayList<>();

        Ponto ponto = new Ponto();
        ponto.setX(10);
        ponto.setY(15);
        pontos.add(ponto);

        ponto = new Ponto();
        ponto.setX(20);
        ponto.setY(21);
        pontos.add(ponto);

        ponto = new Ponto();
        ponto.setX(30);
        ponto.setY(8);
        pontos.add(ponto);

        model.addAttribute("pontos",pontos);

        return "newChart";
    }
}

class Ponto {
    private Integer X;
    private Integer Y;
    public Integer getX() {
        return X;
    }
    public void setX(Integer x) {
        X = x;
    }
    public Integer getY() {
        return Y;
    }
    public void setY(Integer y) {
        Y = y;
    }
}

class Price {
    private Object date;
    private Object price;

    public Price() {
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }
}
