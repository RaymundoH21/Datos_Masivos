//RAYMUNDO HIRALES LAZARENO - 17212339
//PAULA ANDREA RAMOS VERDIN - 18210721
//Exam Unit 1 - 22/03/22

//1.- Comienza con una simple sesion de spark
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

//2.- Cargue el Archivo Netflix Stock CSV, haga que Spark infiere los tipos de datos

//val Netflix = spark.read.option("header", "true").option ("inferSchema", "true") csv ("Netflix_2011_2016.csv")


//3.- ¿Cuáles son los nombres de las columnas?

//4.- ¿Cómo es el esquema?

//5.- Imprime las primeras 5 columnas.

//6.-Usa describe () para aprender sobre el DataFrame.

//7.- Crea un nuevo dataframe con una columna nueva llamada “HV Ratio” que es la relación que
//existe entre el precio de la columna “High” frente a la columna “Volumen” de acciones
//negociadas por un día. Hint - es una operación
