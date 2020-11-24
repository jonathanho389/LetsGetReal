public class NumberTester{
  public static void main(String[] args) {
    RealNumber six = new RealNumber(6);
    RealNumber five = new RealNumber(5);
    RationalNumber fivesixth = new RationalNumber(5,6);
    RationalNumber negative = new RationalNumber(5, -6);
    RationalNumber reduce = new RationalNumber(25, 30);
    System.out.println(six.getValue());
    System.out.println(six.toString());
    System.out.println(six.equals(five));
    System.out.println(six.add(five));
    System.out.println(six.multiply(five));
    System.out.println(six.divide(five));
    System.out.println(six.subtract(five));
    System.out.println(fivesixth.getValue());
    System.out.println(fivesixth.getNumerator());
    System.out.println(fivesixth.getDenominator());
    System.out.println(negative.getValue());
    System.out.println(fivesixth.reciprocal());
    System.out.println(fivesixth.equals(fivesixth));
    System.out.println(fivesixth.toString());
    System.out.println(reduce.toString());
    System.out.println(fivesixth.multiply(reduce));
    System.out.println(fivesixth.divide(reduce));
    System.out.println(fivesixth.add(reduce));
    System.out.println(fivesixth.subtract(reduce));
  }
}
