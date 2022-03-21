# Datos_Masivos
# EVALUATION 1

## 1.- Start a simple Spark session.

''''R
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

## 2.- Load the Netflix Stock CSV file, have Spark infer the data types.

val net = spark.read.option("header", "true").option ("inferSchema", "true") csv ("Netflix_2011_2016.csv")
net
net.printSchema()

## 3.- What are the column names?

net.columns

## 4.- How is the scheme?

net.printSchema()

## 5.- Print the first 5 columns.

var col = 0
while(col < 5)
{
    println(net.columns(col))
    col = col + 1
}

## 6.- Use describe() to learn about the DataFrame.

net.describe().show()

## 7.- Create a new dataframe with a new column called “HV Ratio” which is the ratio that
## exists between the price of the “High” column versus the “Volume” column of shares
## traded for one day. Hint - is an operation

import org.apache.spark.sql.Column
val nData = net.withColumn("HVRatio", net("High")/net("Volume"))
nData.show() 