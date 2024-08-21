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
        assertEquals("")



    }

}
