import java.util.*;

public class Main {
    public static void main(String[] args) {
        listWords();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "89685551122");
        phoneBook.add("Иванов", "89677766321");
        phoneBook.add("Михайлов", "89623147562");
        phoneBook.add("Мальцев", "89174576521");
        phoneBook.add("Фролов", "89192224578");
        phoneBook.add("Фролов","89995523366");
        phoneBook.get("Иванов");
        phoneBook.get("Михайлов");
        phoneBook.get("Мальцев");
        phoneBook.get("Фролов");



    }

    public static void listWords(){

        List<String> names = new ArrayList<>();
        names.add("Иван");
        names.add("Алексей");
        names.add("Игорь");
        names.add("Виталий");
        names.add("Иван");
        names.add("Алексей");
        names.add("Инокентий");
        names.add("Александр");
        names.add("Андрей");
        names.add("Александр");
        names.add("Валерий");
        names.add("Дмитрий");
        names.add("Александр");
        names.add("Дмитрий");
        names.add("Андрей");
        names.add("Игорь");

        List<String> uniqueNames = new ArrayList<>();

        for (String name:names){
            if (Collections.frequency(names, name) == 1) {
                uniqueNames.add(name);
            }
        }
        System.out.println(uniqueNames);
    }





}
