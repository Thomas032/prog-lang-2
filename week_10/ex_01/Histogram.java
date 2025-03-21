import java.util.List;
import java.util.ArrayList;

public class Histogram {
    private List<Integer> data;

    public Histogram(List<Integer> data) {
        this.data = data;
    }

    public void drawHistogram() {
        int[] ranges = new int[10];
        
        for (int num : data) {
            int rangeIndex = (num - 1) / 10;
            if (rangeIndex > 9) {
                rangeIndex = 9;
            }
            ranges[rangeIndex]++;
        }
        
        for (int i = 0; i < 10; i++) {
            int start = i * 10 + 1;
            int end = (i + 1) * 10;
            
            System.out.printf("%2d-%3d | ", start, end);
            
            for (int j = 0; j < ranges[i]; j++) {
                System.out.print("*");
            }
        }
    }

    @Override
    public String toString() {
        drawHistogram();
        return "";
    }
}