
public class HelloWorld {
    public String sayHelloWorld(){
        return  "Hello Maven!";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHelloWorld());
    }
}
