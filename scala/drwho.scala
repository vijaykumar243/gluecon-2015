val sqlContext = new org.apache.spark.sql.SQLContext(sc)
 
val drWho = sqlContext.load("com.databricks.spark.csv", Map("path" -> "./datasets/drwho.dat", "header" -> "true", "delimiter" -> "|"))
 
drWho.save("drwho_avro/", "com.databricks.spark.avro")
