package com.tw.workshop;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private int targetScore;
    private Batsman batsman;
    private List<Integer> batsmanScores;
    private int numOfBalls;

    public Game(int targetScore, Batsman batsman, int numOfBalls) {
        this.targetScore = targetScore;
        this.batsman = batsman;
        this.numOfBalls = numOfBalls;
    }

    public boolean hasBatsmanWon() {
        return batsmanScores.stream().reduce(0,Integer::sum) > targetScore;
    }

    public void start() {
        batsmanScores = new ArrayList<>();
        for(int i=0; i<numOfBalls; i++) {
            batsmanScores.add(batsman.score());
        }
    }

}
