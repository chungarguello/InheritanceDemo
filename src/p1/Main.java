package p1;

public class Main {

    public static void main(String[] args) {
        pet cat1 = new cat();
        cat1.name = "Lucy";
        cat1.breed = "Short Hair";
        cat1.weight = 6;
        cat1.age = 1;

        pet bird1 = new bird();
        bird1.name = "bitchy";
        bird1.breed = "peacock";
        bird1.weight = 3;
        bird1.age = 1;

        System.out.println(cat1 + "\n\n" +  bird1);
    }
}
class pet{
    String name;
    String breed;
    double weight;
    int age;

    @Override
    public String toString() {
        return "pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
class bird extends pet {
    String vocalize = "Tweet";
    int legs = 2;
    boolean canTalk = false;
    boolean canFly = false;

    @Override
    public String toString() {
        String s1 = super.toString();
        String s2 =  "bird{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", canTalk=" + canTalk +
                ", canFly=" + canFly +
                '}';
        return s1 + "\n" + s2;
    }
}
class cat extends pet{
    String vocalization = "Meow";
    int legs = 4;
    boolean isNeutered = false;
    boolean isHouseBroken = false;

    @Override
    public String toString() {
        String s1 = super.toString();
        String s2 = "cat{" +
                "vocalization='" + vocalization + '\'' +
                ", legs=" + legs +
                ", isNeutered=" + isNeutered +
                ", isHouseBroken=" + isHouseBroken +
                '}';
        return s1 + "\n" + s2;
    }
}



