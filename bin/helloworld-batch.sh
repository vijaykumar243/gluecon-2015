#!/bin/bash
#curl -O https://raw.githubusercontent.com/silicon-valley-data-science/gluecon-2015/master/datasets/drwho.dat
spark-shell --packages com.databricks:spark-avro_2.10:1.0.0,com.databricks:spark-csv_2.10:1.0.3 < ./scala/drwho.scala
