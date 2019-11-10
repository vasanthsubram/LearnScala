package classes


//the primary constructor is in the class signature (var x: Int, var y: Int)
class Point(var x: Int, var y: Int) {

  def move(dx :Int, dy: Int): Unit={
    x = x + dx
    y = y+ dx
  }

  override def toString = s"($x, $y)"
}


object PointMain{
  def main(args : Array[String]): Unit ={
    val point = new Point(2,3)
    point.move(10,10)
    println(point.toString())
  }
}

