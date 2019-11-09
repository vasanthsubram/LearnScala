object functionsAndMethods{
  //Functions are expressions that take parameters
  // Functions have no name or no return type

  //You can define an anonymous function (i.e. no name) that returns a given integer plus one:
  (x: Int) => x + 1

  //assign the anonymous function to a variable
  var addOne = (x: Int) => x +1
  println(addOne(100))

  //Functions may take multiple parameters.
  var addTwo = (x: Int, y:Int) => x +y
  println(addTwo(2,3))

  //Or it can take no parameters.
  var bigQuestion = () => 42
  println(bigQuestion())

  //Methods
  //Methods look and behave very similar to functions
  //Methods are defined with the def keyword.
  // def is followed by a name, parameter lists, a return type, and a body.

  def add(x: Int, y: Int): Int = x + y
  println(add(1, 2)) // 3

  //Or no parameter lists at all.
  def name: String = {System.getProperty("user.name")}
  println("Hello " + name)

  //The last expression in the body is the method’s return value.
  // (Scala does have a return keyword, but it’s rarely used.)

  def getSquare(x: Int): Int ={
    val result = x * x
    result
  }
  println(getSquare(100))

}