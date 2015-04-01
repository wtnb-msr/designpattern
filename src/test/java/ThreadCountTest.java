package design;

import static org.junit.Assert.*;
import org.junit.Test;

public class ThreadCountTest {

  @Test
  public void test1() {
    int numThreads = 0;
    ThreadCount threadCount = new ThreadCount(numThreads);
    assertEquals(numThreads, threadCount.getNumThreads());
  }

  @Test
  public void test2() {
    int numThreads = 4;
    ThreadCount threadCount = new ThreadCount(0);
    threadCount.setNumThreads(numThreads);
    assertEquals(numThreads, threadCount.getNumThreads());
  }

  @Test(expected = IllegalArgumentException.class)
  public void test3() {
    int numThreads = -1;
    ThreadCount threadCount = new ThreadCount(numThreads);
    assertEquals(numThreads, threadCount.getNumThreads());
  }

}
