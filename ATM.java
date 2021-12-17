public class ATM {
    public int countBanknotes(int sum) {
        int result = 0;
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        while (sum != 0) {
            if (sum >= banknotes[i] && i < 8) {
                sum -= banknotes[i];
                result++;

            } else if (i+1 < 8) {
                i++;
            }
        }
        return result;
    }
}
