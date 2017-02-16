
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b20 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str22.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str22.headSet("", false);
    boolean b28 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b29 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b30 = treeset_str0.equals((java.lang.Object)b29);
    java.lang.String str32 = treeset_str0.ceiling("[hi!]");
    java.util.Iterator<java.lang.String> iterator_str33 = treeset_str0.iterator();
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array36 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<java.lang.String>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str37, str_array36);
    boolean b39 = treeset_str34.retainAll((java.util.Collection<java.lang.String>)arraylist_str37);
    java.util.TreeSet<java.lang.String> treeset_str40 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str41 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str40);
    java.util.SortedSet<java.lang.String> sortedset_str43 = treeset_str41.tailSet("");
    boolean b44 = treeset_str34.equals((java.lang.Object)treeset_str41);
    boolean b46 = treeset_str41.add("[hi!]");
    treeset_str41.clear();
    java.util.SortedSet<java.lang.String> sortedset_str49 = treeset_str41.headSet("[, hi!]");
    boolean b50 = treeset_str0.equals((java.lang.Object)treeset_str41);
    boolean b51 = treeset_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.tailSet("[]", true);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str15.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    boolean b24 = treeset_str17.add("hi!");
    boolean b25 = treeset_str15.contains((java.lang.Object)"hi!");
    java.lang.String str27 = treeset_str15.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str15.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str31 = treeset_str15.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str32 = treeset_str15.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)navigableset_str32);
    java.lang.Object obj34 = treeset_str33.clone();
    java.lang.Object[] obj_array35 = treeset_str33.toArray();
    boolean b36 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str33);
    java.util.TreeSet<java.lang.String> treeset_str37 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str38 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str37);
    java.lang.String str40 = treeset_str38.lower("");
    java.lang.String str41 = treeset_str38.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str46 = treeset_str38.subSet("", false, "[hi!]", false);
    java.util.SortedSet<java.lang.String> sortedset_str48 = treeset_str38.headSet("[hi!]");
    boolean b49 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str38);
    java.util.NavigableSet<java.lang.String> navigableset_str52 = treeset_str38.headSet("[, hi!]", false);
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.lang.String> sortedset_str55 = treeset_str38.subSet("[hi!]", "[]");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str52);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str25);
    java.util.Iterator<java.lang.String> iterator_str27 = treeset_str26.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array30 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str31, str_array30);
    boolean b33 = treeset_str28.retainAll((java.util.Collection<java.lang.String>)arraylist_str31);
    boolean b35 = treeset_str28.add("hi!");
    boolean b36 = treeset_str26.contains((java.lang.Object)"hi!");
    java.lang.String str38 = treeset_str26.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str43 = treeset_str26.subSet("[hi!]", true, "[hi!]", true);
    boolean b44 = treeset_str0.containsAll((java.util.Collection<java.lang.String>)treeset_str26);
    java.util.SortedSet<java.lang.String> sortedset_str46 = treeset_str0.tailSet("[, hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str49 = treeset_str0.tailSet("[hi!]", false);
    java.util.SortedSet<java.lang.String> sortedset_str51 = treeset_str0.tailSet("[, hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str51);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("", false);
    treeset_str0.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str0.headSet("hi!", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str2 = treeset_str1.toString();
    java.lang.String str3 = treeset_str1.toString();
    java.lang.Object obj4 = treeset_str1.clone();
    java.lang.Object obj5 = treeset_str1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str3.iterator();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    boolean b14 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)arraylist_str12);
    boolean b16 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str18.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str18.headSet("", false);
    boolean b24 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b25 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b26 = treeset_str3.removeAll((java.util.Collection<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str28 = treeset_str8.tailSet("hi!");
    java.lang.String str30 = treeset_str8.higher("");
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str34, str_array33);
    java.util.NavigableSet<java.lang.String> navigableset_str36 = treeset_str34.descendingSet();
    java.lang.String str37 = treeset_str34.pollLast();
    java.util.stream.Stream<java.lang.String> stream_str38 = treeset_str34.stream();
    java.util.TreeSet<java.lang.String> treeset_str39 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array41 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<java.lang.String>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str42, str_array41);
    boolean b44 = treeset_str39.retainAll((java.util.Collection<java.lang.String>)arraylist_str42);
    java.util.TreeSet<java.lang.String> treeset_str45 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str46 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str45);
    java.util.SortedSet<java.lang.String> sortedset_str48 = treeset_str46.tailSet("");
    boolean b49 = treeset_str39.equals((java.lang.Object)treeset_str46);
    java.util.stream.Stream<java.lang.String> stream_str50 = treeset_str39.stream();
    java.util.stream.Stream[] stream_array52 = new java.util.stream.Stream[ 2 ];
    @SuppressWarnings("unchecked")
    java.util.stream.Stream<java.lang.String>[] stream_str_array53 = (java.util.stream.Stream<java.lang.String>[])stream_array52;
    stream_str_array53[0] = stream_str38;
    stream_str_array53[1] = stream_str50;
    java.util.stream.Stream<java.lang.String>[] stream_str_array58 = treeset_str8.toArray(stream_str_array53);
    java.lang.String str60 = treeset_str8.ceiling("[]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str5, str_array4);
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str5.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str8 = treeset_str5.iterator();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    boolean b16 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)arraylist_str14);
    boolean b18 = treeset_str11.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    java.util.SortedSet<java.lang.String> sortedset_str22 = treeset_str20.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str25 = treeset_str20.headSet("", false);
    boolean b26 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)navigableset_str25);
    boolean b27 = treeset_str10.retainAll((java.util.Collection<java.lang.String>)navigableset_str25);
    boolean b28 = treeset_str5.removeAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str10.tailSet("hi!");
    boolean b31 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.String str32 = treeset_str0.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.lang.String str8 = treeset_str0.lower("");
    java.lang.String str10 = treeset_str0.higher("[hi!]");
    java.util.stream.Stream<java.lang.String> stream_str11 = treeset_str0.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str11);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str12 = treeset_str10.tailSet("");
    boolean b13 = treeset_str3.equals((java.lang.Object)treeset_str10);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str3.equals((java.lang.Object)b32);
    java.lang.String str35 = treeset_str3.ceiling("[hi!]");
    boolean b36 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str3);
    java.lang.String str38 = treeset_str1.floor("[]");
    java.util.Comparator<? super java.lang.String> comparator_wildcard39 = treeset_str1.comparator();
    java.util.TreeSet<java.lang.String> treeset_str40 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array42 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str43 = new java.util.ArrayList<java.lang.String>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str43, str_array42);
    boolean b45 = treeset_str40.retainAll((java.util.Collection<java.lang.String>)arraylist_str43);
    boolean b47 = treeset_str40.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str48 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str49 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str48);
    java.util.SortedSet<java.lang.String> sortedset_str51 = treeset_str49.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str54 = treeset_str49.headSet("", false);
    boolean b55 = treeset_str40.retainAll((java.util.Collection<java.lang.String>)navigableset_str54);
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str59 = new java.util.TreeSet<java.lang.String>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str59, str_array58);
    java.util.NavigableSet<java.lang.String> navigableset_str61 = treeset_str59.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str62 = treeset_str59.iterator();
    java.util.Iterator<java.lang.String> iterator_str63 = treeset_str59.iterator();
    boolean b64 = treeset_str40.removeAll((java.util.Collection<java.lang.String>)treeset_str59);
    java.util.Iterator<java.lang.String> iterator_str65 = treeset_str40.iterator();
    java.lang.String str67 = treeset_str40.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str68 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str40);
    java.util.NavigableSet<java.lang.String> navigableset_str71 = treeset_str68.headSet("[hi!]", true);
    boolean b72 = treeset_str1.removeAll((java.util.Collection<java.lang.String>)treeset_str68);
    java.util.NavigableSet<java.lang.String> navigableset_str75 = treeset_str68.tailSet("[[hi!]]", false);
    java.lang.String str76 = treeset_str68.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "[]"+ "'", str76.equals("[]"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str0.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.NavigableSet<java.lang.String> navigableset_str15 = treeset_str9.subSet("", true, "[hi!]", true);
    java.util.NavigableSet<java.lang.String> navigableset_str20 = treeset_str9.subSet("", false, "hi!", false);
    java.lang.String str22 = treeset_str9.ceiling("");
    boolean b23 = treeset_str0.containsAll((java.util.Collection<java.lang.String>)treeset_str9);
    boolean b24 = treeset_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.lang.String str7 = treeset_str3.ceiling("[hi!]");
    java.util.Spliterator<java.lang.String> spliterator_str8 = treeset_str3.spliterator();
    java.lang.String str9 = treeset_str3.last();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str13, str_array12);
    java.util.NavigableSet<java.lang.String> navigableset_str15 = treeset_str13.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str13.iterator();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array21 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str22, str_array21);
    boolean b24 = treeset_str19.retainAll((java.util.Collection<java.lang.String>)arraylist_str22);
    boolean b26 = treeset_str19.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str27);
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str28.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str33 = treeset_str28.headSet("", false);
    boolean b34 = treeset_str19.retainAll((java.util.Collection<java.lang.String>)navigableset_str33);
    boolean b35 = treeset_str18.retainAll((java.util.Collection<java.lang.String>)navigableset_str33);
    boolean b36 = treeset_str13.removeAll((java.util.Collection<java.lang.String>)treeset_str18);
    java.util.TreeSet<java.lang.String> treeset_str37 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array39 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array39);
    boolean b42 = treeset_str37.retainAll((java.util.Collection<java.lang.String>)arraylist_str40);
    java.lang.String str43 = treeset_str37.pollLast();
    java.util.Iterator<java.lang.String> iterator_str44 = treeset_str37.descendingIterator();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str48 = new java.util.TreeSet<java.lang.String>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str48, str_array47);
    java.util.NavigableSet<java.lang.String> navigableset_str50 = treeset_str48.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str51 = treeset_str48.iterator();
    boolean b52 = treeset_str37.equals((java.lang.Object)iterator_str51);
    java.util.Iterator<java.lang.String> iterator_str53 = treeset_str37.iterator();
    boolean b54 = treeset_str18.equals((java.lang.Object)treeset_str37);
    java.util.SortedSet<java.lang.String> sortedset_str56 = treeset_str18.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str57 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str58 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str57);
    java.util.Iterator<java.lang.String> iterator_str59 = treeset_str58.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str60 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array62 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str63 = new java.util.ArrayList<java.lang.String>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str63, str_array62);
    boolean b65 = treeset_str60.retainAll((java.util.Collection<java.lang.String>)arraylist_str63);
    boolean b67 = treeset_str60.add("hi!");
    boolean b68 = treeset_str58.contains((java.lang.Object)"hi!");
    java.lang.String str70 = treeset_str58.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str73 = treeset_str58.headSet("", false);
    boolean b74 = treeset_str18.remove((java.lang.Object)"");
    boolean b75 = treeset_str3.equals((java.lang.Object)"");
    java.lang.Object[] obj_array76 = treeset_str3.toArray();
    java.util.TreeSet<java.lang.String> treeset_str77 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str78 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str77);
    java.util.Iterator<java.lang.String> iterator_str79 = treeset_str78.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str80 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array82 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str83 = new java.util.ArrayList<java.lang.String>();
    boolean b84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str83, str_array82);
    boolean b85 = treeset_str80.retainAll((java.util.Collection<java.lang.String>)arraylist_str83);
    boolean b87 = treeset_str80.add("hi!");
    boolean b88 = treeset_str78.contains((java.lang.Object)"hi!");
    java.lang.String str90 = treeset_str78.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str92 = treeset_str78.tailSet("");
    java.util.stream.Stream<java.lang.String> stream_str93 = treeset_str78.stream();
    java.util.TreeSet<java.lang.String> treeset_str94 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str78);
    java.util.stream.Stream<java.lang.String> stream_str95 = treeset_str78.parallelStream();
    java.util.NavigableSet<java.lang.String> navigableset_str98 = treeset_str78.headSet("[, hi!]", false);
    boolean b99 = treeset_str3.removeAll((java.util.Collection<java.lang.String>)treeset_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str12 = treeset_str10.tailSet("");
    boolean b13 = treeset_str3.equals((java.lang.Object)treeset_str10);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str3.equals((java.lang.Object)b32);
    java.lang.String str35 = treeset_str3.ceiling("[hi!]");
    boolean b36 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str3);
    java.lang.String str38 = treeset_str1.floor("[]");
    java.util.Comparator<? super java.lang.String> comparator_wildcard39 = treeset_str1.comparator();
    java.util.TreeSet<java.lang.String> treeset_str40 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array42 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str43 = new java.util.ArrayList<java.lang.String>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str43, str_array42);
    boolean b45 = treeset_str40.retainAll((java.util.Collection<java.lang.String>)arraylist_str43);
    boolean b47 = treeset_str40.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str48 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str49 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str48);
    java.util.SortedSet<java.lang.String> sortedset_str51 = treeset_str49.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str54 = treeset_str49.headSet("", false);
    boolean b55 = treeset_str40.retainAll((java.util.Collection<java.lang.String>)navigableset_str54);
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str59 = new java.util.TreeSet<java.lang.String>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str59, str_array58);
    java.util.NavigableSet<java.lang.String> navigableset_str61 = treeset_str59.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str62 = treeset_str59.iterator();
    java.util.Iterator<java.lang.String> iterator_str63 = treeset_str59.iterator();
    boolean b64 = treeset_str40.removeAll((java.util.Collection<java.lang.String>)treeset_str59);
    java.util.Iterator<java.lang.String> iterator_str65 = treeset_str40.iterator();
    java.lang.String str67 = treeset_str40.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str68 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str40);
    java.util.NavigableSet<java.lang.String> navigableset_str71 = treeset_str68.headSet("[hi!]", true);
    boolean b72 = treeset_str1.removeAll((java.util.Collection<java.lang.String>)treeset_str68);
    java.lang.String str73 = treeset_str68.toString();
    java.util.Comparator<? super java.lang.String> comparator_wildcard74 = treeset_str68.comparator();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str75 = treeset_str68.last();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "[]"+ "'", str73.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard74);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str3.iterator();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    boolean b14 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)arraylist_str12);
    boolean b16 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str18.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str18.headSet("", false);
    boolean b24 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b25 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b26 = treeset_str3.removeAll((java.util.Collection<java.lang.String>)treeset_str8);
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    boolean b32 = treeset_str27.retainAll((java.util.Collection<java.lang.String>)arraylist_str30);
    java.lang.String str33 = treeset_str27.pollLast();
    java.util.Iterator<java.lang.String> iterator_str34 = treeset_str27.descendingIterator();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str38 = new java.util.TreeSet<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str38, str_array37);
    java.util.NavigableSet<java.lang.String> navigableset_str40 = treeset_str38.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str41 = treeset_str38.iterator();
    boolean b42 = treeset_str27.equals((java.lang.Object)iterator_str41);
    java.util.Iterator<java.lang.String> iterator_str43 = treeset_str27.iterator();
    boolean b44 = treeset_str8.equals((java.lang.Object)treeset_str27);
    java.util.TreeSet<java.lang.String> treeset_str45 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str8);
    java.lang.String str46 = treeset_str45.pollFirst();
    java.lang.String str48 = treeset_str45.higher("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str0.tailSet("[]", false);
    int i31 = treeset_str0.size();
    java.util.Comparator<? super java.lang.String> comparator_wildcard32 = treeset_str0.comparator();
    boolean b33 = treeset_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.subSet("", true, "[hi!]", true);
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str7);
    java.util.SortedSet<java.lang.String> sortedset_str10 = treeset_str8.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    boolean b16 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)arraylist_str14);
    boolean b17 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)treeset_str11);
    java.util.NavigableSet<java.lang.String> navigableset_str20 = treeset_str8.headSet("", false);
    boolean b21 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str8);
    boolean b22 = treeset_str0.isEmpty();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str26, str_array25);
    java.util.NavigableSet<java.lang.String> navigableset_str28 = treeset_str26.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str29 = treeset_str26.iterator();
    java.util.TreeSet<java.lang.String> treeset_str30 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str31 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str30);
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array34 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array34);
    boolean b37 = treeset_str32.retainAll((java.util.Collection<java.lang.String>)arraylist_str35);
    boolean b39 = treeset_str32.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str40 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str41 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str40);
    java.util.SortedSet<java.lang.String> sortedset_str43 = treeset_str41.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str46 = treeset_str41.headSet("", false);
    boolean b47 = treeset_str32.retainAll((java.util.Collection<java.lang.String>)navigableset_str46);
    boolean b48 = treeset_str31.retainAll((java.util.Collection<java.lang.String>)navigableset_str46);
    boolean b49 = treeset_str26.removeAll((java.util.Collection<java.lang.String>)treeset_str31);
    boolean b51 = treeset_str31.add("[hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str54 = treeset_str31.headSet("", false);
    java.util.TreeSet<java.lang.String> treeset_str55 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array57 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str58 = new java.util.ArrayList<java.lang.String>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str58, str_array57);
    boolean b60 = treeset_str55.retainAll((java.util.Collection<java.lang.String>)arraylist_str58);
    java.util.stream.Stream<java.lang.String> stream_str61 = treeset_str55.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str63 = treeset_str55.headSet("");
    boolean b64 = treeset_str31.removeAll((java.util.Collection<java.lang.String>)treeset_str55);
    int i65 = treeset_str55.size();
    int i66 = treeset_str55.size();
    boolean b67 = treeset_str0.equals((java.lang.Object)treeset_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b20 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str22.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str22.headSet("", false);
    boolean b28 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b29 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b30 = treeset_str0.equals((java.lang.Object)b29);
    java.lang.String str32 = treeset_str0.ceiling("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    boolean b34 = treeset_str0.isEmpty();
    java.lang.String str36 = treeset_str0.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str39 = treeset_str0.tailSet("", true);
    int i40 = treeset_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b20 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str22.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str22.headSet("", false);
    boolean b28 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b29 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b30 = treeset_str0.equals((java.lang.Object)b29);
    java.lang.String str32 = treeset_str0.ceiling("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    int i34 = treeset_str0.size();
    java.util.TreeSet<java.lang.String> treeset_str35 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array37 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array37);
    boolean b40 = treeset_str35.retainAll((java.util.Collection<java.lang.String>)arraylist_str38);
    boolean b42 = treeset_str35.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str43 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str44 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str43);
    java.util.SortedSet<java.lang.String> sortedset_str46 = treeset_str44.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str49 = treeset_str44.headSet("", false);
    boolean b50 = treeset_str35.retainAll((java.util.Collection<java.lang.String>)navigableset_str49);
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str54 = new java.util.TreeSet<java.lang.String>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str54, str_array53);
    java.util.NavigableSet<java.lang.String> navigableset_str56 = treeset_str54.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str57 = treeset_str54.iterator();
    java.util.Iterator<java.lang.String> iterator_str58 = treeset_str54.iterator();
    boolean b59 = treeset_str35.removeAll((java.util.Collection<java.lang.String>)treeset_str54);
    java.util.Iterator<java.lang.String> iterator_str60 = treeset_str35.iterator();
    java.lang.String str62 = treeset_str35.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str63 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str35);
    java.lang.String str64 = treeset_str63.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str67 = treeset_str63.headSet("", true);
    boolean b68 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)navigableset_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.subSet("", true, "[hi!]", true);
    java.util.NavigableSet<java.lang.String> navigableset_str11 = treeset_str0.subSet("", false, "hi!", false);
    java.lang.String str13 = treeset_str0.higher("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str18);
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str20.tailSet("[hi!]");
    java.lang.Object obj24 = treeset_str20.clone();
    boolean b25 = treeset_str19.retainAll((java.util.Collection<java.lang.String>)treeset_str20);
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    treeset_str26.clear();
    java.lang.Object[] obj_array28 = treeset_str26.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    boolean b4 = treeset_str1.isEmpty();
    boolean b6 = treeset_str1.add("[hi!]");
    java.lang.String str7 = treeset_str1.toString();
    java.lang.String str9 = treeset_str1.higher("");
    java.lang.String str11 = treeset_str1.ceiling("[]");
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str1.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[hi!]]"+ "'", str7.equals("[[hi!]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[hi!]"+ "'", str9.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[hi!]"+ "'", str11.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", true);
    treeset_str1.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str1.headSet("hi!", true);
    java.util.stream.Stream<java.lang.String> stream_str11 = treeset_str1.parallelStream();
    java.lang.String str12 = treeset_str1.toString();
    java.lang.Object obj13 = treeset_str1.clone();
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.subSet("[]", false, "[, hi!]", false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.Spliterator<java.lang.String> spliterator_str8 = treeset_str0.spliterator();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    int i10 = treeset_str9.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Spliterator<java.lang.String> spliterator_str7 = treeset_str0.spliterator();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.lang.String str13 = treeset_str9.higher("");
    boolean b14 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str0.tailSet("");
    java.util.Comparator<? super java.lang.String> comparator_wildcard17 = treeset_str0.comparator();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str21, str_array20);
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str21.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str24 = treeset_str21.iterator();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str25);
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    boolean b32 = treeset_str27.retainAll((java.util.Collection<java.lang.String>)arraylist_str30);
    boolean b34 = treeset_str27.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str35 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str36 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str35);
    java.util.SortedSet<java.lang.String> sortedset_str38 = treeset_str36.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str41 = treeset_str36.headSet("", false);
    boolean b42 = treeset_str27.retainAll((java.util.Collection<java.lang.String>)navigableset_str41);
    boolean b43 = treeset_str26.retainAll((java.util.Collection<java.lang.String>)navigableset_str41);
    boolean b44 = treeset_str21.removeAll((java.util.Collection<java.lang.String>)treeset_str26);
    java.util.SortedSet<java.lang.String> sortedset_str46 = treeset_str26.tailSet("hi!");
    java.util.TreeSet<java.lang.String> treeset_str47 = new java.util.TreeSet<java.lang.String>(sortedset_str46);
    treeset_str47.clear();
    java.lang.String str50 = treeset_str47.floor("[[hi!]]");
    boolean b51 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str47);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str52 = treeset_str0.last();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str11, str_array10);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str11.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str14 = treeset_str11.iterator();
    boolean b15 = treeset_str0.equals((java.lang.Object)iterator_str14);
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str0.iterator();
    java.lang.String str18 = treeset_str0.floor("hi!");
    java.lang.String str20 = treeset_str0.higher("[[hi!]]");
    java.util.Spliterator<java.lang.String> spliterator_str21 = treeset_str0.spliterator();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array24 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str25, str_array24);
    boolean b27 = treeset_str22.retainAll((java.util.Collection<java.lang.String>)arraylist_str25);
    java.lang.String str28 = treeset_str22.pollLast();
    java.util.Iterator<java.lang.String> iterator_str29 = treeset_str22.descendingIterator();
    java.util.Iterator<java.lang.String> iterator_str30 = treeset_str22.descendingIterator();
    java.lang.String str31 = treeset_str22.pollFirst();
    java.lang.Object[] obj_array32 = new java.lang.Object[] {  };
    java.lang.Object[] obj_array33 = new java.lang.Object[] {  };
    java.lang.Object[] obj_array34 = new java.lang.Object[] {  };
    java.lang.Object[] obj_array35 = new java.lang.Object[] {  };
    java.lang.Object[][] obj_array_array36 = new java.lang.Object[][] { obj_array32, obj_array33, obj_array34, obj_array35 };
    java.lang.Object[][] obj_array_array37 = treeset_str22.toArray(obj_array_array36);
    java.lang.Cloneable[] cloneable_array38 = treeset_str0.toArray((java.lang.Cloneable[])obj_array_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cloneable_array38);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str3.iterator();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str3.iterator();
    java.util.Comparator<? super java.lang.String> comparator_wildcard8 = treeset_str3.comparator();
    java.lang.String str10 = treeset_str3.higher("[hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.lang.String str8 = treeset_str0.lower("");
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    boolean b14 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)arraylist_str12);
    boolean b16 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str18.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str18.headSet("", false);
    boolean b24 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str28, str_array27);
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str28.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str31 = treeset_str28.iterator();
    java.util.Iterator<java.lang.String> iterator_str32 = treeset_str28.iterator();
    boolean b33 = treeset_str9.removeAll((java.util.Collection<java.lang.String>)treeset_str28);
    java.util.Iterator<java.lang.String> iterator_str34 = treeset_str9.iterator();
    java.util.TreeSet<java.lang.String> treeset_str35 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str36 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str35);
    java.util.Iterator<java.lang.String> iterator_str37 = treeset_str36.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str38 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array40 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str41, str_array40);
    boolean b43 = treeset_str38.retainAll((java.util.Collection<java.lang.String>)arraylist_str41);
    boolean b45 = treeset_str38.add("hi!");
    boolean b46 = treeset_str36.contains((java.lang.Object)"hi!");
    java.lang.String str48 = treeset_str36.ceiling("hi!");
    treeset_str36.clear();
    java.util.TreeSet<java.lang.String> treeset_str50 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str51 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str50);
    java.util.Iterator<java.lang.String> iterator_str52 = treeset_str51.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str53 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array55 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str56 = new java.util.ArrayList<java.lang.String>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str56, str_array55);
    boolean b58 = treeset_str53.retainAll((java.util.Collection<java.lang.String>)arraylist_str56);
    boolean b60 = treeset_str53.add("hi!");
    boolean b61 = treeset_str51.contains((java.lang.Object)"hi!");
    java.lang.String str63 = treeset_str51.ceiling("hi!");
    java.util.TreeSet<java.lang.String> treeset_str64 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str65 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str64);
    java.util.SortedSet<java.lang.String> sortedset_str67 = treeset_str65.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str70 = treeset_str65.headSet("", false);
    java.util.SortedSet[] sortedSet_array72 = new java.util.SortedSet[ 4 ];
    @SuppressWarnings("unchecked")
    java.util.SortedSet<java.lang.String>[] sortedset_str_array73 = (java.util.SortedSet<java.lang.String>[])sortedSet_array72;
    sortedset_str_array73[0] = treeset_str9;
    sortedset_str_array73[1] = treeset_str36;
    sortedset_str_array73[2] = treeset_str51;
    sortedset_str_array73[3] = treeset_str65;
    java.util.SortedSet<java.lang.String>[] sortedset_str_array82 = treeset_str0.toArray(sortedset_str_array73);
    java.util.Spliterator<java.lang.String> spliterator_str83 = treeset_str0.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str88 = treeset_str0.subSet("", true, "[hi!]", true);
    java.lang.String str90 = treeset_str0.floor("");
    boolean b91 = treeset_str0.isEmpty();
    java.util.SortedSet<java.lang.String> sortedset_str94 = treeset_str0.subSet("[[]]", "[hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedSet_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str94);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str2 = treeset_str1.toString();
    java.util.Spliterator<java.lang.String> spliterator_str3 = treeset_str1.spliterator();
    java.util.stream.Stream<java.lang.String> stream_str4 = treeset_str1.parallelStream();
    java.lang.String str5 = treeset_str1.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    boolean b4 = treeset_str1.isEmpty();
    boolean b6 = treeset_str1.add("[hi!]");
    java.lang.String str7 = treeset_str1.toString();
    java.lang.String str8 = treeset_str1.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[hi!]]"+ "'", str7.equals("[[hi!]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str7.tailSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<java.lang.String>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str18, str_array17);
    boolean b20 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)arraylist_str18);
    java.lang.String str21 = treeset_str15.pollLast();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str15.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str25 = treeset_str15.headSet("[[]]", false);
    boolean b26 = treeset_str7.addAll((java.util.Collection<java.lang.String>)treeset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b20 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str22.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str22.headSet("", false);
    boolean b28 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b29 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b30 = treeset_str0.equals((java.lang.Object)b29);
    java.lang.String str32 = treeset_str0.ceiling("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.stream.Stream<java.lang.String> stream_str34 = treeset_str0.parallelStream();
    java.util.TreeSet<java.lang.String> treeset_str35 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array37 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array37);
    boolean b40 = treeset_str35.retainAll((java.util.Collection<java.lang.String>)arraylist_str38);
    boolean b42 = treeset_str35.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str43 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str44 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str43);
    java.util.SortedSet<java.lang.String> sortedset_str46 = treeset_str44.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str49 = treeset_str44.headSet("", false);
    boolean b50 = treeset_str35.retainAll((java.util.Collection<java.lang.String>)navigableset_str49);
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str54 = new java.util.TreeSet<java.lang.String>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str54, str_array53);
    java.util.NavigableSet<java.lang.String> navigableset_str56 = treeset_str54.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str57 = treeset_str54.iterator();
    java.util.Iterator<java.lang.String> iterator_str58 = treeset_str54.iterator();
    boolean b59 = treeset_str35.removeAll((java.util.Collection<java.lang.String>)treeset_str54);
    java.util.Iterator<java.lang.String> iterator_str60 = treeset_str35.iterator();
    java.lang.String str62 = treeset_str35.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str63 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str35);
    int i64 = treeset_str35.size();
    java.util.SortedSet<java.lang.String> sortedset_str67 = treeset_str35.subSet("[hi!]", "hi!");
    boolean b68 = treeset_str0.containsAll((java.util.Collection<java.lang.String>)sortedset_str67);
    java.util.TreeSet<java.lang.String> treeset_str69 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array71 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str72 = new java.util.ArrayList<java.lang.String>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str72, str_array71);
    boolean b74 = treeset_str69.retainAll((java.util.Collection<java.lang.String>)arraylist_str72);
    java.lang.String str75 = treeset_str69.pollLast();
    java.util.Iterator<java.lang.String> iterator_str76 = treeset_str69.descendingIterator();
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str80 = new java.util.TreeSet<java.lang.String>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str80, str_array79);
    java.util.NavigableSet<java.lang.String> navigableset_str82 = treeset_str80.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str83 = treeset_str80.iterator();
    boolean b84 = treeset_str69.equals((java.lang.Object)iterator_str83);
    java.util.Iterator<java.lang.String> iterator_str85 = treeset_str69.iterator();
    boolean b86 = treeset_str0.containsAll((java.util.Collection<java.lang.String>)treeset_str69);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str87 = treeset_str0.first();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str1.subSet("", false, "[hi!]", false);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str1.headSet("[hi!]");
    boolean b13 = treeset_str1.add("[hi!]");
    int i14 = treeset_str1.size();
    java.util.Iterator<java.lang.String> iterator_str15 = treeset_str1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str15);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str25);
    java.util.Iterator<java.lang.String> iterator_str27 = treeset_str26.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array30 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str31, str_array30);
    boolean b33 = treeset_str28.retainAll((java.util.Collection<java.lang.String>)arraylist_str31);
    boolean b35 = treeset_str28.add("hi!");
    boolean b36 = treeset_str26.contains((java.lang.Object)"hi!");
    java.lang.String str38 = treeset_str26.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str43 = treeset_str26.subSet("[hi!]", true, "[hi!]", true);
    boolean b44 = treeset_str0.containsAll((java.util.Collection<java.lang.String>)treeset_str26);
    java.util.SortedSet<java.lang.String> sortedset_str46 = treeset_str0.tailSet("[, hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str49 = treeset_str0.tailSet("[hi!]", false);
    java.lang.String str50 = treeset_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]"+ "'", str50.equals("[]"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", true);
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str10, str_array9);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str10.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str13 = treeset_str10.iterator();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str10.removeAll((java.util.Collection<java.lang.String>)treeset_str15);
    boolean b34 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str10);
    int i35 = treeset_str10.size();
    java.util.NavigableSet<java.lang.String> navigableset_str36 = treeset_str10.descendingSet();
    java.util.Comparator<? super java.lang.String> comparator_wildcard37 = treeset_str10.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard37);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("", false);
    java.lang.String str7 = treeset_str1.pollLast();
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str1.tailSet("[, hi!]");
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str12, str_array11);
    int i14 = treeset_str12.size();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str12);
    java.lang.String str17 = treeset_str15.higher("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str15);
    java.lang.String str19 = treeset_str1.last();
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.util.Comparator<? super java.lang.String> comparator_wildcard22 = treeset_str20.comparator();
    java.util.SortedSet<java.lang.String> sortedset_str25 = treeset_str20.subSet("[hi!]", "[hi!]");
    boolean b26 = treeset_str20.isEmpty();
    boolean b27 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str20);
    java.util.Comparator<? super java.lang.String> comparator_wildcard28 = treeset_str1.comparator();
    java.lang.String str29 = treeset_str1.first();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str18);
    java.util.Iterator<java.lang.String> iterator_str20 = treeset_str19.descendingIterator();
    java.lang.String str22 = treeset_str19.higher("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str19.subSet("[]", false, "[]", false);
    java.lang.String str29 = treeset_str19.floor("[]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.lang.String str6 = treeset_str3.pollLast();
    java.lang.String str7 = treeset_str3.toString();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    boolean b13 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)arraylist_str11);
    java.lang.String str14 = treeset_str8.pollLast();
    java.util.Iterator<java.lang.String> iterator_str15 = treeset_str8.descendingIterator();
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str8.descendingIterator();
    java.lang.String str18 = treeset_str8.lower("");
    boolean b19 = treeset_str3.addAll((java.util.Collection<java.lang.String>)treeset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Spliterator<java.lang.String> spliterator_str7 = treeset_str0.spliterator();
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str0.tailSet("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    boolean b11 = treeset_str10.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = treeset_str10.first();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    treeset_str0.clear();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str3);
    java.lang.String str6 = treeset_str4.lower("");
    java.lang.String str7 = treeset_str4.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str4);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str4.subSet("[]", "[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str12);
    java.lang.String str15 = treeset_str13.lower("");
    boolean b16 = treeset_str13.isEmpty();
    boolean b17 = treeset_str4.contains((java.lang.Object)b16);
    java.lang.String str18 = treeset_str4.pollFirst();
    boolean b19 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str4);
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str20.subSet("", true, "[hi!]", true);
    java.lang.Object[] obj_array27 = treeset_str20.toArray();
    boolean b28 = treeset_str0.equals((java.lang.Object)treeset_str20);
    java.util.stream.Stream<java.lang.String> stream_str29 = treeset_str20.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str29);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.lang.String str20 = treeset_str1.higher("[, hi!]");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.util.Comparator<? super java.lang.String> comparator_wildcard22 = treeset_str1.comparator();
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str23);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str24.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array28 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<java.lang.String>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str29, str_array28);
    boolean b31 = treeset_str26.retainAll((java.util.Collection<java.lang.String>)arraylist_str29);
    boolean b33 = treeset_str26.add("hi!");
    boolean b34 = treeset_str24.contains((java.lang.Object)"hi!");
    java.lang.String str36 = treeset_str24.floor("[]");
    java.lang.String str37 = treeset_str24.toString();
    java.util.Spliterator<java.lang.String> spliterator_str38 = treeset_str24.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str41 = treeset_str24.tailSet("", false);
    java.util.TreeSet<java.lang.String> treeset_str42 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str43 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str42);
    java.util.SortedSet<java.lang.String> sortedset_str45 = treeset_str43.tailSet("");
    java.util.SortedSet<java.lang.String> sortedset_str47 = treeset_str43.headSet("[[hi!]]");
    boolean b48 = treeset_str24.equals((java.lang.Object)treeset_str43);
    java.util.NavigableSet<java.lang.String> navigableset_str51 = treeset_str43.headSet("[]", false);
    java.util.TreeSet<java.lang.String> treeset_str52 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array54 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str55 = new java.util.ArrayList<java.lang.String>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str55, str_array54);
    boolean b57 = treeset_str52.retainAll((java.util.Collection<java.lang.String>)arraylist_str55);
    boolean b59 = treeset_str52.add("hi!");
    java.lang.String str60 = treeset_str52.toString();
    java.util.Spliterator<java.lang.String> spliterator_str61 = treeset_str52.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str64 = treeset_str52.headSet("hi!", false);
    java.util.Spliterator<java.lang.String> spliterator_str65 = treeset_str52.spliterator();
    java.util.SortedSet<java.lang.String> sortedset_str67 = treeset_str52.tailSet("[]");
    boolean b68 = treeset_str43.addAll((java.util.Collection<java.lang.String>)treeset_str52);
    boolean b69 = treeset_str1.remove((java.lang.Object)b68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]"+ "'", str37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "[hi!]"+ "'", str60.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.lang.String str20 = treeset_str1.lower("[]");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array23 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str24, str_array23);
    boolean b26 = treeset_str21.retainAll((java.util.Collection<java.lang.String>)arraylist_str24);
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    boolean b32 = treeset_str27.retainAll((java.util.Collection<java.lang.String>)arraylist_str30);
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array35);
    boolean b38 = treeset_str33.retainAll((java.util.Collection<java.lang.String>)arraylist_str36);
    java.util.TreeSet<java.lang.String> treeset_str39 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array41 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<java.lang.String>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str42, str_array41);
    boolean b44 = treeset_str39.retainAll((java.util.Collection<java.lang.String>)arraylist_str42);
    java.util.TreeSet<java.lang.String> treeset_str45 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array47 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str48 = new java.util.ArrayList<java.lang.String>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str48, str_array47);
    boolean b50 = treeset_str45.retainAll((java.util.Collection<java.lang.String>)arraylist_str48);
    java.util.ArrayList[] arrayList_array52 = new java.util.ArrayList[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.lang.String>[] arraylist_str_array53 = (java.util.ArrayList<java.lang.String>[])arrayList_array52;
    arraylist_str_array53[0] = arraylist_str24;
    arraylist_str_array53[1] = arraylist_str30;
    arraylist_str_array53[2] = arraylist_str36;
    arraylist_str_array53[3] = arraylist_str42;
    arraylist_str_array53[4] = arraylist_str48;
    java.util.ArrayList<java.lang.String>[] arraylist_str_array64 = treeset_str1.toArray(arraylist_str_array53);
    java.lang.Object obj65 = treeset_str1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj65);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str0.headSet("");
    java.lang.String str9 = treeset_str0.pollLast();
    java.util.stream.Stream<java.lang.String> stream_str10 = treeset_str0.stream();
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    boolean b16 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)arraylist_str14);
    boolean b18 = treeset_str11.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str11.tailSet("hi!", true);
    java.lang.String str23 = treeset_str11.higher("[hi!]");
    java.util.SortedSet<java.lang.String> sortedset_str25 = treeset_str11.tailSet("[[]]");
    boolean b26 = treeset_str0.addAll((java.util.Collection<java.lang.String>)sortedset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.subSet("", true, "[hi!]", true);
    java.lang.Object[] obj_array7 = treeset_str0.toArray();
    boolean b8 = treeset_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.floor("[]");
    java.lang.String str14 = treeset_str1.toString();
    java.util.Spliterator<java.lang.String> spliterator_str15 = treeset_str1.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.tailSet("", false);
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    java.util.SortedSet<java.lang.String> sortedset_str22 = treeset_str20.tailSet("");
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str20.headSet("[[hi!]]");
    boolean b25 = treeset_str1.equals((java.lang.Object)treeset_str20);
    java.util.SortedSet<java.lang.String> sortedset_str28 = treeset_str20.subSet("[, hi!]", "[, hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str28);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    java.lang.String[] str_array1 = new java.lang.String[] { "" };
    java.util.TreeSet<java.lang.String> treeset_str2 = new java.util.TreeSet<java.lang.String>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str2, str_array1);
    int i4 = treeset_str2.size();
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str2);
    java.lang.String str7 = treeset_str5.higher("");
    java.util.Iterator<java.lang.String> iterator_str8 = treeset_str5.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str8);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b20 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str22.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str22.headSet("", false);
    boolean b28 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b29 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b30 = treeset_str0.equals((java.lang.Object)b29);
    java.lang.String str32 = treeset_str0.ceiling("[hi!]");
    java.util.Iterator<java.lang.String> iterator_str33 = treeset_str0.iterator();
    java.lang.String str34 = treeset_str0.pollLast();
    java.lang.String str35 = treeset_str0.pollLast();
    java.lang.Object[] obj_array36 = treeset_str0.toArray();
    java.lang.Object obj37 = treeset_str0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj37);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str18);
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str20.tailSet("[hi!]");
    java.lang.Object obj24 = treeset_str20.clone();
    boolean b25 = treeset_str19.retainAll((java.util.Collection<java.lang.String>)treeset_str20);
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.util.SortedSet<java.lang.String> sortedset_str28 = treeset_str20.headSet("[[hi!]]");
    java.lang.String str29 = treeset_str20.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Spliterator<java.lang.String> spliterator_str7 = treeset_str0.spliterator();
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str0.tailSet("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = treeset_str10.last();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    int i29 = treeset_str0.size();
    int i30 = treeset_str0.size();
    java.lang.Object obj31 = treeset_str0.clone();
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = treeset_str0.last();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str12 = treeset_str10.tailSet("");
    boolean b13 = treeset_str3.equals((java.lang.Object)treeset_str10);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str3.equals((java.lang.Object)b32);
    java.lang.String str35 = treeset_str3.ceiling("[hi!]");
    boolean b36 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str3);
    java.util.TreeSet<java.lang.String> treeset_str37 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array39 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array39);
    boolean b42 = treeset_str37.retainAll((java.util.Collection<java.lang.String>)arraylist_str40);
    java.util.stream.Stream<java.lang.String> stream_str43 = treeset_str37.parallelStream();
    java.lang.String str45 = treeset_str37.lower("");
    java.lang.String str47 = treeset_str37.higher("");
    boolean b48 = treeset_str1.containsAll((java.util.Collection<java.lang.String>)treeset_str37);
    java.lang.String str50 = treeset_str37.ceiling("[]");
    java.util.Iterator<java.lang.String> iterator_str51 = treeset_str37.descendingIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str51);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Comparator<? super java.lang.String> comparator_wildcard2 = treeset_str0.comparator();
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str0.subSet("[hi!]", "[hi!]");
    boolean b6 = treeset_str0.isEmpty();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str10, str_array9);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str10.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str13 = treeset_str10.iterator();
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str10.headSet("[hi!]");
    boolean b16 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.String str17 = treeset_str0.first();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.floor("[]");
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str1);
    java.lang.Object[] obj_array15 = treeset_str1.toArray();
    java.lang.String str17 = treeset_str1.floor("[[hi!]]");
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array20 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    boolean b23 = treeset_str18.retainAll((java.util.Collection<java.lang.String>)arraylist_str21);
    boolean b25 = treeset_str18.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str26);
    java.util.SortedSet<java.lang.String> sortedset_str29 = treeset_str27.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str32 = treeset_str27.headSet("", false);
    boolean b33 = treeset_str18.retainAll((java.util.Collection<java.lang.String>)navigableset_str32);
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str37 = new java.util.TreeSet<java.lang.String>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str37, str_array36);
    java.util.NavigableSet<java.lang.String> navigableset_str39 = treeset_str37.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str40 = treeset_str37.iterator();
    java.util.Iterator<java.lang.String> iterator_str41 = treeset_str37.iterator();
    boolean b42 = treeset_str18.removeAll((java.util.Collection<java.lang.String>)treeset_str37);
    java.util.Iterator<java.lang.String> iterator_str43 = treeset_str18.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str44 = treeset_str18.descendingSet();
    java.util.NavigableSet<java.lang.String> navigableset_str47 = treeset_str18.headSet("[]", true);
    boolean b48 = treeset_str1.removeAll((java.util.Collection<java.lang.String>)treeset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str0.descendingSet();
    java.util.Spliterator<java.lang.String> spliterator_str27 = treeset_str0.spliterator();
    java.util.SortedSet<java.lang.String> sortedset_str29 = treeset_str0.headSet("");
    java.lang.String str31 = treeset_str0.floor("[, hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str28.headSet("[hi!]", true);
    java.lang.String str32 = treeset_str28.toString();
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array35);
    boolean b38 = treeset_str33.retainAll((java.util.Collection<java.lang.String>)arraylist_str36);
    boolean b40 = treeset_str33.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str43 = treeset_str33.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str44 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str33);
    boolean b46 = treeset_str44.add("[]");
    java.lang.String str48 = treeset_str44.floor("hi!");
    java.util.TreeSet<java.lang.String> treeset_str49 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array51 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str52 = new java.util.ArrayList<java.lang.String>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str52, str_array51);
    boolean b54 = treeset_str49.retainAll((java.util.Collection<java.lang.String>)arraylist_str52);
    java.lang.String str55 = treeset_str49.pollLast();
    java.util.stream.Stream<java.lang.String> stream_str56 = treeset_str49.parallelStream();
    java.util.TreeSet<java.lang.String> treeset_str57 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str58 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str57);
    java.util.SortedSet<java.lang.String> sortedset_str60 = treeset_str57.tailSet("[hi!]");
    java.lang.Object obj61 = treeset_str57.clone();
    java.util.NavigableSet<java.lang.String> navigableset_str64 = treeset_str57.headSet("hi!", false);
    boolean b65 = treeset_str49.removeAll((java.util.Collection<java.lang.String>)navigableset_str64);
    boolean b66 = treeset_str44.containsAll((java.util.Collection<java.lang.String>)navigableset_str64);
    java.util.TreeSet<java.lang.String> treeset_str67 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array69 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str70 = new java.util.ArrayList<java.lang.String>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str70, str_array69);
    boolean b72 = treeset_str67.retainAll((java.util.Collection<java.lang.String>)arraylist_str70);
    java.util.TreeSet<java.lang.String> treeset_str73 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str74 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str73);
    java.util.SortedSet<java.lang.String> sortedset_str76 = treeset_str74.tailSet("");
    boolean b77 = treeset_str67.equals((java.lang.Object)treeset_str74);
    java.util.stream.Stream<java.lang.String> stream_str78 = treeset_str67.stream();
    java.util.TreeSet<java.lang.String> treeset_str79 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str80 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str79);
    java.lang.String str82 = treeset_str80.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str85 = treeset_str80.headSet("hi!", true);
    boolean b86 = treeset_str80.isEmpty();
    java.util.SortedSet<java.lang.String> sortedset_str88 = treeset_str80.headSet("[hi!]");
    boolean b89 = treeset_str67.retainAll((java.util.Collection<java.lang.String>)treeset_str80);
    boolean b90 = treeset_str44.removeAll((java.util.Collection<java.lang.String>)treeset_str67);
    boolean b91 = treeset_str28.remove((java.lang.Object)b90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!"+ "'", str48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    java.util.TreeSet<java.lang.String> treeset_str29 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str30 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str29);
    java.util.TreeSet<java.lang.String> treeset_str31 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array33 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str34 = new java.util.ArrayList<java.lang.String>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str34, str_array33);
    boolean b36 = treeset_str31.retainAll((java.util.Collection<java.lang.String>)arraylist_str34);
    boolean b38 = treeset_str31.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str39 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str40 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str39);
    java.util.SortedSet<java.lang.String> sortedset_str42 = treeset_str40.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str45 = treeset_str40.headSet("", false);
    boolean b46 = treeset_str31.retainAll((java.util.Collection<java.lang.String>)navigableset_str45);
    boolean b47 = treeset_str30.retainAll((java.util.Collection<java.lang.String>)navigableset_str45);
    boolean b48 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str30);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str49 = treeset_str0.first();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.floor("[]");
    java.lang.String str14 = treeset_str1.toString();
    java.util.Spliterator<java.lang.String> spliterator_str15 = treeset_str1.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.tailSet("", false);
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    java.util.SortedSet<java.lang.String> sortedset_str22 = treeset_str20.tailSet("");
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str20.headSet("[[hi!]]");
    boolean b25 = treeset_str1.equals((java.lang.Object)treeset_str20);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = treeset_str1.first();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.lang.String str20 = treeset_str1.lower("[]");
    int i21 = treeset_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array6);
    boolean b9 = treeset_str4.retainAll((java.util.Collection<java.lang.String>)arraylist_str7);
    boolean b10 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str4);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str1.headSet("", false);
    java.lang.String str14 = treeset_str1.pollFirst();
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.lang.String> navigableset_str19 = treeset_str1.subSet("[hi!]", false, "", true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.lang.String str8 = treeset_str0.toString();
    java.util.Spliterator<java.lang.String> spliterator_str9 = treeset_str0.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", false);
    java.lang.String str14 = treeset_str0.floor("[[hi!]]");
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str15);
    java.util.SortedSet<java.lang.String> sortedset_str18 = treeset_str16.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>(sortedset_str18);
    boolean b20 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.lang.String str21 = treeset_str0.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str22);
    java.lang.String str25 = treeset_str23.lower("");
    java.lang.String str26 = treeset_str23.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str23);
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str23.subSet("[]", "[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str31 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str31);
    java.lang.String str34 = treeset_str32.lower("");
    boolean b35 = treeset_str32.isEmpty();
    boolean b36 = treeset_str23.contains((java.lang.Object)b35);
    java.util.TreeSet<java.lang.String> treeset_str37 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str23);
    java.util.NavigableSet<java.lang.String> navigableset_str38 = treeset_str23.descendingSet();
    boolean b39 = treeset_str0.addAll((java.util.Collection<java.lang.String>)navigableset_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str1.subSet("", false, "[hi!]", false);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str1.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str15, str_array14);
    boolean b17 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)arraylist_str15);
    java.lang.String str18 = treeset_str12.pollLast();
    boolean b19 = treeset_str1.containsAll((java.util.Collection<java.lang.String>)treeset_str12);
    java.util.SortedSet<java.lang.String> sortedset_str21 = treeset_str12.headSet("[[hi!]]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str21);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str11, str_array10);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str11.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str14 = treeset_str11.iterator();
    boolean b15 = treeset_str0.equals((java.lang.Object)iterator_str14);
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str0.headSet("", true);
    java.lang.String str19 = treeset_str0.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.subSet("[hi!]", true, "hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.lang.String str17 = treeset_str15.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str20 = treeset_str15.headSet("hi!", true);
    boolean b21 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str15);
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str0.headSet("[[hi!]]");
    java.util.SortedSet<java.lang.String> sortedset_str25 = treeset_str0.tailSet("[[]]");
    java.util.Comparator<? super java.lang.String> comparator_wildcard26 = treeset_str0.comparator();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = treeset_str0.last();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard26);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str1.tailSet("");
    java.util.stream.Stream<java.lang.String> stream_str16 = treeset_str1.stream();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array20 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    boolean b23 = treeset_str18.retainAll((java.util.Collection<java.lang.String>)arraylist_str21);
    java.util.stream.Stream<java.lang.String> stream_str24 = treeset_str18.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str26 = treeset_str18.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str18.subSet("[hi!]", true, "hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str32);
    java.lang.String str35 = treeset_str33.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str38 = treeset_str33.headSet("hi!", true);
    boolean b39 = treeset_str18.removeAll((java.util.Collection<java.lang.String>)treeset_str33);
    java.util.stream.Stream<java.lang.String> stream_str40 = treeset_str18.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str43 = treeset_str18.subSet("[]", "[]");
    boolean b44 = treeset_str17.contains((java.lang.Object)"[]");
    int i45 = treeset_str17.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    boolean b13 = treeset_str0.add("[]");
    java.lang.String[] str_array18 = new java.lang.String[] { "[, hi!]", "[]", "[hi!]", "hi!" };
    java.lang.String[] str_array23 = new java.lang.String[] { "[, hi!]", "[]", "[hi!]", "hi!" };
    java.lang.String[] str_array28 = new java.lang.String[] { "[, hi!]", "[]", "[hi!]", "hi!" };
    java.lang.Comparable[][] comparable_array_array30 = new java.lang.Comparable[ 3 ][];
    @SuppressWarnings("unchecked")
    java.lang.Comparable<java.lang.String>[][] comparable_str_array_array31 = (java.lang.Comparable<java.lang.String>[][])comparable_array_array30;
    comparable_str_array_array31[0] = str_array18;
    comparable_str_array_array31[1] = str_array23;
    comparable_str_array_array31[2] = str_array28;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String>[][] comparable_str_array_array38 = treeset_str0.toArray(comparable_str_array_array31);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_array_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_str_array_array31);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>(sortedset_str3);
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str5);
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str6.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    boolean b13 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)arraylist_str11);
    boolean b15 = treeset_str8.add("hi!");
    boolean b16 = treeset_str6.contains((java.lang.Object)"hi!");
    java.lang.String str18 = treeset_str6.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str6.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str6.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str6.descendingSet();
    boolean b24 = treeset_str4.equals((java.lang.Object)navigableset_str23);
    int i25 = treeset_str4.size();
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.lang.String> sortedset_str28 = treeset_str4.subSet("hi!", "[, hi!]");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.descendingSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str1.subSet("", false, "[hi!]", false);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str1.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str15, str_array14);
    boolean b17 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)arraylist_str15);
    java.lang.String str18 = treeset_str12.pollLast();
    boolean b19 = treeset_str1.containsAll((java.util.Collection<java.lang.String>)treeset_str12);
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str21.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array26 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str27, str_array26);
    boolean b29 = treeset_str24.retainAll((java.util.Collection<java.lang.String>)arraylist_str27);
    boolean b30 = treeset_str21.retainAll((java.util.Collection<java.lang.String>)treeset_str24);
    java.lang.String str32 = treeset_str24.higher("");
    java.util.SortedSet<java.lang.String> sortedset_str35 = treeset_str24.subSet("", "hi!");
    boolean b36 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str24);
    java.lang.String str38 = treeset_str1.floor("[[]]");
    java.util.stream.Stream<java.lang.String> stream_str39 = treeset_str1.stream();
    java.lang.String str40 = treeset_str1.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str3.iterator();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    boolean b14 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)arraylist_str12);
    boolean b16 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str18.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str18.headSet("", false);
    boolean b24 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b25 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b26 = treeset_str3.removeAll((java.util.Collection<java.lang.String>)treeset_str8);
    java.lang.String str27 = treeset_str3.first();
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array30 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str31, str_array30);
    boolean b33 = treeset_str28.retainAll((java.util.Collection<java.lang.String>)arraylist_str31);
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str35 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str34);
    java.util.SortedSet<java.lang.String> sortedset_str37 = treeset_str35.tailSet("");
    boolean b38 = treeset_str28.equals((java.lang.Object)treeset_str35);
    java.util.TreeSet<java.lang.String> treeset_str39 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str40 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str39);
    java.util.TreeSet<java.lang.String> treeset_str41 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array43 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str44, str_array43);
    boolean b46 = treeset_str41.retainAll((java.util.Collection<java.lang.String>)arraylist_str44);
    boolean b48 = treeset_str41.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str49 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str50 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str49);
    java.util.SortedSet<java.lang.String> sortedset_str52 = treeset_str50.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str55 = treeset_str50.headSet("", false);
    boolean b56 = treeset_str41.retainAll((java.util.Collection<java.lang.String>)navigableset_str55);
    boolean b57 = treeset_str40.retainAll((java.util.Collection<java.lang.String>)navigableset_str55);
    boolean b58 = treeset_str28.equals((java.lang.Object)b57);
    boolean b60 = treeset_str28.add("[]");
    java.lang.String str61 = treeset_str28.toString();
    treeset_str28.clear();
    // The following exception was thrown during execution in test generation
    try {
    boolean b63 = treeset_str3.remove((java.lang.Object)treeset_str28);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "[[]]"+ "'", str61.equals("[[]]"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", true);
    java.util.stream.Stream<java.lang.String> stream_str7 = treeset_str1.stream();
    java.lang.String str8 = treeset_str1.pollFirst();
    boolean b9 = treeset_str1.isEmpty();
    boolean b11 = treeset_str1.remove((java.lang.Object)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.Iterator<java.lang.String> iterator_str11 = treeset_str0.iterator();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str15, str_array14);
    boolean b17 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)arraylist_str15);
    java.lang.String str18 = treeset_str12.pollLast();
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str12.descendingIterator();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str23, str_array22);
    java.util.NavigableSet<java.lang.String> navigableset_str25 = treeset_str23.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str26 = treeset_str23.iterator();
    boolean b27 = treeset_str12.equals((java.lang.Object)iterator_str26);
    java.util.Iterator<java.lang.String> iterator_str28 = treeset_str12.iterator();
    java.lang.String str30 = treeset_str12.floor("hi!");
    boolean b31 = treeset_str0.remove((java.lang.Object)"hi!");
    java.util.stream.Stream<java.lang.String> stream_str32 = treeset_str0.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str32);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Comparator<? super java.lang.String> comparator_wildcard2 = treeset_str0.comparator();
    java.util.SortedSet<java.lang.String> sortedset_str5 = treeset_str0.subSet("[hi!]", "[hi!]");
    boolean b6 = treeset_str0.isEmpty();
    treeset_str0.clear();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.Iterator<java.lang.String> iterator_str10 = treeset_str9.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    boolean b16 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)arraylist_str14);
    boolean b18 = treeset_str11.add("hi!");
    boolean b19 = treeset_str9.contains((java.lang.Object)"hi!");
    java.lang.String str21 = treeset_str9.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str24 = treeset_str9.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str9.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str9.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)navigableset_str26);
    boolean b28 = treeset_str0.equals((java.lang.Object)navigableset_str26);
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str0.headSet("[, hi!]");
    java.util.Iterator<java.lang.String> iterator_str31 = treeset_str0.descendingIterator();
    java.lang.String str33 = treeset_str0.lower("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str32, str_array31);
    java.util.NavigableSet<java.lang.String> navigableset_str34 = treeset_str32.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str35 = treeset_str32.iterator();
    java.util.TreeSet<java.lang.String> treeset_str36 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str37 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str36);
    java.util.TreeSet<java.lang.String> treeset_str38 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array40 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str41, str_array40);
    boolean b43 = treeset_str38.retainAll((java.util.Collection<java.lang.String>)arraylist_str41);
    boolean b45 = treeset_str38.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str46 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str47 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str46);
    java.util.SortedSet<java.lang.String> sortedset_str49 = treeset_str47.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str52 = treeset_str47.headSet("", false);
    boolean b53 = treeset_str38.retainAll((java.util.Collection<java.lang.String>)navigableset_str52);
    boolean b54 = treeset_str37.retainAll((java.util.Collection<java.lang.String>)navigableset_str52);
    boolean b55 = treeset_str32.removeAll((java.util.Collection<java.lang.String>)treeset_str37);
    boolean b57 = treeset_str37.add("[hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str60 = treeset_str37.headSet("", false);
    java.util.TreeSet<java.lang.String> treeset_str61 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array63 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str64 = new java.util.ArrayList<java.lang.String>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str64, str_array63);
    boolean b66 = treeset_str61.retainAll((java.util.Collection<java.lang.String>)arraylist_str64);
    java.util.stream.Stream<java.lang.String> stream_str67 = treeset_str61.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str69 = treeset_str61.headSet("");
    boolean b70 = treeset_str37.removeAll((java.util.Collection<java.lang.String>)treeset_str61);
    java.lang.Object obj71 = treeset_str37.clone();
    boolean b72 = treeset_str28.removeAll((java.util.Collection<java.lang.String>)treeset_str37);
    java.util.NavigableSet<java.lang.String> navigableset_str75 = treeset_str37.tailSet("hi!", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str75);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str0.tailSet("[hi!]");
    java.lang.Object obj4 = treeset_str0.clone();
    java.util.Spliterator<java.lang.String> spliterator_str5 = treeset_str0.spliterator();
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    boolean b11 = treeset_str6.retainAll((java.util.Collection<java.lang.String>)arraylist_str9);
    java.util.stream.Stream<java.lang.String> stream_str12 = treeset_str6.parallelStream();
    java.lang.String str14 = treeset_str6.lower("");
    java.lang.String str16 = treeset_str6.higher("");
    java.lang.String str17 = treeset_str6.toString();
    java.util.NavigableSet<java.lang.String> navigableset_str20 = treeset_str6.tailSet("[]", true);
    boolean b21 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str0.descendingIterator();
    java.lang.Object[] obj_array17 = treeset_str0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Spliterator<java.lang.String> spliterator_str7 = treeset_str0.spliterator();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.lang.String str13 = treeset_str9.higher("");
    boolean b14 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str0.tailSet("");
    java.util.Comparator<? super java.lang.String> comparator_wildcard17 = treeset_str0.comparator();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str21, str_array20);
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str21.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str24 = treeset_str21.iterator();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str25);
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    boolean b32 = treeset_str27.retainAll((java.util.Collection<java.lang.String>)arraylist_str30);
    boolean b34 = treeset_str27.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str35 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str36 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str35);
    java.util.SortedSet<java.lang.String> sortedset_str38 = treeset_str36.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str41 = treeset_str36.headSet("", false);
    boolean b42 = treeset_str27.retainAll((java.util.Collection<java.lang.String>)navigableset_str41);
    boolean b43 = treeset_str26.retainAll((java.util.Collection<java.lang.String>)navigableset_str41);
    boolean b44 = treeset_str21.removeAll((java.util.Collection<java.lang.String>)treeset_str26);
    java.util.SortedSet<java.lang.String> sortedset_str46 = treeset_str26.tailSet("hi!");
    java.util.TreeSet<java.lang.String> treeset_str47 = new java.util.TreeSet<java.lang.String>(sortedset_str46);
    treeset_str47.clear();
    java.lang.String str50 = treeset_str47.floor("[[hi!]]");
    boolean b51 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str47);
    // The following exception was thrown during execution in test generation
    try {
    java.util.SortedSet<java.lang.String> sortedset_str54 = treeset_str47.subSet("[[hi!]]", "[, hi!]");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str4 = treeset_str0.headSet("[]", true);
    java.util.SortedSet<java.lang.String> sortedset_str6 = treeset_str0.tailSet("hi!");
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str7);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str8.subSet("hi!", "hi!");
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str8);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str13);
    java.util.NavigableSet<java.lang.String> navigableset_str19 = treeset_str13.subSet("", true, "[hi!]", true);
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str21.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array26 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str27, str_array26);
    boolean b29 = treeset_str24.retainAll((java.util.Collection<java.lang.String>)arraylist_str27);
    boolean b30 = treeset_str21.retainAll((java.util.Collection<java.lang.String>)treeset_str24);
    java.util.NavigableSet<java.lang.String> navigableset_str33 = treeset_str21.headSet("", false);
    boolean b34 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)treeset_str21);
    boolean b35 = treeset_str8.removeAll((java.util.Collection<java.lang.String>)treeset_str13);
    boolean b36 = treeset_str0.equals((java.lang.Object)b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    boolean b12 = treeset_str7.add("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str13);
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str14.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    boolean b23 = treeset_str14.retainAll((java.util.Collection<java.lang.String>)treeset_str17);
    java.lang.String str25 = treeset_str17.higher("");
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array28 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<java.lang.String>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str29, str_array28);
    boolean b31 = treeset_str26.retainAll((java.util.Collection<java.lang.String>)arraylist_str29);
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str26);
    boolean b33 = treeset_str17.removeAll((java.util.Collection<java.lang.String>)treeset_str26);
    java.util.SortedSet<java.lang.String> sortedset_str36 = treeset_str17.subSet("[]", "[]");
    boolean b37 = treeset_str7.retainAll((java.util.Collection<java.lang.String>)sortedset_str36);
    java.lang.Object[] obj_array38 = treeset_str7.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.subSet("", true, "[hi!]", true);
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.headSet("[hi!]", false);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.headSet("[, hi!]", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str0.headSet("");
    java.lang.String str9 = treeset_str0.pollLast();
    java.util.stream.Stream<java.lang.String> stream_str10 = treeset_str0.stream();
    java.lang.String str12 = treeset_str0.ceiling("[, hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.lang.String str20 = treeset_str1.lower("[]");
    java.lang.String str21 = treeset_str1.pollFirst();
    java.lang.String str23 = treeset_str1.lower("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array26 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str27, str_array26);
    boolean b29 = treeset_str24.retainAll((java.util.Collection<java.lang.String>)arraylist_str27);
    java.util.stream.Stream<java.lang.String> stream_str30 = treeset_str24.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str32 = treeset_str24.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str33);
    java.util.NavigableSet<java.lang.String> navigableset_str39 = treeset_str33.subSet("", true, "[hi!]", true);
    java.util.NavigableSet<java.lang.String> navigableset_str44 = treeset_str33.subSet("", false, "hi!", false);
    java.lang.String str46 = treeset_str33.ceiling("");
    boolean b47 = treeset_str24.containsAll((java.util.Collection<java.lang.String>)treeset_str33);
    boolean b48 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str1.subSet("", false, "[hi!]", false);
    boolean b10 = treeset_str1.isEmpty();
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str1.tailSet("", true);
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.subSet("[[hi!]]", true, "[hi!]", true);
    java.lang.String str19 = treeset_str1.pollLast();
    java.lang.String str21 = treeset_str1.higher("[[hi!]]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", true);
    java.util.stream.Stream<java.lang.String> stream_str7 = treeset_str1.stream();
    java.lang.String str8 = treeset_str1.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = treeset_str1.last();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str1);
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str1.subSet("[]", "[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.lang.String str12 = treeset_str10.lower("");
    boolean b13 = treeset_str10.isEmpty();
    boolean b14 = treeset_str1.contains((java.lang.Object)b13);
    java.util.stream.Stream<java.lang.String> stream_str15 = treeset_str1.parallelStream();
    java.lang.String str17 = treeset_str1.ceiling("[hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array6);
    boolean b9 = treeset_str4.retainAll((java.util.Collection<java.lang.String>)arraylist_str7);
    boolean b10 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str4);
    java.lang.String str12 = treeset_str1.higher("");
    java.lang.Object obj13 = treeset_str1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.lang.String str8 = treeset_str0.lower("");
    java.lang.String str10 = treeset_str0.higher("");
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    boolean b16 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)arraylist_str14);
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    boolean b28 = treeset_str23.retainAll((java.util.Collection<java.lang.String>)arraylist_str26);
    java.util.TreeSet<java.lang.String> treeset_str29 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array31 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    boolean b34 = treeset_str29.retainAll((java.util.Collection<java.lang.String>)arraylist_str32);
    java.util.ArrayList[] arrayList_array36 = new java.util.ArrayList[ 4 ];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.lang.String>[] arraylist_str_array37 = (java.util.ArrayList<java.lang.String>[])arrayList_array36;
    arraylist_str_array37[0] = arraylist_str14;
    arraylist_str_array37[1] = arraylist_str20;
    arraylist_str_array37[2] = arraylist_str26;
    arraylist_str_array37[3] = arraylist_str32;
    java.util.TreeSet<java.lang.String> treeset_str46 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array48 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str49 = new java.util.ArrayList<java.lang.String>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str49, str_array48);
    boolean b51 = treeset_str46.retainAll((java.util.Collection<java.lang.String>)arraylist_str49);
    java.util.TreeSet<java.lang.String> treeset_str52 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array54 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str55 = new java.util.ArrayList<java.lang.String>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str55, str_array54);
    boolean b57 = treeset_str52.retainAll((java.util.Collection<java.lang.String>)arraylist_str55);
    java.util.TreeSet<java.lang.String> treeset_str58 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array60 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str61 = new java.util.ArrayList<java.lang.String>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str61, str_array60);
    boolean b63 = treeset_str58.retainAll((java.util.Collection<java.lang.String>)arraylist_str61);
    java.util.TreeSet<java.lang.String> treeset_str64 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array66 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str67 = new java.util.ArrayList<java.lang.String>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str67, str_array66);
    boolean b69 = treeset_str64.retainAll((java.util.Collection<java.lang.String>)arraylist_str67);
    java.util.ArrayList[] arrayList_array71 = new java.util.ArrayList[ 4 ];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.lang.String>[] arraylist_str_array72 = (java.util.ArrayList<java.lang.String>[])arrayList_array71;
    arraylist_str_array72[0] = arraylist_str49;
    arraylist_str_array72[1] = arraylist_str55;
    arraylist_str_array72[2] = arraylist_str61;
    arraylist_str_array72[3] = arraylist_str67;
    java.util.ArrayList[][] arrayList_array_array82 = new java.util.ArrayList[ 2 ][];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.lang.String>[][] arraylist_str_array_array83 = (java.util.ArrayList<java.lang.String>[][])arrayList_array_array82;
    arraylist_str_array_array83[0] = arraylist_str_array37;
    arraylist_str_array_array83[1] = arraylist_str_array72;
    java.util.ArrayList<java.lang.String>[][] arraylist_str_array_array88 = treeset_str0.toArray(arraylist_str_array_array83);
    java.lang.String str90 = treeset_str0.floor("[hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str91 = treeset_str0.descendingSet();
    treeset_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str91);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str4 = treeset_str1.subSet("hi!", "hi!");
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.util.SortedSet<java.lang.String> sortedset_str7 = treeset_str1.headSet("[, hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str7);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str0.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.NavigableSet<java.lang.String> navigableset_str15 = treeset_str9.subSet("", true, "[hi!]", true);
    java.util.NavigableSet<java.lang.String> navigableset_str20 = treeset_str9.subSet("", false, "hi!", false);
    java.lang.String str22 = treeset_str9.ceiling("");
    boolean b23 = treeset_str0.containsAll((java.util.Collection<java.lang.String>)treeset_str9);
    java.util.Iterator<java.lang.String> iterator_str24 = treeset_str0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str24);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", true);
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str10, str_array9);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str10.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str13 = treeset_str10.iterator();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str10.removeAll((java.util.Collection<java.lang.String>)treeset_str15);
    boolean b34 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.lang.String str35 = treeset_str10.toString();
    java.util.TreeSet<java.lang.String> treeset_str36 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array38 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str39 = new java.util.ArrayList<java.lang.String>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str39, str_array38);
    boolean b41 = treeset_str36.retainAll((java.util.Collection<java.lang.String>)arraylist_str39);
    boolean b43 = treeset_str36.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str46 = treeset_str36.tailSet("hi!", true);
    java.util.NavigableSet<java.lang.String> navigableset_str49 = treeset_str36.tailSet("[]", true);
    java.util.TreeSet<java.lang.String> treeset_str50 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str51 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str50);
    java.util.Iterator<java.lang.String> iterator_str52 = treeset_str51.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str53 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array55 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str56 = new java.util.ArrayList<java.lang.String>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str56, str_array55);
    boolean b58 = treeset_str53.retainAll((java.util.Collection<java.lang.String>)arraylist_str56);
    boolean b60 = treeset_str53.add("hi!");
    boolean b61 = treeset_str51.contains((java.lang.Object)"hi!");
    java.lang.String str63 = treeset_str51.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str66 = treeset_str51.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str67 = treeset_str51.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str68 = treeset_str51.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str69 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)navigableset_str68);
    java.lang.Object obj70 = treeset_str69.clone();
    java.lang.Object[] obj_array71 = treeset_str69.toArray();
    boolean b72 = treeset_str36.retainAll((java.util.Collection<java.lang.String>)treeset_str69);
    java.lang.String str74 = treeset_str36.higher("hi!");
    java.util.Spliterator<java.lang.String> spliterator_str75 = treeset_str36.spliterator();
    boolean b76 = treeset_str10.retainAll((java.util.Collection<java.lang.String>)treeset_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[, hi!]"+ "'", str35.equals("[, hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.tailSet("[]", true);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str15.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    boolean b24 = treeset_str17.add("hi!");
    boolean b25 = treeset_str15.contains((java.lang.Object)"hi!");
    java.lang.String str27 = treeset_str15.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str15.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str31 = treeset_str15.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str32 = treeset_str15.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)navigableset_str32);
    java.lang.Object obj34 = treeset_str33.clone();
    java.lang.Object[] obj_array35 = treeset_str33.toArray();
    boolean b36 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str33);
    java.lang.String str38 = treeset_str0.higher("hi!");
    treeset_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.subSet("[hi!]", true, "hi!", false);
    int i14 = treeset_str0.size();
    java.util.Iterator<java.lang.String> iterator_str15 = treeset_str0.descendingIterator();
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str0.descendingIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str1.subSet("", false, "[hi!]", false);
    java.util.Iterator<java.lang.String> iterator_str10 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.Iterator<java.lang.String> iterator_str13 = treeset_str12.iterator();
    java.util.Iterator<java.lang.String> iterator_str14 = treeset_str12.iterator();
    boolean b15 = treeset_str1.containsAll((java.util.Collection<java.lang.String>)treeset_str12);
    boolean b17 = treeset_str12.add("[hi!]");
    java.util.SortedSet<java.lang.String> sortedset_str19 = treeset_str12.tailSet("[hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str19);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.subSet("", true, "[hi!]", true);
    java.lang.Object obj7 = treeset_str0.clone();
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str0.headSet("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.descendingSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.floor("[]");
    java.lang.String str14 = treeset_str1.toString();
    java.util.Spliterator<java.lang.String> spliterator_str15 = treeset_str1.spliterator();
    boolean b17 = treeset_str1.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str22 = treeset_str1.subSet("hi!", false, "hi!", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str22);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    boolean b13 = treeset_str11.add("[]");
    boolean b15 = treeset_str11.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str16.tailSet("hi!", true);
    java.util.NavigableSet<java.lang.String> navigableset_str29 = treeset_str16.tailSet("[]", true);
    java.util.TreeSet<java.lang.String> treeset_str30 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str31 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str30);
    java.util.Iterator<java.lang.String> iterator_str32 = treeset_str31.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array35);
    boolean b38 = treeset_str33.retainAll((java.util.Collection<java.lang.String>)arraylist_str36);
    boolean b40 = treeset_str33.add("hi!");
    boolean b41 = treeset_str31.contains((java.lang.Object)"hi!");
    java.lang.String str43 = treeset_str31.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str46 = treeset_str31.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str47 = treeset_str31.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str48 = treeset_str31.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str49 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)navigableset_str48);
    java.lang.Object obj50 = treeset_str49.clone();
    java.lang.Object[] obj_array51 = treeset_str49.toArray();
    boolean b52 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)treeset_str49);
    java.lang.String str54 = treeset_str16.higher("hi!");
    boolean b55 = treeset_str11.equals((java.lang.Object)treeset_str16);
    java.util.TreeSet<java.lang.String> treeset_str56 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str16);
    int i57 = treeset_str16.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", true);
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str10, str_array9);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str10.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str13 = treeset_str10.iterator();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str10.removeAll((java.util.Collection<java.lang.String>)treeset_str15);
    boolean b34 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str10);
    int i35 = treeset_str10.size();
    java.util.NavigableSet<java.lang.String> navigableset_str36 = treeset_str10.descendingSet();
    java.util.stream.Stream<java.lang.String> stream_str37 = treeset_str10.parallelStream();
    java.lang.String str39 = treeset_str10.floor("[]");
    java.util.TreeSet<java.lang.String> treeset_str40 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str41 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str40);
    java.util.Iterator<java.lang.String> iterator_str42 = treeset_str41.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str43 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array45 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str46 = new java.util.ArrayList<java.lang.String>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str46, str_array45);
    boolean b48 = treeset_str43.retainAll((java.util.Collection<java.lang.String>)arraylist_str46);
    boolean b50 = treeset_str43.add("hi!");
    boolean b51 = treeset_str41.contains((java.lang.Object)"hi!");
    java.lang.String str53 = treeset_str41.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str55 = treeset_str41.headSet("[hi!]");
    boolean b56 = treeset_str10.containsAll((java.util.Collection<java.lang.String>)treeset_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("", false);
    java.lang.String str7 = treeset_str1.pollLast();
    boolean b8 = treeset_str1.isEmpty();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str12 = treeset_str10.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b19 = treeset_str10.retainAll((java.util.Collection<java.lang.String>)treeset_str13);
    java.util.NavigableSet<java.lang.String> navigableset_str22 = treeset_str10.headSet("", false);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str10.tailSet("");
    boolean b25 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str10);
    treeset_str10.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str10.descendingSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array6);
    boolean b9 = treeset_str4.retainAll((java.util.Collection<java.lang.String>)arraylist_str7);
    boolean b10 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str4);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str1.headSet("", false);
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str1.tailSet("");
    boolean b17 = treeset_str1.add("[]");
    java.lang.String str19 = treeset_str1.higher("[, hi!]");
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.lang.String str23 = treeset_str21.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str21.headSet("hi!", true);
    treeset_str21.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str21.headSet("hi!", true);
    treeset_str21.clear();
    java.util.Spliterator<java.lang.String> spliterator_str32 = treeset_str21.spliterator();
    boolean b33 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.lang.String str8 = treeset_str0.toString();
    java.util.Spliterator<java.lang.String> spliterator_str9 = treeset_str0.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", false);
    java.util.Spliterator<java.lang.String> spliterator_str13 = treeset_str0.spliterator();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.SortedSet<java.lang.String> sortedset_str17 = treeset_str15.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str20 = treeset_str15.headSet("", false);
    int i21 = treeset_str15.size();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str15);
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str23);
    java.lang.String str26 = treeset_str24.lower("");
    java.lang.String str27 = treeset_str24.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str32 = treeset_str24.subSet("", false, "[hi!]", false);
    boolean b33 = treeset_str24.isEmpty();
    java.util.Spliterator<java.lang.String> spliterator_str34 = treeset_str24.spliterator();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.Comparable<java.lang.String>[] comparable_str_array37 = treeset_str24.toArray((java.lang.Comparable<java.lang.String>[])str_array36);
    java.lang.Comparable<java.lang.String>[] comparable_str_array38 = treeset_str22.toArray((java.lang.Comparable<java.lang.String>[])str_array36);
    // The following exception was thrown during execution in test generation
    try {
    boolean b39 = treeset_str0.contains((java.lang.Object)treeset_str22);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_str_array38);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b20 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str22.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str22.headSet("", false);
    boolean b28 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b29 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b30 = treeset_str0.equals((java.lang.Object)b29);
    java.lang.String str32 = treeset_str0.ceiling("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    boolean b34 = treeset_str0.isEmpty();
    java.lang.String str36 = treeset_str0.ceiling("hi!");
    treeset_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str38 = treeset_str0.first();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str1.tailSet("");
    java.util.stream.Stream<java.lang.String> stream_str16 = treeset_str1.stream();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.lang.Object[] obj_array19 = treeset_str17.toArray();
    java.lang.String str20 = treeset_str17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b20 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str22.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str22.headSet("", false);
    boolean b28 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b29 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b30 = treeset_str0.equals((java.lang.Object)b29);
    boolean b32 = treeset_str0.add("[]");
    java.util.Comparator<? super java.lang.String> comparator_wildcard33 = treeset_str0.comparator();
    java.util.Comparator<? super java.lang.String> comparator_wildcard34 = treeset_str0.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard34);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.stream.Stream<java.lang.String> stream_str11 = treeset_str0.stream();
    boolean b13 = treeset_str0.add("[]");
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.SortedSet<java.lang.String> sortedset_str17 = treeset_str15.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array20 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    boolean b23 = treeset_str18.retainAll((java.util.Collection<java.lang.String>)arraylist_str21);
    boolean b24 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)treeset_str18);
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.util.AbstractSet[] abstractSet_array27 = new java.util.AbstractSet[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.AbstractSet<java.lang.String>[] abstractset_str_array28 = (java.util.AbstractSet<java.lang.String>[])abstractSet_array27;
    abstractset_str_array28[0] = treeset_str25;
    java.util.AbstractSet<java.lang.String>[] abstractset_str_array31 = treeset_str18.toArray(abstractset_str_array28);
    java.util.NavigableSet<java.lang.String> navigableset_str34 = treeset_str18.tailSet("", true);
    boolean b35 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str18);
    java.util.SortedSet<java.lang.String> sortedset_str37 = treeset_str18.headSet("[]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractSet_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractset_str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractset_str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str37);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", true);
    boolean b7 = treeset_str1.isEmpty();
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str1.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str10);
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str10.subSet("", true, "[hi!]", true);
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str18.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array23 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str24, str_array23);
    boolean b26 = treeset_str21.retainAll((java.util.Collection<java.lang.String>)arraylist_str24);
    boolean b27 = treeset_str18.retainAll((java.util.Collection<java.lang.String>)treeset_str21);
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str18.headSet("", false);
    boolean b31 = treeset_str10.retainAll((java.util.Collection<java.lang.String>)treeset_str18);
    java.lang.String str32 = treeset_str18.pollFirst();
    boolean b33 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str18);
    java.util.SortedSet<java.lang.String> sortedset_str35 = treeset_str1.tailSet("[hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str35);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.stream.Stream<java.lang.String> stream_str11 = treeset_str0.stream();
    java.util.Iterator<java.lang.String> iterator_str12 = treeset_str0.descendingIterator();
    java.lang.Object[] obj_array13 = treeset_str0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String str16 = treeset_str0.pollLast();
    java.util.NavigableSet<java.lang.String> navigableset_str19 = treeset_str0.tailSet("", true);
    java.lang.String str21 = treeset_str0.ceiling("[, hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str12 = treeset_str10.tailSet("");
    boolean b13 = treeset_str3.equals((java.lang.Object)treeset_str10);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str3.equals((java.lang.Object)b32);
    java.lang.String str35 = treeset_str3.ceiling("[hi!]");
    boolean b36 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str3);
    java.lang.String str38 = treeset_str1.floor("[]");
    java.util.Comparator<? super java.lang.String> comparator_wildcard39 = treeset_str1.comparator();
    java.lang.String str41 = treeset_str1.floor("[[]]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str1.subSet("", false, "[hi!]", false);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str1.headSet("[hi!]");
    java.util.stream.Stream<java.lang.String> stream_str12 = sortedset_str11.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str12);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str0.iterator();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = treeset_str0.first();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    treeset_str1.clear();
    int i15 = treeset_str1.size();
    boolean b17 = treeset_str1.add("[, hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.lang.String str8 = treeset_str0.lower("");
    java.lang.String str10 = treeset_str0.higher("");
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    boolean b16 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)arraylist_str14);
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    boolean b28 = treeset_str23.retainAll((java.util.Collection<java.lang.String>)arraylist_str26);
    java.util.TreeSet<java.lang.String> treeset_str29 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array31 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    boolean b34 = treeset_str29.retainAll((java.util.Collection<java.lang.String>)arraylist_str32);
    java.util.ArrayList[] arrayList_array36 = new java.util.ArrayList[ 4 ];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.lang.String>[] arraylist_str_array37 = (java.util.ArrayList<java.lang.String>[])arrayList_array36;
    arraylist_str_array37[0] = arraylist_str14;
    arraylist_str_array37[1] = arraylist_str20;
    arraylist_str_array37[2] = arraylist_str26;
    arraylist_str_array37[3] = arraylist_str32;
    java.util.TreeSet<java.lang.String> treeset_str46 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array48 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str49 = new java.util.ArrayList<java.lang.String>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str49, str_array48);
    boolean b51 = treeset_str46.retainAll((java.util.Collection<java.lang.String>)arraylist_str49);
    java.util.TreeSet<java.lang.String> treeset_str52 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array54 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str55 = new java.util.ArrayList<java.lang.String>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str55, str_array54);
    boolean b57 = treeset_str52.retainAll((java.util.Collection<java.lang.String>)arraylist_str55);
    java.util.TreeSet<java.lang.String> treeset_str58 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array60 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str61 = new java.util.ArrayList<java.lang.String>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str61, str_array60);
    boolean b63 = treeset_str58.retainAll((java.util.Collection<java.lang.String>)arraylist_str61);
    java.util.TreeSet<java.lang.String> treeset_str64 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array66 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str67 = new java.util.ArrayList<java.lang.String>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str67, str_array66);
    boolean b69 = treeset_str64.retainAll((java.util.Collection<java.lang.String>)arraylist_str67);
    java.util.ArrayList[] arrayList_array71 = new java.util.ArrayList[ 4 ];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.lang.String>[] arraylist_str_array72 = (java.util.ArrayList<java.lang.String>[])arrayList_array71;
    arraylist_str_array72[0] = arraylist_str49;
    arraylist_str_array72[1] = arraylist_str55;
    arraylist_str_array72[2] = arraylist_str61;
    arraylist_str_array72[3] = arraylist_str67;
    java.util.ArrayList[][] arrayList_array_array82 = new java.util.ArrayList[ 2 ][];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.lang.String>[][] arraylist_str_array_array83 = (java.util.ArrayList<java.lang.String>[][])arrayList_array_array82;
    arraylist_str_array_array83[0] = arraylist_str_array37;
    arraylist_str_array_array83[1] = arraylist_str_array72;
    java.util.ArrayList<java.lang.String>[][] arraylist_str_array_array88 = treeset_str0.toArray(arraylist_str_array_array83);
    java.util.TreeSet<java.lang.String> treeset_str89 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array_array88);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str4 = treeset_str1.subSet("hi!", "hi!");
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str6.subSet("", true, "[hi!]", true);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str13);
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str14.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    boolean b23 = treeset_str14.retainAll((java.util.Collection<java.lang.String>)treeset_str17);
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str14.headSet("", false);
    boolean b27 = treeset_str6.retainAll((java.util.Collection<java.lang.String>)treeset_str14);
    boolean b28 = treeset_str1.removeAll((java.util.Collection<java.lang.String>)treeset_str6);
    java.lang.String str29 = treeset_str6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    boolean b13 = treeset_str11.add("[]");
    java.lang.String str14 = treeset_str11.pollFirst();
    java.util.Spliterator<java.lang.String> spliterator_str15 = treeset_str11.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str15);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str3.iterator();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    boolean b14 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)arraylist_str12);
    boolean b16 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str18.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str18.headSet("", false);
    boolean b24 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b25 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b26 = treeset_str3.removeAll((java.util.Collection<java.lang.String>)treeset_str8);
    boolean b28 = treeset_str8.add("[hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str8.headSet("", false);
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array34 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array34);
    boolean b37 = treeset_str32.retainAll((java.util.Collection<java.lang.String>)arraylist_str35);
    java.util.stream.Stream<java.lang.String> stream_str38 = treeset_str32.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str40 = treeset_str32.headSet("");
    boolean b41 = treeset_str8.removeAll((java.util.Collection<java.lang.String>)treeset_str32);
    int i42 = treeset_str32.size();
    java.util.Iterator<java.lang.String> iterator_str43 = treeset_str32.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str46 = treeset_str32.headSet("[]", true);
    java.util.NavigableSet<java.lang.String> navigableset_str49 = treeset_str32.tailSet("[[]]", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str49);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str0.tailSet("[]", false);
    int i31 = treeset_str0.size();
    java.util.Comparator<? super java.lang.String> comparator_wildcard32 = treeset_str0.comparator();
    java.lang.String str34 = treeset_str0.ceiling("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    boolean b4 = treeset_str1.isEmpty();
    boolean b6 = treeset_str1.add("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str7);
    java.util.SortedSet<java.lang.String> sortedset_str10 = treeset_str8.tailSet("");
    boolean b11 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.lang.String str11 = treeset_str0.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "", "[hi!]", "[[hi!]]", "[]", "[]" };
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str7, str_array6);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str7.subSet("[hi!]", false, "[hi!]", false);
    treeset_str7.clear();
    java.lang.String str16 = treeset_str7.higher("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str0.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    boolean b24 = treeset_str17.add("hi!");
    java.lang.String str25 = treeset_str17.toString();
    boolean b27 = treeset_str17.add("hi!");
    boolean b28 = treeset_str0.addAll((java.util.Collection<java.lang.String>)treeset_str17);
    java.lang.Object obj29 = treeset_str0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[hi!]"+ "'", str25.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.lang.String str6 = treeset_str3.pollLast();
    java.util.stream.Stream<java.lang.String> stream_str7 = treeset_str3.stream();
    java.util.stream.Stream<java.lang.String> stream_str8 = treeset_str3.stream();
    java.lang.String str9 = treeset_str3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.subSet("", true, "[hi!]", true);
    boolean b8 = treeset_str0.add("[]");
    java.lang.Object[] obj_array9 = treeset_str0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.util.stream.Stream<java.lang.String> stream_str19 = treeset_str18.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str19);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    java.lang.String str12 = treeset_str0.toString();
    java.util.Comparator<? super java.lang.String> comparator_wildcard13 = treeset_str0.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[hi!]"+ "'", str12.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard13);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.lang.String str8 = treeset_str0.toString();
    java.util.Spliterator<java.lang.String> spliterator_str9 = treeset_str0.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", false);
    java.util.Spliterator<java.lang.String> spliterator_str13 = treeset_str0.spliterator();
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str0.tailSet("[]");
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str22);
    java.util.SortedSet<java.lang.String> sortedset_str25 = treeset_str23.tailSet("");
    boolean b26 = treeset_str16.equals((java.lang.Object)treeset_str23);
    java.util.NavigableSet<java.lang.String> navigableset_str29 = treeset_str23.tailSet("hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str30 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str23);
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str30.descendingSet();
    boolean b32 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)navigableset_str31);
    java.util.NavigableSet<java.lang.String> navigableset_str35 = treeset_str0.headSet("[]", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str35);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.lang.String str8 = treeset_str0.lower("");
    java.lang.String str10 = treeset_str0.higher("");
    java.lang.String str11 = treeset_str0.toString();
    treeset_str0.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str15 = treeset_str0.headSet("[, hi!]", false);
    java.lang.String str17 = treeset_str0.floor("[[hi!]]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    treeset_str0.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str0.tailSet("", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.subSet("", true, "[hi!]", true);
    java.util.NavigableSet<java.lang.String> navigableset_str11 = treeset_str0.subSet("", false, "hi!", false);
    java.util.stream.Stream<java.lang.String> stream_str12 = treeset_str0.parallelStream();
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str13);
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str14.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str19 = treeset_str14.headSet("", false);
    java.lang.String str20 = treeset_str14.pollLast();
    boolean b21 = treeset_str14.isEmpty();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array24 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str25, str_array24);
    boolean b27 = treeset_str22.retainAll((java.util.Collection<java.lang.String>)arraylist_str25);
    java.util.stream.Stream<java.lang.String> stream_str28 = treeset_str22.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str22.headSet("");
    java.util.stream.Stream<java.lang.String> stream_str31 = treeset_str22.parallelStream();
    boolean b32 = treeset_str14.equals((java.lang.Object)stream_str31);
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str33);
    java.util.Comparator<? super java.lang.String> comparator_wildcard35 = treeset_str33.comparator();
    java.util.SortedSet<java.lang.String> sortedset_str38 = treeset_str33.subSet("[hi!]", "[hi!]");
    boolean b39 = treeset_str14.removeAll((java.util.Collection<java.lang.String>)treeset_str33);
    java.util.Iterator<java.lang.String> iterator_str40 = treeset_str14.descendingIterator();
    boolean b41 = treeset_str0.equals((java.lang.Object)iterator_str40);
    java.util.TreeSet<java.lang.String> treeset_str42 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array44 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str45 = new java.util.ArrayList<java.lang.String>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str45, str_array44);
    boolean b47 = treeset_str42.retainAll((java.util.Collection<java.lang.String>)arraylist_str45);
    boolean b49 = treeset_str42.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str52 = treeset_str42.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str53 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str42);
    boolean b55 = treeset_str53.add("[]");
    java.lang.String str56 = treeset_str53.pollFirst();
    // The following exception was thrown during execution in test generation
    try {
    boolean b57 = treeset_str0.remove((java.lang.Object)treeset_str53);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]"+ "'", str56.equals("[]"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str1.subSet("", false, "[hi!]", false);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str1.headSet("[[]]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str0.descendingIterator();
    java.util.SortedSet<java.lang.String> sortedset_str18 = treeset_str0.tailSet("hi!");
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    java.util.SortedSet<java.lang.String> sortedset_str22 = treeset_str19.tailSet("[hi!]");
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = treeset_str0.remove((java.lang.Object)sortedset_str22);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str22);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str1.subSet("", false, "[hi!]", false);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str1.headSet("[hi!]");
    boolean b13 = treeset_str1.add("[hi!]");
    java.lang.String str14 = treeset_str1.first();
    java.lang.String str15 = treeset_str1.pollLast();
    java.util.Spliterator<java.lang.String> spliterator_str16 = treeset_str1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[hi!]"+ "'", str14.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[hi!]"+ "'", str15.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str16);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str12 = treeset_str10.tailSet("");
    boolean b13 = treeset_str3.equals((java.lang.Object)treeset_str10);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str3.equals((java.lang.Object)b32);
    java.lang.String str35 = treeset_str3.ceiling("[hi!]");
    boolean b36 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str3);
    int i37 = treeset_str3.size();
    java.util.NavigableSet<java.lang.String> navigableset_str38 = treeset_str3.descendingSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str38);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str4 = treeset_str1.subSet("hi!", "hi!");
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str6.subSet("", true, "[hi!]", true);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str13);
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str14.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    boolean b23 = treeset_str14.retainAll((java.util.Collection<java.lang.String>)treeset_str17);
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str14.headSet("", false);
    boolean b27 = treeset_str6.retainAll((java.util.Collection<java.lang.String>)treeset_str14);
    boolean b28 = treeset_str1.removeAll((java.util.Collection<java.lang.String>)treeset_str6);
    java.util.Iterator<java.lang.String> iterator_str29 = treeset_str6.descendingIterator();
    java.lang.String str31 = treeset_str6.higher("[]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array21 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str22 = new java.util.ArrayList<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str22, str_array21);
    boolean b24 = treeset_str19.retainAll((java.util.Collection<java.lang.String>)arraylist_str22);
    boolean b26 = treeset_str19.add("hi!");
    java.lang.String str27 = treeset_str19.toString();
    java.lang.Object[] obj_array28 = treeset_str19.toArray();
    // The following exception was thrown during execution in test generation
    try {
    boolean b29 = treeset_str1.remove((java.lang.Object)obj_array28);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[hi!]"+ "'", str27.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.floor("[]");
    java.lang.String str14 = treeset_str1.toString();
    java.util.Spliterator<java.lang.String> spliterator_str15 = treeset_str1.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.tailSet("", false);
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    java.util.SortedSet<java.lang.String> sortedset_str22 = treeset_str20.tailSet("");
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str20.headSet("[[hi!]]");
    boolean b25 = treeset_str1.equals((java.lang.Object)treeset_str20);
    java.lang.Object[] obj_array26 = treeset_str20.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array6);
    boolean b9 = treeset_str4.retainAll((java.util.Collection<java.lang.String>)arraylist_str7);
    boolean b10 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str4);
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str14, str_array13);
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str14.descendingSet();
    java.lang.String str18 = treeset_str14.ceiling("[hi!]");
    boolean b19 = treeset_str4.remove((java.lang.Object)"[hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str24 = treeset_str4.subSet("[]", true, "[hi!]", false);
    java.util.NavigableSet<java.lang.String> navigableset_str25 = treeset_str4.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array28 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<java.lang.String>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str29, str_array28);
    boolean b31 = treeset_str26.retainAll((java.util.Collection<java.lang.String>)arraylist_str29);
    boolean b33 = treeset_str26.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str35 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str34);
    java.util.SortedSet<java.lang.String> sortedset_str37 = treeset_str35.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str40 = treeset_str35.headSet("", false);
    boolean b41 = treeset_str26.retainAll((java.util.Collection<java.lang.String>)navigableset_str40);
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str45 = new java.util.TreeSet<java.lang.String>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str45, str_array44);
    java.util.NavigableSet<java.lang.String> navigableset_str47 = treeset_str45.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str48 = treeset_str45.iterator();
    java.util.Iterator<java.lang.String> iterator_str49 = treeset_str45.iterator();
    boolean b50 = treeset_str26.removeAll((java.util.Collection<java.lang.String>)treeset_str45);
    boolean b52 = treeset_str45.add("[, hi!]");
    boolean b53 = treeset_str4.addAll((java.util.Collection<java.lang.String>)treeset_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str12 = treeset_str10.tailSet("");
    boolean b13 = treeset_str3.equals((java.lang.Object)treeset_str10);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str3.equals((java.lang.Object)b32);
    java.lang.String str35 = treeset_str3.ceiling("[hi!]");
    boolean b36 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str3);
    java.util.SortedSet<java.lang.String> sortedset_str38 = treeset_str1.headSet("[[]]");
    java.util.NavigableSet<java.lang.String> navigableset_str41 = treeset_str1.tailSet("[, hi!]", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str41);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.lang.String str8 = treeset_str0.toString();
    java.util.SortedSet<java.lang.String> sortedset_str10 = treeset_str0.headSet("[, hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str10);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str1.subSet("", false, "[hi!]", false);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str1.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str15, str_array14);
    boolean b17 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)arraylist_str15);
    java.lang.String str18 = treeset_str12.pollLast();
    boolean b19 = treeset_str1.containsAll((java.util.Collection<java.lang.String>)treeset_str12);
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str21.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array26 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str27, str_array26);
    boolean b29 = treeset_str24.retainAll((java.util.Collection<java.lang.String>)arraylist_str27);
    boolean b30 = treeset_str21.retainAll((java.util.Collection<java.lang.String>)treeset_str24);
    java.lang.String str32 = treeset_str24.higher("");
    java.util.SortedSet<java.lang.String> sortedset_str35 = treeset_str24.subSet("", "hi!");
    boolean b36 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str24);
    java.util.stream.Stream<java.lang.String> stream_str37 = treeset_str24.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str37);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str1.tailSet("");
    java.util.stream.Stream<java.lang.String> stream_str16 = treeset_str1.stream();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    int i18 = treeset_str17.size();
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str17.tailSet("[[]]");
    java.util.NavigableSet<java.lang.String> navigableset_str25 = treeset_str17.subSet("[hi!]", true, "[hi!]", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str25);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    boolean b13 = treeset_str11.add("[]");
    boolean b15 = treeset_str11.add("hi!");
    java.lang.String str17 = treeset_str11.ceiling("[[hi!]]");
    java.util.SortedSet<java.lang.String> sortedset_str19 = treeset_str11.tailSet("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str19);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.subSet("[hi!]", true, "hi!", false);
    int i14 = treeset_str0.size();
    java.util.Iterator<java.lang.String> iterator_str15 = treeset_str0.descendingIterator();
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str0.iterator();
    treeset_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    treeset_str0.clear();
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str0.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str0.tailSet("[hi!]", true);
    boolean b6 = treeset_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.floor("[]");
    java.lang.String str15 = treeset_str1.higher("hi!");
    java.lang.Object[] obj_array16 = treeset_str1.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b20 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str22.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str22.headSet("", false);
    boolean b28 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b29 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b30 = treeset_str0.equals((java.lang.Object)b29);
    java.lang.String str32 = treeset_str0.ceiling("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str35 = treeset_str33.floor("[[]]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("", false);
    java.lang.String str7 = treeset_str1.pollLast();
    boolean b8 = treeset_str1.isEmpty();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    boolean b14 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)arraylist_str12);
    java.util.stream.Stream<java.lang.String> stream_str15 = treeset_str9.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str17 = treeset_str9.headSet("");
    java.util.stream.Stream<java.lang.String> stream_str18 = treeset_str9.parallelStream();
    boolean b19 = treeset_str1.equals((java.lang.Object)stream_str18);
    boolean b21 = treeset_str1.contains((java.lang.Object)100);
    java.lang.String str22 = treeset_str1.toString();
    java.lang.Object obj23 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = treeset_str1.remove(obj23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", true);
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str10, str_array9);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str10.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str13 = treeset_str10.iterator();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str10.removeAll((java.util.Collection<java.lang.String>)treeset_str15);
    boolean b34 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.util.Comparator<? super java.lang.String> comparator_wildcard35 = treeset_str10.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard35);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str18);
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str20.tailSet("[hi!]");
    java.lang.Object obj24 = treeset_str20.clone();
    boolean b25 = treeset_str19.retainAll((java.util.Collection<java.lang.String>)treeset_str20);
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    treeset_str26.clear();
    java.lang.String str29 = treeset_str26.higher("[hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str15 = treeset_str1.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str16);
    java.lang.String str19 = treeset_str17.lower("");
    java.lang.String str20 = treeset_str17.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str25 = treeset_str17.subSet("", false, "[hi!]", false);
    boolean b26 = treeset_str17.isEmpty();
    java.util.NavigableSet<java.lang.String> navigableset_str29 = treeset_str17.tailSet("", true);
    java.util.SortedSet<java.lang.String> sortedset_str31 = treeset_str17.tailSet("[, hi!]");
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = treeset_str1.remove((java.lang.Object)sortedset_str31);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str31);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str0.tailSet("[]", false);
    java.lang.Object obj31 = treeset_str0.clone();
    boolean b33 = treeset_str0.add("[hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str11, str_array10);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str11.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str14 = treeset_str11.iterator();
    boolean b15 = treeset_str0.equals((java.lang.Object)iterator_str14);
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str0.headSet("", true);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str0.tailSet("[[]]");
    java.lang.String str21 = treeset_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    boolean b13 = treeset_str11.add("[]");
    boolean b15 = treeset_str11.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str16.tailSet("hi!", true);
    java.util.NavigableSet<java.lang.String> navigableset_str29 = treeset_str16.tailSet("[]", true);
    java.util.TreeSet<java.lang.String> treeset_str30 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str31 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str30);
    java.util.Iterator<java.lang.String> iterator_str32 = treeset_str31.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array35);
    boolean b38 = treeset_str33.retainAll((java.util.Collection<java.lang.String>)arraylist_str36);
    boolean b40 = treeset_str33.add("hi!");
    boolean b41 = treeset_str31.contains((java.lang.Object)"hi!");
    java.lang.String str43 = treeset_str31.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str46 = treeset_str31.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str47 = treeset_str31.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str48 = treeset_str31.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str49 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)navigableset_str48);
    java.lang.Object obj50 = treeset_str49.clone();
    java.lang.Object[] obj_array51 = treeset_str49.toArray();
    boolean b52 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)treeset_str49);
    java.lang.String str54 = treeset_str16.higher("hi!");
    boolean b55 = treeset_str11.equals((java.lang.Object)treeset_str16);
    java.util.TreeSet<java.lang.String> treeset_str56 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str16);
    java.util.Iterator<java.lang.String> iterator_str57 = treeset_str16.iterator();
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.lang.String> navigableset_str62 = treeset_str16.subSet("[]", true, "[[]]", true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str57);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    java.lang.String[] str_array1 = new java.lang.String[] { "" };
    java.util.TreeSet<java.lang.String> treeset_str2 = new java.util.TreeSet<java.lang.String>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str2, str_array1);
    int i4 = treeset_str2.size();
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str2);
    java.lang.String str7 = treeset_str5.higher("");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array10 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    boolean b13 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)arraylist_str11);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.SortedSet<java.lang.String> sortedset_str17 = treeset_str15.tailSet("");
    boolean b18 = treeset_str8.equals((java.lang.Object)treeset_str15);
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array23 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str24, str_array23);
    boolean b26 = treeset_str21.retainAll((java.util.Collection<java.lang.String>)arraylist_str24);
    boolean b28 = treeset_str21.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str29 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str30 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str29);
    java.util.SortedSet<java.lang.String> sortedset_str32 = treeset_str30.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str35 = treeset_str30.headSet("", false);
    boolean b36 = treeset_str21.retainAll((java.util.Collection<java.lang.String>)navigableset_str35);
    boolean b37 = treeset_str20.retainAll((java.util.Collection<java.lang.String>)navigableset_str35);
    boolean b38 = treeset_str8.equals((java.lang.Object)b37);
    boolean b40 = treeset_str8.add("[]");
    boolean b41 = treeset_str5.retainAll((java.util.Collection<java.lang.String>)treeset_str8);
    java.lang.Object[] obj_array42 = treeset_str8.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str5, str_array4);
    java.util.NavigableSet<java.lang.String> navigableset_str7 = treeset_str5.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str8 = treeset_str5.iterator();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    boolean b16 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)arraylist_str14);
    boolean b18 = treeset_str11.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    java.util.SortedSet<java.lang.String> sortedset_str22 = treeset_str20.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str25 = treeset_str20.headSet("", false);
    boolean b26 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)navigableset_str25);
    boolean b27 = treeset_str10.retainAll((java.util.Collection<java.lang.String>)navigableset_str25);
    boolean b28 = treeset_str5.removeAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str10.tailSet("hi!");
    boolean b31 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str10);
    java.util.Iterator<java.lang.String> iterator_str32 = treeset_str10.iterator();
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array35);
    boolean b38 = treeset_str33.retainAll((java.util.Collection<java.lang.String>)arraylist_str36);
    boolean b40 = treeset_str33.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str41 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str42 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str41);
    java.util.SortedSet<java.lang.String> sortedset_str44 = treeset_str42.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str47 = treeset_str42.headSet("", false);
    boolean b48 = treeset_str33.retainAll((java.util.Collection<java.lang.String>)navigableset_str47);
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str52 = new java.util.TreeSet<java.lang.String>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str52, str_array51);
    java.util.NavigableSet<java.lang.String> navigableset_str54 = treeset_str52.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str55 = treeset_str52.iterator();
    java.util.Iterator<java.lang.String> iterator_str56 = treeset_str52.iterator();
    boolean b57 = treeset_str33.removeAll((java.util.Collection<java.lang.String>)treeset_str52);
    java.util.TreeSet<java.lang.String> treeset_str58 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str59 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str58);
    java.util.Iterator<java.lang.String> iterator_str60 = treeset_str59.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str61 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array63 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str64 = new java.util.ArrayList<java.lang.String>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str64, str_array63);
    boolean b66 = treeset_str61.retainAll((java.util.Collection<java.lang.String>)arraylist_str64);
    boolean b68 = treeset_str61.add("hi!");
    boolean b69 = treeset_str59.contains((java.lang.Object)"hi!");
    java.lang.String str71 = treeset_str59.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str76 = treeset_str59.subSet("[hi!]", true, "[hi!]", true);
    boolean b77 = treeset_str33.containsAll((java.util.Collection<java.lang.String>)treeset_str59);
    java.util.SortedSet<java.lang.String> sortedset_str79 = treeset_str33.tailSet("[, hi!]");
    java.util.TreeSet<java.lang.String> treeset_str80 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str33);
    // The following exception was thrown during execution in test generation
    try {
    boolean b81 = treeset_str10.remove((java.lang.Object)treeset_str80);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str79);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.subSet("", true, "[hi!]", true);
    java.lang.String str7 = treeset_str0.pollLast();
    java.lang.String str9 = treeset_str0.floor("[, hi!]");
    java.util.Comparator<? super java.lang.String> comparator_wildcard10 = treeset_str0.comparator();
    boolean b11 = treeset_str0.isEmpty();
    java.lang.Object obj12 = treeset_str0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b20 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str22.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str22.headSet("", false);
    boolean b28 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b29 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b30 = treeset_str0.equals((java.lang.Object)b29);
    java.lang.String str32 = treeset_str0.ceiling("[hi!]");
    java.util.Iterator<java.lang.String> iterator_str33 = treeset_str0.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str36 = treeset_str0.headSet("[hi!]", true);
    java.lang.String str37 = treeset_str0.pollFirst();
    java.lang.String str39 = treeset_str0.floor("[hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str1);
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str1.subSet("[]", "[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    boolean b14 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)arraylist_str12);
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<java.lang.String>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str18, str_array17);
    boolean b20 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)arraylist_str18);
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array23 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str24, str_array23);
    boolean b26 = treeset_str21.retainAll((java.util.Collection<java.lang.String>)arraylist_str24);
    java.util.ArrayList[] arrayList_array28 = new java.util.ArrayList[ 3 ];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.lang.String>[] arraylist_str_array29 = (java.util.ArrayList<java.lang.String>[])arrayList_array28;
    arraylist_str_array29[0] = arraylist_str12;
    arraylist_str_array29[1] = arraylist_str18;
    arraylist_str_array29[2] = arraylist_str24;
    java.util.ArrayList<java.lang.String>[] arraylist_str_array36 = treeset_str1.toArray(arraylist_str_array29);
    java.util.TreeSet<java.lang.String> treeset_str37 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str38 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str37);
    java.util.SortedSet<java.lang.String> sortedset_str40 = treeset_str38.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str43 = treeset_str38.headSet("", false);
    int i44 = treeset_str38.size();
    java.lang.String str46 = treeset_str38.ceiling("[]");
    java.util.NavigableSet<java.lang.String> navigableset_str47 = treeset_str38.descendingSet();
    boolean b48 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str38);
    int i49 = treeset_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str18);
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    java.util.SortedSet<java.lang.String> sortedset_str23 = treeset_str20.tailSet("[hi!]");
    java.lang.Object obj24 = treeset_str20.clone();
    boolean b25 = treeset_str19.retainAll((java.util.Collection<java.lang.String>)treeset_str20);
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str20);
    boolean b27 = treeset_str26.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str11, str_array10);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str11.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str14 = treeset_str11.iterator();
    boolean b15 = treeset_str0.equals((java.lang.Object)iterator_str14);
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str0.iterator();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    boolean b24 = treeset_str17.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str25);
    java.util.SortedSet<java.lang.String> sortedset_str28 = treeset_str26.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str26.headSet("", false);
    boolean b32 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)navigableset_str31);
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str36 = new java.util.TreeSet<java.lang.String>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str36, str_array35);
    java.util.NavigableSet<java.lang.String> navigableset_str38 = treeset_str36.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str39 = treeset_str36.iterator();
    java.util.Iterator<java.lang.String> iterator_str40 = treeset_str36.iterator();
    boolean b41 = treeset_str17.removeAll((java.util.Collection<java.lang.String>)treeset_str36);
    java.util.SortedSet[] sortedSet_array43 = new java.util.SortedSet[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.SortedSet<java.lang.String>[] sortedset_str_array44 = (java.util.SortedSet<java.lang.String>[])sortedSet_array43;
    sortedset_str_array44[0] = treeset_str17;
    java.util.SortedSet[][] sortedSet_array_array48 = new java.util.SortedSet[ 1 ][];
    @SuppressWarnings("unchecked")
    java.util.SortedSet<java.lang.String>[][] sortedset_str_array_array49 = (java.util.SortedSet<java.lang.String>[][])sortedSet_array_array48;
    sortedset_str_array_array49[0] = sortedset_str_array44;
    java.util.SortedSet<java.lang.String>[][] sortedset_str_array_array52 = treeset_str0.toArray(sortedset_str_array_array49);
    java.util.TreeSet<java.lang.String> treeset_str53 = new java.util.TreeSet<java.lang.String>();
    boolean b54 = treeset_str0.containsAll((java.util.Collection<java.lang.String>)treeset_str53);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str55 = treeset_str0.first();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedSet_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedSet_array_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str_array_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str_array_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str19 = treeset_str1.iterator();
    int i20 = treeset_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    int i29 = treeset_str0.size();
    java.util.SortedSet<java.lang.String> sortedset_str32 = treeset_str0.subSet("[hi!]", "hi!");
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str33);
    java.lang.String str36 = treeset_str34.lower("");
    boolean b37 = treeset_str34.isEmpty();
    boolean b39 = treeset_str34.add("[hi!]");
    java.lang.String str40 = treeset_str34.toString();
    java.lang.String str42 = treeset_str34.higher("");
    java.lang.String str44 = treeset_str34.ceiling("[]");
    java.util.TreeSet<java.lang.String> treeset_str45 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str46 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str45);
    java.util.Iterator<java.lang.String> iterator_str47 = treeset_str46.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str48 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array50 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str51 = new java.util.ArrayList<java.lang.String>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str51, str_array50);
    boolean b53 = treeset_str48.retainAll((java.util.Collection<java.lang.String>)arraylist_str51);
    boolean b55 = treeset_str48.add("hi!");
    boolean b56 = treeset_str46.contains((java.lang.Object)"hi!");
    java.lang.String str58 = treeset_str46.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str60 = treeset_str46.tailSet("");
    java.util.stream.Stream<java.lang.String> stream_str61 = treeset_str46.stream();
    java.util.TreeSet<java.lang.String> treeset_str62 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str46);
    java.util.TreeSet<java.lang.String> treeset_str63 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str62);
    boolean b64 = treeset_str34.addAll((java.util.Collection<java.lang.String>)treeset_str62);
    boolean b65 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str62);
    treeset_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[[hi!]]"+ "'", str40.equals("[[hi!]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[hi!]"+ "'", str42.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[hi!]"+ "'", str44.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    boolean b13 = treeset_str11.add("[]");
    java.lang.String str15 = treeset_str11.floor("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str11.tailSet("[]", false);
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    int i6 = treeset_str3.size();
    java.lang.String str8 = treeset_str3.lower("[]");
    java.lang.Object[] obj_array9 = treeset_str3.toArray();
    java.util.Iterator<java.lang.String> iterator_str10 = treeset_str3.iterator();
    java.lang.Object[] obj_array11 = treeset_str3.toArray();
    int i12 = treeset_str3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("", false);
    java.lang.String str7 = treeset_str1.pollLast();
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str1.tailSet("[, hi!]");
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str12, str_array11);
    int i14 = treeset_str12.size();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str12);
    java.lang.String str17 = treeset_str15.higher("");
    boolean b18 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str15);
    java.lang.String str20 = treeset_str1.higher("[[hi!]]");
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str1.descendingSet();
    java.lang.String str22 = treeset_str1.last();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.lang.String str20 = treeset_str1.lower("[]");
    java.lang.String str21 = treeset_str1.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str22);
    java.util.Iterator<java.lang.String> iterator_str24 = treeset_str23.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array27 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    boolean b30 = treeset_str25.retainAll((java.util.Collection<java.lang.String>)arraylist_str28);
    boolean b32 = treeset_str25.add("hi!");
    boolean b33 = treeset_str23.contains((java.lang.Object)"hi!");
    boolean b34 = treeset_str1.removeAll((java.util.Collection<java.lang.String>)treeset_str23);
    java.util.Comparator<? super java.lang.String> comparator_wildcard35 = treeset_str1.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard35);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.lang.String str8 = treeset_str0.toString();
    boolean b10 = treeset_str0.add("hi!");
    java.lang.Object obj11 = treeset_str0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.lang.String str8 = treeset_str0.toString();
    java.util.NavigableSet<java.lang.String> navigableset_str11 = treeset_str0.headSet("[]", false);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.descendingSet();
    java.lang.String str14 = treeset_str0.ceiling("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str15);
    java.util.Comparator<? super java.lang.String> comparator_wildcard17 = treeset_str15.comparator();
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str15.subSet("[hi!]", "[hi!]");
    boolean b21 = treeset_str15.isEmpty();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str25, str_array24);
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str25.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str28 = treeset_str25.iterator();
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str25.headSet("[hi!]");
    boolean b31 = treeset_str15.addAll((java.util.Collection<java.lang.String>)treeset_str25);
    java.util.SortedSet<java.lang.String> sortedset_str33 = treeset_str25.tailSet("[[]]");
    boolean b34 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str25);
    java.util.NavigableSet<java.lang.String> navigableset_str35 = treeset_str0.descendingSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str35);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str1);
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str1.subSet("[]", "[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.lang.String str12 = treeset_str10.lower("");
    boolean b13 = treeset_str10.isEmpty();
    boolean b14 = treeset_str1.contains((java.lang.Object)b13);
    java.util.stream.Stream<java.lang.String> stream_str15 = treeset_str1.parallelStream();
    java.lang.String str17 = treeset_str1.higher("[hi!]");
    boolean b19 = treeset_str1.add("");
    java.util.NavigableSet<java.lang.String> navigableset_str22 = treeset_str1.tailSet("[, hi!]", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str22);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.lang.String str12 = treeset_str0.higher("[hi!]");
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str0.tailSet("[[]]");
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str15);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str16.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array20 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    boolean b23 = treeset_str18.retainAll((java.util.Collection<java.lang.String>)arraylist_str21);
    boolean b25 = treeset_str18.add("hi!");
    boolean b26 = treeset_str16.contains((java.lang.Object)"hi!");
    java.lang.String str28 = treeset_str16.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str16.tailSet("");
    java.util.stream.Stream<java.lang.String> stream_str31 = treeset_str16.stream();
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str16);
    java.util.stream.Stream<java.lang.String> stream_str33 = treeset_str16.parallelStream();
    boolean b34 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.Spliterator<java.lang.String> spliterator_str1 = treeset_str0.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str1);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str0.tailSet("[]", false);
    int i31 = treeset_str0.size();
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str32);
    java.lang.String str35 = treeset_str33.lower("");
    java.lang.String str36 = treeset_str33.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str37 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str33);
    java.util.SortedSet<java.lang.String> sortedset_str40 = treeset_str33.subSet("[]", "[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str41 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str42 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str41);
    java.lang.String str44 = treeset_str42.lower("");
    boolean b45 = treeset_str42.isEmpty();
    boolean b46 = treeset_str33.contains((java.lang.Object)b45);
    java.util.TreeSet<java.lang.String> treeset_str47 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str33);
    boolean b48 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str47);
    int i49 = treeset_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();
    java.util.Iterator<java.lang.String> iterator_str8 = treeset_str0.descendingIterator();
    boolean b10 = treeset_str0.add("");
    java.lang.Object obj11 = treeset_str0.clone();
    java.util.stream.Stream<java.lang.String> stream_str12 = treeset_str0.stream();
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str13);
    java.util.Iterator<java.lang.String> iterator_str15 = treeset_str14.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    boolean b24 = treeset_str14.contains((java.lang.Object)"hi!");
    java.lang.String str26 = treeset_str14.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str29 = treeset_str14.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str30 = treeset_str14.iterator();
    java.util.TreeSet<java.lang.String> treeset_str31 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str14);
    java.lang.String str33 = treeset_str14.higher("[, hi!]");
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str14);
    java.util.NavigableSet<java.lang.String> navigableset_str37 = treeset_str14.headSet("[, hi!]", true);
    // The following exception was thrown during execution in test generation
    try {
    boolean b38 = treeset_str0.contains((java.lang.Object)navigableset_str37);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str37);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str12 = treeset_str10.tailSet("");
    boolean b13 = treeset_str3.equals((java.lang.Object)treeset_str10);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str24 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str24);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str25.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str30 = treeset_str25.headSet("", false);
    boolean b31 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b32 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)navigableset_str30);
    boolean b33 = treeset_str3.equals((java.lang.Object)b32);
    java.lang.String str35 = treeset_str3.ceiling("[hi!]");
    boolean b36 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str3);
    java.lang.String str38 = treeset_str1.floor("[]");
    java.util.Comparator<? super java.lang.String> comparator_wildcard39 = treeset_str1.comparator();
    java.util.TreeSet<java.lang.String> treeset_str40 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array42 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str43 = new java.util.ArrayList<java.lang.String>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str43, str_array42);
    boolean b45 = treeset_str40.retainAll((java.util.Collection<java.lang.String>)arraylist_str43);
    boolean b47 = treeset_str40.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str48 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str49 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str48);
    java.util.SortedSet<java.lang.String> sortedset_str51 = treeset_str49.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str54 = treeset_str49.headSet("", false);
    boolean b55 = treeset_str40.retainAll((java.util.Collection<java.lang.String>)navigableset_str54);
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str59 = new java.util.TreeSet<java.lang.String>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str59, str_array58);
    java.util.NavigableSet<java.lang.String> navigableset_str61 = treeset_str59.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str62 = treeset_str59.iterator();
    java.util.Iterator<java.lang.String> iterator_str63 = treeset_str59.iterator();
    boolean b64 = treeset_str40.removeAll((java.util.Collection<java.lang.String>)treeset_str59);
    java.util.Iterator<java.lang.String> iterator_str65 = treeset_str40.iterator();
    java.lang.String str67 = treeset_str40.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str68 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str40);
    java.util.NavigableSet<java.lang.String> navigableset_str71 = treeset_str68.headSet("[hi!]", true);
    boolean b72 = treeset_str1.removeAll((java.util.Collection<java.lang.String>)treeset_str68);
    java.lang.String str73 = treeset_str68.toString();
    java.util.Spliterator<java.lang.String> spliterator_str74 = treeset_str68.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "[]"+ "'", str73.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str74);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Spliterator<java.lang.String> spliterator_str7 = treeset_str0.spliterator();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.lang.String str13 = treeset_str9.higher("");
    boolean b14 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str9);
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str0.tailSet("");
    java.lang.Object obj17 = treeset_str0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.Iterator<java.lang.String> iterator_str11 = treeset_str0.iterator();
    java.lang.Object obj12 = treeset_str0.clone();
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    java.util.SortedSet<java.lang.String> sortedset_str22 = treeset_str20.tailSet("");
    boolean b23 = treeset_str13.equals((java.lang.Object)treeset_str20);
    java.util.stream.Stream<java.lang.String> stream_str24 = treeset_str13.stream();
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array27 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    boolean b30 = treeset_str25.retainAll((java.util.Collection<java.lang.String>)arraylist_str28);
    java.util.TreeSet<java.lang.String> treeset_str31 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str31);
    java.util.SortedSet<java.lang.String> sortedset_str34 = treeset_str32.tailSet("");
    boolean b35 = treeset_str25.equals((java.lang.Object)treeset_str32);
    java.util.stream.Stream<java.lang.String> stream_str36 = treeset_str25.stream();
    java.util.Iterator<java.lang.String> iterator_str37 = treeset_str25.descendingIterator();
    java.util.NavigableSet<java.lang.String> navigableset_str38 = treeset_str25.descendingSet();
    boolean b39 = treeset_str13.addAll((java.util.Collection<java.lang.String>)navigableset_str38);
    int i40 = treeset_str13.size();
    boolean b41 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str13);
    int i42 = treeset_str0.size();
    java.lang.String str43 = treeset_str0.pollLast();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.lang.String str8 = treeset_str0.toString();
    java.util.Spliterator<java.lang.String> spliterator_str9 = treeset_str0.spliterator();
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str0.headSet("hi!", false);
    java.lang.String str14 = treeset_str0.floor("[[hi!]]");
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str15);
    java.util.SortedSet<java.lang.String> sortedset_str18 = treeset_str16.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>(sortedset_str18);
    boolean b20 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Collection<java.lang.String> collection_str21 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = treeset_str19.removeAll(collection_str21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    boolean b4 = treeset_str1.isEmpty();
    boolean b6 = treeset_str1.add("[hi!]");
    java.lang.String str7 = treeset_str1.toString();
    java.lang.String str9 = treeset_str1.higher("");
    java.lang.String str11 = treeset_str1.ceiling("[]");
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str12);
    java.util.Iterator<java.lang.String> iterator_str14 = treeset_str13.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<java.lang.String>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str18, str_array17);
    boolean b20 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)arraylist_str18);
    boolean b22 = treeset_str15.add("hi!");
    boolean b23 = treeset_str13.contains((java.lang.Object)"hi!");
    java.lang.String str25 = treeset_str13.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str13.tailSet("");
    java.util.stream.Stream<java.lang.String> stream_str28 = treeset_str13.stream();
    java.util.TreeSet<java.lang.String> treeset_str29 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str13);
    java.util.TreeSet<java.lang.String> treeset_str30 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str29);
    boolean b31 = treeset_str1.addAll((java.util.Collection<java.lang.String>)treeset_str29);
    java.util.SortedSet<java.lang.String> sortedset_str34 = treeset_str1.subSet("[[hi!]]", "[[hi!]]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[hi!]]"+ "'", str7.equals("[[hi!]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[hi!]"+ "'", str9.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[hi!]"+ "'", str11.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str34);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.lang.String str4 = treeset_str1.pollFirst();
    java.util.NavigableSet<java.lang.String> navigableset_str9 = treeset_str1.subSet("", false, "[hi!]", false);
    boolean b10 = treeset_str1.isEmpty();
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str14, str_array13);
    boolean b16 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)arraylist_str14);
    java.lang.String str17 = treeset_str11.pollLast();
    java.util.Spliterator<java.lang.String> spliterator_str18 = treeset_str11.spliterator();
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str20 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str19);
    java.util.SortedSet<java.lang.String> sortedset_str22 = treeset_str20.tailSet("");
    java.lang.String str24 = treeset_str20.higher("");
    boolean b25 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)treeset_str20);
    java.util.SortedSet<java.lang.String> sortedset_str27 = treeset_str11.tailSet("");
    boolean b28 = treeset_str1.containsAll((java.util.Collection<java.lang.String>)sortedset_str27);
    java.util.TreeSet<java.lang.String> treeset_str29 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str30 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str29);
    java.lang.String str32 = treeset_str30.lower("");
    java.lang.String str33 = treeset_str30.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str34 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str30);
    java.util.SortedSet<java.lang.String> sortedset_str37 = treeset_str30.subSet("[]", "[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str38 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array40 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str41, str_array40);
    boolean b43 = treeset_str38.retainAll((java.util.Collection<java.lang.String>)arraylist_str41);
    java.util.TreeSet<java.lang.String> treeset_str44 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array46 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str47 = new java.util.ArrayList<java.lang.String>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str47, str_array46);
    boolean b49 = treeset_str44.retainAll((java.util.Collection<java.lang.String>)arraylist_str47);
    java.util.TreeSet<java.lang.String> treeset_str50 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array52 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str53 = new java.util.ArrayList<java.lang.String>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str53, str_array52);
    boolean b55 = treeset_str50.retainAll((java.util.Collection<java.lang.String>)arraylist_str53);
    java.util.ArrayList[] arrayList_array57 = new java.util.ArrayList[ 3 ];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.lang.String>[] arraylist_str_array58 = (java.util.ArrayList<java.lang.String>[])arrayList_array57;
    arraylist_str_array58[0] = arraylist_str41;
    arraylist_str_array58[1] = arraylist_str47;
    arraylist_str_array58[2] = arraylist_str53;
    java.util.ArrayList<java.lang.String>[] arraylist_str_array65 = treeset_str30.toArray(arraylist_str_array58);
    java.util.List<java.lang.String>[] list_str_array66 = treeset_str1.toArray((java.util.List<java.lang.String>[])arraylist_str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str_array66);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str3.iterator();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    boolean b14 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)arraylist_str12);
    boolean b16 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str18.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str18.headSet("", false);
    boolean b24 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b25 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b26 = treeset_str3.removeAll((java.util.Collection<java.lang.String>)treeset_str8);
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    boolean b32 = treeset_str27.retainAll((java.util.Collection<java.lang.String>)arraylist_str30);
    java.lang.String str33 = treeset_str27.pollLast();
    java.util.Iterator<java.lang.String> iterator_str34 = treeset_str27.descendingIterator();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str38 = new java.util.TreeSet<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str38, str_array37);
    java.util.NavigableSet<java.lang.String> navigableset_str40 = treeset_str38.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str41 = treeset_str38.iterator();
    boolean b42 = treeset_str27.equals((java.lang.Object)iterator_str41);
    java.util.Iterator<java.lang.String> iterator_str43 = treeset_str27.iterator();
    boolean b44 = treeset_str8.equals((java.lang.Object)treeset_str27);
    java.util.SortedSet<java.lang.String> sortedset_str46 = treeset_str8.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str47 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str48 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str47);
    java.util.TreeSet<java.lang.String> treeset_str49 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array51 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str52 = new java.util.ArrayList<java.lang.String>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str52, str_array51);
    boolean b54 = treeset_str49.retainAll((java.util.Collection<java.lang.String>)arraylist_str52);
    boolean b56 = treeset_str49.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str57 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str58 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str57);
    java.util.SortedSet<java.lang.String> sortedset_str60 = treeset_str58.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str63 = treeset_str58.headSet("", false);
    boolean b64 = treeset_str49.retainAll((java.util.Collection<java.lang.String>)navigableset_str63);
    boolean b65 = treeset_str48.retainAll((java.util.Collection<java.lang.String>)navigableset_str63);
    java.util.SortedSet<java.lang.String> sortedset_str67 = treeset_str48.headSet("hi!");
    boolean b68 = treeset_str8.containsAll((java.util.Collection<java.lang.String>)treeset_str48);
    java.lang.Object obj69 = treeset_str8.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj69);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    java.util.TreeSet<java.lang.String> treeset_str29 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array31 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    boolean b34 = treeset_str29.retainAll((java.util.Collection<java.lang.String>)arraylist_str32);
    java.lang.String str35 = treeset_str29.pollLast();
    java.util.Iterator<java.lang.String> iterator_str36 = treeset_str29.descendingIterator();
    java.util.Iterator<java.lang.String> iterator_str37 = treeset_str29.descendingIterator();
    boolean b38 = treeset_str28.retainAll((java.util.Collection<java.lang.String>)treeset_str29);
    java.lang.String str39 = treeset_str28.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str40 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str41 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str40);
    java.util.Iterator<java.lang.String> iterator_str42 = treeset_str41.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str43 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array45 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str46 = new java.util.ArrayList<java.lang.String>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str46, str_array45);
    boolean b48 = treeset_str43.retainAll((java.util.Collection<java.lang.String>)arraylist_str46);
    boolean b50 = treeset_str43.add("hi!");
    boolean b51 = treeset_str41.contains((java.lang.Object)"hi!");
    java.lang.String str53 = treeset_str41.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str56 = treeset_str41.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str57 = treeset_str41.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str58 = treeset_str41.descendingSet();
    java.lang.String str60 = treeset_str41.lower("[]");
    boolean b61 = treeset_str28.removeAll((java.util.Collection<java.lang.String>)treeset_str41);
    java.util.NavigableSet<java.lang.String> navigableset_str64 = treeset_str28.tailSet("[, hi!]", true);
    java.lang.Object[] obj_array65 = treeset_str28.toArray();
    java.util.Iterator<java.lang.String> iterator_str66 = treeset_str28.iterator();
    java.util.TreeSet<java.lang.String> treeset_str67 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str68 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str67);
    java.lang.String str70 = treeset_str68.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str73 = treeset_str68.headSet("hi!", true);
    treeset_str68.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str77 = treeset_str68.headSet("hi!", true);
    boolean b78 = treeset_str28.removeAll((java.util.Collection<java.lang.String>)treeset_str68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str3.iterator();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    boolean b14 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)arraylist_str12);
    boolean b16 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str18.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str18.headSet("", false);
    boolean b24 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b25 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b26 = treeset_str3.removeAll((java.util.Collection<java.lang.String>)treeset_str8);
    boolean b28 = treeset_str8.add("[hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str8.headSet("", false);
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array34 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array34);
    boolean b37 = treeset_str32.retainAll((java.util.Collection<java.lang.String>)arraylist_str35);
    java.util.stream.Stream<java.lang.String> stream_str38 = treeset_str32.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str40 = treeset_str32.headSet("");
    boolean b41 = treeset_str8.removeAll((java.util.Collection<java.lang.String>)treeset_str32);
    treeset_str32.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str45 = treeset_str32.headSet("[, hi!]", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str45);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", true);
    java.util.stream.Stream<java.lang.String> stream_str7 = treeset_str1.stream();
    java.lang.String str8 = treeset_str1.pollFirst();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.util.TreeSet<java.lang.String> treeset_str10 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array12 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str13 = new java.util.ArrayList<java.lang.String>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str13, str_array12);
    boolean b15 = treeset_str10.retainAll((java.util.Collection<java.lang.String>)arraylist_str13);
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str16);
    java.util.SortedSet<java.lang.String> sortedset_str19 = treeset_str17.tailSet("");
    boolean b20 = treeset_str10.equals((java.lang.Object)treeset_str17);
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    boolean b28 = treeset_str23.retainAll((java.util.Collection<java.lang.String>)arraylist_str26);
    boolean b30 = treeset_str23.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str31 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str32 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str31);
    java.util.SortedSet<java.lang.String> sortedset_str34 = treeset_str32.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str37 = treeset_str32.headSet("", false);
    boolean b38 = treeset_str23.retainAll((java.util.Collection<java.lang.String>)navigableset_str37);
    boolean b39 = treeset_str22.retainAll((java.util.Collection<java.lang.String>)navigableset_str37);
    boolean b40 = treeset_str10.equals((java.lang.Object)b39);
    java.lang.String str42 = treeset_str10.ceiling("[hi!]");
    java.util.Iterator<java.lang.String> iterator_str43 = treeset_str10.iterator();
    java.util.SortedSet<java.lang.String> sortedset_str46 = treeset_str10.subSet("", "hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str49 = treeset_str10.tailSet("[[]]", false);
    java.util.Iterator<java.lang.String> iterator_str50 = treeset_str10.iterator();
    // The following exception was thrown during execution in test generation
    try {
    boolean b51 = treeset_str1.contains((java.lang.Object)treeset_str10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str50);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.lang.String str7 = treeset_str3.ceiling("[hi!]");
    java.util.Spliterator<java.lang.String> spliterator_str8 = treeset_str3.spliterator();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str12, str_array11);
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str12.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str15 = treeset_str12.iterator();
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str16);
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array20 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    boolean b23 = treeset_str18.retainAll((java.util.Collection<java.lang.String>)arraylist_str21);
    boolean b25 = treeset_str18.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str26);
    java.util.SortedSet<java.lang.String> sortedset_str29 = treeset_str27.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str32 = treeset_str27.headSet("", false);
    boolean b33 = treeset_str18.retainAll((java.util.Collection<java.lang.String>)navigableset_str32);
    boolean b34 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)navigableset_str32);
    boolean b35 = treeset_str12.removeAll((java.util.Collection<java.lang.String>)treeset_str17);
    boolean b37 = treeset_str17.add("[hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str40 = treeset_str17.headSet("", false);
    boolean b41 = treeset_str3.remove((java.lang.Object)"");
    java.lang.Object obj42 = treeset_str3.clone();
    java.util.TreeSet<java.lang.String> treeset_str43 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array45 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str46 = new java.util.ArrayList<java.lang.String>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str46, str_array45);
    boolean b48 = treeset_str43.retainAll((java.util.Collection<java.lang.String>)arraylist_str46);
    java.util.TreeSet<java.lang.String> treeset_str49 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str50 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str49);
    java.util.SortedSet<java.lang.String> sortedset_str52 = treeset_str50.tailSet("");
    boolean b53 = treeset_str43.equals((java.lang.Object)treeset_str50);
    java.util.TreeSet<java.lang.String> treeset_str54 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str55 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str54);
    java.util.TreeSet<java.lang.String> treeset_str56 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array58 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str59 = new java.util.ArrayList<java.lang.String>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str59, str_array58);
    boolean b61 = treeset_str56.retainAll((java.util.Collection<java.lang.String>)arraylist_str59);
    boolean b63 = treeset_str56.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str64 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str65 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str64);
    java.util.SortedSet<java.lang.String> sortedset_str67 = treeset_str65.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str70 = treeset_str65.headSet("", false);
    boolean b71 = treeset_str56.retainAll((java.util.Collection<java.lang.String>)navigableset_str70);
    boolean b72 = treeset_str55.retainAll((java.util.Collection<java.lang.String>)navigableset_str70);
    boolean b73 = treeset_str43.equals((java.lang.Object)b72);
    java.lang.String str75 = treeset_str43.ceiling("[hi!]");
    java.util.TreeSet<java.lang.String> treeset_str76 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str43);
    boolean b77 = treeset_str43.isEmpty();
    java.lang.String str79 = treeset_str43.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str82 = treeset_str43.tailSet("", true);
    java.util.SortedSet<java.lang.String> sortedset_str84 = treeset_str43.headSet("[hi!]");
    // The following exception was thrown during execution in test generation
    try {
    boolean b85 = treeset_str3.remove((java.lang.Object)treeset_str43);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str84);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    boolean b13 = treeset_str11.add("[]");
    boolean b15 = treeset_str11.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array18 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str19, str_array18);
    boolean b21 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)arraylist_str19);
    boolean b23 = treeset_str16.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str16.tailSet("hi!", true);
    java.util.NavigableSet<java.lang.String> navigableset_str29 = treeset_str16.tailSet("[]", true);
    java.util.TreeSet<java.lang.String> treeset_str30 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str31 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str30);
    java.util.Iterator<java.lang.String> iterator_str32 = treeset_str31.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array35);
    boolean b38 = treeset_str33.retainAll((java.util.Collection<java.lang.String>)arraylist_str36);
    boolean b40 = treeset_str33.add("hi!");
    boolean b41 = treeset_str31.contains((java.lang.Object)"hi!");
    java.lang.String str43 = treeset_str31.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str46 = treeset_str31.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str47 = treeset_str31.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str48 = treeset_str31.descendingSet();
    java.util.TreeSet<java.lang.String> treeset_str49 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)navigableset_str48);
    java.lang.Object obj50 = treeset_str49.clone();
    java.lang.Object[] obj_array51 = treeset_str49.toArray();
    boolean b52 = treeset_str16.retainAll((java.util.Collection<java.lang.String>)treeset_str49);
    java.lang.String str54 = treeset_str16.higher("hi!");
    boolean b55 = treeset_str11.equals((java.lang.Object)treeset_str16);
    java.lang.String[] str_array62 = new java.lang.String[] { "", "", "[hi!]", "[[hi!]]", "[]", "[]" };
    java.util.TreeSet<java.lang.String> treeset_str63 = new java.util.TreeSet<java.lang.String>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str63, str_array62);
    java.util.NavigableSet<java.lang.String> navigableset_str69 = treeset_str63.subSet("[hi!]", false, "[hi!]", false);
    treeset_str63.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str73 = treeset_str63.tailSet("[[hi!]]", false);
    // The following exception was thrown during execution in test generation
    try {
    boolean b74 = treeset_str16.contains((java.lang.Object)treeset_str63);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str73);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.NavigableSet<java.lang.String> navigableset_str18 = treeset_str1.descendingSet();
    java.lang.String str20 = treeset_str1.lower("[]");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array23 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str24, str_array23);
    boolean b26 = treeset_str21.retainAll((java.util.Collection<java.lang.String>)arraylist_str24);
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    boolean b32 = treeset_str27.retainAll((java.util.Collection<java.lang.String>)arraylist_str30);
    java.util.TreeSet<java.lang.String> treeset_str33 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str36 = new java.util.ArrayList<java.lang.String>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str36, str_array35);
    boolean b38 = treeset_str33.retainAll((java.util.Collection<java.lang.String>)arraylist_str36);
    java.util.TreeSet<java.lang.String> treeset_str39 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array41 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<java.lang.String>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str42, str_array41);
    boolean b44 = treeset_str39.retainAll((java.util.Collection<java.lang.String>)arraylist_str42);
    java.util.TreeSet<java.lang.String> treeset_str45 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array47 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str48 = new java.util.ArrayList<java.lang.String>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str48, str_array47);
    boolean b50 = treeset_str45.retainAll((java.util.Collection<java.lang.String>)arraylist_str48);
    java.util.ArrayList[] arrayList_array52 = new java.util.ArrayList[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.lang.String>[] arraylist_str_array53 = (java.util.ArrayList<java.lang.String>[])arrayList_array52;
    arraylist_str_array53[0] = arraylist_str24;
    arraylist_str_array53[1] = arraylist_str30;
    arraylist_str_array53[2] = arraylist_str36;
    arraylist_str_array53[3] = arraylist_str42;
    arraylist_str_array53[4] = arraylist_str48;
    java.util.ArrayList<java.lang.String>[] arraylist_str_array64 = treeset_str1.toArray(arraylist_str_array53);
    java.util.NavigableSet<java.lang.String> navigableset_str65 = treeset_str1.descendingSet();
    java.lang.String str67 = treeset_str1.ceiling("[]");
    boolean b69 = treeset_str1.add("[[]]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>(sortedset_str3);
    java.lang.Object[] obj_array5 = treeset_str4.toArray();
    // The following exception was thrown during execution in test generation
    try {
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str4.subSet("[hi!]", true, "[]", true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    java.lang.String str12 = treeset_str0.toString();
    java.lang.String str14 = treeset_str0.ceiling("hi!");
    java.util.stream.Stream<java.lang.String> stream_str15 = treeset_str0.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[hi!]"+ "'", str12.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str15);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.subSet("", true, "[hi!]", true);
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();
    java.util.SortedSet<java.lang.String> sortedset_str10 = treeset_str0.subSet("[[hi!]]", "[[hi!]]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str10);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str25);
    java.util.Iterator<java.lang.String> iterator_str27 = treeset_str26.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array30 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str31, str_array30);
    boolean b33 = treeset_str28.retainAll((java.util.Collection<java.lang.String>)arraylist_str31);
    boolean b35 = treeset_str28.add("hi!");
    boolean b36 = treeset_str26.contains((java.lang.Object)"hi!");
    java.lang.String str38 = treeset_str26.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str43 = treeset_str26.subSet("[hi!]", true, "[hi!]", true);
    boolean b44 = treeset_str0.containsAll((java.util.Collection<java.lang.String>)treeset_str26);
    java.util.SortedSet<java.lang.String> sortedset_str46 = treeset_str0.tailSet("[, hi!]");
    java.util.TreeSet<java.lang.String> treeset_str47 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str48 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str47);
    java.util.Iterator<java.lang.String> iterator_str49 = treeset_str48.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str50 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array52 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str53 = new java.util.ArrayList<java.lang.String>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str53, str_array52);
    boolean b55 = treeset_str50.retainAll((java.util.Collection<java.lang.String>)arraylist_str53);
    boolean b57 = treeset_str50.add("hi!");
    boolean b58 = treeset_str48.contains((java.lang.Object)"hi!");
    java.lang.String str60 = treeset_str48.floor("[]");
    boolean b61 = treeset_str0.contains((java.lang.Object)"[]");
    boolean b63 = treeset_str0.add("[]");
    java.util.TreeSet<java.lang.String> treeset_str64 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str65 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str64);
    java.util.SortedSet<java.lang.String> sortedset_str67 = treeset_str65.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str70 = treeset_str65.headSet("", false);
    int i71 = treeset_str65.size();
    java.util.Iterator<java.lang.String> iterator_str72 = treeset_str65.descendingIterator();
    java.lang.String str74 = treeset_str65.ceiling("hi!");
    boolean b75 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str65);
    java.util.TreeSet<java.lang.String> treeset_str76 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str77 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str76);
    java.util.Iterator<java.lang.String> iterator_str78 = treeset_str77.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str79 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array81 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str82 = new java.util.ArrayList<java.lang.String>();
    boolean b83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str82, str_array81);
    boolean b84 = treeset_str79.retainAll((java.util.Collection<java.lang.String>)arraylist_str82);
    boolean b86 = treeset_str79.add("hi!");
    boolean b87 = treeset_str77.contains((java.lang.Object)"hi!");
    java.lang.String str89 = treeset_str77.ceiling("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str91 = treeset_str77.tailSet("");
    java.util.Spliterator<java.lang.String> spliterator_str92 = treeset_str77.spliterator();
    java.util.SortedSet<java.lang.String> sortedset_str94 = treeset_str77.tailSet("");
    boolean b95 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)sortedset_str94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.subSet("[hi!]", true, "hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.lang.String str17 = treeset_str15.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str20 = treeset_str15.headSet("hi!", true);
    boolean b21 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str15);
    java.util.stream.Stream<java.lang.String> stream_str22 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str25 = treeset_str0.subSet("[]", "[]");
    java.util.stream.Stream<java.lang.String> stream_str26 = treeset_str0.stream();
    java.lang.Object obj27 = treeset_str0.clone();
    java.util.SortedSet<java.lang.String> sortedset_str29 = treeset_str0.headSet("[]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str29);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.lang.String str20 = treeset_str1.higher("[, hi!]");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    int i22 = treeset_str21.size();
    java.util.NavigableSet<java.lang.String> navigableset_str25 = treeset_str21.headSet("[]", false);
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str21.descendingSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str4 = treeset_str1.subSet("hi!", "hi!");
    java.util.TreeSet<java.lang.String> treeset_str5 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.NavigableSet<java.lang.String> navigableset_str12 = treeset_str6.subSet("", true, "[hi!]", true);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str13);
    java.util.SortedSet<java.lang.String> sortedset_str16 = treeset_str14.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    boolean b23 = treeset_str14.retainAll((java.util.Collection<java.lang.String>)treeset_str17);
    java.util.NavigableSet<java.lang.String> navigableset_str26 = treeset_str14.headSet("", false);
    boolean b27 = treeset_str6.retainAll((java.util.Collection<java.lang.String>)treeset_str14);
    boolean b28 = treeset_str1.removeAll((java.util.Collection<java.lang.String>)treeset_str6);
    java.util.TreeSet<java.lang.String> treeset_str29 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array31 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    boolean b34 = treeset_str29.retainAll((java.util.Collection<java.lang.String>)arraylist_str32);
    boolean b36 = treeset_str29.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str39 = treeset_str29.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str40 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str29);
    boolean b42 = treeset_str40.add("[]");
    java.lang.String str44 = treeset_str40.floor("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str47 = treeset_str40.tailSet("[]", false);
    boolean b48 = treeset_str1.removeAll((java.util.Collection<java.lang.String>)treeset_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str3.iterator();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str3.iterator();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str11, str_array10);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str11.descendingSet();
    java.lang.String str14 = treeset_str11.pollLast();
    java.util.stream.Stream<java.lang.String> stream_str15 = treeset_str11.stream();
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str11.descendingIterator();
    boolean b17 = treeset_str3.removeAll((java.util.Collection<java.lang.String>)treeset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("", false);
    int i7 = treeset_str1.size();
    java.util.Iterator<java.lang.String> iterator_str8 = treeset_str1.descendingIterator();
    java.lang.String str10 = treeset_str1.ceiling("hi!");
    int i11 = treeset_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.TreeSet<java.lang.String> treeset_str6 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str6);
    java.util.SortedSet<java.lang.String> sortedset_str9 = treeset_str7.tailSet("");
    boolean b10 = treeset_str0.equals((java.lang.Object)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.TreeSet<java.lang.String> treeset_str13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    boolean b18 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)arraylist_str16);
    boolean b20 = treeset_str13.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str21);
    java.util.SortedSet<java.lang.String> sortedset_str24 = treeset_str22.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str27 = treeset_str22.headSet("", false);
    boolean b28 = treeset_str13.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b29 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)navigableset_str27);
    boolean b30 = treeset_str0.equals((java.lang.Object)b29);
    boolean b32 = treeset_str0.add("[]");
    java.lang.String str33 = treeset_str0.toString();
    java.util.NavigableSet<java.lang.String> navigableset_str36 = treeset_str0.tailSet("[]", false);
    java.util.stream.Stream<java.lang.String> stream_str37 = treeset_str0.stream();
    java.util.Comparator<? super java.lang.String> comparator_wildcard38 = treeset_str0.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[[]]"+ "'", str33.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard38);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.lang.String str8 = treeset_str0.toString();
    java.util.NavigableSet<java.lang.String> navigableset_str11 = treeset_str0.headSet("[]", false);
    boolean b12 = treeset_str0.isEmpty();
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str0.headSet("");
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]"+ "'", str8.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str10 = treeset_str0.tailSet("hi!", true);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str0);
    boolean b13 = treeset_str11.add("[]");
    java.lang.String str15 = treeset_str11.floor("[[]]");
    java.util.NavigableSet<java.lang.String> navigableset_str20 = treeset_str11.subSet("[, hi!]", true, "[]", true);
    java.util.TreeSet<java.lang.String> treeset_str21 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)navigableset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str20);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.util.stream.Stream<java.lang.String> stream_str6 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str8 = treeset_str0.headSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str0.subSet("[hi!]", true, "hi!", false);
    java.util.TreeSet<java.lang.String> treeset_str14 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str14);
    java.lang.String str17 = treeset_str15.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str20 = treeset_str15.headSet("hi!", true);
    boolean b21 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str15);
    java.util.stream.Stream<java.lang.String> stream_str22 = treeset_str0.parallelStream();
    java.util.SortedSet<java.lang.String> sortedset_str25 = treeset_str0.subSet("[]", "[]");
    java.util.Spliterator<java.lang.String> spliterator_str26 = treeset_str0.spliterator();
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str30 = treeset_str27.subSet("[]", "[hi!]");
    treeset_str27.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str30);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str0.subSet("", true, "[hi!]", true);
    java.lang.String str7 = treeset_str0.pollLast();
    java.lang.String str9 = treeset_str0.floor("[, hi!]");
    java.util.Comparator<? super java.lang.String> comparator_wildcard10 = treeset_str0.comparator();
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.SortedSet<java.lang.String> sortedset_str14 = treeset_str12.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array17 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<java.lang.String>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str18, str_array17);
    boolean b20 = treeset_str15.retainAll((java.util.Collection<java.lang.String>)arraylist_str18);
    boolean b21 = treeset_str12.retainAll((java.util.Collection<java.lang.String>)treeset_str15);
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.util.AbstractSet[] abstractSet_array24 = new java.util.AbstractSet[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.AbstractSet<java.lang.String>[] abstractset_str_array25 = (java.util.AbstractSet<java.lang.String>[])abstractSet_array24;
    abstractset_str_array25[0] = treeset_str22;
    java.util.AbstractSet<java.lang.String>[] abstractset_str_array28 = treeset_str15.toArray(abstractset_str_array25);
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str15.tailSet("", true);
    java.lang.String str32 = treeset_str15.pollLast();
    boolean b33 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)treeset_str15);
    java.lang.Object obj34 = treeset_str15.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_wildcard10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractSet_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractset_str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractset_str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj34);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    boolean b2 = treeset_str1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str25);
    java.util.Iterator<java.lang.String> iterator_str27 = treeset_str26.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str28 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array30 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str31, str_array30);
    boolean b33 = treeset_str28.retainAll((java.util.Collection<java.lang.String>)arraylist_str31);
    boolean b35 = treeset_str28.add("hi!");
    boolean b36 = treeset_str26.contains((java.lang.Object)"hi!");
    java.lang.String str38 = treeset_str26.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str43 = treeset_str26.subSet("[hi!]", true, "[hi!]", true);
    boolean b44 = treeset_str0.containsAll((java.util.Collection<java.lang.String>)treeset_str26);
    java.util.SortedSet<java.lang.String> sortedset_str46 = treeset_str0.tailSet("[, hi!]");
    java.util.NavigableSet<java.lang.String> navigableset_str49 = treeset_str0.tailSet("[hi!]", false);
    boolean b50 = treeset_str0.isEmpty();
    java.lang.String str51 = treeset_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]"+ "'", str51.equals("[]"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    boolean b17 = treeset_str0.equals((java.lang.Object)0);
    java.lang.String str19 = treeset_str0.ceiling("[[]]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.SortedSet<java.lang.String> sortedset_str3 = treeset_str1.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str4 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str7, str_array6);
    boolean b9 = treeset_str4.retainAll((java.util.Collection<java.lang.String>)arraylist_str7);
    boolean b10 = treeset_str1.retainAll((java.util.Collection<java.lang.String>)treeset_str4);
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str12 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str11);
    java.util.NavigableSet<java.lang.String> navigableset_str17 = treeset_str11.subSet("", true, "[hi!]", true);
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str18);
    java.util.SortedSet<java.lang.String> sortedset_str21 = treeset_str19.tailSet("");
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array24 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str25, str_array24);
    boolean b27 = treeset_str22.retainAll((java.util.Collection<java.lang.String>)arraylist_str25);
    boolean b28 = treeset_str19.retainAll((java.util.Collection<java.lang.String>)treeset_str22);
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str19.headSet("", false);
    boolean b32 = treeset_str11.retainAll((java.util.Collection<java.lang.String>)treeset_str19);
    boolean b33 = treeset_str11.isEmpty();
    java.util.NavigableSet<java.lang.String> navigableset_str34 = treeset_str11.descendingSet();
    boolean b35 = treeset_str4.retainAll((java.util.Collection<java.lang.String>)treeset_str11);
    java.util.SortedSet<java.lang.String> sortedset_str37 = treeset_str4.headSet("[[]]");
    java.lang.String str38 = treeset_str4.pollLast();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.lang.String str3 = treeset_str1.lower("");
    java.util.NavigableSet<java.lang.String> navigableset_str6 = treeset_str1.headSet("hi!", true);
    java.util.stream.Stream<java.lang.String> stream_str7 = treeset_str1.stream();
    java.util.Spliterator<java.lang.String> spliterator_str8 = treeset_str1.spliterator();
    java.util.Iterator<java.lang.String> iterator_str9 = treeset_str1.iterator();
    java.lang.String[][] str_array_array10 = new java.lang.String[][] {  };
    java.lang.String[][] str_array_array11 = treeset_str1.toArray(str_array_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array11);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    java.lang.String str6 = treeset_str0.pollLast();
    java.util.Iterator<java.lang.String> iterator_str7 = treeset_str0.descendingIterator();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str11 = new java.util.TreeSet<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str11, str_array10);
    java.util.NavigableSet<java.lang.String> navigableset_str13 = treeset_str11.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str14 = treeset_str11.iterator();
    boolean b15 = treeset_str0.equals((java.lang.Object)iterator_str14);
    java.util.Iterator<java.lang.String> iterator_str16 = treeset_str0.iterator();
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    boolean b22 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)arraylist_str20);
    boolean b24 = treeset_str17.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str25 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str25);
    java.util.SortedSet<java.lang.String> sortedset_str28 = treeset_str26.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str31 = treeset_str26.headSet("", false);
    boolean b32 = treeset_str17.retainAll((java.util.Collection<java.lang.String>)navigableset_str31);
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str36 = new java.util.TreeSet<java.lang.String>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str36, str_array35);
    java.util.NavigableSet<java.lang.String> navigableset_str38 = treeset_str36.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str39 = treeset_str36.iterator();
    java.util.Iterator<java.lang.String> iterator_str40 = treeset_str36.iterator();
    boolean b41 = treeset_str17.removeAll((java.util.Collection<java.lang.String>)treeset_str36);
    java.util.SortedSet[] sortedSet_array43 = new java.util.SortedSet[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.SortedSet<java.lang.String>[] sortedset_str_array44 = (java.util.SortedSet<java.lang.String>[])sortedSet_array43;
    sortedset_str_array44[0] = treeset_str17;
    java.util.SortedSet[][] sortedSet_array_array48 = new java.util.SortedSet[ 1 ][];
    @SuppressWarnings("unchecked")
    java.util.SortedSet<java.lang.String>[][] sortedset_str_array_array49 = (java.util.SortedSet<java.lang.String>[][])sortedSet_array_array48;
    sortedset_str_array_array49[0] = sortedset_str_array44;
    java.util.SortedSet<java.lang.String>[][] sortedset_str_array_array52 = treeset_str0.toArray(sortedset_str_array_array49);
    java.util.TreeSet<java.lang.String> treeset_str53 = new java.util.TreeSet<java.lang.String>();
    boolean b54 = treeset_str0.containsAll((java.util.Collection<java.lang.String>)treeset_str53);
    java.util.TreeSet<java.lang.String> treeset_str55 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str56 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str55);
    java.util.SortedSet<java.lang.String> sortedset_str58 = treeset_str56.tailSet("");
    java.util.SortedSet<java.lang.String> sortedset_str60 = treeset_str56.headSet("[[hi!]]");
    boolean b61 = treeset_str53.retainAll((java.util.Collection<java.lang.String>)treeset_str56);
    treeset_str56.clear();
    java.util.NavigableSet<java.lang.String> navigableset_str67 = treeset_str56.subSet("[[hi!]]", true, "[[hi!]]", true);
    int i68 = treeset_str56.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedSet_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedSet_array_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str_array_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str_array_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str3, str_array2);
    java.util.NavigableSet<java.lang.String> navigableset_str5 = treeset_str3.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str6 = treeset_str3.iterator();
    java.util.TreeSet<java.lang.String> treeset_str7 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str7);
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array11 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    boolean b14 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)arraylist_str12);
    boolean b16 = treeset_str9.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str17 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str17);
    java.util.SortedSet<java.lang.String> sortedset_str20 = treeset_str18.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str23 = treeset_str18.headSet("", false);
    boolean b24 = treeset_str9.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b25 = treeset_str8.retainAll((java.util.Collection<java.lang.String>)navigableset_str23);
    boolean b26 = treeset_str3.removeAll((java.util.Collection<java.lang.String>)treeset_str8);
    java.util.TreeSet<java.lang.String> treeset_str27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array29 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str30, str_array29);
    boolean b32 = treeset_str27.retainAll((java.util.Collection<java.lang.String>)arraylist_str30);
    java.lang.String str33 = treeset_str27.pollLast();
    java.util.Iterator<java.lang.String> iterator_str34 = treeset_str27.descendingIterator();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str38 = new java.util.TreeSet<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str38, str_array37);
    java.util.NavigableSet<java.lang.String> navigableset_str40 = treeset_str38.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str41 = treeset_str38.iterator();
    boolean b42 = treeset_str27.equals((java.lang.Object)iterator_str41);
    java.util.Iterator<java.lang.String> iterator_str43 = treeset_str27.iterator();
    boolean b44 = treeset_str8.equals((java.lang.Object)treeset_str27);
    java.util.TreeSet<java.lang.String> treeset_str45 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str8);
    java.lang.String str46 = treeset_str45.pollFirst();
    java.util.SortedSet<java.lang.String> sortedset_str48 = treeset_str45.tailSet("[hi!]");
    java.lang.String str50 = treeset_str45.lower("");
    java.lang.String str52 = treeset_str45.floor("hi!");
    java.lang.String str53 = treeset_str45.pollLast();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str3 = new java.util.ArrayList<java.lang.String>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str3, str_array2);
    boolean b5 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)arraylist_str3);
    boolean b7 = treeset_str0.add("hi!");
    java.util.TreeSet<java.lang.String> treeset_str8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str8);
    java.util.SortedSet<java.lang.String> sortedset_str11 = treeset_str9.tailSet("");
    java.util.NavigableSet<java.lang.String> navigableset_str14 = treeset_str9.headSet("", false);
    boolean b15 = treeset_str0.retainAll((java.util.Collection<java.lang.String>)navigableset_str14);
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "" };
    java.util.TreeSet<java.lang.String> treeset_str19 = new java.util.TreeSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)treeset_str19, str_array18);
    java.util.NavigableSet<java.lang.String> navigableset_str21 = treeset_str19.descendingSet();
    java.util.Iterator<java.lang.String> iterator_str22 = treeset_str19.iterator();
    java.util.Iterator<java.lang.String> iterator_str23 = treeset_str19.iterator();
    boolean b24 = treeset_str0.removeAll((java.util.Collection<java.lang.String>)treeset_str19);
    java.util.Iterator<java.lang.String> iterator_str25 = treeset_str0.iterator();
    java.lang.String str27 = treeset_str0.lower("hi!");
    java.util.SortedSet<java.lang.String> sortedset_str29 = treeset_str0.headSet("[[hi!]]");
    boolean b31 = treeset_str0.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

    java.util.TreeSet<java.lang.String> treeset_str0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str1 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str0);
    java.util.Iterator<java.lang.String> iterator_str2 = treeset_str1.descendingIterator();
    java.util.TreeSet<java.lang.String> treeset_str3 = new java.util.TreeSet<java.lang.String>();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    boolean b8 = treeset_str3.retainAll((java.util.Collection<java.lang.String>)arraylist_str6);
    boolean b10 = treeset_str3.add("hi!");
    boolean b11 = treeset_str1.contains((java.lang.Object)"hi!");
    java.lang.String str13 = treeset_str1.ceiling("hi!");
    java.util.NavigableSet<java.lang.String> navigableset_str16 = treeset_str1.headSet("", false);
    java.util.Iterator<java.lang.String> iterator_str17 = treeset_str1.iterator();
    java.util.TreeSet<java.lang.String> treeset_str18 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>)treeset_str1);
    boolean b19 = treeset_str1.isEmpty();
    java.util.SortedSet<java.lang.String> sortedset_str21 = treeset_str1.headSet("[, hi!]");
    java.util.TreeSet<java.lang.String> treeset_str22 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> treeset_str23 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>)treeset_str22);
    java.lang.String str25 = treeset_str23.lower("");
    boolean b26 = treeset_str23.isEmpty();
    java.util.NavigableSet<java.lang.String> navigableset_str29 = treeset_str23.tailSet("hi!", true);
    boolean b30 = treeset_str1.contains((java.lang.Object)true);
    treeset_str1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortedset_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(navigableset_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

}
