package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    @Test
    @DisplayName("อ่านข้อมูล")
    void testReadData() {
        StudentHardCodeDatasource datasource = new StudentHardCodeDatasource();
        StudentList studentList = datasource.readData();

        assertNotNull(studentList);
        assertNotEquals(0, studentList.getStudents().size());

        assertEquals("6710400001", studentList.getStudents().get(0).getId());
        assertEquals("6710400002", studentList.getStudents().get(1).getId());
        assertEquals("6710400003", studentList.getStudents().get(2).getId());
        assertEquals("6710400004", studentList.getStudents().get(3).getId());

        assertEquals("First", studentList.getStudents().get(0).getName());
        assertEquals("Second", studentList.getStudents().get(1).getName());
        assertEquals("Third", studentList.getStudents().get(2).getName());
        assertEquals("Fourth", studentList.getStudents().get(3).getName());

    }

}