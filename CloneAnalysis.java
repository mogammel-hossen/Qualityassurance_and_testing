Skip to main content
Google Classroom
Classroom
EDGE-KU-SQA
Home
Calendar
Enrolled
To do
A
Artificial Intelligence
E
EDGE-KU-SQA
S
SE_SD_Lab
C
CSE 1201: Object Oriented Programming
2022
Archived classes
Settings
Stream
Classwork
People
EDGE-KU-SQA
Upcoming
Woohoo, no work due in soon!

Announce something to your class

Post by Abul Fazal (Sabu)
Abul Fazal (Sabu)
Created 11 Nov 202411 Nov 2024
📍NOTICE! 💻

সকলের অবগতির জন্য জানানো যাচ্ছে যে আমাদের SQA কোর্সের বর্তমান দায়িত্বপ্রাপ্ত স্যার আমাদের একটা হোয়াটসঅ্যাপ গ্রুপে যুক্ত হতে বলেছেন। আমাদের সবাইকে একটা ফর্ম পূরণ করতে হবে। বাকি ৩টা ক্লাস আগামী সপ্তাহে হতে পারে বলে স্যার অবহিত করেছেন।

নিচের হোয়াটসঅ্যাপ গ্রুপের লিঙ্কে কাইন্ডলি সবাই যুক্ত হবেন।
https://chat.whatsapp.com/FA82ohzcOrV2fgL1BO7VB2

গ্রুপে যুক্ত হতে কোন সমস্যা হলে অনুগ্রহ করে আমাকে জানাবেন। :)

Add class comment…


Post by SK Tahmid Mostafa
SK Tahmid Mostafa
Created 23 Oct 202423 Oct 2024
SQA কোর্সের সার্টিফিকেট কবে দেয়া হবে.?

Add class comment…


Post by Shamim Ahmed Shaon
Shamim Ahmed Shaon
Created 8 Oct 20248 Oct 2024
আজ ক্লাস হবে না

Add class comment…


Post by SK Tahmid Mostafa
SK Tahmid Mostafa
Created 5 Oct 20245 Oct 2024
ক্লাস হবে আজকে?

Add class comment…


Post by Muhayminul Islam
Muhayminul Islam
Created 30 Sept 202430 Sept 2024
for locust
https://a.testable.io/login

L1 WT QAST.pptx
Microsoft PowerPoint

Add class comment…


Post by Muhayminul Islam
Muhayminul Islam
Created 25 Sept 202425 Sept 2024
Job Market

Lecture 3.ppsx
Microsoft PowerPoint

Add class comment…


Announcement: 'Today's class will be an interesting…'
Amit Kumar Mondal
Created 22 Sept 202422 Sept 2024
Today's class will be an interesting class. I will discuss about Basic Mobile (Android) Application Development and Testing.
All students should present today.

Add class comment…


Announcement: 'There will be an exam on Tuesday 4:45pm…'
Amit Kumar Mondal
Created 19 Sept 202419 Sept 2024
There will be an exam on Tuesday 4:45pm (24th September). 1 hour 25 marks.
Please find the exam contents from here https://drive.google.com/drive/folders/1Vn7TNNdqX2v9nqHGm4hCFDjuMXNi72ur?usp=sharing

Add class comment…


Announcement: 'Basis paths test'
Amit Kumar Mondal
Created 18 Sept 202418 Sept 2024
Basis paths test

TestingConventionalSystem.pptx
Microsoft PowerPoint

Add class comment…


Announcement: 'Basis paths test'
Amit Kumar Mondal
Created 18 Sept 202418 Sept 2024
Basis paths test

TestingFramework.pptx
Microsoft PowerPoint

Add class comment…


Announcement: 'Today (Tuesday) I will take the…'
Amit Kumar Mondal
Created 17 Sept 202417 Sept 2024
Today (Tuesday) I will take the class...please all should attend...

Add class comment…


Announcement: 'Reminder: I will take class only on…'
Amit Kumar Mondal
Created 10 Sept 202410 Sept 2024
Reminder: I will take class only on Sunday and Wednesday.
Today I will not take today's class. Please contact with the coordinator for the todays (Tuesday) scheduled class

Add class comment…


Post by Shamim Ahmed Shaon
Shamim Ahmed Shaon
Created 4 Sept 20244 Sept 2024
আজ Edge প্রোগ্রামের ক্লাস বন্ধ থাকবে। সামনের সপ্তাহ থেকে নতুন রুটিনে ক্লাস হবে। রবি, মঙ্গল, বুধবার বিকাল ৫ টা থেকে ৮ টা
Displaying FB_IMG_1725425456347.jpg
FB_IMG_1725425456347.jpg
1 class comment

