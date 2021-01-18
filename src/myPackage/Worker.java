package myPackage;

public class Worker extends Person{
    String name;

    @Override
    public void info() {
        this.name = "Ha noi";
        System.out.println(this.name);

        super.info();
        super.name = "Tay Ho";
        System.out.println(super.name);

    }


}
