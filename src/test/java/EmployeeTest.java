import org.example.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    void testEmployeeCreation() {
        Employee employee = new Employee("John Doe", 60000);
        assertEquals("John Doe", employee.getName());
        assertEquals(60000, employee.getAnnualSalary());
    }
}
