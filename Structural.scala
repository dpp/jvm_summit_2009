package jvm_summit

object Structural {
  def getLen(in: {def length(): Int}): Int =
    in.length

  def main(in: Array[String]) {
    getLen("Hello")
    getLen(new Lenny)
  }
}

class Lenny {
  def length() = 55
}

