public class RationalNumber extends Number{
  private int numerator, denominator;

  private static int gcd(int a, int b){
    if(a % b == 0){
      return b;
    }
    if(a < b){
      int place = a;
      a = b;
      b = place;
    }
    int remainder = a % b;
    while(remainder != 0){
      a = b;
      b = remainder;
      remainder = a % b;
      }
      return b;
    }

  private void reduce(){
    int common = gcd(Math.abs(numerator), denominator);
    numerator = numerator / common;
    denominator = denominator / common;
  }

  public RationalNumber(int nume, int deno){
    if(deno == 0){
      numerator = 0;
      denominator = 1;
      reduce();
    }
    else if(denominator < 0){
      numerator = nume * -1;
      denominator = deno * -1;
      reduce();
    }
    else{
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue(){
    return (double)numerator / (double)denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber num = new RationalNumber(denominator, numerator);
    return num;
  }

  public boolean equals(RationalNumber other){
    if(numerator == other.getNumerator() && denominator == other.getDenominator()){
      return true;
    }
    else{
      return false;
    }
  }

  public String toString(){
    if(denominator == 1){
      return "" + numerator;
    }
    else if(numerator == 0){
      return "0";
    }
    return numerator + "/" + denominator;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber num = new RationalNumber(getNumerator() * other.getNumerator(), getDenominator() * other.getDenominator());
    return num;
  }

  public RationalNumber divide(RationalNumber other){
    return multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other){
    int common = getDenominator() * other.getDenominator();
    int commonenume = getNumerator() * other.getDenominator();
    int commonenume2 = other.getNumerator() * getDenominator();
    RationalNumber num = new RationalNumber(commonenume + commonenume2, common);
    return num;
  }

  public RationalNumber subtract(RationalNumber other){
    int common = getDenominator() * other.getDenominator();
    int commonenume = getNumerator() * other.getDenominator();
    int commonenume2 = other.getNumerator() * getDenominator();
    RationalNumber num = new RationalNumber(commonenume - commonenume2, common);
    return num;
  }
}
