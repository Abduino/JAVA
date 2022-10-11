import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;


public class Registration {

     String name;
     int age;
     int year;
     String  Grade ;
     String sex;
     String status;
     String semister; 
     String region;
     int birthdate;
    String department;
   // private InputStream istream;
    void get(){
    Scanner sc=new Scanner(System.in);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println(" WELL COME TO OUR REGISTRATION SYSTEM");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     System.out.println(" Enter the ff Information");
        System.out.println("Name");
        name=sc.next();
        System.out.println("Age");
        age=sc.nextInt();
                
       System.out.println("Year");
       year=sc.nextInt();
       System.out.println("Grade");
        Grade=sc.next();
        System.out.println("Sex");
        sex=sc.next();
        System.out.println("Semister");
        semister=sc.next();
        System.out.println("Region");
        region=sc.next();
        System.out.println("Birthdate");
        birthdate=sc.nextInt();
        System.out.println("Departement");
        department=sc.next();
    }
    void write()
        {
        try {
            FileOutputStream out=new FileOutputStream("tr.txt",true);
          
            PrintStream print= new PrintStream(out);
            print.println(" Students Registration File");
            print.println(" ---------------------------------");
            print.println(name);
            print.println(age);
            print.println(year);
            print.println(Grade);
            print.println(sex);
            print.println(semister); 
            print.println(region);
            print.println(birthdate);
            print.println(department);
            print.println(" ---------------------------------");
             System.out.println(" The registration is succesfully");
        } catch (FileNotFoundException ex) {
           System.out.println(ex.getMessage());
        }
        catch(IOException ex)
        {
           System.out.println(ex.getMessage()); 
        }
            catch(ArrayIndexOutOfBoundsException ex)
        {
           System.out.println(ex.getMessage()); 
        }
        }
        void read() throws IOException//displaying the entire information
        {
                       try {
    BufferedReader in = new BufferedReader(new FileReader("tr.txt"));
    String str;
    while ((str = in.readLine()) !=null) {
       System.out.println(str);
       //System.out.println(" hello reading");
    }
    in.close();
} catch (IOException e) {
}}
        void select() throws IOException
        {
            FileInputStream input = null;  
        try {
            input = new FileInputStream("tr.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(" file not found");
            
        }
                  DataInputStream in1= new DataInputStream(input);  
   
        
             BufferedReader bf = new BufferedReader(new InputStreamReader(in1)); 
                 String []strLine=new String[100];
              int i=0;
       Scanner se=new Scanner(System.in);
                         String ch;
                         System.out.println(" Enter you want to check");
                         ch=se.next();
                          //System.out.println(" This Student is not registered");
                        
                         
               while((i<strLine.length)&&((strLine[i] = bf.readLine()) != null))
               {
                         
                        if(strLine[i].equals(ch))
                        {
                             System.out.println(" This Student is registered");
                              break;
                        }
                        else 
                            i++;
                                                                     
               }
              
     
        }
    public static void main(String []args) throws IOException
    { 
        Scanner s=new Scanner(System.in);
     
        int x;
            Registration  rg=new  Registration ();
            do
            {
                System.out.println(" Enter your choice"); 
                System.out.println("==========================");
                System.out.println(" 1... for Register");
                System.out.println(" 2... for check");
                System.out.println(" 3... for Display");
                System.out.println(" 4... exit");
                System.out.println("***************************");
     x=s.nextInt();
            
            switch(x)
                    {                                         
                        case 1:
                       rg.get();
                        rg.write();
                        break;
                        case 2:
                           rg.select();
                            break;
                        case 3:
                        rg.read();
                            break;
                        default:
                            System.out.println(" invalid input");
                    }
            }while(x!=4);
    }
}
