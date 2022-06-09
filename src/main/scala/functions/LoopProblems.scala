package functions

// We are Doing Problem #5, which is the Diophantine Linear Equation One
// Equation is ax + by = c | We have the variables a, b, c, and n.
// We have to find all Int solutions (|x| < n and |y| < n).
// We have to go from -n to n.

object LoopProblems {

def DioPhantineEquation(n: Int, c: Int, a:Int, b:Int) = {

for {
    x <- 0 to n
    y <- 0 to n
    if a*x + b*y == c 
} yield(x,y)

}


def main (argv: Array[String]): Unit =
   println({DioPhantineEquation(100,28,2,4)})

}












