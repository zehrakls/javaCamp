package firstLessonWork;

public class MultiDimensionalArrayDemo {

    public static void main(String[] args) {
        String[][] city = new String[3][3];

        city[0][0] = "Adana";
        city[0][1] = "Adıyaman";
        city[0][2] = "Ankara";
        city[1][0] = "İstanbul";
        city[1][1] = "İzmir";
        city[1][2] = "Antalya";
        city[2][0] = "Muğla";
        city[2][1] = "Mersin";
        city[2][2] = "Eskişehir";

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(city[i][j]);
            }
        }
    }
}
