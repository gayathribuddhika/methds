
public class methods {

    
    public static void main(String[] args) {
        myFirstMethod();
        sayHello("kasun");
        sayHello("tom");
        addValues(25,45);
        addValues(125,463);
        
        int sum = add(12,13);
        int result = sum*2;
        System.out.println(sum);
        System.out.println(result);
        /*my,FirstMethod();
        myFirstMethod();
        myFirstMethod();
        myFirstMethod();*/ 
    }
    public static void myFirstMethod(){
            System.out.println("Hello");
        }
    public static void sayHello(String name){
       
        System.out.println("hello " + name);
    }
    public static void addValues(int x, int y){
       
        System.out.println(x + y);//can to several maths operations here 
    }
    public static int add(int a, int b){
        return(a+b);
    }
}
