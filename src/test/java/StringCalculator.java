class StringCalculator {
  public int add(String numbers) {
    String separator = "[,\n]";
    if (numbers.startsWith("//")) {
      String[] separatorAndNumbers = numbers.split("\n");
      separator = separatorAndNumbers[0].substring(2, 3);
      numbers = separatorAndNumbers[1];
    }
    return sum(numbers.split(separator));
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
}
