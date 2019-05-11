package pl.sda.ex2;

import java.util.List;

class MinValueSeeker implements ValueSeeker {

    @Override
    public Integer find(List<Integer> values) {
        InputValidator validator = new InputValidator();
        validator.validate((values));


        Integer min = Integer.MAX_VALUE;

        for (Integer value : values) {
            if (min > value) {
                min = value;
            }
        }

        return min;
    }
}
