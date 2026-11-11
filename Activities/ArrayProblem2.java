
import java.util.Arrays; // Ini-import ko ang Arrays class para magamit ang deepToString() method.

public class ArrayProblem2 { // Nagdeclare ako ng class na maglalaman ng buong cinema seating chart program.

    public static void main(String[] args) { // Main method kung saan simulacrum ang program.

        String[][] seats = { // Nagde-declare at nag-i-initialize ng 2D String array.
                {"Alice", "Bob", "Charlie"}, // Unang row na naglalaman ng tatlong nakaupo.
                {"David", "Emma", "Frank"} // Pangalawang row na naglalaman nh tatlong pangalan ulit.
        }; //c DIto tinatapos ko na ang paglalagay ng mga pangalan sa 2D array.

        System.out.println("Person in second row, third column: " + seats[1][2]); // Ina-access at ipinapakita ang pangalan ng taong nasa second row at third column, na si Frank.

        seats[0][1] = "Vacant"; // Pinapalitan ko ang pangalan ni Bob ng Vacant dahil ang kanyang position ay nasa first row at second column.

        System.out.println("Updated Cinema Seating Chart:"); // Nilagyan ko naman na nagpapakita ng heading bago ilabas ang updated seating arrangement.

        System.out.println(Arrays.deepToString(seats)); // Ginagamit ang deepToString() upang ipakita ang lahat ng laman ng 2D array sa isang linya.

    } // Tinatapos ang main method.

} // Tinatapos ang ArrayProblem2 class.
