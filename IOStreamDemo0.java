import java.io.*;

public class IOStreamDemo0 {
// Throw exceptions to console:
   public static void main(String[] args)
       throws IOException {


// Print the length and  content of the input file
     File file = new File(args[0]);
     long length = file.length();
     System.out.println("\n\n" + file + " lenght is: " + length);

     BufferedReader inpf = new BufferedReader( new FileReader(file));
     String str;
     System.out.println ("The content of " +  file + ":\n");
      while((str = inpf.readLine())!= null)
      	   System.out.println(str);

// Transfer bytes from in to out
      String infile = args[0];
      String outfile = args[1];
      InputStream fin = new FileInputStream(infile);
      OutputStream fout = new FileOutputStream(outfile);
          byte[] buf = new byte[1024];
      int len;
      while ((len = fin.read(buf)) > 0) {
         fout.write(buf, 0, len);
      }
      fin.close();
      fout.close();

// Reading standard input and Append to file.
      FileOutputStream appendedFile = new FileOutputStream (outfile, true);

      BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
      String st="";
      System.out.print("\n\nEnter a line or type CTRL-D to finish:" + "\n");
      while (true)  {
        try {
        	st = stdin.readLine();
        } 
        catch(EOFException e) {
           System.err.println("End of stream");
        }
        if ( st == null) break;
      	System.out.println(st);
      	appendedFile.write(st.getBytes());
      	appendedFile.write('\n');
      }

// Print the content of the output file
     BufferedReader inf = new BufferedReader( new FileReader(outfile));
     System.out.println ("\n\nThe content of " +  outfile + ":\n");
      while((st = inf.readLine())!= null)
      	   System.out.println(st);
   }
} 
