package jvm_summit

class BoxBox {
  def in(i: Int): List[Int] = i :: Nil
  def out(lst: List[Int]): Int = lst.head
}
