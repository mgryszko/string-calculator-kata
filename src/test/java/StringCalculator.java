class StringCalculator {
  public int add(String numbers) {
    if (!numbers.isBlank()) {
      return Integer.valueOf(numbers);
    }
    if (numbers.equals("3")) {
      return 3;
    }
    if (numbers.equals("5")) {
      return 5;
    }
    return 0;
  }
}
