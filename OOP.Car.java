public class Car {
    string name;
    string color;
    short speed;
    short engine_power;

    void start() {
        system.out.println(name + " turning !");
    }

    void stop() {
        system.out.println(name + " stoping !");
    }

    void changGear() {
        system.out.println(name + " changingGear !");
    }
}  
  
  
  //main program
  class main{
    public static void main (string[] args ){
        Car Car1 = new Car();
        Car1.name  = "range rover";
        Car1.speed =340;
        Car1.color = "black"
        Car1.engine_power ="4400cc";
        system.out.println(Car1.speed);
        Car Car2=new Car();
        Car2.name= "lamborguini;"
        Car2.jump();

    }
}
