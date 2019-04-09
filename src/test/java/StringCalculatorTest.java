import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {
  private StringCalculator calculator = new StringCalculator();

  @Test
  public void emptyString() {
    assertThat(calculator.add(""), is(0));
  }

  @Test
  public void oneNumber() {
    assertThat(calculator.add("3"), is(3));
    assertThat(calculator.add("5"), is(5));
    assertThat(calculator.add("7"), is(7));
  }
}
