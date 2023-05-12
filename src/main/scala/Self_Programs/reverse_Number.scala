package Self_Programs

object reverse_Number {

  def main(args:Array[String]): Unit={

    println("Enter The Number for reverse order ")
    var num = scala.io.StdIn.readInt()

    var rev = 0
    while(num != 0){

//      num=num%10
      rev = rev*10+num%10
      num = num/10

    }
    println(s"Reverse Number is : $rev")

  }
}
