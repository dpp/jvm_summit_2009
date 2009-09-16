package jvm_summit

trait Access {
  def name: String
}

class Person extends Access {
  var name = "David"
}