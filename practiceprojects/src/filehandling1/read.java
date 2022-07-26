package filehandling1;


import java.io.File;

class read {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("TextFile.java");

    try {

      // create a new file with name specified
      // by the file object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("New Java File is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}