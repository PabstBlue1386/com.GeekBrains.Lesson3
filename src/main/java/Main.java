import java.util.*;

public class Main {
    public static void main(String[] args) {
        listWords();
    }

    public static void listWords(){
        //List<String> list = new ArrayList<>();
        //int count = Collections.frequency(list, "kr");

        int count = 0;

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
