
import java.util.ArrayList;

public class Statistics {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Statistics() {
        points = new ArrayList<>();
        grades = new ArrayList<>();
    }
    
    private int getGrade(int point) {
        int grade = 0;
        if (point >= 90) {
            grade = 5;
        } else if (point >= 80) {
            grade = 4;
        } else if (point >= 70) {
            grade = 3;
        } else if (point >= 60) {
            grade = 2;
        } else if (point >= 50) {
            grade = 1;
        }
        return grade;
    }
    
    public void addPoint(int point) {
        if (point >= 0 && point <= 100) {
            points.add(point);
            grades.add(getGrade(point));
        }
    }
    
    public double average() {
        int sum = 0;
        for (Integer point : points) {
            sum += point;
        }
        return 1.0 * sum / points.size();
    }

    public double averagePassing() {
        int sum = 0;
        int count = 0;
        for (Integer point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        return 1.0 * sum / count;
    }

    public double passPercentage() {
        int count = 0;
        for (Integer point : points) {
            if (point >= 50) {
                count++;
            }
        }
        return 100.0 * count / points.size();
    }
    
    public void printDistribution() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            int count = 0;
            for (Integer grade : grades) {
                if (grade == i) {
                    count++;
                }
            }
            System.out.print(i + ": ");
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
