public class Car extends Inheritancelearn{
    String color;
    void start(){
        // super key le jun ma use garyo tesko parent lai target garxa
        super.start();
        System.out.println(this);
        System.err.println(this.model+" this is method overriding");
    }
    public static void main(String[] args) {
        Car obj=new Car();
       obj.wheelscount=4;
        obj.start();
        obj.model="110";
        obj.start();
        obj.color="red";
    }
}
