package basics;





import java.util.*;

public class DemoEnum {
    // way of defining the constant(final) values
    enum days{
        MONDAY,
        SUNDAY
    }

    days displayDay(String str){
    	 
        switch(str){
            case "mon":{
            	 System.out.println(str);
            return days.MONDAY;
            }
            case "sun": return days.SUNDAY;
            default: return days.MONDAY;
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter either of two values - mon or sun");
        String str = Sc.next();
      
        DemoEnum ob = new DemoEnum();
        System.out.println("Selected day:  "+ ob.displayDay(str));

    }
}



