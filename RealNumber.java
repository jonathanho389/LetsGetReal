public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return "" + getValue();
  }
  public boolean equals(RealNumber other){
    double diff1 = Math.abs(value - other.getValue())/value;
    if(other.getValue() == 0 && value == 0){
      return true;
    }
    else if(diff1 <= 0.001){
      return true;
    }
    else{
      return false;
    }
  }
  public RealNumber add(RealNumber other){
    RealNumber num = new RealNumber(value * other.getValue());
    return num;
  }
}
