package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test

    public void testSumSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.sumSales(sales);
        long expected = 8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testAverageSale() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.averageSale(sales);
        long expected = (8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMonthMaxSale() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.monthMaxSale(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMonthMinSale() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.monthMinSale(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.monthsBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.monthsAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
