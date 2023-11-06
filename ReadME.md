Эти два метода выполняют одну и ту же функцию. Как вы думаете, какой лучше и почему?

public String weekday1(int day) {
switch (day) {
case 1:
return "Monday";
case 2:
return "Tuesday";
case 3:
return "Wednesday";
case 4:
return "Thursday";
case 5:
return "Friday";
case 6:
return "Saturday";
case 7:
return "Sunday";
default:
throw new InvalidOperationException("day must be in range 1 to 7");
}
}

public String weekday2(int day) {
if ((day < 1) || (day > 7)) throw new InvalidOperationException("day must be in range 1 to 7");

    string[] days = {
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    };

    return days[day - 1];

}

### Ответ:

weekday2 исключает повторение кода :
(case n
:return),
и дает более короткую запись кода.

weekday1 же более експліцитний, и легок для
пониманя когда надо сделать много вариантов обработки.

### 2

Создайте проект Spring с помощью start.spring.io
Создайте POJO класс.

1) Настройте bean-компонент Student в файле bean-factory-demo.xml
2) Создайте java-конфигурацию
3) используйте аннотации

Запишите его в класс приложения.

// POJO class
public class Student {

// Member variables
private String name;
private String age;
}