package com.example.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.model.Stock;
import com.example.stock.model.StockType;
import com.example.stock.service.StockService;


@RestController
@RequestMapping(value = "/stock")
public class StockController {
    

    @Autowired
    StockService stockService;

    @GetMapping(value = "/type/{stockType}")
    public List<Stock> getStocksBasedOnType(@PathVariable StockType stockType)
    {
        return stockService.getStocksByType(stockType);
    }

    @GetMapping(value = "/price/{price}/lowerData/date/{date}")
    public List<Stock> getStocksAbovePriceAndLowerDate(@PathVariable Double price,@PathVariable String date)
    {
        return stockService.getStocksAbovePriceAndLowerDate(price,date);
    }

    @GetMapping(value = "/cap/{capPercentage}")
    public List<Stock> getAllStocksAboveMarketCap(@PathVariable Double capPercentage)
    {
        return stockService.getAllStocksAboveMarketCap(capPercentage);
    }

    
    @PostMapping(value = "/")
    public String insertStocks(@RequestBody List<Stock> stockList)
    {
        return stockService.addStocks(stockList);
    }

    
    @PutMapping(value = "/marketCap/{marketCap}/id/{id}")
    public void insertStocks(@PathVariable Double marketCap, @PathVariable Integer id)
    {
         stockService.updateMarketCap(marketCap,id);
    }

    @PutMapping(value = "/stock/type/id")
    public void updateTypeById(@RequestParam StockType stockType, @RequestParam Integer id)
    {
        stockService.updateTypeById(stockType,id);
    }

    @PutMapping(value = "/stock/{id}")
    public void updateStockById(@PathVariable Integer id, @RequestBody Stock myStock)
    {
        stockService.updateStockById(id,myStock);
    }

    @DeleteMapping(value = "/ownerCount/{count}")
    public void removeStocksByOwnerCount(@PathVariable  Integer count)
    {
        stockService.deleteStocksBasedOnCount(count);
    }

}
