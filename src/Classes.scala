class Greeter(prefix : String, suffix: String) {

  def greet(name: String): Unit = {
    println(prefix + name + suffix)
  }
}

//Objects are single instances of their own definitions. You can think of them as singletons of their own classes.
object runGreeter{
  //Using an object, you can define a main method as follows:
  def main(args: Array[String]): Unit ={
    val greeter = new Greeter("Hello ", " !")
    greeter.greet(System.getProperty("user.name"))
}

}
