public class main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        int weight = 98;
        int index = service.calculate(height, weight); // должно получиться 500
        System.out.println(index);
    }
}
