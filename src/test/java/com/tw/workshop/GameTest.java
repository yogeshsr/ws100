package com.tw.workshop;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class GameTest {

    @Test
    public void shouldDeclareBatsmanAsWinner() {
        Run randomRun = new FixedRun(Arrays.asList(5,2,3,1,0,3));
        Batsman batsman = new Batsman(1, randomRun);

        Game game = new Game(12, batsman, 6);

        game.play();

        assertTrue(game.hasBatsmanWon());
    }


}