/* Please, do not rename it */
class Problem {

    public static void main(String args[]) {
        args[0] = "MAX";
        args[1] = "7";
        args[2] = "3";
        String operator = args[0];
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);
                sum += Integer.parseInt(args[i]);
            }
            if (Integer.parseInt(args[i]) < min) {
                min = Integer.parseInt(args[i]);
            }
        }
        switch (operator) {
            case "MAX":
                System.out.println(max);
                break;
            case "MIN":
                System.out.println(min);
                break;
            case "SUM":
                System.out.println(sum);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}