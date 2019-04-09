class StringCalculator {
  public int add(String numbers) {
    String[] addends = numbers.split(",");
    int sum = 0;
    for (String number : addends) {
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
