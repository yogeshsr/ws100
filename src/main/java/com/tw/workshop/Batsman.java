package com.tw.workshop;

public class Batsman {
    private int id;
    private final Run randomRun;

    public Batsman(int id, Run randomRun) {
        this.id = id;
        this.randomRun = randomRun;
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "id=" + id +
                '}';
    }

    public int score() {
        return randomRun.nextRun();
    }
}
