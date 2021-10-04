package pholymorphism;

public class MethodOverriding {
    
    public static void main(String[] args){
        OverridingOne o1=new OverridingOne();
        OverridingTwo o2=new OverridingTwo();
        o1.rateOfInterest();
        o2.rateOfInterest();
    }
  
}
class OverridingOne{
    void rateOfInterest()
    {
        System.out.println("One");
    }
    
}

class OverridingTwo extends OverridingOne{
    
    @Override
    void rateOfInterest()
    {
        System.out.println("Two");
    }
    
}


