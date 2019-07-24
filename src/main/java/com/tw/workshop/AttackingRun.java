package com.tw.workshop;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AttackingRun implements Run {
    private List<Integer> possibleRuns = Arrays.asList(0, 4, 6);
    private Random random = new Random();

    public int nextRun() {
        return possibleRuns.get(random.nextInt(possibleRuns.size()));
    }
}
