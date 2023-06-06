package Array_Programs

object find_Palindrome {
  def main(args:Array[String]):Unit= {
    for (i <- 1 to 100) {

      var rev = 0
      var rem = 0

      var a = i
      while (a > 0) {

        rem = a % 10
        rev = rev * 10 + rem
        a = a / 10
      }
      if (i == rev) {
        println(s"This is Palindrome Number :$i")
      }
    }
  }

}
