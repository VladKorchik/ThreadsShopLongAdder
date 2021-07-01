package ru.netology;

import java.util.concurrent.atomic.LongAdder;

public class FinalReport implements Reportable{
    final private LongAdder stat;

    public FinalReport(LongAdder stat) {
        this.stat = stat;
    }
    public LongAdder getStat() {
        return stat;
    }
}
