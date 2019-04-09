class StringCalculator {
  public int add(String numbers) {
    int sum = 0;
    for (String addend : numbers.split("[,\n]")) {
      sum += valueOf(addend);
    }
    return sum;
  }

  private Integer valueOf(String str) {
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
