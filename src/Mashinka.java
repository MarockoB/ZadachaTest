public class Mashinka implements ISoundMachine {
    String mark;
    String color;
    String typeCuz;

    public Mashinka(String mark, String color, String typeCuz) {
        this.mark = mark;
        this.color = color;
        this.typeCuz = typeCuz;
    }

    @Override
    public String toString() {
        return "Машинка | " + "Марка = " + mark + ", цвет = " + color + ", Кузов = " + typeCuz+" "+sound();
    }

    @Override
    public String sound() {return " | Шумит, Гудит, Фыркает как "+mark;}
}

