public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", "бренд-менеджер",1988);
        Human anya = new Human("Аня", "Москва","методист образовательных программ" ,1993);
        Human katya = new Human("Катя", "Калининград","продакт-менеджер", 0);
        Human artem = new Human("Артем", "Москва",null, 1995);
        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
    }
}