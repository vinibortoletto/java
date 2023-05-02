package Variables;

public class Variables {
    public static void main(String[] args) {
        // Primitives
        byte typeByte = 9;
        short typeShort = 300;
        short typeShortWithUnderscore = 300_00; // better readability
        int typeInt = 10;
        long typeLong = 102030405060L;
        float typeFloat = 101.10f;
        double typeDouble = 101.10d;
        char typeChar = 'c';
        boolean typeBoolean = true;

        // Non primitive
        String typeString = "String";
        StringBuilder stringBuilder = new StringBuilder();
        String firstName = "Vinicius";
        String lastName = "Bortoletto";
        String fullName = stringBuilder.append(firstName).append(lastName).toString();

        int[] typeArray = new int[9];
        int[] numberList = { 1, 2, 3 };
        int[][] matrix = new int[2][10];

    }
}