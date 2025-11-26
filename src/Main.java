public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Start Here");

        // Escolhe uma matriz solucionada para usar no VALIDADOR (VALIDATOR)
        Integer[][][] solvedMatrix = SudokuSource.getSolvedMatrix(1);

        // ....

        // Escolhe uma matriz NÃO resolvida para usar no SOLUCIONADOR (SOLVER)
        Integer[][][] unsolvedMatrix = SudokuSource.getUnsolvedMatrix(1);
        
        // ....

    }

}
