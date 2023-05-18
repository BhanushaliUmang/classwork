package com.example.stock.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.dao.IStockRepository;
import com.example.stock.model.Stock;
import com.example.stock.model.StockType;

import jakarta.transaction.Transactional;

@Service
public class StockService {
    

    @Autowired
    IStockRepository stockRepo;

    public List<Stock> getStocksByType(StockType stockType) {

        return stockRepo.findBy();
    }

    public String addStocks(List<Stock> stockList) {

         Iterable<Stock> list = stockRepo.saveAll(stockList);
         if(list!=null)
         {
             return "Added list of Stocks.....!!!";
         }
         else
         {
             return "Could not added..!!!";
         }
    }

    public List<Stock> getStocksAbovePriceAndLowerDate(Double price, String date) {

        LocalDateTime myDate = LocalDateTime.parse(date);
        return stockRepo.findByStockPriceGreaterThanAndStockBirthTimeStampLessThanOrderByStockName(price, myDate);
    }

    public List<Stock> getAllStocksAboveMarketCap(Double capPercentage) {
        return stockRepo.getAllStocksAboveMarketCap(capPercentage);
    }

    @Transactional
    public void updateMarketCap(Double marketCap, Integer id) {
        stockRepo.updateMarketCapById(marketCap,id);
    }

    @Transactional
    public void deleteStocksBasedOnCount(Integer count) {
        stockRepo.deleteStocksBasedOnCount(count);
    }



    @Transactional
    public void updateTypeById(StockType stockType, Integer id) {

        String enumValue = stockType.name();
        stockRepo.modifyStockTypeById(enumValue, id);

        throw new IllegalStateException("Mainak testing transactional ");

    }

    @Transactional
    public void updateStockById(Integer id, Stock myStock) {

        stockRepo.updateStockById(id,myStock.getStockId(),myStock.getStockName(),myStock.getStockPrice(),myStock.getStockBirthTimeStamp());
    }
}
