package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Darko Mikhailovich
 * @version $Id$
 * @since 0.1
 */

public class BoardTest {
    @Test
    public void when3x3() {
        Board board = new Board();
        String result = board.paint(3, 3);
        assertThat(result, is(result));
    }
    @Test
    public void when5x4() {
        Board board = new Board();
        String result = board.paint(5, 4);
        assertThat(result, is(result));
    }
}
