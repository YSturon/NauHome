import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lab2_3 {
    static class Employee{
        private String fullName;
        private Integer age;
        private String department;
        private Double salary;

        public Employee(String fullName, Integer age, String department, Double salary){
            this.fullName = fullName;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }
        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
        public String getFullName() {
            return fullName;
        }
        public void setAge(Integer age) {
            this.age = age;
        }
        public Integer getAge() {
            return age;
        }
        public void setDepartment(String department) {
            this.department = department;
        }
        public String getDepartment() {
            return department;
        }
        public void setSalary(Double salary) {
            this.salary = salary;
        }
        public Double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return fullName + ",\nage=" + age + ",\ndep=" + department + ",\nsalary=" + salary+"\n";
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new  ArrayList<>();
        employees.add(new Employee("Стуров Юрий Александрович", 20, "Главный", 150000.0));
        employees.add(new Employee("Добрый Добярк Добрякович", 21, "Обычный", 142410.0));
        employees.add(new Employee("Злой Зляк Злякович", 35, "Обычный", 400.0));
        employees.add(new Employee("Иванов Иван Иванович", 70, "Главный", 120.5));
        employees.add(new Employee("Тестовый Тест Тестович", 20, "Главный", 15.3));

        List<Employee> olderThan30 = employees.stream()
                .filter(e -> e.getAge() > 30)
                .toList();
        System.out.println("Сотрудники старше 30:\n");
        olderThan30.forEach(System.out::println);
    }




}
