class StringCalculator {
  public int add(String numbers) {
    if (numbers.isBlank()) {
      return 0;
    }

    String[] addends = numbers.split(",");
    int sum = 0;
    for (String number : addends) {
      sum += Integer.valueOf(number);
    }
    return sum;
  }
}
