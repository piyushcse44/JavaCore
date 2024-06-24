import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
      readList(List.of(1,2,3,4,5,6,7,8));
    }
    public static void readList(List<Integer>values)
    {
        for(int value : values)
        {
            System.out.print(value);
        }
    }
}
