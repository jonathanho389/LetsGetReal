public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    if(getValue() == other.getValue()){
      return 0;
    }
    else if(getValue() < other.getValue()){
      return -1;
    }
    else{
      return 1;
    }
  }

  public boolean equals(RealNumber other){
    double diff1 = Math.abs(getValue() - other.getValue())/getValue();
    if(other.getValue() == 0 && getValue() == 0){
      return true;
    }
    else if(diff1 <= 0.00001){
      return true;
    }
    else{
      return false;
    }
  }

}
