public abstract class Element
{
   protected String symbol;
   protected int atomicNumber;
   protected double atomicWeight;
   
   public Element(String symbol, int atomicNumber, double atomicWeight)
   {
      this.symbol = symbol;
      this.atomicNumber = atomicNumber;
      this.atomicWeight = atomicWeight;
   }
   
   public abstract String describeElement();
   
   public String getSymbol()
   {
      return symbol;
   }
   
   public double getAtomicWeight()
   {
      return atomicWeight;
   }
   
   public double getAtomicNumber()
   {
      return atomicNumber;
   }
}