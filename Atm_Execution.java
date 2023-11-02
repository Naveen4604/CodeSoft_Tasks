import java.util.*;

class StudentGrade {
    double[] arr = new double[6];
    double percentage;
    int subj;
    Scanner s = new Scanner(System.in);

    void Input() 
{
System.out.println("enter sub no.");
int n=s.nextInt();
        System.out.println("Enter marks of each subject");
        for (subj = 0; subj < n; subj++) {
            System.out.print("Enter subject " + (subj + 1) + " Marks: ");
            arr[subj] = s.nextDouble();
        }
        calculator(n);
    }

    void calculator(int n) {
        double sum = 0;
        for (subj = 0; subj < n; subj++) {
            sum += arr[subj];
        }
        percentage = (sum / n*100) * 100;
        System.out.println("Percentage of the student: " + percentage + "%");
        gradecalculator(percentage);
    }

    void gradecalculator(double percent) {
        if (percent < 60) {
            System.out.println("Grade: Fail");
        } else if (percent <= 70) {
            System.out.println("Grade: B");
        } else if (percent <= 80) {
            System.out.println("Grade: B+");
        } else if (percent <= 90) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Grade: A+");
        }
    }



    public static void main(String args[]) {
        StudentGrade g = new StudentGrade();
        g.Input();
    }
}




