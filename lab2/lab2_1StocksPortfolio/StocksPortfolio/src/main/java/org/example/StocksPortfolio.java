package org.example;
import java.util.ArrayList;


public class StocksPortfolio {


    private IStockmarketService stockmarketService;
    ArrayList<Stock> stocks = new ArrayList<>();


    public StocksPortfolio(IStockmarketService stockmarketService) {
        this.stockmarketService = stockmarketService;
    }


    public double getTotalValue() {
        double totalValue = 0;
        double value;
        int times;
        for (Stock stock : stocks) {

            value = stockmarketService.lookupPrice(stock.label);
            times = stock.quantity;
            totalValue += (value * times);
        }
        return totalValue;
    }


    public void setMarketService(IStockmarketService iStocksMarket) {
        this.stockmarketService = iStocksMarket;
    }

    public void addStock(Stock s) {
        stocks.add(s);
    }
}