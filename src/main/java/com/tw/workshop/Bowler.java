package com.tw.workshop;

public class Bowler {
    private int id;
    private Run run;

    public Bowler(int id, Run run) {
        this.id = id;
        this.run = run;
    }

    public int deliverBall() {
        return run.nextRun();
    }
}
