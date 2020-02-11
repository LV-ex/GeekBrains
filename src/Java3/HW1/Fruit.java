package Java3.HW1;
// Абстрактный класс Fruit, в котором мы создаем общие методы, которые реализуют классы наследники

public abstract class Fruit {
    protected float weight;

    public Fruit(float weight){
        this.weight = weight;
    }
    public float getWeight(){
        return weight;
    }
}
