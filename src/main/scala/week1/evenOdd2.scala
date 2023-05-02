package week1

object evenOdd2 {

  def main(args:Array[String]): Unit ={

    val num=1 to 100
     println("Even Numbers :")
    for(i<-num){

      if(i%2==0){
        print(s" $i")
      }

    }
    println("\n Odd Numbers :")
    for(i<-num){
      if(i%2 !=0){
       print(s" $i")
      }
    }
  }

}