Amit Kumar Mondal10 Sept 2024
I will take class sunday and wednesday only.

Add class comment…


Post by Muhayminul Islam
Muhayminul Islam
Created 8 Jul 20248 Jul 2024
By Abu Bakar Sidique sir

Lecture_2.ppsx
Microsoft PowerPoint

Lecture_1.ppsx
Microsoft PowerPoint

Add class comment…


Post by Abul Fazal (Sabu)
Abul Fazal (Sabu)
Created 6 Jul 20246 Jul 2024
Mentorship class: LECTURE-2

Lecture_2.pdf
PDF

Add class comment…


Post by Faiyaz Karim
Faiyaz Karim
Created 6 Jul 20246 Jul 2024
Assalamualaikum Sir,
Do we have class today?.

Add class comment…


Announcement: 'Clone Refactoring using Lambda…'
Dr. Manishankar Mondal
Created 5 Jun 20245 Jun 2024
Clone Refactoring using Lambda Expressions

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learninglambdaexpressions;

/**
 *
 * @author pc
 */
public class LearningLambdaExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        final int m = 20;
       
        MyInterface mi;
        mi = (a)->
        {
            int sum = 0;
            for (int i =1;i<=a;i++)
            {
                sum = sum+i;
            }
            System.out.println (sum+m);
            return 1;
        };
       
        MyInterface mi2;
        mi2 = (b) ->
        {
            int sum = 1;
            for (int i =1;i<=b;i++)
            {
                sum = sum*i;
            }
            System.out.println (sum+m);
            return 0;
        };
       
        mi.dothis (10);
        mi2.dothis (10);
       
        m2 ((b) ->
        {
            int sum = 1;
            for (int i =1;i<=b;i++)
            {
                sum = sum*i;
            }
            System.out.println (sum+m);
            return 0;
        });
       
    }
   
    public static void m2 (MyInterface mi)
    {
        mi.dothis(10);
    }
   
   
   
}

interface MyInterface
{
    int dothis (int n);
}

interface MyInterface2
{
    int dothis (int n1, int n2);
}


class A
{
    public void method1 (int n)
    {        
        methodmergedlambda (n, (n1, n2)->{return n1+n2;});
    }
    public void method2 (int n)
    {        
        methodmergedlambda (n, (n1, n2)->{return n1-n2;});        
    }
   
