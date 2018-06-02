package pregunta3;

public class Combination {

    public static void main(String[] args) {
        Combination combinations = new Combination();
        int n = 10;
        int level = 0;
        System.out.println("# Ladder's steps: " + n);
        System.out.println("# Step combinations: " + combinations.countCombinations(n, level));
        System.out.println("# Step combinations improved: " + combinations.countCombinationsImproved(n, level));
    }

    public long countCombinations(int n, int level) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 && level == 0) {
            return 0;
        }
        if (n == 0 && level > 0) {
            return 1;
        }
        return countCombinations(n - 1, level + 1) + countCombinations(n - 2, level + 1)
                + countCombinations(n - 3, level + 1);
    }

    public long countCombinationsImproved(int n, int level) {
        long tablaDinamica[][] = new long[n + 1][2];
        if (n < 0) {
            return 0;
        }
        if (n == 0 && level == 0) {
            return 0;
        }
        if (n == 0 && level > 0) {
            return 1;
        }
        tablaDinamica[0][0] = 1;
        tablaDinamica[1][0] = 1;
        tablaDinamica[2][0] = 2;
        tablaDinamica[3][0] = 4;
        tablaDinamica[0][1] = 1;
        tablaDinamica[1][1] = 1;
        tablaDinamica[2][1] = 2;
        tablaDinamica[3][1] = 4;
        for (int i = 3; i <= n; i++) {
            if (level == 0) {
                tablaDinamica[i][0] = tablaDinamica[i - 1][0] + tablaDinamica[i - 2][0] + tablaDinamica[i - 3][0];
            } else {
                tablaDinamica[i][1] = tablaDinamica[i - 1][1] + tablaDinamica[i - 2][1] + tablaDinamica[i - 3][1];
            }

        }
        if (level == 0) {
            return tablaDinamica[n][0];
        } else {
            return tablaDinamica[n][1];
        }
    }
}
