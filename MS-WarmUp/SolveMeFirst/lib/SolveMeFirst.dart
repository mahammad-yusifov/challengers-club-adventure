import 'dart:io';

void main(List<String> arguments) {
  print('Enter first number: ');
  var a = int.parse(stdin.readLineSync());

  print('Enter second number: ');
  var b = int.parse(stdin.readLineSync());

  print('sum is = ${doSum(a, b)}');
}

int doSum(int a, int b) => a + b;
