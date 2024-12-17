public class Hangar {
    public static void main (String[]args){
        Boat titanic= new Boat("Titanic");
        Car mercedes= new Car("mercedes");

        System.out.println(titanic.doStuff());
        System.out.println(mercedes.doStuff());
    }
}
