package ru.netology;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.LongAdder;

public class Main {

    public static void main(String[] args) {

        FinalReport finalReport = new FinalReport(new LongAdder());

        Runnable shopOnLenina = new Shop(finalReport);
        Runnable shopOnSovetskaya = new Shop(finalReport);
        Runnable shopOnVorovskogo = new Shop(finalReport);

        Collection<Thread> shops = new ArrayList<>();
        shops.add(new Thread(shopOnLenina));
        shops.add(new Thread(shopOnSovetskaya));
        shops.add(new Thread(shopOnVorovskogo));
        shops.stream()
                .forEach(i -> i.start());

        Thread accountantThread = new Thread(new TaxCounter(finalReport));
        accountantThread.start();
    }
}