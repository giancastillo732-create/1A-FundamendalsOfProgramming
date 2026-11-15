
public class ArrayProblem1 { // Nagde-declarec ako dito ng class na naglalaman ng program para sa pag-track ng daily temperatures.

    public static void main(String[] args) { // DIto naman Main method  kung saan magsisimula ang execution ng program.

        double[] temperatures = new double[5]; // Ito namanv ay Gumagawa ng 1D double array na may limang elements para paglagyan ng temperature sa loob ng limang araw.

        temperatures[0] = 32.5; // Itinatakda ang temperature sa unang araw gamit ang index 0.
        temperatures[1] = 34.0; // Itinatakda ang temperature sa ikalawang araw gamit ang index 1.
        temperatures[2] = 31.8; // Itinatakda ang temperature sa ikatlong araw gamit ang index 2.
        temperatures[3] = 33.2; // Itinatakda ang temperature sa ikaapat na araw gamit ang index 3.
        temperatures[4] = 35.1; // Itinatakda ang temperature sa ikalimang araw gamit ang index 4.

        System.out.println("Daily Temperatures:"); // Nilagyan ko naman dito ng nagpapakita ng heading bago ilista ang temperature ng bawat araw.

        for (int i = 0; i < temperatures.length; i++) { // Gumamit naman ako ng for loop at length property dito para ma-access ang bawat element ng array.
            System.out.println("Day " + (i + 1) + ": " + temperatures[i] + "°C"); //Nilagyan ko naman dito  nagpapakita ng araw at ang katumbas nitong temperature.
        } //    Dito tinatapos ang for loop pagkatapos maipakita ang lahat ng limang temperatures.

        temperatures[2] = 32.0; // Dito naman ina-update ang temperature sa ikatlong araw mula 31.8°C patungong 32.0°C.

        System.out.println("Updated temperature for the third day: " + temperatures[2] + "°C"); // Dito nagpapakita ng bagong temperature para sa ikatlong araw.

    } // Tinatapos ang main method.

} // Tinatapos ang ArrayProblem1