    public void methodmerged (int n, int p)
    {        
        int sum = 0;
        for (int i =1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println (sum);        
       
        int c = 0;
        if (p == 1)
        {
            c = sum + 15;
        }
        else
        {
            c = sum - 15;
        }
       
        sum = 1;
        for (int i =1;i<=n;i++)
        {
            sum = sum*i;
        }
        System.out.println (sum);        
    }

    public void methodmergedlambda (int n, MyInterface2 mi)
    {        
        int sum = 0;
        for (int i =1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println (sum);        
       
        int c = 0;
       
        c = mi.dothis (sum,15);
       
        sum = 1;
        for (int i =1;i<=n;i++)
        {
            sum = sum*i;
        }
        System.out.println (sum);        
    }
   
   
}
1 class comment

SK Tahmid Mostafa22 Jun 2024
Sir Assalamualikum,
Do we have class today?

Add class comment…


Announcement: 'Code to analyze using SonarQube'
Dr. Manishankar Mondal
Created 5 Jun 20245 Jun 2024
Code to analyze using SonarQube

CloneAnalysis.java
Java

Add class comment…


Announcement: 'Slide 9'
Dr. Manishankar Mondal
Created 5 Jun 20245 Jun 2024
Slide 9

lecture9.pptx
Microsoft PowerPoint

Add class comment…


Announcement: 'SonarQube files.'
Dr. Manishankar Mondal
Created 5 Jun 20245 Jun 2024
SonarQube files.

sonarqube-10.5.1.90531.zip
Compressed archive

sonar-scanner-cli-5.0.1.3006-windows.zip
Compressed archive

Add class comment…

Assignment: "Assignment from Quality Assurance Part"
Dr. Manishankar Mondal posted a new assignment: Assignment from Quality Assurance Part
Created 5 Jun 20245 Jun 2024

Announcement: 'Class assignment'
Amit Kumar Mondal
Created 1 Jun 20241 Jun 2024
Class assignment

assign1.docx
Microsoft Word
1 class comment

Amit Kumar Mondal1 Jun 2024
https://drive.google.com/drive/folders/1gUqSuHWZhkc_ASneEMMw6GATMxIQLyJl?usp=sharing

Add class comment…


Announcement: 'Assignment Currently, a library has two…'
Dr. Manishankar Mondal
Created 29 May 202429 May 2024
Assignment


Currently, a library has two types of books: (i) journals and (ii) conference proceedings. While both types of books have id, title, publisher, and publication year, journals specially have volume and issue numbers. Moreover, conference proceedings have an special attribute called conference venue. The capacity of the library is 10000 books of different types. Make necessary classes for this library management system. The library should have facilities for adding different types of books, searching a particular book using the title. While a new book is going to be added to the library, the book should get a new ID.

Implement this using the design patterns, and principles that we have learned.

Add class comment…


Announcement: 'Strategy Design Pattern Code'
Dr. Manishankar Mondal
Created 29 May 202429 May 2024
Strategy Design Pattern Code

StrategyDesignPatternExample.java
Java

StrategyDesignPattern.java
Java

Add class comment…


Announcement: 'Slides'
Dr. Manishankar Mondal
Created 18 May 202418 May 2024
Slides

lecture6.pptx
Microsoft PowerPoint

Add class comment…


Announcement: 'Contents from 18/5/2024'
Dr. Manishankar Mondal
Created 18 May 202418 May 2024
Contents from 18/5/2024

contents_2024-05-18.zip
Compressed archive

Add class comment…


Announcement: 'updated slides'
Dr. Manishankar Mondal
Created 15 May 202415 May 2024
updated slides

slides 2 - code clones.pptx
Microsoft PowerPoint

Add class comment…


Announcement: 'Updated code'
Dr. Manishankar Mondal
Created 15 May 202415 May 2024
Updated code

CloneAnalysis.java
Java

Add class comment…


Announcement: 'Find the file that contains the highest…'
Dr. Manishankar Mondal
Created 15 May 202415 May 2024
Find the file that contains the highest number of clones.

CloneAnalysis.java
Java

Add class comment…


Announcement: 'Clone Analysis Code package…'
Dr. Manishankar Mondal
Created 15 May 202415 May 2024
Clone Analysis Code

package cloneanalysis;

import java.io.*;

public class CloneAnalysis
{
    public static void main (String [] args)
    {
        readfile ("fortest.xml");
    }
   
    public static void readfile (String filepath)
    {
        int samefile = 0, dfile = 0;
        try
        {
            BufferedReader br = new BufferedReader (new InputStreamReader (new FileInputStream (filepath)));
            String str = "";
           
            while ((str = br.readLine ())!= null)
            {
                //System.out.println (str);
               
                if (str.contains ("<clone nlines"))
                {
                    String str1 = "", str2 = "", file1 = "", file2 = "";
                    str1 = br.readLine ();
                    str2 = br.readLine ();
                    file1 = str1.split ("[\"]+")[1];
                    file2 = str2.split ("[\"]+")[1];
                    if (file1.equals (file2))
                    {
                        System.out.println ("\nfile1 = "+file1);
                        System.out.println ("file2 = "+file2);
                       
                        samefile++;
                    }
                    else
                    {
                        dfile++;                        
                    }
                }
            }
           
            System.out.println ("same file pair = "+samefile);
            System.out.println ("different file pair = "+dfile);
           
        }
        catch (Exception e)
        {
           
        }
    }
}

Add class comment…


Announcement: 'clone file'
Dr. Manishankar Mondal
Created 15 May 202415 May 2024
clone file

fortest.xml
XML

Add class comment…


Announcement: 'Code from 11/5/2024'
Dr. Manishankar Mondal
Created 11 May 202411 May 2024
Code from 11/5/2024

DesignPatterns.zip
Compressed archive

Add class comment…


Announcement: 'How to install NiCad (Code clone…'
Dr. Manishankar Mondal
Created 11 May 202411 May 2024
How to install NiCad (Code clone detector)

1. if we have a windows operating system, we need to install CYGWIN.
2. gcc-core, gcc-g++, make, cmake
3. download txl from txl.ca and install it inside the cygwin environment
4. download NiCad and install it inside the cygwin environment
1 class comment

Dr. Manishankar Mondal11 May 2024
Txl installation command:     ./InstallTxl
NiCad installation command:    make
Command for clone detection using NiCad:    
                                  ./nicad6 functions java examples/JHotDraw

Add class comment…


Announcement: 'Presentation on Code Smell (code clones)'
Dr. Manishankar Mondal
Created 8 May 20248 May 2024
Presentation on Code Smell (code clones)

slides 2 - code clones.pptx
Microsoft PowerPoint

Add class comment…


Announcement: 'Abstract Factory Design Pattern /* * To…'
Dr. Manishankar Mondal
Created 8 May 20248 May 2024
Abstract Factory Design Pattern

/*
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
}

Add class comment…


Announcement: 'Slides on Design Pattern'
Dr. Manishankar Mondal
Created 5 May 20245 May 2024
Slides on Design Pattern

Design Patterns.pptx
Microsoft PowerPoint

Add class comment…


Announcement: 'Sample Code for Factory Method Design…'
Dr. Manishankar Mondal
Created 4 May 20244 May 2024
Sample Code for Factory Method Design Pattern


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

Add class comment…


Announcement: 'SQA Slides (1st Lecture)'
Dr. Manishankar Mondal
Created 27 Apr 202427 Apr 2024
SQA Slides (1st Lecture)

qualityassuranceandsoftwaretesting.pptx
Microsoft PowerPoint

Add class comment…

Stream
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloneanalysis;

import java.io.*;

public class CloneAnalysis
{
    public static void main (String [] args)
    {
        //readfile ("fortest.xml");
        
        A a = new A ();
        A1 a1 = new A1 ();
        A2 a2 = new A2 ();
        a = a1;
        a.m1(10, 15);
        a = a2;
        a.m1(10, 15);
        
        /*
        A a = new A ();
        
        A1 a1 = new A1 ();
        A2 a2 = new A2 ();
        
        a = a1;
        a.m1();
        
        a = a2;
        a.m1();
        
        a2.m2 ();
        a.m2 ();
        */
        
    }
    
