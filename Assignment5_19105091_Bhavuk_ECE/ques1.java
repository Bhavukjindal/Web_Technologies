class Mammals{
    void print(){
        System.out.println("I am mammal");
    }
}
class MarineAnimals extends Mammals{
    void print(){
        System.out.println("I am a marine animal");
    }
    void printParent(){
        super.print();
    }
}
class BlueWhale extends MarineAnimals{
    void print(){
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
    void printP1(){
        super.print();
    }
    void printP2(){
        super.printParent();
    }
}

public class ques1{
    public static void main(String args[]){
        Mammals obj_Mammals = new Mammals();
        MarineAnimals obj_MarineAnimals = new MarineAnimals();
        BlueWhale obj_BlueWhale = new BlueWhale();

        obj_Mammals.print();
        obj_MarineAnimals.print();
        obj_BlueWhale.print();

        obj_BlueWhale.printP1();
        obj_BlueWhale.printP2();
    }
}
