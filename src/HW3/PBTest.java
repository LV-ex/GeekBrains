package HW3;

public class PBTest {

    public static void main (String[] args){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+79241112232");
        phoneBook.add("Иванов", "+79241112233");
        phoneBook.add("Петров", "+79241112234");
        phoneBook.add("Сидоров", "+79241112235");

        System.out.println(phoneBook.get("Сидоров"));
        System.out.println(phoneBook.get("Иванов"));
    }
}
