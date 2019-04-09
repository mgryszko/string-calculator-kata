class StringCalculator {
  public int add(String numbers) {
    int sum = 0;
    for (String addend : numbers.split("[,\n]")) {
      sum += valueOf(addend);
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
