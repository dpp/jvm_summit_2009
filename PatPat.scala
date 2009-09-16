package jvm_summit

case class Namey(name: String, age: Int)

class PatPat {
  def check(in: Any): String = in match {
    case i: Int => "Integer: "+(i + 3)
    case d: Double if d > 0.0D => "Double: "+(d * 2D)
    case Namey(n, 45) => "Name: "+n
    case x => "Dunno "+x
  }
  
  val n = Namey("David", 45)
  val older = n.copy(age = n.age + 1)
}