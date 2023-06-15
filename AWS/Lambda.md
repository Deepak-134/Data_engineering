# Lambda

## Layers 
         A layer is a ZIP archive that contains libraries, a custom runtime, or other dependencies. 
         Layers let you install all the modules you need for your application to run.
     
Q> How to add layers ?
      
Firstly create directories :- mkdir -p aws-layer/python/lib/python3.7/site-packages
      
Install necessary modules in that directory :- pip3 install numpy --target aws-layer/python/lib/python3.7/site-packages  **OR**
If you have multiple modules, put them in a file :- nano modules.txt ------> pandas == 1.1.4
                                                                             numpy == 1.19.4
                                        then:- pip3 install -r modules.txt --target aws-layer/python/lib/python3.7/site-packages
      
Create a zip file for the layer that will be uploaded :-  cd aws-layer
                                                          zip -r9 lambda-layer.zip
                                                                
Add the layer using Consol.
      
Q> What is max execution time in lambda ?
-----> 900 seconds (15 minutes)

Q> Memory and Disk in Lambda.
-----> The disk space (ephemeral) is limited to 512 MB.
       The default deployment package size is 50 MB.
       The memory range is from 128 to 3008 MB.  **NEW UPDATE** ===> memory range from 128 to 10,240 MB (10GB)

## Synchronous & asynchronous functions/events/invocation
### Synchronous functions
Lambda functions execute immediately when you perform the Lambda Invoke by API call, we wait for the function to process the function and return back to response. When we perform a synchronous invocation, we are responsible for inspecting the response and determining if there was an error like time out exceptions and decide to retry the invocation.   **— invocation-type RequestResponse**
EX:- Lambda function use pymysql to access RDS and get required data.
In this we need to wait for the function to fetch the data, also we can view the result and check for errors.

### Asynchronous functions
Lambda functions works with events and invoke by events and not respond immediately.
In an asynchronous flow, you don’t need to wait for the response from a Lambda function.
The Lambda service places an event in a queue and returns a “success” response. It won’t have any information other than a status code.
A separate process reads events from the queue and sends them to your function.
**— invocation-type event**
Ex:- S3 bucket write triggers a lambda function.
