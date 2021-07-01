package ru.netology;

public class TaxCounter implements Runnable {
    private Reportable finalReport;

    final static int DATA_COUNTING_TIME = 2000;

    public TaxCounter(FinalReport finalReport) {
        this.finalReport = finalReport;
    }

    public void run() {
        try {
            Thread.sleep(DATA_COUNTING_TIME);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("За сегодня оборот составил " + finalReport.getStat().sum());
    }
}
