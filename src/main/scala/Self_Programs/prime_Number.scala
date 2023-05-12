package Self_Programs

object prime_Number {

  def main(args:Array[String]): Unit={

             println("Enter the Number")
             val num = scala.io.StdIn.readInt()
             var count=0
             if(num>1){

                    for(i<- 1 to num){

                         if(num%i == 0)
                           count=count+1
                    }
               if(count==2){
                 println(s"This is Prime Number  : $num")
               }
               else{
                 println(s"This is Not Prime Number : $num")
               }
             }
             else {

                 println(s"Invalid number ")

             }
  }

}
