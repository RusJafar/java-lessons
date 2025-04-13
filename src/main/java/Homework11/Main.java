package Homework11;

import java.util.List;

/**
 * 1) Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
 * 2) Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
 * 3) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 2000 руб, иначе 1900. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 2500 руб, иначе 2200.
 * 4) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
 */

public class Main {
    public static void main(String[] args) {
        // Создаем программы обучения
        TrainingProgram techThread = new TrainingProgram(List.of("Алгебра", "Геометрия", "Физика"));
        TrainingProgram programThread = new TrainingProgram(List.of("Алгебра", "Геометрия", "Физика", "Проектироавние инф. систем", "Дискретная математика"));

        // Создаем группы по программам обучения
        Group techGroup = new Group(1, techThread);
        Group appliedInformaticsGroup = new Group(2, programThread);

        // Набираем в группы студентов
        techGroup.addAspirantToGroup("Фирсов", "Андрей");
        techGroup.addAspirantToGroup("Федоров", "Алексей");
        techGroup.addAspirantToGroup("Федоров", "Алексей");
        appliedInformaticsGroup.addStudentToGroup("Захаров", "Игорь");
        appliedInformaticsGroup.addStudentToGroup("Мальков", "Сергей");
        appliedInformaticsGroup.addStudentToGroup("Черницов", "Антон");
        appliedInformaticsGroup.addStudentToGroup("Исабагандов", "Мурат");
        appliedInformaticsGroup.addStudentToGroup("Шевцов", "Сергей");

        // Проводим семинары для групп студентов
        techGroup.checkOutTheSeminar("Алгебра");
        techGroup.checkOutTheSeminar("Геометрия");
        techGroup.checkOutTheSeminar("Физика");
        appliedInformaticsGroup.checkOutTheSeminar("Проектироавние инф. систем");
        appliedInformaticsGroup.checkOutTheSeminar("Дискретная математика");
        appliedInformaticsGroup.checkOutTheSeminar("Геометрия");

        // Выводим информацию о стипендиях
        techGroup.printScholarshipForGroup();
        appliedInformaticsGroup.printScholarshipForGroup();
    }
}
