package design.scala

import org.specs2.mutable.SpecificationWithJUnit

class ThreadCountSpec extends SpecificationWithJUnit {

  "ThreadCount" should {
    "return given value" in {
      val numThreads = 2
      val threadCount = ThreadCount(numThreads)
      threadCount.numThreads must_== numThreads
    }
    "return given value" in {
      val numThreads = 4
      val threadCount = ThreadCount(0)
      threadCount.numThreads = numThreads
      threadCount.numThreads must_== numThreads
    }
    "throw exception when given value is minus" in {
      val numThreads = -1
      ThreadCount(numThreads) must throwA[IllegalArgumentException]
    }
  }
}
