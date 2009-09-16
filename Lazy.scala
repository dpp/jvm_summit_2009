package jvm_summit

class LazyPerson extends Access {
  lazy val name = System.currentTimeMillis.toString
}