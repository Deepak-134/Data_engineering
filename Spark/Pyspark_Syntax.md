# Spark Syntax

## Create an DataFrame

- From RDD
```
rdd = spark.sparkContext.parallize([1,2,3,4,5,6])
df = rdd.toDF(schema)
```
```df = spark.createDataFrame(rdd,schema)```
