package java_module.java_basics.question;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunOfThreeTest {
    @ParameterizedTest
    @MethodSource("provideInputsAndExpectedOutputs")
    public void runTestCases(char[][] input, int[][] expectedOutput) {
        int[][] actualOutput = RunOfThree.findWinningPiecesCoordinates(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> provideInputsAndExpectedOutputs() {
        return Stream.of(
                Arguments.of(new char[][]{
                        {'-', 'x', 'o'},
                        {'x', '-', '-'},
                        {'-', 'o', 'o'}
                }, new int[][]{}),
                Arguments.of(new char[][]{
                        {'-', '-', 'o'},
                        {'o', '-', 'x'},
                        {'-', '-', 'o'}
                }, new int[][]{}),
                Arguments.of(new char[][]{
                        {'x', 'x', 'o'},
                        {'-', '-', '-'},
                        {'-', 'o', 'o'}
                }, new int[][]{}),
                Arguments.of(new char[][]{
                        {'-', '-', '-'},
                        {'-', '-', '-'},
                        {'-', '-', '-'}
                }, new int[][]{}),
                Arguments.of(new char[][]{
                        {'x', 'o', 'x'},
                        {'x', 'o', 'x'},
                        {'o', 'x', 'o'}
                }, new int[][]{}),
                Arguments.of(new char[][]{
                        {'o', 'x', 'o'},
                        {'-', 'x', '-'},
                        {'o', 'x', 'o'}
                }, new int[][]{
                        {0, 1},
                        {1, 1},
                        {2, 1},
                }),
                Arguments.of(new char[][]{
                        {'x', 'o', 'x'},
                        {'-', 'o', 'x'},
                        {'x', 'o', 'o'}
                }, new int[][]{
                        {0, 1},
                        {1, 1},
                        {2, 1},
                }),
                Arguments.of(new char[][]{
                        {'o', 'x', 'o'},
                        {'-', '-', '-'},
                        {'o', 'o', 'o'}
                }, new int[][]{
                        {2, 0},
                        {2, 1},
                        {2, 2},
                }),
                Arguments.of(new char[][]{
                        {'o', 'x', 'o'},
                        {'-', '-', '-'},
                        {'x', 'x', 'x'}
                }, new int[][]{
                        {2, 0},
                        {2, 1},
                        {2, 2},
                }),
                Arguments.of(new char[][]{
                        {'o', 'x', 'o'},
                        {'-', 'o', '-'},
                        {'-', '-', 'o'}
                }, new int[][]{
                        {0, 0},
                        {1, 1},
                        {2, 2},
                }),
                Arguments.of(new char[][]{
                        {'x', 'o', 'o'},
                        {'-', 'x', '-'},
                        {'-', '-', 'x'}
                }, new int[][]{
                        {0, 0},
                        {1, 1},
                        {2, 2},
                }),
                Arguments.of(new char[][]{
                        {'x', 'x', 'o'},
                        {'-', 'o', '-'},
                        {'o', '-', 'o'}
                }, new int[][]{
                        {0, 2},
                        {1, 1},
                        {2, 0},
                }),
                Arguments.of(new char[][]{
                        {'o', 'o', 'x'},
                        {'-', 'x', '-'},
                        {'x', '-', 'o'}
                }, new int[][]{
                        {0, 2},
                        {1, 1},
                        {2, 0},
                })
        );
    }
}
