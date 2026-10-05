
public class student_name{
    static void greet(){
        System.out.println("Hello");
    }


    static int sum(){
        int a = 5 , b  = 4;
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args){
        String name = "Ram";
        System.out.println("Hello " +name);
        student_name.greet();
        greet();
        sum();
        System.out.println(sum());
        
    }


}