package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(companySales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAverage(companySales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldLastMonthWithMaxSales() {
        StatsService service = new StatsService();
        long[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.lastMonthWithMaxSales(companySales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldLastMonthWithMinSales() {
        StatsService service = new StatsService();
        long[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.lastMonthWithMinSales(companySales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberOfMonthWithSalesLowAverage() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberOfMonthWithSalesLowAverage(companySales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberOfMonthWithSalesUpAverage() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberOfMonthWithSalesUpAverage(companySales);
        assertEquals(expected, actual);
    }
}
