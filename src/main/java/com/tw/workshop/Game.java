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

    public void play() {
        batsmanScores = new ArrayList<>();
        for(int i=0; i<numOfBalls; i++) {
            int score = batsman.score();
            System.out.printf("Batsman scored: %d%n", score);
            batsmanScores.add(score);
        }
    }

    public static void main(String[] args) {
        Batsman batsman = new Batsman(1, new RandomRun());
        Game game = new Game(12, batsman, 6);

        game.play();

        String status = game.hasBatsmanWon() ? "WON" : "LOST";
        System.out.printf("Batsman has %s", status);
    }

}
