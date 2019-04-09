import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {
  private StringCalculator calculator = new StringCalculator();

  @Test
  public void emptyString() {
    assertThat(calculator.add(""), is(0));
  }
}
