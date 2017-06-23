public class App {
  public static void main(String[] args) {

    Calc calculator = new Calc();

    int addTest = calculator.add(3, 5);
    System.out.println(addTest);

    int subtractTest = calculator.subtract(7, 4);
    System.out.println(subtractTest);

    int multiplyTest = calculator.multiply(6, 8);
    System.out.println(multiplyTest);

    int divisionTest = calculator.divide(9, 3);
    System.out.println(divisionTest);

  }
}
