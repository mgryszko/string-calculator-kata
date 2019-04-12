import java.util.regex.Pattern;

class StringCalculator {
  public int add(String numbers) {
    SeparatorAndNumbers separatorAndNum = getSeparatorAndNumbersFrom(numbers);
    return sum(separatorAndNum.extractNumberLine());
  }

  private SeparatorAndNumbers getSeparatorAndNumbersFrom(String numbers) {
    if (numbers.startsWith("//")) {
      String[] separatorAndNumbers = numbers.split("\n");
      return new SeparatorAndNumbers(extractSeparator(separatorAndNumbers[0]), separatorAndNumbers[1]);
    }

    return new SeparatorAndNumbers("[,\n]", numbers);
  }

  private String extractSeparator(String separator) {
    return Pattern.quote(separator.substring(2, 3));
  }

  private int sum(String[] numbers) {
    int sum = 0;
    for (String addend : numbers) {
      sum += nonNegativeValueOf(addend);
    }
    return sum;
  }

  private Integer nonNegativeValueOf(String str) {
    if (str.isEmpty()) {
      return 0;
    }

    Integer number = Integer.valueOf(str);
    if (number < 0) {
      throw new IllegalArgumentException();
    }
    return number;
  }

  private static class SeparatorAndNumbers {
    private final String separator;
    private final String numbers;

    public SeparatorAndNumbers(String separator, String numbers) {
      this.separator = separator;
      this.numbers = numbers;
    }

    public String[] extractNumberLine() {
      return numbers.split(separator);
    }
  }
}

















