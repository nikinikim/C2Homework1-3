public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", "бренд-менеджер",1988);
        Human anya = new Human("Аня", "Москва","методист образовательных программ" ,1993);
        Human katya = new Human("Катя", "Калининград","продакт-менеджер", 0);
        Human artem = new Human("Артем", "Москва","директор", 1995);
        Human vladimir = new Human("Владимир", "Казань",null, 1995);
        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);

        Flower rosa = new Flower("Роза",null, "Голландия", 35.59);
        Flower hrizantema = new Flower("Хризантема",null, null, 15.00, 5);
        Flower pion = new Flower("Пион",null, "Англия", 69.9, 1);
        Flower hipsofila = new Flower("Гипсофила", null, "Турция", 19.5, 10);
        System.out.println(rosa);
    }

}