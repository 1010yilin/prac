class Dog{
    public int weight;

    public Dog(int weight) {
        this.weight = weight;
    }
    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weight>d2.weight){
            return d1;
        }return d2;
    }
    public void makeNoise(){
        if (weight<10){
            System.out.println("yip!");
        } else if (weight<30) {
            System.out.println("Bark!");
        }else {
            System.out.println("woooooof!");
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog(100);
        Dog d2 = new Dog(50);
        Dog bigger = Dog.maxDog(d1,d2);
        bigger.makeNoise();

    }
}