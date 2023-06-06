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
   
