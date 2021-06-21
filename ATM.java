public class ATM {
    public int countBanknotes(int sum) {
        int[] cash = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int result = 0;
        int tempSum = sum;
        int tempResult = 0;
        int count = 0;
        int index = 0;

        while (count < cash.length) {

            if (tempSum >= cash[index]) {
                tempResult = tempSum / cash[index];
                tempSum -= (tempResult * cash[index]);
                result += tempResult;
            }
            index++;
            count++;
        }


        return result;
    }

    public static void main(String[] args) {
        ATM numberOfBills = new ATM();
        System.out.println(numberOfBills.countBanknotes(2001));

    }
}
