package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public long averageSale(long[] sales) {

    }
}
