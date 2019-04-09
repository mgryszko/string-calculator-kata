class StringCalculator {
  public int add(String numbers) {
    int sum = 0;
    for (String number : numbers.split(",")) {
      sum += valueOf(number);
    }
    return sum;
  }

  private Integer valueOf(String number) {
    if (number.isEmpty()) {
      return 0;
    }

    return Integer.valueOf(number) ;
  }
}
