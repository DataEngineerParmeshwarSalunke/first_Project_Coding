package Array_Programs

object array_Demo {
  def main(array: Array[String]): Unit ={

    val arr = new Array[Int](5)

    val arr2:Array[Int] = new Array[Int](5)

    arr(0) = 20
    arr(1) = 30
    arr(2) = 40
    arr(3) = 50
    arr(4) = 60

          for(x <- arr){

              print(s"  $x")
             }
              println(" ")

    arr2(0) = 2
    arr2(1) = 4
    arr2(2) = 6
    arr2(3) = 8
    arr2(4) = 10

          for(i <- 0 to (arr2.length-1)){

            print(arr2(i) + " ")
           }

  }
}
