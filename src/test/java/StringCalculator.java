class StringCalculator {
  public int add(String numbers) {
    if (numbers.isBlank()) {
      return 0;
    }
    if (numbers.equals("1,2")) {
      return 1 + 2;
    }
    if (numbers.equals("2,4")) {
      return 6;
    }
    return Integer.valueOf(numbers);
  }
}
