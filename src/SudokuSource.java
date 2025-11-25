import java.util.HashMap;
import java.util.Map;

public class SudokuSource {

    final private static Map<String, Integer[][][]> solvedMatrices = new HashMap<>();
    final private static Map<String, Integer[][][]> unsolvedMatrices = new HashMap<>();

    static {

        solvedMatrices.put("#1", makeMatrix9x9(
            makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),
            makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),
            makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9))
        ));

        solvedMatrices.put("#2", makeMatrix9x9(
            makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),
            makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),
            makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9))
        ));

        solvedMatrices.put("#3", makeMatrix9x9(
            makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),
            makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),
            makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9)),      makeBlock(bLine(1, 2, 3), bLine(4, 5, 6), bLine(7, 8, 9))
        ));


        unsolvedMatrices.put("#1", makeMatrix9x9( // very easy
            makeBlock(bLine(null, null, 8), bLine(2, null, 3), bLine(5, null, 6)),            makeBlock(bLine(null, 9, 4), bLine(null, 7, 5), bLine(null, null, 8)),                    makeBlock(bLine(null, null, null), bLine(9, null, 6), bLine(null, 1, 7)),
            makeBlock(bLine(9, null, 5), bLine(6, null, 4), bLine(null, 3, null)),            makeBlock(bLine(7, 8, null), bLine(9, null, null), bLine(2, null, null)),                 makeBlock(bLine(null, 4, 3), bLine(7, 2, null), bLine(5, 6, null)),
            makeBlock(bLine(null, 5, null), bLine(3, 6, null), bLine(null, null, 9)),         makeBlock(bLine(8, 6, 9), bLine(null, 1, 7), bLine(null, 3, null)),                       makeBlock(bLine(2, 3, null), bLine(null, 9, 5), bLine(6, null, 1))
        ));

        unsolvedMatrices.put("#2", makeMatrix9x9( // medium
            makeBlock(bLine(null, null, null), bLine(4, 5, null), bLine(null, 8, null)),      makeBlock(bLine(null, 6, null), bLine(null, 2, null), bLine(3, null, null)),              makeBlock(bLine(2, 4, null), bLine(3, null, null), bLine(null, null, null)),
            makeBlock(bLine(null, null, 5), bLine(null, 7, 8), bLine(null, null, 9)),         makeBlock(bLine(4, null, null), bLine(null, 5, null), bLine(2, null, null)),              makeBlock(bLine(null, null, null), bLine(null, null, 9), bLine(null, null, null)),
            makeBlock(bLine(null, 3, null), bLine(5, 1, null), bLine(null, null, null)),      makeBlock(bLine(8, null, null), bLine(null, 3, null), bLine(null, 4, null)),              makeBlock(bLine(null, null, null), bLine(8, null, null), bLine(6, 5, null))
        ));

        unsolvedMatrices.put("#3", makeMatrix9x9( // very hard
            makeBlock(bLine(null, 8, null), bLine(null, null, null), bLine(null, null, 7)),   makeBlock(bLine(3, 1, null), bLine(null, 5, 2), bLine(4, null, 8)),                       makeBlock(bLine(null, null, null), bLine(null, null, 8), bLine(1, null, null)),
            makeBlock(bLine(null, 7, 3), bLine(9, 6, null), bLine(8, null, 2)),               makeBlock(bLine(null, null, null), bLine(null, null, null), bLine(null, null, null)),     makeBlock(bLine(8, null, 9), bLine(null, 7, 2), bLine(6, 1, null)),
            makeBlock(bLine(null, null, 8), bLine(3, null, null), bLine(null, null, null)),   makeBlock(bLine(9, null, 3), bLine(8, 7, null), bLine(null, 4, 1)),                       makeBlock(bLine(5, null, null), bLine(null, null, null), bLine(null, 8, null))
        ));

    }

    public static Integer[][][] getSolvedMatrix(int id) {
        return solvedMatrices.get("#" + id);
    }

    public static Integer[][][] getUnsolvedMatrix(int id) {
        return unsolvedMatrices.get("#" + id);
    }

    private static Integer[][][] makeMatrix9x9(
        Integer[][] block1, Integer[][] block2, Integer[][] block3,
        Integer[][] block4, Integer[][] block5, Integer[][] block6,
        Integer[][] block7, Integer[][] block8, Integer[][] block9
    ) {

        return new Integer[][][] {
            block1, block2, block3,
            block4, block5, block6,
            block7, block8, block9
        };

    }

    private static Integer[][] makeBlock(Integer[] blockLine1, Integer[] blockLine2, Integer[] blockLine3) {

        return new Integer[][]{
            blockLine1,
            blockLine2,
            blockLine3
        };

    }

    private static Integer[] bLine(Integer num1, Integer num2, Integer num3) {
        return new Integer[]{num1, num2, num3};
    }

}
