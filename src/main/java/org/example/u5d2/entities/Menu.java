package org.example.u5d2.entities;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Menu {
    @Autowired
    private List<Pizza> pizzaList;
    @Autowired
    private List<Drink> drinkList;
    @Autowired
    private List<Topping> toppingList;

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinkList.forEach(System.out::println);
        System.out.println();

    }
}

