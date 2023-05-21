package Array_Programs

object palindrome_Number {
  def main(args: Array[String]): Unit = {

    val num = 454;
    var a=num
    var rev =0
    var rem =0

    while (a > 0) {

      rem = a % 10
      rev = rev * 10 + rem
      a = a / 10
    }

      if (num == rev) {
        println(s"This is Palindrome Number  :$num")
      }
      else {
        println(s"This is not Palindrome number  :$num")
      }
    }

  }

