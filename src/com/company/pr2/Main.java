package com.company.pr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

//Сортировка по сумме веса и возраста, фильтрация по весу кратно 5,
// выбор первых четырёх элементов, конкатенация имён через пробел
public class Main {
    public static void main(String[] args) {
        List<Human> people = new ArrayList<Human>() {{
            add(new Human(10, "Liza", "Lebedeva", LocalDate.of(2011, 6, 5), 40));
            add(new Human(15, "Anna", "Alekseeva", LocalDate.of(2005, 5, 15), 66));
            add(new Human(25, "Max", "Orlov", LocalDate.of(1995, 5, 20), 60));
            add(new Human(20, "Alex", "Skamander", LocalDate.of(2001, 6, 4), 59));
            add(new Human(30, "Nikita", "Volkov", LocalDate.of(1990, 4, 20), 70));
        }};

        System.out.println("По сумме веса и возраста:");
        people.stream()
                .sorted(Comparator.comparing(human -> human.getWeight()+human.getAge()))
                .forEach(System.out::println);

        System.out.println("\nФильтрация весу кратно 5:");
        people.stream()
                .filter(human -> human.getWeight()%5==0)
                .forEach(System.out::println);

        System.out.println("\nВыбор первых четырёх элементов:");
        people.stream()
                .limit(4)
                .forEach(System.out::println);

        System.out.println("\nКонкатенация имён через пробел:");
        String abc = people.stream()
                .map(Human::getFirstName)
                .map(i->i+" ")
                .collect(Collectors.joining());
        System.out.println(abc);
    }
}
