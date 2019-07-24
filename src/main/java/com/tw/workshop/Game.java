package com.tw.workshop;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private int targetScore;
    private Batsman batsman;
    private List<Integer> batsmanScores;
    private int numOfBalls;

    public Game(int targetScore, int numOfBalls, Batsman batsman) {
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
        Batsman batsman = new Batsman(1, new MixedRun());
        Game game = new Game(12, 6, batsman);

        game.play();

        String status = game.hasBatsmanWon() ? "WON" : "LOST";
        System.out.printf("Batsman has %s", status);
    }

}
