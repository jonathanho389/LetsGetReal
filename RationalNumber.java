public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  private static int gcd(int a, int b){
    if(a < b){
      int remainder = b % a;
      if(b % a == 0){
        return 0;
      }
      else{
        while(remainder != 0){
          b = a;
          a = remainder;
          remainder = b % a;
        }
      }
      return a;
    }
    int remainder = a % b;
    if(a % b == 0){
      return 0;
    }
    else{
      while(remainder != 0){
        a = b;
        b = remainder;
        remainder = a % b;
      }
    }
    return b;
  }


  private void reduce(){
    int common = gcd(numerator, denominator);
    numerator = numerator / common;
    denominator = denominator / common;
  }

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;
    if(denominator == 0){
      numerator = 0;
      denominator = 1;
    }
    if(denominator < 0){
      numerator *= -1;
      denominator *= -1;
    }
    reduce();
  }

  public double getValue(){
    return (double)numerator/(double)denominator;
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
    return numerator + "/" + denominator;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber num = new RationalNumber(getValue() * other.getValue());
    return num;
  }
}
