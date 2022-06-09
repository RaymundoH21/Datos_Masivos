//RAYMUNDO HIRALES LAZARENO - 17212339
//PAULA ANDREA RAMOS VERDIN - 18210721
//Practica 4 - 09/03/22

//1. Algoritmo 1 Recursiva descendente

def fibonacci(n:Int):Int = 
{
    if(n<2)
    {
        return n
    }
    else
    {
        return (fibonacci(n-1)+ fibonacci(n-2))
    }
}

//2. Algoritmo 2 Formula explicita

var p: Double = 0
var j: Double = 0

def fibonacci1(n:Double):Double =
{
    if(n<2)
    return n
    else
    {
        p = ((1 + Math.sqrt(5))/2)
        j = ((Math.pow(p,n)- Math.pow((1-p), n))/ Math.sqrt (5))
        return j
    }
}

//3. Algoritmo 3 Version Iterativa

def fibonacci2(n2:Int): Int =
{
    var a = 0
    var b = 1
    var c = 0

    for (k <- Range(0, n2))
    {
        c = b + a
        a = b
        b = c 
    }

    return a
}

//4. Algoritmo Iterativa con 2 variables

def fibonacci3(n:Int): Int =
{
    var a = 0;
    var b = 1;

    for(k <- Range(0, n))
    {
        b = b + a;
        a = b - a;
    }

    return b;
}

//5. Algoritmo Iterativo con Arreglos 

def fibonacci4(n: Int): Int =
{
    if(n < 2)
    {
        return n;
    }
    else
    {
        var arre = Array.ofDim[Int](n + 1);
        arre(0) = 0;
        arre(1) = 1;

        for(k <- Range(2, n + 1))
        {
            arre(k) = ar(k - 1) + arre(k - 2);
        }
        
        return arre(n);
    }
}
