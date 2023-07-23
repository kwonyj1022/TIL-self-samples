package lombok.nonnull_example;

import lombok.NonNull;

public class NonNullExample {

    public String greetingLombokVersion(@NonNull String name) {
        return "Hello " + name;
    }
}
