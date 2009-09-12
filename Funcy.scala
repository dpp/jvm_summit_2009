package jvm_summit

object Invoker {
  def invoke(f: () => Int): Int = f()
}

class CallInvoker {
  def intFunc(): Int = 5
  def doCall() = Invoker.invoke(intFunc _)
}
