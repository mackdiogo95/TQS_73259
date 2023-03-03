import org.example.IStockmarketService;
import org.example.Stock;
import org.example.StocksPortfolio;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class StocksPortfolioTest {

    @Test
    void getTotalValueInClassTest() {
        IStockmarketService stockmarketService = Mockito.mock(IStockmarketService.class);

        StocksPortfolio myStocks = new StocksPortfolio(stockmarketService);

        when(stockmarketService.lookupPrice("EBAY")).thenReturn(4.0);
        when(stockmarketService.lookupPrice("MSFT")).thenReturn(1.5);

        myStocks.addStock(new Stock("EBAY", 2));
        myStocks.addStock(new Stock("MSFT", 4));

        double result = myStocks.getTotalValue();

        assertEquals(14, result);
    }
}
