package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentListTest {
    StudentList studentList;
    @BeforeEach
    void init() {
        studentList = new StudentList();
        studentList.addNewStudent("6700000000", "Test1");
    }

    @Test
    @DisplayName("เพิ่มนักเรียน")
    void testAddNewStudent() {
        studentList.addNewStudent("6700000001", "Test2", 85);
        assertEquals(2, studentList.getStudents().size());
        assertEquals("6700000000", studentList.getStudents().get(0).getId());
        assertEquals("6700000001", studentList.getStudents().get(1).getId());
        assertEquals("Test1", studentList.getStudents().get(0).getName());
        assertEquals("Test2", studentList.getStudents().get(1).getName());
        assertEquals("A", studentList.getStudents().get(1).getGrade());
    }

    @Test
    @DisplayName("หาไอดีนักเรียน")
    void testFindStudentById() {
        assertEquals(studentList.getStudents().get(0), studentList.findStudentById("6700000000"));
    }

    @Test
    @DisplayName("หรองนักเรียนจากชื่อ")
    void testFilterByName() {
        studentList.addNewStudent("6700000000", "Test2");
        studentList.addNewStudent("6700000001", "Test3");
        studentList.addNewStudent("6700000002", "Test1");
        assertEquals(2, studentList.filterByName("Test1").getStudents().size());
    }

    @Test
    @DisplayName("เพิ่มคะแนนให้ไอดี")
    void testGiveScoreToId() {
        studentList.giveScoreToId("6700000000", 86);
        assertEquals(86,studentList.getStudents().get(0).getScore());
    }

    @Test
    @DisplayName("ดูเกรดจากไอดี")
    void testViewGradeOfId() {
        studentList.addNewStudent("6700000001", "Test2", 85);
        assertEquals("A",studentList.viewGradeOfId(studentList.getStudents().get(1).getId()));
    }


}