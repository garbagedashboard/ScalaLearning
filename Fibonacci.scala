/* Another comment */
/** A documentation comment */
object Fibonacci {
 def fibs(n: Int): Int = {
   if (n<0) return -1
    n match {
	case 1 =>1
	case 0 => 0
	case _ => fibs(n-1)+fibs(n-2)	
}
}
 def main(args: Array[String]): Unit = {
 println(fibs(-42))
 println(fibs(12))
	}
 
}

