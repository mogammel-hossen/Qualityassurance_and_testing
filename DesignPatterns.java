public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        PersonFactory pf = new PersonFactory ();
        Person p1 = pf.makePerson (1, "Aranya", 101, "nothing");
        Person p2 = pf.makePerson (2, "Kamal Hossain", 1, "Programming");
       
        p1.printDetails ();
        p2.printDetails ();
       
    }
   
}



class Person
{
    String name;
   
    public void printDetails ()
    {
        System.out.println ("name = "+this.name);
    }
}

class Student extends Person
{
    int sid;
   
    @Override
    public void printDetails ()
    {
        System.out.println ("this is a student. name = "+this.name+", studentid = "+sid);
    }
}

class Teacher extends Person
{
    String subject;
   
    @Override
    public void printDetails ()
    {
        System.out.println ("this is a teacher. name = "+this.name+", course = "+subject);
    }    
}

class PersonFactory
{
    public Person makePerson (int ptype, String pname, int psid, String pcourse)
    {
        if (ptype == 1)
        {
            Student s = new Student ();
            s.name = pname;
            s.sid = psid;
            return s;
        }
        else
        {
            Teacher t = new Teacher ();
            t.name = pname;
            t.subject = pcourse;
            return t;
        }
    }
}