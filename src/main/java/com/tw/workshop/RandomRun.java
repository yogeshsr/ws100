package com.tw.workshop;

import java.util.Random;

public class RandomRun implements Run {

    private Random random = new Random();

    public int nextRun() {
        return random.nextInt(6);
    }
}
