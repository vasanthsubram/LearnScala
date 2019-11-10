package classes

class Point2 {

  private var _x: Int = 0
  private var _y: Int = 0

  def x = _x
  def y = _y

  def x_= (newVal: Int): Unit ={
    _x = newVal
  }

  def y_=(newVal: Int): Unit ={
    _y = newVal
  }

  override def toString=s"($x $y)"
}

object Point2Main{

  def main(args: Array[String]) {

    var point = new Point2();
    point.x=2
    point.y=3

    println(point)
  }
}
