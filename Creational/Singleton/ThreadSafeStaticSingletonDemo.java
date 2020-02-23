/******************************************************************************
- Static singlton class have one static method which returns same object when requested
- instace and constructor should be private
- instance will create once when class will load 
- to improve performance do a lazy loading with null check. see example LazySingleton class
*******************************************************************************/
class ThreadsafeSaticSingleton
{
  /**
   * volatile keyword will make sure that it will keep instance as a singleton even if any chages happen inside
     JVM during execution
   */ 
  private static volatile ThreadsafeSaticSingleton instance = null;
  private ThreadsafeSaticSingleton ()
  {
    /**
     *Here we cross check if any thread is trying to initilize new instance directly without using getInstance static method 
     */
    if(instance !=null) {
        throw RuntimeException("Use getInstance() method to get instance");
    }
  }

  /**
   * We can make this whole method as synchronized but it will make impact on performance 
   * If we make a call this sync method then whole class will lock for that particular instance
   * So we will synchronized the particular code block
   */
  public static ThreadsafeSaticSingleton getInstance ()
  {
    if (instance == null) {
        synchronized(ThreadsafeSaticSingleton.class) {
          /**
           * we are going to add another null check here because may be multiple thread will try to access
           * that block then if 1st thread initilize the instance then remaining thread dont need to initialze 
           * they can directly use that initialzed instance
           */
           if(instance == null)
            instance = new ThreadsafeSaticSingleton ();    
        }
    }
    return instance;
  }
}

public class ThreadsafeSaticSingleton
{
  public static void main (String... a)
  {
    ThreadsafeSaticSingleton fistLazyCall = ThreadsafeSaticSingleton.getInstance ();
      System.out.println (fistLazyCall);
    ThreadsafeSaticSingleton secondLazyCall = ThreadsafeSaticSingleton.getInstance ();
      System.out.println (secondLazyCall);
    ThreadsafeSaticSingleton thirdLazyCall = ThreadsafeSaticSingleton.getInstance ();
      System.out.println (thirdLazyCall);
  }
}
