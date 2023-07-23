package lombok.nonnull_example;

import jakarta.annotation.Nonnull;

public class NonNullVanilla {

    public String greetingJavaVersion(@Nonnull String name) {
        return "Hello " + name;
    }
}
