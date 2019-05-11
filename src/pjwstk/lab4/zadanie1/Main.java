/*
    Zadanie 1:
    Autor: Rafał Tęcza & Damian Brzoskowski
    Index: s19468
*/

package pjwstk.lab4.zadanie1;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Adam", "Telefoniczna");
        Student student = new Student(person.getName(), person.getAddress(), "IT", 2019, 7050.00);
        Staff staff = new Staff(person.getName(), person.getAddress(), "PJWSTK" , 4700.00);

        System.out.println(student);
        System.out.println(staff);

    }
}
