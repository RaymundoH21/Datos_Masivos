
<p align="center">
    <img alt="Logo" src="https://www.tijuana.tecnm.mx/wp-content/uploads/2021/08/liston-de-logos-oficiales-educacion-tecnm-FEB-2021.jpg" width=850 height=250>
</p>

<H2><p align="Center">TECNOLÓGICO NACIONAL DE MÉXICO</p></H2>

<H2><p align="Center">INSTITUTO TECNOLÓGICO DE TIJUANA</p></H2>

<H2><p align="Center">SUBDIRECCIÓN ACADÉMICA</p></H2>

<H2><p align="Center">DEPARTAMENTO DE SISTEMAS Y COMPUTACIÓN</p></H2>

<H2><p align="Center">NOMBRE DE LOS ALUMNOS: </p></H2>

<H2><p align="Center">RAYMUNDO HIRALES LAZARENO (N. CONTROL: 17212339)</p></H2>

<H2><p align="Center">PAULA ANDREA RAMOS VERDIN (N.CONTROL: 18210721)</p></H2>

<H2><p align="Center">Carrera: Ingeniería Informática</p></H2>

<H2><p align="Center">MATERIA: Datos masivos</p></H2>

<H2><p align="Center">PROFESOR: JOSE CHRISTIAN ROMERO HERNANDEZ</p></H2>

<H2><p align="Center">TRABAJOS: Practica 4</p></H2>

<H2><p align="Center">FECHA: 09/03/22</p></H2>

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>




###

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