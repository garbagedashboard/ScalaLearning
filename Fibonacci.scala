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
def formatResult(name: String, n: Int, f: Int => Int) = {
	val msg = "The %s of %d is %d."
	msg.format(name, n, f(n))
}

 def main(args: Array[String]): Unit = {
 println(fibs(-42))
 println(fibs(12))
 println(formatResult("Fibonacci", 7, fibs))
	}
 
}

