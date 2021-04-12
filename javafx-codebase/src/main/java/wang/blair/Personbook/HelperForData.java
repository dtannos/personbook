/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wang.blair.Personbook;

import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blair
 */
public class HelperForData {
    public static List<Person> generateSamplePersonRecords() {
        List<Person> people = new ArrayList<>();
        
        
        Person andrewBob = new Person("Andrew Bob");
        andrewBob.setBdayMonthDay(MonthDay.of(9, 25));
        andrewBob.addCaseNote(new CaseNote("This case note was created at the time of program execution! :)"));
        people.add(andrewBob);
        
        
        people.add(new Person("Charlie Dennis"));
        people.add(new Person("Evan Foucault"));
        people.add(new Person("Gary Habermas"));
        people.add(new Person("Ivan Jung"));
        people.add(new Person("Kevin Larry"));
        people.add(new Person("Michael Noland"));
        
        return people;
    }
    
    public static String formatLocalDateTime(LocalDateTime ldt) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
        return ldt.format(dtf);
    }
}
