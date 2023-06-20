## To find max, min, avg from a column in dataframe,

dfff = self.spark.createDataFrame([(1., 4.), (2., 5.), (3., 6.)], ["A", "B"])

# Method 1: Use describe()  (Take more time)
max_val = float(dfff.describe("A").filter("summary = 'max'").select("A").collect()[0].asDict()['A'])

# Method 3: Use groupby()    ***
max_val = dfff.groupby().max('A').collect()[0].asDict()['max(A)']

# Method 4: Convert to RDD  
max_val = dfff.select("A").rdd.max()[0]

# Method 5: Use agg()    ***
max_val = dfff.agg({"A": "max"}).collect()[0][0]


## To convert a Dataframe column to List
Link :- https://mungingdata.com/pyspark/column-to-list-collect-tolocaliterator/

1) By using toPandas()   (Suited for huge data)
# Firstly convert Spark dataframe to Pandas df, then convert a single pandas df column to list.
pd_df = df.select('empid','name').toPandas()['empid','name']
empid = list(pd_df['empid'])
name = list(pd_df['name'])

2) By List comprehension   (Not suited for huge data)
dep = [row[0] for row in df.select('department').collect()]













1) SELECT * FROM COUNTRY
   WHERE AREA >= 3000000 OR POPULATION >= 25000000;
   
   df.filter((df['area'] >= 3000000) | (df['population'] >= 25000000))
  
2) SELECT DISTINCT AUTHOR_ID AS ID
   FROM VIEWS
   WHERE AUTHOR_ID = VIEWER_ID
   ORDER BY ID;
   
   df.filter(df.author_id == df.viewer_id).select(df.author_id.alias('id')).distinct().orderBy(df.id.asc())
    
3) SELECT TWEET_ID
   FROM TWEETS
   WHERE CHAR_LENGTH(CONTENT) > 15;
   
   df.filter(len(df.content) > 15).select(df.tweet_id)

4) SELECT UNIQUE_ID, NAME
   FROM Employees LEFT JOIN EmployeeUNI
   ON Employees.ID = EmployeeUNI.ID

   Employees.join(EmployeeUNI, Employees.id == EmployeeUNI.id, 'left').select(df['unique_id'],df['name'])
   
