package lab4;
public class Two {
    public static void main(String[] args) {
        // how to take input from a file
        String firstName = IO.readLine();
        String lastName = IO.readLine();
        int a = Integer.parseInt(IO.readLine());
        float b = Float.parseFloat(IO.readLine());

        System.out.println(firstName + " " + lastName + " " + a + " " + b);
        //array of strings
        String[] lines = new String[4];
        for(int i = 0; i < lines.length; ++i)
            lines[i] = IO.readLine();           
        for(String line : lines)
            System.out.println(line);
    }
}
