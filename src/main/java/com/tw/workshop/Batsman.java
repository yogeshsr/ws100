package com.tw.workshop;

public class Batsman {
    private int id;
    private final Run run;

    public Batsman(int id, Run run) {
        this.id = id;
        this.run = run;
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "id=" + id +
                '}';
    }

    public int score() {
        return run.nextRun();
    }
}
