package pholymorphism;

public class MethodOverloading {
    
    int add(int a,int b)
    {
        int result=a+b;
        return result;
    }
    
    
    int add(int a,int b,int c)
    {
        int result=a+b+c;
        return result;
    }
    
    
    /*
    double add(double a,double b,double c)
    {
        double result=a+b+c;
        return result;
    }
    */
    
    /*void add(double a,double b)
    {
        
        double result=a+b;
        System.out.println("Additon is: "+result);
        
    }*/
    
    public static void main(String[] args){
        
        MethodOverloading methodOverloading = new MethodOverloading();
        
        //double result=methodOverloading.add(5, 4);
        System.out.println("Additon is: "+methodOverloading.add(5, 4));
        //methodOverloading.add(5, 4);
        
    }
}
