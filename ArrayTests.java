import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2(){
    int[] input = { 1, 2, 3};
    ArrayExamples.reverseInPlace(input);
    System.out.println(input.toString());
    assertArrayEquals(new int[]{ 3, 2, 1 }, input);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2(){
    int[] input = { 1, 2, 3};
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input));
  }

  @Test
  public void testAverage2(){
    double[] input = { 2.0, 2.0 };
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input), 0.0001);
  }

  @Test
  public void testAverage(){
    double[] input = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input), 0.0001);
    double[] input2 = { 1.0, 2.0 };
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input2), 0.0001);
    double[] input3 = {3.0, 3.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input3), 0.0001);
  }
}
