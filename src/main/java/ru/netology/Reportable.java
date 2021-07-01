package ru.netology;

import java.util.concurrent.atomic.LongAdder;

public interface Reportable {

    LongAdder getStat();
}
