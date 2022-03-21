//RAYMUNDO HIRALES LAZARENO - 17212339
//PAULA ANDREA RAMOS VERDIN - 18210721
//Exam Unit 1 - 22/03/22

//1.- Comienza con una simple sesion de spark
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

//2.- Cargue el Archivo Netflix Stock CSV, haga que Spark infiere los tipos de datos

val Net = spark.read.option("header", "true").option ("inferSchema", "true") csv ("Netflix_2011_2016.csv")
net
net.printSchema()

//3.- ¿Cuáles son los nombres de las columnas?
net.columns

//4.- ¿Cómo es el esquema?
net.printSchema()

//5.- Imprime las primeras 5 columnas.
var col = 0
while(col < 5)
{
    println(net.columns(col))
    col = col + 1
}

//6.-Usa describe () para aprender sobre el DataFrame.
net.describe().show()

//7.- Crea un nuevo dataframe con una columna nueva llamada “HV Ratio” que es la relación que
//existe entre el precio de la columna “High” frente a la columna “Volumen” de acciones
//negociadas por un día. Hint - es una operación
import org.apache.spark.sql.Column
val nData = net.withColumn("HVRatio", net("High")/net("Volume"))
nData.show() 
