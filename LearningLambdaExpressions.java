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