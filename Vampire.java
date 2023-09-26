package Java;
public class Vampire {
    public static Boolean isVampire(int num) {
        String str = Integer.toString(num);
        if (str.length() % 2 != 0)
            return false;

        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && i != 0) {
                    int num1 = arr[i] * 10 + arr[j];
                    int num2 = (arr[arr.length - 1 - i] * 10) + arr[arr.length - 1 - j];

                    if (num1 * num2 == num) 
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 1260;
        if (isVampire(n))
            System.out.println(n + " is vampire");
    }
}