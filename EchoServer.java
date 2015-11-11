//: c15: EchoServer.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// Very simple server that just
// echoes whatever the client sends.
import java.io.*;
import java.net.*;



public class EchoServer {
// Choose a port outside of the range 1-1024:
   public static final int PORT = 10203;
   public static void main(String[] args)
       throws IOException {
      ServerSocket s = new ServerSocket(PORT);
      Socket socket;
      System.out.println("Started: " + s);
      try {
// Blocks until a connection occurs:
         socket = s.accept();
         try {
            System.out.println(
                "Connection accepted, complete information: "+ socket);
               System.out.println("Local Port: " + socket.getLocalPort());
               System.out.println("Local IP Address: " + socket.getLocalAddress());
               System.out.println("Remote Port: " + socket.getPort());
               System.out.println("Remote IP Address: " + socket.getInetAddress());
               System.out.println("Remote Address: " + socket.getRemoteSocketAddress());
               System.out.println("Local Address: " + socket.getLocalSocketAddress());

            BufferedReader in = 
                new BufferedReader(
                new InputStreamReader(
                socket.getInputStream()));
            // Output is automatically flushed
// by PrintWriter:
                PrintWriter out = 
                new PrintWriter(
                new BufferedWriter(
                new OutputStreamWriter(
                socket.getOutputStream())),true);
                PrintWriter outf =  new PrintWriter( new BufferedWriter(
                              new FileWriter("IODemo.out")));

            while (true) {
               String str = in.readLine();
               // if (str.equals("END")) {
               if (str==null) {
                 outf.close();
                 break;
               }
               System.out.println("Echoing: " + str);
               out.println(str);
               outf.println(str);
            }
            // Always close the two sockets...
         }
         finally {
            System.out.println("closing...");
            socket.close();
         }
      }
      finally {
         s.close();
      }
   }
} 
///:
