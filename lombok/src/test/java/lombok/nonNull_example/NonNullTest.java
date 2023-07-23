package lombok.nonNull_example;

import lombok.nonnull_example.NonNullExample;
import lombok.nonnull_example.NonNullVanilla;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NonNullTest {

    @Test
    void nonNull_lombok() {
        NonNullExample nonNullExample = new NonNullExample();
        assertThatThrownBy(() -> nonNullExample.greetingLombokVersion(null))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void nonNull_vanilla() {
        NonNullVanilla nonNullVanilla = new NonNullVanilla();

        String vanillaOutput = nonNullVanilla.greetingJavaVersion(null);

        assertThat(vanillaOutput).isEqualTo("Hello null");
    }
}