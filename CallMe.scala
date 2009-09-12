package jvm_summit

class CallMe {
  final def count(in: Int): Int = 
    if (in >= 1000) in else count(in + 1)
  
}

class NoTail {
  def count(in: Int): Int = 
    if (in >= 1000) in else count(in + 1)  
}

class WhyNo extends NoTail {
  override def count(in: Int): Int = 
    if (in > 500) in else super.count(in)
}
