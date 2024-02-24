package com.vent.java.springbootexercise1;

import com.vent.java.springbootexercise1.controller.impl.StockController;
import com.vent.java.springbootexercise1.dto.response.CompanyDTO;
import com.vent.java.springbootexercise1.dto.response.StockDTO;
import com.vent.java.springbootexercise1.entity.Company;
import com.vent.java.springbootexercise1.entity.Stock;
import com.vent.java.springbootexercise1.service.StockService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(StockController.class)
public class StockControllerTests {
    @MockBean
    private StockService stockService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetStock() throws Exception {
        CompanyDTO companyDTO = CompanyDTO.builder()
                .companyName("Apple Inc")
                .country("US")
                .currency("usd")
                .logo("https://static2.finnhub.io/file/publicdatany/finnhubimage/stock_logo/AAPL.svg")
                .marketCap(222)
                .ipoDate("rrr")
                .build();
        Company company = new Company();

        StockDTO stockDTO = StockDTO.builder()
                .prevDayClose(111)
                .dayOpen(222)
                .dayLow(333)
                .dayHigh(444)
                .currentPrice(555)
                .companyProfile(companyDTO)
                .build();
        Stock stock = new Stock();

        Mockito.when(stockService.getCompany("APPL")).thenReturn(company);
        Mockito.when(stockService.getStock("APPL")).thenReturn(stock);
        mockMvc.perform(get("/api/v1/stock?symbol=AAPL"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON)) // assert
                .andExpect(jsonPath("$.companyProfile.country").value("US")) //
                .andExpect(jsonPath("$.currentPrice").value(555)) //
                .andDo(print());

    }
}
