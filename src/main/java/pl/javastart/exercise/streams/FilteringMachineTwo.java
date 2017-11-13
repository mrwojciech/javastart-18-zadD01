package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;

public class FilteringMachineTwo {

    public List<String> findKidNames(List<Person> ppl) {
        List<String> result = new ArrayList<>();
        for (Person person : ppl) {
            if (person.getAge() < 18) {
                result.add(person.getName());
            }
        }
        return result;
    }


    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> users = new ArrayList<>();
        for (Person person : people) {
            users.add(new User(person.getName(), person.getAge(), person.getName() + "_" + person.getAge()));
        }
        return users;
    }
}
