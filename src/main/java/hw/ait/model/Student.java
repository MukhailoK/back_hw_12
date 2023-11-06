package hw.ait.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Student {

    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }
}
