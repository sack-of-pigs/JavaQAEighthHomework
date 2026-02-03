import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.VacationService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/VacationMonthsTestParameters")
    public void testCalculateVacationMonthsTest(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();
        int result = service.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expected, result);
    }
}
