package pl.sda.ex2;

import java.util.List;

public class MaxValueSeeker implements ValueSeeker {

    @Override
    public Integer find(List<Integer> values) {
        validate(values);

        Integer max = Integer.MIN_VALUE;

        for (Integer value : values) {
            if (max < value) {
                max = value;
            }
        }

        return max;
    }

    private void validate(List<Integer> values) {
        if (values == null || values.isEmpty()) {
            throw new EmptyListException("Lista nie może być pusta!");
        }
    }
}
