package fr.lernejo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {


    @ParameterizedTest
    @CsvSource({
        "ADD,1, 1, 2",
        "ADD,-1, 1, 0",
        "MULT,5,5,25",
        "MULT,2,2,4"


    })
    void add_and_multi_behave_as_expected_cases(Sample.Operation test_nature, int a, int b, int expectedResult) {
        int result = new Sample().op(test_nature, a, b);

        assertThat(result).isEqualTo(expectedResult);
    }
}

