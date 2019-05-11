package pl.sda.ex2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MinValueSeekerTest {

    @Test
    public void shouldFind1AsMinElement() {
        //given
        final Integer expectedMin = 1;
        final List<Integer> elements = Arrays.asList(1, 6, 8, 10, 5, 2, 6, 7, 2, 7, 3);
        final ValueSeeker valueSeeker = new MinValueSeeker();

        //when
        Integer result = valueSeeker.find(elements);

        //then
        assertEquals(expectedMin, result);

    }

    @Test(expected = EmptyListException.class)
    public void shouldThrowExceptionWhenListIsEmpty() {
        //given
        final List<Integer> elements = new ArrayList<>();
        final ValueSeeker valueSeeker = new MinValueSeeker();

        //when
        valueSeeker.find(elements);
    }

    @Test
    public void shouldThrowExceptionWhenListIsNull() {
        //given
        final List<Integer> elements = null;
        final ValueSeeker valueSeeker = new MinValueSeeker();

        //when
        try {
            valueSeeker.find(elements);
            fail("Wyjątek nie został rzucony!");

        } catch (EmptyListException e) {
        }
    }
}