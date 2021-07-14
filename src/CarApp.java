public class CarApp {
    public static void main(String[] args){
        Car redPorsche = new Car("Red Porsche", 50, true);
        System.out.println(redPorsche.starting());
        System.out.println(redPorsche.accelerating());
        System.out.println(redPorsche.speedometer());
        System.out.println(redPorsche.stop());

        Car blue_jetta = new Car();
        blue_jetta.setName("Blue Jetta");
        blue_jetta.setSpeed(100);
        blue_jetta.setPass(true);

        System.out.println(redPorsche.starting());
        System.out.println(blue_jetta.starting());
        System.out.println(redPorsche.accelerating());
        System.out.println(blue_jetta.accelerating());
        System.out.println(blue_jetta.emissionTest());
        System.out.println(blue_jetta.emissionResult());
        System.out.println(redPorsche.speedometer());
        System.out.println(redPorsche.stop());
        System.out.println(blue_jetta.passes(redPorsche));
    }
}
