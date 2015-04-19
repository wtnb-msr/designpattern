package design.scala

case class ThreadCount(numThreads: Int) {
  require(numThreads > -1, "numThreads must be greater than or equal to 0")

  def setNumThreads(numThreads: Int) =
    this.copy(numThreads = numThreads)

}