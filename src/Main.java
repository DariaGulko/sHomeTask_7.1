
/**
 * Created by Dariya on 18.10.2015.
 * ������� ��������� ������ �� 8 ����� �� 5 �������� � ������ �� ��������� ����� ����� �� ������� [10;99]. ������� ������ �� �����.
 */
public class Main {
    public static void main(String[] args) {
        int array[][] =new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j<array[i].length;j++){
                array[i][j]= (int) (10 + (Math.random() * (100 - 10)));
            }
        }
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
