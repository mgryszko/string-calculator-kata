class StringCalculator {
  public int add(String numbers) {
    SeparatorAndNumbers separatorAndNum = getSeparatorAndNumbersFrom(numbers);
    return sum(separatorAndNum.numbers.split(separatorAndNum.separator));
  }

  private SeparatorAndNumbers getSeparatorAndNumbersFrom(String numbers) {
    if (numbers.startsWith("//")) {
      String[] separatorAndNumbers = numbers.split("\n");
      return new SeparatorAndNumbers(separatorAndNumbers[0].substring(2, 3), separatorAndNumbers[1]);
    }

    return new SeparatorAndNumbers("[,\n]", numbers);
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
    final String separator;
    final String numbers;

    public SeparatorAndNumbers(String separator, String numbers) {
      this.separator = separator;
      this.numbers = numbers;
    }
  }
}

















