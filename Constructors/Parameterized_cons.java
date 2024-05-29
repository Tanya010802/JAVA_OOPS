class Parameterized_cons
{
String languages;
Parameterized_cons(String lang)
{
    languages = lang;

System.out.println(languages + " Programming Language");
  
}
  public static void main(String[] args) {

    // call constructor by passing a single value
    Parameterized_cons obj1 = new Parameterized_cons("Java");
    Parameterized_cons obj2 = new Parameterized_cons("Python");
    Parameterized_cons obj3 = new Parameterized_cons("C");
 
  }
}

