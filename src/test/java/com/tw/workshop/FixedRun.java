package com.tw.workshop;

import java.util.Iterator;
import java.util.List;

public class FixedRun implements Run {

    private final Iterator<Integer> iterator;

    public FixedRun(List<Integer> runList) {
        iterator = runList.iterator();
    }

    @Override
    public int nextRun() {
        return iterator.next();
    }
}
