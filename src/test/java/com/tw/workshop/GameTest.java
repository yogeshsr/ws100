package com.tw.workshop;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class GameTest {

    @Test
    public void shouldDeclareBatsmanAsWinner() {
        Run batsmanRuns = new FixedRun(Arrays.asList(5,2,3,1,0,3));

        Batsman batsman = new Batsman(1, batsmanRuns);

        Game game = new Game(12, 6, batsman);

        game.play();

        assertTrue(game.hasBatsmanWon());
    }

}