public abstract class Animal {
    private String name; 
    private int age;

    public Animal(){
        System.out.println("creating new Animal object");
    }

    public Animal(String name) {
        this.name = name;

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sleep();

    public void eat() {        
        System.out.println("eating");
    }    

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){        
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
            


}
