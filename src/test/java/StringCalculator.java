class StringCalculator {
  public int add(String numbers) {
    if (numbers.isBlank()) {
      return 0;
    }

    if (numbers.contains(",")) {
      String[] addends = numbers.split(",");
      int sum = 0;
      for (String number : addends) {
        sum += Integer.valueOf(number);
      }
      return sum;
    }

    return Integer.valueOf(numbers);
  }
}
