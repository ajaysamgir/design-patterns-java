class Person
{
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;

  public Person (Builder b)
  {
    this.firstName = b.firstName;
    this.middleName = b.middleName;
    this.lastName = b.lastName;
    this.age = b.age;
  }

  public static class Builder
  {
    private static String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Builder ()
    {
    }

    /**
	 * Bind all data in this and return this to parent class constructor as a parameter
	*/
    public Builder setFirstName (String firstName)
    {
      this.firstName = firstName;
      return this;
    }

    public Builder setMiddleName (String middleName)
    {
      this.middleName = middleName;
      return this;
    }

    public Builder setLastName (String lastName)
    {
      this.lastName = lastName;
      return this;
    }

    public Builder setAge (int age)
    {
      this.age = age;
      return this;
    }

    public Person build ()
    {
      return new Person (this);
    }
  }

  public String getFirstName ()
  {
    return firstName;
  }

  public void setFirstName (String firstName)
  {
    this.firstName = firstName;
  }

  public String getMiddleName ()
  {
    return middleName;
  }

  public void setMiddleName (String middleName)
  {
    this.middleName = middleName;
  }

  public String getLastName ()
  {
    return lastName;
  }

  public void setLastName (String lastName)
  {
    this.lastName = lastName;
  }

  public int getAge ()
  {
    return age;
  }

  public void setAge (int age)
  {
    this.age = age;
  }
}

public class BuilerPattern
{
  public static void main (String[]a)
  {
	// Create object of build class and add data inside that 
    Person.Builder builder = new Person.Builder ();
    builder.setFirstName ("Ajay").setLastName ("Samgir").setAge (29).build ();
	// instanciate Persion class object through the build() method
    Person person = builder.build ();
    
    System.out.println (person.getFirstName ());
    System.out.println (person.getLastName ());
    System.out.println (person.getAge ());
  }
}
