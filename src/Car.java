public class Car {
    String name;
    int speed;
    boolean pass;

    public Car(){
    }

    public Car(String name, int speed, boolean pass){
        this.name = name;
        this.speed = speed;
        this.pass = pass;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setPass(boolean pass){
        this.pass = pass;
    }

    public boolean getPass(){
        return this.pass;
    }

    public String starting(){
        return "The " + this.name + " is starting";
    }

    public String accelerating(){
        return "The " + this.name + " is accelerating";
    }

    public String emissionTest(){
        return "The " + this.name + " stopped to have its emissions checked";
    }

    public String emissionResult(){
        String result = "";
        if(pass){
            result += "The " + this.name + " passes its emission test";
        }
        else{
            result += "The " + this.name + " fails its emission test";
        }
        return result;
    }

    public String speedometer(){
        return "The " + this.name + " is going " + speed + " mph";
    }

    public String stop(){
        return "The " + this.name + " is stopped";
    }

    public String passes(Car car){
        return "The " + this.name + " passes the " + car.getName();
    }
}
