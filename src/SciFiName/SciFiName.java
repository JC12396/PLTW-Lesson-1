package SciFiName;

public class SciFiName
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     *
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main(String[] args)
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name

        firstName = firstName.substring(0, 3);
        lastName = lastName.substring(0, 2);

        city = city.substring(0, 2);
        school = school.substring(0, 3);

        int r1 = (int) (Math.random()* relativeName1.length());
        int r2 = (int) (Math.random()* relativeName2.length());

        relativeName1 = relativeName1.substring(r1, relativeName1.length());
        relativeName2 = relativeName2.substring(r2, relativeName2.length());


        String c1 = firstName.substring(0,1).toUpperCase();
        String c2 = lastName.substring(0,1).toLowerCase();
        String c3 = city.substring(0,1).toUpperCase();
        String c4 = school.substring(0,1).toLowerCase();
        String c5 = relativeName1.substring(0,1).toUpperCase();
        String c6 = relativeName2.substring(0,1).toLowerCase();







        String first = c1 + firstName.substring(1, firstName.length())+ c2 + lastName.substring(1, lastName.length());
        String last = c3 + city.substring(1, city.length()) + c4 + school.substring(1, school.length());
        String origin = c5 + relativeName1.substring(1, relativeName1.length()) + c6 + relativeName2.substring(1, relativeName2.length());


        System.out.println("Hello " + first+ " " + last + " of " + origin + ". Welcome!");



    }
}

