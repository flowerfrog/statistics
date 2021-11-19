package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int lastMonthWithMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int lastMonthWithMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberOfMonthWithSalesLowAverage(int[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < calculateSum(sales) / sales.length) {
                counter += 1;
            }
        }
        return counter;
    }

    public int numberOfMonthWithSalesUpAverage(int[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > calculateSum(sales) / sales.length) {
                counter += 1;
            }
        }
        return counter;
    }
}
