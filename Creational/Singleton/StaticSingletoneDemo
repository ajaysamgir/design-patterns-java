/******************************************************************************
- Static singlton class have one static method which returns same object when requested
- instace and constructor should be private
- instance will create once when class will load 
- to improve performance do a lazy loading with null check. see example LazySingleton class
*******************************************************************************/
class StaticSingleton
{
  private static StaticSingleton instance = new StaticSingleton ();
  private StaticSingleton ()
  {
  }

  public static StaticSingleton getInstance ()
  {
    return instance;
  }
}

class LazySaticSingleton
{
  private static LazySaticSingleton instance = null;
  private LazySaticSingleton ()
  {
  }

  public static LazySaticSingleton getInstance ()
  {
    if (instance == null) {
        System.out.println("First lazy call...");
        instance = new LazySaticSingleton ();
    }
      
    return instance;
  }
}

public class StaticSingletoneDemo
{
  public static void main (String ... a)
  {
    StaticSingleton fistCall = StaticSingleton.getInstance ();
      System.out.println (fistCall);
    StaticSingleton secondCall = StaticSingleton.getInstance ();
      System.out.println (secondCall);
    StaticSingleton thirdCall = StaticSingleton.getInstance ();
      System.out.println (thirdCall);
      
    LazySaticSingleton fistLazyCall = LazySaticSingleton.getInstance ();
      System.out.println (fistLazyCall);
    LazySaticSingleton secondLazyCall = LazySaticSingleton.getInstance ();
      System.out.println (secondLazyCall);
    LazySaticSingleton thirdLazyCall = LazySaticSingleton.getInstance ();
      System.out.println (thirdLazyCall);
  }
}
