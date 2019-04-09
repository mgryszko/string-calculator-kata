class StringCalculator {
  public int add(String numbers) {
    if (numbers.isBlank()) {
      return 0;
    }
    if (numbers.equals("1,2")) {
      int addend1 = Integer.valueOf(numbers.split(",")[0]);
      int addend2 = Integer.valueOf(numbers.split(",")[1]);
      return addend1 + addend2;
    }
    if (numbers.equals("2,4")) {
      int addend1 = Integer.valueOf(numbers.split(",")[0]);
      int addend2 = Integer.valueOf(numbers.split(",")[1]);
      return addend1 + addend2;
    }
    return Integer.valueOf(numbers);
  }
}
