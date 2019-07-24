package com.tw.workshop;

import java.util.ArrayList;
import java.util.List;

public class MultiPlayerGame {
    private final Bowler bowler;
    private int targetScore;
    private Batsman batsman;
    private int numOfBalls;
    private List<Integer> batsmanScores;

    public MultiPlayerGame(int targetScore, int numOfBalls, Batsman batsman, Bowler bowler) {
        this.targetScore = targetScore;
        this.numOfBalls = numOfBalls;
        this.batsman = batsman;
        this.bowler = bowler;
    }

    public void play() {
        batsmanScores = new ArrayList<>();
        for (int i = 0; i < numOfBalls; i++) {
            int score = batsman.score();
            int delivery = bowler.deliverBall();
            System.out.printf("Bowler : %d Batsman : %d\n", delivery, score);
            if (delivery == score){
                break;
            }
            batsmanScores.add(score);
        }
    }

    public boolean hasBatsmanWon() {
        return batsmanScores.stream().reduce(0,Integer::sum) > targetScore;
    }

    public static void main(String[] args) {
        Batsman batsman = new Batsman(1, new RandomRun());
        Bowler bowler = new Bowler(1, new RandomRun());
        MultiPlayerGame game = new MultiPlayerGame(12, 6, batsman, bowler);

        game.play();

        String status = game.hasBatsmanWon() ? "WON" : "LOST";
        System.out.printf("Batsman has %s", status);
    }
}
