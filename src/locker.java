import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
public class locker {
    public static void main(String[] args) throws IOException {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Email:- sushilraut311@gmail.com      -> Coded By Sushil Raut  <-     \n");

        System.out.println("                 ** Welcome To The LockersMe.com **                  ");
        System.out.println("---------------------------------------------------------------------");
        File file = new File("C:\\LockersMe");
        int user = 0;
      while(true && user!=3){
          System.out.println("1. List Down All Files \n2. Bussiness Level Operation \n3. Exit Form Application");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter As Yours Choice");
        user = sc.nextInt();

        if (user == 1) {
            System.out.println("only one directory is there - c:\\LockersMe");
            String[] dirListing = null;
            File dir = new File("C:\\LockersMe");
            dirListing = dir.list();
            Arrays.sort(dirListing);
            System.out.println(Arrays.deepToString(dirListing));
            System.out.println("\n");
           // File[] files = file.listFiles();
           // for (File s1 : files) {
             //   if (s1.isFile()) {
                //    System.out.println(s1.getName());
              //  } else if (s1.isDirectory()) {
                    //System.out.println(s1.getName());
              //  }

           // }


        } else if (user == 2) {
            System.out.println("1. Add File\n2. Delete File\n3. Search File\n4. Return To Main");
            System.out.println("Only Write the file name - EX ( project ) dont need to write project.txt");
            Scanner git = new Scanner(System.in);
            System.out.println("Enter Your Choice between (1-2-3-4)");
            int user2 = git.nextInt();
            if (user2 == 1) {
                try {
                    String filename;
                    Scanner fi = new Scanner(System.in);
                    System.out.println("Enter File Name Here");
                    filename = fi.next();
                    File f1 = new File("C:\\LockersMe\\" + filename + ".txt");
                    boolean isFCreated = f1.createNewFile();
                    if (isFCreated) {
                        System.out.println("File has been created successfully");
                    } else {
                        System.out.println("File is already Exists");
                    }

                } catch (IOException e) {
                    System.out.println("Some Error is occurs");
                }
                System.out.println("\n");
            } else if (user2 == 2) {
              try{  String filedelete;
                Scanner si = new Scanner(System.in);
                System.out.println("Enter File Name which you want to delete");
                filedelete = si.next();
                File f2 = new File("C:\\LockersMe\\" + filedelete + ".txt");
                if (f2.delete()) {
                    System.out.println("file is deleted successfully");
                } else {
                    System.out.println("File is not deleted");
                }}catch (Exception e){
                  System.out.println(e);
              }
                System.out.println("\n");
            } else if (user2 == 3) {
                File directory = new File("C:\\LockersMe");
                System.out.println("Search File Which You Want.....(just write the file name)");
                Scanner se = new Scanner(System.in);
                String search = se.next();
                String[] flist = directory.list();
                int flag = 0;
                if (flist == null) {
                    System.out.println("Empty directory.");
                }
                else {
                try{    for (int i = 0; i < flist.length; i++) {
                        String filename = flist[i];
                        if (filename.equalsIgnoreCase(search+".txt")) {
                            System.out.println(filename + " found");
                            flag = 1;
                        }
                    }
                }catch (Exception e){
                    System.out.println(e);
                }
                }

                if (flag == 0) {
                    System.out.println("File Not Found");
                }
                System.out.println("\n");
            }else if(user2 ==4){
                System.out.println("back to Main");
                }else if(user2 >4){
                System.out.println("Please Enter Valid Number");

            }
            System.out.println("\n");

            }
        else if(user >3){
            System.out.println(" ---- Please Enter Valid Number ---- ");
        }

            }
        }

    }