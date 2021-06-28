package ru.netology;

public class TaxCounter implements Runnable {
    private IFinalReport finalReport;

    final static int dataCountingTime = 2000;

    public TaxCounter(FinalReport finalReport) {
        this.finalReport = finalReport;
    }

    public void run() {
        try {
            Thread.sleep(dataCountingTime);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("За сегодня оборот составил " + finalReport.getStat().sum());
    }
}
