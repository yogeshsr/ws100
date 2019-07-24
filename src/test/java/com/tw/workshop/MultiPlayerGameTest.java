package com.tw.workshop;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiPlayerGameTest {

    @Test
    public void batsmanShouldGetOutWhenScoresSameAsDelivery() {
        Run batsmanRuns = new FixedRun(Arrays.asList(5, 2, 3, 1, 0, 3));
        Run bowlerDeliveries = new FixedRun(Arrays.asList(1, 4, 3, 1, 0, 3));

        Batsman batsman = new Batsman(1, batsmanRuns);
        Bowler bowler = new Bowler(1, bowlerDeliveries);

        MultiPlayerGame game = new MultiPlayerGame(12, 6, batsman, bowler);

        game.play();

        assertFalse(game.hasBatsmanWon());

    }

    @Test
    public void attackingBatsmanShouldWin() {
        List<Integer> attackingRuns = Arrays.asList(0, 6, 4);
        Run batsmanRuns = new FixedRun(attackingRuns);
        Run bowlerDeliveries = new FixedRun(Arrays.asList(1, 4, 3, 2, 1, 3));

        Batsman attackingBatsman = new Batsman(1, batsmanRuns);
        Bowler bowler = new Bowler(1, bowlerDeliveries);

        MultiPlayerGame game = new MultiPlayerGame(12, 6, attackingBatsman, bowler);

        game.play();

        assertTrue(game.hasBatsmanWon());
    }
}