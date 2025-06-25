package com.pravinyam.throwsexception;
import java.io.IOException;

//public class ThrowsException {
//	public static void main(String[] args) throws IOException{
//		show();
//	}
//	static void show()throws IOException{
//		throw new IOException("IO error occured");
//	}
//
//}




public class ThrowsException {

    // This method declares that it may throw an IOException
    static void readFile() throws IOException {
        // Simulating an exception
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {
        try {
            readFile(); // Call the method that might throw exception
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
