package jvm_summit

class Variable {
  def doSomething(f: Int => Unit ) = f(42)
  
  def refVar() {
    var x = 0
    doSomething(y => x += y)
    assert(x == 42)
  }
}