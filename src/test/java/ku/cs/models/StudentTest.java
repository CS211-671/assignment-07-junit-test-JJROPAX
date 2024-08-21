package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

        Student s1;
        @BeforeEach
        void init(){
            s1 = new Student("6610450862", "Jiropas");
        }

        @Test
        void testAddScore(){
            //Student s1 = new Student("6610450862", "Jiropas");
            assertEquals(0, s1.getScore());
            s1.addScore(50.45);
            assertEquals(50.45, s1.getScore());
            s1.addScore(20);
            assertEquals(70.45, s1.getScore());
        }

        @Test
        @DisplayName("ทดสอบการคิดเกรด")
        void testCalculateScore(){
            //Student s1 = new Student("6610450862", "Jiropas");
            s1.addScore(60.8);
            assertEquals("C", s1.grade());
        }

        @Test
        @DisplayName("ทดสอบการเปลี่ยนชื่อ")
        void testGetName(){
            s1.changeName("o0Nonth0o");
            assertEquals("o0Nonth0o", s1.getName());
        }

        @Test
        @DisplayName("ทดสอบID")
        void testIsId(){
            String id = "6610450862";
            assertEquals(true, s1.isId(id));
        }

        @Test
        @DisplayName("test constructor")
        void testStudent(){
            Student s2 = new Student("6610450001", "Maximus");
            assertEquals("6610450001", s2.getId());
            assertEquals("Maximus", s2.getName());
            assertEquals(0, s2.getScore());
        }

        @Test
        @DisplayName("test toString")
        void testToString(){
            Student s2 = new Student("6610450001", "Maximus");
            assertEquals("{id: '6610450001', name: 'Maximus', score: 0.0}", s2.toString());

        }
}