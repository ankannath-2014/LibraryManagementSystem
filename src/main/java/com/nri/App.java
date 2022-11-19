package com.nri;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
        SessionFactory factory = config.configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx =  session.beginTransaction();
        
        
        // First Library Object
        Library libobj1 = new Library();
        libobj1.setLibid(1);
        libobj1.setLibname("CSEIT");
        libobj1.setLibfees(500);
        
        
        
        // Second Library Object
        Library libobj2 = new Library();
        libobj2.setLibid(2);
        libobj2.setLibname("ECE");
        libobj2.setLibfees(800);
        
        
        
        // Third Library Object
        Library libobj3 = new Library();
        libobj3.setLibid(3);
        libobj3.setLibname("MECH");
        libobj3.setLibfees(700);
        
        
        //Session Saving Sending to Database For Library Class
        //session.save(libobj1);
        //session.save(libobj2);
        //session.save(libobj3);
        
        
        
        
        // First Book Object for CSE
        Books bookobj1 = new Books();
        bookobj1.setBookid(1);
        bookobj1.setBookname("JAVA");
        bookobj1.setBookqnty(500);
        bookobj1.setLibrary(libobj1);
        
        
       // Second Book Object for CSE
        Books bookobj2 = new Books();
        bookobj2.setBookid(2);
        bookobj2.setBookname("PYTHON");
        bookobj2.setBookqnty(100);
        bookobj2.setLibrary(libobj1);
        
        
        
        // Third Book Object for CSE
        Books bookobj3 = new Books();
        bookobj3.setBookid(3);
        bookobj3.setBookname("CPP");
        bookobj3.setBookqnty(50);
        bookobj3.setLibrary(libobj1);
        
        
        // List for CSE IT BOOKS
        List<Books> booklist = new ArrayList();
        
        // Adding Books Object to the list
        booklist.add(bookobj1);
        booklist.add(bookobj2);
        booklist.add(bookobj3);
        
        //Adding booklist to List Object One
        libobj1.setBook(booklist);
        
        // Saving Session for CSE Library
        session.save(libobj1);
       
       
       
       
       
       // First Book Object for ECE
       Books bookobj4 = new Books();
       bookobj4.setBookid(4);
       bookobj4.setBookname("DIGITAL");
       bookobj4.setBookqnty(800);
       
       
      // Second Book Object for ECE
       Books bookobj5 = new Books();
       bookobj5.setBookid(5);
       bookobj5.setBookname("ANALOG");
       bookobj5.setBookqnty(550);
       
       
       
       // Third Book Object for ECE
       Books bookobj6 = new Books();
       bookobj6.setBookid(6);
       bookobj6.setBookname("CIRCUIT");
       bookobj6.setBookqnty(680);
       
       
       // List for ECE BOOKS
       List<Books> booklist2 = new ArrayList();
       
       // Adding Books Object to the list
       booklist2.add(bookobj4);
       booklist2.add(bookobj5);
       booklist2.add(bookobj6);
       
       //Adding booklist to List Object One
       libobj2.setBook(booklist2);
       
       // Saving Session for ECE Library
       
      session.save(libobj2);
      
      
      
      
      
      // First Book Object for MECH
      Books bookobj7 = new Books();
      bookobj7.setBookid(7);
      bookobj7.setBookname("Thermodynamic");
      bookobj7.setBookqnty(80);
      
      
     // Second Book Object for MECH
      Books bookobj8 = new Books();
      bookobj8.setBookid(8);
      bookobj8.setBookname("Metals");
      bookobj8.setBookqnty(555);
      
      
      
      // Third Book Object for MECH
      Books bookobj9 = new Books();
      bookobj9.setBookid(9);
      bookobj9.setBookname("Instruments");
      bookobj9.setBookqnty(6880);
      
      
      // List for MECH BOOKS
      List<Books> booklist3 = new ArrayList();
      
      // Adding Books Object to the list
      booklist3.add(bookobj7);
      booklist3.add(bookobj8);
      booklist3.add(bookobj9);
      
      //Adding booklist to List Object One
      libobj3.setBook(booklist3);
      
      // Saving Session for MECH Library
      
     session.save(libobj3);
     
     // Committing the changes
    
       
     
     // ----------------------------------------------------- 
     // Update and Delete and get and load
     
     
     
     //Display the object
     Library libobjr = session.get(Library.class, 1);
     System.out.println(libobjr);
     
     //Update 
    
     Library libobju = new Library();
     libobju.setLibid(1);
     libobju.setLibname("ELECTRICAL");
     libobju.setLibfees(1800);
     session.update(libobju);
     
     
     
     
     //Delete 
     Library libobjd = new Library();
     libobjd.setLibid(1);
     session.delete(libobjd);
     
     
    tx.commit();
     
     
     session.close();
     factory.close();
     
     
   }
}
