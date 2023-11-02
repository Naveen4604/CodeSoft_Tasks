import java.util.*;

class StudentGrade {
    double[] arr = new double[6];
    double percentage;
    int subj;
    Scanner s = new Scanner(System.in);

    void Input() 
    {
        int x=s.nextInt();
        System.out.println("Enter marks of each subject");
        for (subj = 0; subj < x; subj++) {
            System.out.print("Enter subject " + (subj + 1) + " Marks: ");
            arr[subj] = s.nextDouble();
        }
        calculator(x);
    }

    void calculator(int x) {
        double sum = 0;
        for (subj = 0; subj < x; subj++) {
            sum += arr[subj];
        }
        percentage = (sum / (x*100)) * 100;
        System.out.println("Percentage of the student: " + percentage + "%");
        gradecalculator(percentage);
    }

    void gradecalculator(double percent) {
        if (percent < 60) {
            System.out.println("Grade: Fail");
        } else if (percent <= 70) {
            System.out.println("Grade: \"B\"");
        } else if (percent <= 80) {
            System.out.println("Grade:\" B+\"");
        } else if (percent <= 90) {
            System.out.println("Grade: \"A\"");
        } else {
            System.out.println("Grade: \"A+\"");
        }
    }



    public static void main(String args[]) {
        StudentGrade g = new StudentGrade();
        g.Input();
    }
}


/*class Grade
{
	//double sub1,sub2,sub3,sub4,sub5,sub6;
	double arr[]=new double[6];
	double percentage,sum;
	//char grade;
	int subj;
	Scanner s=new Scanner(System.in);

	void Input()
	{
	System.out.println("enter marks of each subject");
	for(subj=0;subj<6;subj+=1)
	{
	System.out.println("Enter subject"+ (subj+1) +" Marks");
	arr[subj]=s.nextDouble();
	}
	calculator();
	}

	void calculator()
	{
	sum=0;
	for(subj=0;subj<6;subj+=1)
	{
	sum=sum+subj;
	}
percentage=(sum/600)*100;
System.out.println("percentge of the student are");
System.out.println(percentage);
System.out.println(gradecalculator(percentage));
	}
	

	int gradecalculator(double percent)
	{
		if(percent <60)
			System.out.println("fail");
		if ( percent >60 && percent <=70)
			System.out.println("B");
			//break;
		else if ( percent >70 && percent <=80)
			System.out.println("B+");
			//break;
		else if ( percent >80 && percent <=90Ṇ)
			System.out.println("A");
			//break;
		else if (percent >90)
			System.out.println("A+");
			//break;
		return 1;
	}

}
class StudentGrade
{
	public static void main(String args[])
	{
	 Grade g=new Grade();
	g.Input();

}
}*/