/*

1. Отсортировать массив, состоящий из экземпляров класса Notebook в количестве 10000 штук.
Условия для сортировки:
1) по цене. От 500 до 2000 долларов с шагом в 50
если цена равная, то
2) по кол-ву оперативной памяти (от 4 до 24 с шагом 4)
если памяти тоже равное количество, то 3) по производителю:
Lenuvo > Asos > MacNote > Eser > Xamiou

2(дополнительно). Оптимизировать сортировку выбором, добавив поиск по максимального значения
 */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Notebook[] notebooks = new Notebook[5000];
        for (int i = 0; i < notebooks.length; i++)
            notebooks[i] = new Notebook(random.nextInt(31) * 50 + 500,
                                    random.nextInt(6) * 4 + 4,
                                    Manufacturer.values()[random.nextInt(5)]);
        
        Ascending(notebooks);

        for (int i = 0; i < notebooks.length; i++) {
            System.out.println(notebooks[i].toString());

        }

    }

    public static void Ascending(Notebook[] arr) {
        int start = 0;
        Notebook min;
        Notebook max;
        int minc;
        int maxc;
        int lenght = arr.length-1;
        boolean action = true;
        while(action){
            min = arr[start];
            max = arr[lenght];
            minc = start;
            maxc = lenght;
            action = false;
            for (int i = start; i < lenght+1; i++) {

                if (arr[i].price < min.price && !arr[i].price.equals(min.price)) {
                    min = arr[i];
                    minc = i;
                    action = true;
                }

                if (arr[i].price.equals(min.price)){
                    if(arr[i].RAM < min.RAM && !arr[i].RAM.equals(min.RAM)){
                    min = arr[i];
                    minc = i;
                    action = true;
                    continue;
                }
                if(arr[i].RAM.equals(min.RAM)) if(!arr[i].manufacturer.compare(min.manufacturer)){
                    min = arr[i];
                    minc = i;
                    action = true;
                }
                }


                if (arr[i].price > max.price && !arr[i].price.equals(max.price)) {
                    max = arr[i];
                    maxc = i;
                    action = true;
                }

                if (arr[i].price.equals(max.price)){
                    if(arr[i].RAM > max.RAM && !arr[i].RAM.equals(max.RAM)){
                        max = arr[i];
                        maxc = i;
                        action = true;
                        continue;
                    }
                    if(arr[i].RAM.equals(max.RAM)) if(arr[i].manufacturer.compare(max.manufacturer)){
                        max = arr[i];
                        maxc = i;
                        action = true;
                    }
                }

            }
            arr[minc] = arr[start];
            arr[start] = min;
            if(maxc == start) maxc = minc;
            arr[maxc] = arr[lenght];
            arr[lenght] = max;

            lenght--;
            start++;

        };
    }

    }
