public class School {
   public String schoolName;
   public void showSchool(String schoolName)
   {
       this.schoolName = schoolName;
       System.out.println("Name of the school: "+schoolName);
   }

    public static void main(String[] args) {
        School sl = new School();
        sl.showSchool("KV");
    }

}
