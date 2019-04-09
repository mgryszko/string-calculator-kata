class StringCalculator {
  public int add(String numbers) {
    if (numbers.isBlank()) {
      return 0;
    }

    if (numbers.contains(",")) {
      String[] addends = numbers.split(",");
      int addend1 = Integer.valueOf(addends[0]);
      int addend2 = Integer.valueOf(addends[1]);
      return addend1 + addend2;
    }

    return Integer.valueOf(numbers);
  }
}
