package ku.cs.models;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;
    @BeforeEach
    void init(){
        student = new Student("6700000000", "test");
    }

    @Test
    @DisplayName("เปลี่ยนชื่อ")
    void testChangeName(){
        student.changeName("Jame");
        assertEquals("Jame", student.getName());
    }

    @Test
    @DisplayName("เพิ่มคะแนน")
    void testAddScore(){
        student.addScore(40.1);
        assertEquals(40.1, student.getScore());
    }

    @Test
    @DisplayName("เพิ่มเกรด")
    void testCalculateGrade(){
        student.addScore(90);
        assertEquals("A", student.grade());
    }

    @Test
    @DisplayName("เช็คไอดี")
    void testIsId(){
        assertTrue(student.isId("6700000000"));
    }

    @Test
    @DisplayName("เช็คชื่อ")
    void testIsNameContains(){
        assertTrue(student.isNameContains("test"));
    }

}