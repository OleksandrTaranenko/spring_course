package spring_introduction;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public void init(){
        System.out.println("class Dog: init method");
    }

    public  void destroy(){
        System.out.println("class Dog: destroy method");
    }
}
