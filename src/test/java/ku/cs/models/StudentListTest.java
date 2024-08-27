package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentListTest {

    StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
    }

    @Test
    @DisplayName("test addNewStudent")
    void testAddNewStudent(){
        Student s1 = new Student("6610450862", "Jiropas");
        studentList.addNewStudent("6610450862", "Jiropas");

        Student s = studentList.findStudentById("6610450862");
        assertEquals("Jiropas", s.getName());
    }

    @Test
    @DisplayName("Find Student Test")
    void testFindStudent(){
        studentList.addNewStudent("6610450001", "mo");
        studentList.addNewStudent("6610450002", "dew");
        studentList.addNewStudent("6610450003", "plai");

        Student s = studentList.findStudentById("6610450001");
        assertEquals("mo", s.getName());
    }

    @Test
    @DisplayName("Give score test")
    void testGiveScore(){
        studentList.addNewStudent("6610450001", "mo");
        studentList.addNewStudent("6610450002", "dew");
        studentList.addNewStudent("6610450003", "plai");

        studentList.giveScoreToId("6610450001", 100);
        double expected = 100;
        double actual = studentList.findStudentById("6610450001").getScore();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("View grade test")
    void testViewScore(){
        studentList.addNewStudent("6610450001", "mo");
        studentList.addNewStudent("6610450002", "non");
        studentList.addNewStudent("6610450003", "plai");

        studentList.giveScoreToId("6610450001", 100);
        String expected = "A";
        String actual = studentList.viewGradeOfId("6610450001");
        assertEquals(expected, actual);
    }
}
