public /*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package abstractfactorydesignpattern;

/**
*
* @author pc
*/
public class AbstractFactoryDesignPattern {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       // TODO code application logic here
      
       teacherfactory tf = new teacherfactory ("Mr. Atanu Shome", "Microprocessor");
       studentfactory sf = new studentfactory ("Manishankar Mondal", 3);
      
       personfactory pf = new personfactory ();
       person p1 = pf.make (tf);
       person p2 = pf.make (sf);
      
       p1.display();
       p2.display();        
   }
  
}


class person
{
   String name;
  
   public void display ()
   {
       System.out.println (name);
   }
}

class student extends person
{
   int year;
  
   public void display ()
   {
       System.out.println ("type = student "+name + " " + year);
   }
}

class teacher extends person
{
   String course;
  
   public void display ()
   {
       System.out.println ("type = teacher "+name + " " + course);
   }
  
}

class personfactory
{
   public person make (abstractfactory f)
   {
       return f.make ();
   }
}


abstract class abstractfactory
{
   abstract public person make ();
}

class teacherfactory extends abstractfactory
{
   String name;
   String course;
  
   teacherfactory (String pname, String pcourse)
   {
       this.name = pname;
       this.course = pcourse;
   }
      
   public teacher make ()
   {
       teacher t = new teacher ();
       t.name = this.name;
       t.course = this.course;
       return t;
   }
}



class studentfactory extends abstractfactory
{
   String name;
   int year;
  
   studentfactory (String pname, int pyear)
   {
       this.name = pname;
       this.year = pyear;
   }
  
   public student make ()
   {
       student s = new student ();
       s.name = this.name;
       s.year = this.year ;
       return s;
   }
} {
    
}
