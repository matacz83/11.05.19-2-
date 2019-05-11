package pl.sda.ex2;

import java.util.List;

class InputValidator {
    void validate(List<Integer> input) {
        if (input == null || input.isEmpty()) {
            throw new EmptyListException("Lista nie może być pusta!");
        }
    }
}
