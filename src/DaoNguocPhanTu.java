public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int array[] = {1,3,7,8,2,5,6,9};

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }
}
