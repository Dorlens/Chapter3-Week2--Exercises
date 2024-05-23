public class Chapter3Ex1 
{
    public static void main(String[]args)
    {

    
    if (args.length == 0) 
    {
        System.out.println("Please provide a file name as a command-line argument.");
        return;
    }

    String s = args[0];
    int dot = s.lastIndexOf(".");
    
    if (dot == -1 || dot == 0 || dot == s.length() - 1) {
        System.out.println("Invalid file name  Please provide a valid file name with an extension.");
        return;
    }

    String base = s.substring(0, dot);
    String extension = s.substring(dot + 1);

    System.out.println("Base name: " + base);
    System.out.println("Extension: " + extension);
}
}
