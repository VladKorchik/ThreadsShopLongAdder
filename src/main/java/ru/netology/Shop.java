package ru.netology;

import java.util.stream.IntStream;

public class Shop implements Runnable {
    private Reportable finalReport;

    final static int MIN_VALUE = 1;
    final static int MAX_VALUE = 1000;

    public Shop(FinalReport finalReport) {
        this.finalReport = finalReport;
    }

    public void run() {
        IntStream.range(MIN_VALUE, MAX_VALUE)
                .forEach(i -> finalReport.getStat().add(i));
    }
}
