#Lambda

Layers:- A layer is a ZIP archive that contains libraries, a custom runtime, or other dependencies. 
         Layers let you install all the modules you need for your application to run.
     
Q> How to add layers ?
----> Firstly create directories :- mkdir -p aws-layer/python/lib/python3.7/site-packages
      
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

