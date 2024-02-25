### Socket communication: image transfer and manipulation

This assignment involves establishing a socket connection between a client and a server.

Your task is to develop an executable jar that can initiate either the client or the server application. 
Launch the server using the following command-line instruction, where 12345 represents the port number:

```
java -jar ImageTransfer-1.0.jar server 12345
```

To start the client, use this command:
```
java -jar ImageTransfer-1.0.jar client 127.0.0.1 12345
```

Here, you specify the server's IP address and port number.

When the server is operational, it will receive a jpg image from the client. The server will then convert this image into greyscale and return the altered image to the client, which will display it.

- Step 1: Begin by reading about socket communication: https://docs.oracle.com/javase/tutorial/networking/sockets/index.html. 
Starting with implementing the EchoServer and EchoClient example is beneficial.

- Step 2: Fill in the missing pieces in the Util class. This is where you'll find methods for sending and receiving an image, as well as the algorithm for changing the image from color to greyscale.

- Step 3: Develop the server's code, incorporating extra debug messages for clarity.

- Step 4: Develop the client's code, also including additional debug messages.

- Step 5: Create the main application that ties everything together.

- Step 6: Modify the pom.xml file to enable the construction of an executable jar. Proceed to test your application.
