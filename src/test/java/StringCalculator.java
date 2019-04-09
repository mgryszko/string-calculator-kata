class StringCalculator {
  public int add(String numbers) {
    if (numbers.isBlank())
    {
      return 0;
    }
    return Integer.valueOf(numbers);
  }
}
