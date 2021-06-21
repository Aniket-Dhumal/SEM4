import java.util.*; class test2
{
public static void main(String[] agrs)
{
Vector v = new Vector(); 
System.out.println(v.capacity());
 System.out.println(v.size());
  v.add("Hello"); 
 System.out.println(v);
  v.add("Java"); 
  System.out.println(v);
   v.addElement("World");
    System.out.println(v);
v.clear(); 
System.out.println(v); 
v.add("Hello");
 System.out.println(v);
 v.add("Java");
  System.out.println(v); 
 v.addElement("World");
  System.out.println(v); 
 v.contains("Hello"); 
 System.out.println(v); 
 v.elementAt(1); 
 System.out.println(v); 
 v.indexOf("Java");
  System.out.println(v);
  v.firstElement();
   System.out.println(v); 
  v.lastElement();
   System.out.println(v);
v.insertElementAt("Program",1);
 System.out.println(v);
 v.removeElement("Program");
  System.out.println(v);
  v.removeElementAt(1);
   System.out.println(v);
    v.removeAll(v);
     System.out.println(v);
}
}


