package ru.netology;

import java.util.stream.IntStream;

public class Shop implements Runnable {
    private IFinalReport finalReport;

    final static int minValue = 1;
    final static int maxValue = 1000;

    public Shop(FinalReport finalReport) {
        this.finalReport = finalReport;
    }

    public void run() {
        IntStream.range(minValue, maxValue)
                .forEach(i -> finalReport.getStat().add(i));
    }
}
