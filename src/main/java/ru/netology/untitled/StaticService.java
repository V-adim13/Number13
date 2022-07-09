package ru.netology.untitled;

//Сумму всех продаж
public class StaticService {
    public long AmountMonth(long[] sales) {
        long AmountMonth = 0;

        for (long sale : sales) {
            AmountMonth += sale;

        }
        return AmountMonth;

    }

//Среднюю сумму продаж в месяц


    public long AverageNumber(long[] sales) {

        long AmountMonth = AmountMonth(sales);

        return AmountMonth / 12;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
//Пик продаж 5,7 месяц , как сделать что бы выдать два числа ?
    public int MaxxSales(long[] sales) {
        int MaxxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxxMonth]) {
                MaxxMonth = i;
            }
        }
        return MaxxMonth;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int MiniSales(long[] sales) {
        int MinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinMonth])
                MinMonth = i;
        }
        return MinMonth;
    }


//Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)

    public int MinAverageSales(long[] sales) {
        int MinAverage = 0;
        long amo = AverageNumber(sales);
        for (long sale : sales) {
            if (sale < amo) {
                MinAverage++;

            }
        }
        return MinAverage;
    }
    //Кол-во месяцев, в которых продажи были выше среднего (см. п.2)

    public int MaxAverageSales(long[] sales) {
        int MaxAverage = 0;
        long amo = AverageNumber(sales);
        for (long sale : sales) {
            if (sale > amo) {
                MaxAverage++;

            }
        }
        return MaxAverage;
    }
}
