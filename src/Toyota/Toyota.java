package Toyota;

/**
 * Created by IT on 18.04.2016.
 */
public class Toyota extends Object {
    private String name;
    private double volume;


    public Toyota(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public Toyota(String name) {
        this.name = name;
        System.out.println("Конструктор Камри");
    }


    public Toyota(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
