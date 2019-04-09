class StringCalculator {
  public int add(String numbers) {
    if (numbers.isBlank()) {
      return 0;
    }


    if (numbers.contains(",")) {
      String[] addends = numbers.split(",");
      int addend1 = Integer.valueOf(addends[0]);
      int addend2 = Integer.valueOf(addends[1]);
      int addend3 = 0;
      if (addends.length == 3 || addends.length == 4) {
        addend3 = Integer.valueOf(addends[2]);
      }
      int addend4  = 0;
      if (addends.length == 4) {
        addend4 = Integer.valueOf(addends[3]);
      }
      return addend1 + addend2 + addend3 + addend4;
    }

    return Integer.valueOf(numbers);
  }
}
