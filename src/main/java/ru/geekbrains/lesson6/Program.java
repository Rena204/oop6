package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.srp2.Order;

public class Program {

public static void main(String[] args) {
        Order order = new Order("Bruce Wayne", "Porche", 5,500000);
        Saver saver = new Saver();
        Loader loader = new Loader();
        Order order1 = new Order();
        System.out.println(order1);
    }
       
     }



