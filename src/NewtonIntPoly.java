public class NewtonIntPoly {
    public static void main(String[] args) {
        int [] x = {1, 2, 3};
        int [][] y = new int [10][10];
        y[0][0] = 86;
        y[1][0] = 84;
        y[2][0] = 89;

        dividedDifference(x, y);

    }

    public static void dividedDifference (int [] x, int [][]y) {
        int n = y.length;
        int [][] coef;
        coef = y;

        for (int i=1; i<n; i++){
            for (int j=0; j<n-j; j++){
                coef[j][i] = (coef[j][i-1] - coef[j+1][i-1])/(x[i+j] - x[j]);
            }
            System.out.println(coef);
        }
    }

    public static void newtonPloynomial(int [] coef, int [] x_data, int x){
        int n = x_data.length - 1;
        int p = coef[n];

        for (int k=1; k<n+1; k++) {
            p = coef[n - k] + (x - x_data[n-k]) * p;
        }

    }
}
