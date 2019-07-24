package com.tw.workshop;

import java.util.Iterator;
import java.util.List;

public class FixedRun implements Run {

    private Iterator<Integer> iterator;
    private List<Integer> runList;

    public FixedRun(List<Integer> runList) {
        this.runList = runList;
        iterator = this.runList.iterator();
    }

    @Override
    public int nextRun() {
        if (!iterator.hasNext()) {
            iterator = runList.iterator();
        }
        return iterator.next();
    }
}
