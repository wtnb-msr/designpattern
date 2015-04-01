package design;

public class ThreadCount {

  private int numThreads;

  public ThreadCount(int numThreads) {
    setNumThreads(numThreads);
  }

  public void setNumThreads(int numThreads) {
    if (numThreads < 0) {
      throw new IllegalArgumentException();
    }
    this.numThreads = numThreads;
  }

  public int getNumThreads() {
    return this.numThreads;
  }
}
