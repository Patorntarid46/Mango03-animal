public class Duck extends Animal implements Flyable{
    @Override
    public String sound(){
        return "quack";
    }
    public void dive(){
        System.out.println("jom+ boong+");
    }

    @Override
    public void fly() {
        System.out.println("pb pb");
    }

    @Override
    public void glide() {
        System.out.println("feww");

    }
    public void clean(Animal animal){   //Dynamicspolymorph
        System.out.println(this.toString() + " is cleaning " + animal.toString());
    }

}
