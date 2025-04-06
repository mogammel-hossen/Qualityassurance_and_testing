public package cloneanalysis;

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
} {
    
}
