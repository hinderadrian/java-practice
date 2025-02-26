package practicecoding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employeevalidator {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 39000, 20),
                new Employee(2, "Alex", 26500, 34),
                new Employee(3, "Maria", 92000, 25),
                new Employee(4, "Magdalena", 29999, 22),
                new Employee(5, "Aurora", 30000, 17),
                new Employee(6, "Carlos", 45000, 28),
                new Employee(7, "Andrea", 27600, 30)
        );

        /*
        Generar como resultado una nueva lista de empleados basado en las siguientes condiciones:
        1- Edad entre 20 y 30
        2- salario mayor a 30000
        3- Ordenado por el nombre de los empleados
         */
        List<Employee> filteredList = employees.stream()
                .filter(employee -> employee.getAge() >= 20 && employee.getAge() <=30)
                .filter(employee -> employee.getSalary() > 30000)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        //filteredList.forEach(System.out::println);
        //print all the values of filtered list
        filteredList.forEach(employee -> {
            System.out.println("---- EMPLOYEE ----");
            System.out.println(employee.getId());
            System.out.println(employee.getName());
            System.out.println(employee.getSalary());
            System.out.println(employee.getAge());
            System.out.println("------------------");
        });

        // Convert filteredList into Map with id as key and value as the entire object
        Map<Integer, Employee> mappedEmployees = filteredList.stream().collect(Collectors.toMap(Employee::getId, employee -> employee));

        System.out.println(mappedEmployees);
    }

    static class Employee {
        private int id;
        private String name;
        private int salary;
        private int age;

        public Employee(int id, String name, int salary, int age) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
