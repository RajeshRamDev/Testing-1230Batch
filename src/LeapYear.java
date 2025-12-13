public class LeapYear {

        int year;
        public void leapYear(int year)
        {
            if(year%4==0)
            {
                System.out.println(year+ " Is a Leap year");
            }
            else {
                System.out.println(year+ " Is a Non Leap Year");
            }
        }

        public static void main(String[] args) {
        LeapYear ly = new LeapYear();
        ly.leapYear(2004);
    }
    }


