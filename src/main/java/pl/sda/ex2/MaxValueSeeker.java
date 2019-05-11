package pl.sda.ex2;

import java.util.List;

class MaxValueSeeker implements ValueSeeker {

    @Override
    public Integer find(List<Integer> values) {
        InputValidator validator = new InputValidator();
        validator.validate((values));

        Integer max = Integer.MIN_VALUE;

        for (Integer value : values) {
            if (max < value) {
                max = value;
            }
        }

        return max;
    }
}
