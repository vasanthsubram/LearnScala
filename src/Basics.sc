object Basics{
  println("Hello, world!")

  1+1

  //values - constants
  val x = 1 + 1
  println(x)

  // Values cannot be re-assigned.
  //x = 20

  //Types of values can be inferred, but you can also explicitly state the type,
  // like this:
  val y: Int = 1 + 1

  //Variables are like values, except you can re-assign them.
  // You can define a variable with the var keyword.

  var  z = 5
  println(z)

  z = z + 10
  println(z)

  var z2: Int = 50
  println(z2)

  //blocks
  println({var x1 = 200+300
  println("x1=" + x1)
  })
}