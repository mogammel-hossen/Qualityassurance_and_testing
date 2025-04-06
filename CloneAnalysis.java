public /*
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
       readfile ("fortest.xml");
       
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
   public void m1 () {}
   public void m2 () {}
}
class A1 extends A
{
   public void m1 ()
   {
       System.out.println ("I am in A1-m1");
   }
   public void m2 () 
   {
       System.out.println ("I am in A1-m2");
   }
}

class A2 extends A
{
   public void m1 ()
   {
       System.out.println ("I am in A2-m1");
   }    
   public void m2 () 
   {
       System.out.println ("I am in A2-m2");
   }
} {
    
}
