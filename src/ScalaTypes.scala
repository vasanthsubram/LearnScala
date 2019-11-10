object ScalaTypes {

  def main(args: Array[String]) {

    val x: Long = 1234556789
    val y: Float = x;
    //val z: Long = y   //wont compile
    println(y)

    val smiley = '\u263a'
    println(smiley)

    var list: List[Any] = List(" a string", 456, 'c', true, () => "anonymous function returning string")
    println(list)

  }
}
