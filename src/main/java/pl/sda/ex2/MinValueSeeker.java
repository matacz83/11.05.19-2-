package pl.sda.ex2;

import java.util.List;

public class MinValueSeeker implements ValueSeeker {

    @Override
    public Integer find(List<Integer> values) {
        validate(values);

        Integer min = Integer.MAX_VALUE;

        for (Integer value : values) {
            if (min > value) {
                min = value;
            }
        }

        return min;
    }

    private void validate(List<Integer> values) {
        if (values == null || values.isEmpty()) {
            throw new EmptyListException("Lista nie może być pusta!");
        }
    }
}
