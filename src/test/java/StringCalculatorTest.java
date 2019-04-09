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

  @Test
  public void twoNumbers() {
    assertThat(calculator.add("1,2"), is(3));
    assertThat(calculator.add("2,4"), is(6));
    assertThat(calculator.add("15,31"), is(46));
  }

  @Test
  public void manyNumbers() {
    assertThat(calculator.add("1,2,3"), is(6));
    assertThat(calculator.add("2,3,4"), is(9));
    assertThat(calculator.add("1,2,3,4"), is(10));
  }

  @Test
  public void newLinesAsSeparators() {
    assertThat(calculator.add("1\n2,3,4"), is(10));
    assertThat(calculator.add("1\n2\n3\n4"), is(10));
  }
}
