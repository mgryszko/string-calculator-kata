import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SmokeTest
{
  @Test
  public void fails()
  {
    assertThat(true, is(false));
  }
}