    public static void readfile (String filepath)
    {
        int samefile = 0, dfile = 0;
        //String [] dclones = new String [100000];
        String dclones = "", dfiles = "";
        int dclonecount = 0;
        try
        {
            BufferedReader br = new BufferedReader (new InputStreamReader (new FileInputStream (filepath)));
            String str = "";
            
            while ((str = br.readLine ())!= null)
            {
                //System.out.println (str);
                
                if (str.contains ("<clone nlines"))
                {
                    String str1 = "", str2 = "", file1 = "", file2 = "";
                    str1 = br.readLine ();
                    str2 = br.readLine ();
                    file1 = str1.split ("[\"]+")[1];
                    file2 = str2.split ("[\"]+")[1];
                    
                    String cstring1 = file1 + ";"+str1.split ("[\"]+")[3]+";"+str1.split ("[\"]+")[5];
                    String cstring2 = file2 + ";"+str2.split ("[\"]+")[3]+";"+str2.split ("[\"]+")[5];
                    
                    if (!dclones.contains (" " +  cstring1+" "))
                    {
                        dclones += " " + cstring1 + " ";
                    }
                    if (!dclones.contains (" " +  cstring2+" "))
                    {
                        dclones += " " + cstring2 + " ";
                    }
                    if (!dfiles.contains (" "+file1+" ")) { dfiles += " "+file1+" "; }
                    if (!dfiles.contains (" "+file2+" ")) { dfiles += " "+file2+" "; }
                    
                    
                    /*
                    if (file1.equals (file2))
                    {
                        System.out.println ("\nfile1 = "+file1);
                        System.out.println ("file2 = "+file2);
                        
                        samefile++;
                    }
                    else
                    {
                        dfile++;                        
                    }
                    */
                }
            }
            
            int l = dfiles.trim().split("[ ]+").length;
            String hfile = "";
            int hcount = 0, ccount = 0;
            for (int i=0;i<l;i++)
            {
                String tclones = dclones;
                String f = dfiles.trim().split("[ ]+")[i];
                tclones = tclones.replaceAll(f, "#");
                ccount = 0;
                for (int j =0;j<tclones.length();j++)
                {
                    if (tclones.charAt(j) == '#') { ccount++; }
                }
                if (ccount > hcount) { hcount = ccount; hfile = f; }
            }
            
            System.out.println ("hfile = "+hfile+", hcount = "+hcount);
            
            
            //System.out.println ("same file pair = "+samefile);
            //System.out.println ("different file pair = "+dfile);
            
        }
        catch (Exception e)
        {
            
        }
    }
}

class A
{
    public int operation (int a, int b) { return 0; }
    public void m1 (int a, int b) 
    {
        int sum = 0, fact = 1;
        for (int i =1;i<= 10;i++) { sum = sum + i; }
        int c = operation(a, b);
        System.out.println ("operation result = "+c);
        for (int i =1;i<= 10;i++) { fact = fact * i; }        
    }
}
class A1 extends A
{
    public int operation (int a, int b)
    {
        return a+b;
    }
}

class A2 extends A
{
    public int operation (int a, int b)
    {
        return a-b;
    }
}
CloneAnalysis.java
Displaying CloneAnalysis.java.