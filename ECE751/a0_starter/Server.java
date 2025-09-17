import java.io.*;
import java.net.*;

class Server {
	public static void main(String args[]) throws Exception {
		if (args.length != 1) {
			System.out.println("usage: java Server port");
			System.exit(-1);
		}
		int port = Integer.parseInt(args[0]);

		ServerSocket ssock = new ServerSocket(port);
		System.out.println("listening on port " + port);
		while(true) {
			try {
				/*
				  YOUR CODE GOES HERE
				  - accept a connection from the server socket
				  - for each connection, read and process requests from this
				    connection repeatedly until the client closes it
				    (do this in a dedicated thread so that multiple connections
				    can be handled in parallel)
				  - for each request, compute an output and send a response
				    back to the client over the same connection
				  - each message has a 4-byte header followed by a payload
				  - the header is the length of the payload
				    (signed, two's complement, big-endian)
				  - the payload is an ASCII string
				*/
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
