import java.util.*;

public class PhoneBook {
    Map<String, List<String>> phoneBook = new HashMap<>();
    List<String> phoneNumber = new ArrayList<>();


    public void add(String surname, String number){
        if (phoneBook.containsKey(surname)){
            phoneNumber.add(number);
            phoneBook.put(surname, phoneNumber);
        } else {
            phoneNumber = new ArrayList<>();
            phoneNumber.add(number);
            phoneBook.put(surname,phoneNumber);
        }

    }

    public void get(String surname){
        System.out.println(surname + " " + phoneBook.get(surname));
    }


}
