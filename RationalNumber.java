public class RationalNumber extends RealNumber{
  private int numerator, denominator;

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
}
