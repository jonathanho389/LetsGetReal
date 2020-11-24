public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;
    if(denominator == 0){
      numerator = 0;
      denominator = numerator;
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
}
