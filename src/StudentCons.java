public class StudentCons {

        private String name;
        private String grade;
        private int age;
        public StudentCons(String name)
        {
            this. name = name;
            System.out.println("Nmae: "+name);
        }
        public StudentCons(String name, String grade)
        {
            this.name = name;
            this.grade = grade;
            System.out.println("Name: "+name+"\tGrade: "+grade);
        }
        public StudentCons(String name,String grade,int age)
        {
            this.name = name;
            this.grade = grade;
            this.name = name;
            System.out.println("Name: "+name+"\tGrade: "+grade+"\tAge: "+age);
        }

        public static void main(String[] args) {
            StudentCons s1 = new StudentCons("Riya");
            StudentCons s2 = new StudentCons("Raj","A");
            StudentCons s3 = new StudentCons("Aman","B",17);
        }
    }

