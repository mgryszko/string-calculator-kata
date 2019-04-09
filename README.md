## Before you start

- Try not to read ahead.
- Do one task at a time. The trick is to learn to work incrementally.
- Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata

## String Calculator

Create a simple `String` calculator with a method signature:
```
int add(String numbers)
```

The method can take up to two numbers, separated by commas, and will return their sum. For an empty string it will return `0`.

For example `""` or `"1"` or `"1,2"` as inputs.

Hints:
- Start with the simplest test case of an empty string and move to one and two numbers
- Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
- Remember to refactor after each passing test
 
### Allow the `add` method to handle an unknown amount of numbers

### Allow the `add` method to handle new lines between numbers (instead of commas)

`"1\n2,3"` will equal `6`.

### Disallow negative numbers

Calling `add` with a negative number will throw an exception.

### Support different delimiters

To change a delimiter, the beginning of the string will contain a separate line that looks like this: `"//[delimiter]\n[numbers…]"`.
For example `"//;\n1;2"` should return `3` where the default delimiter is `;`.

The first line is optional. All existing scenarios should still be supported

