public class Chapter3Ex4 
{
    public static String translate(String dna)
     {
        dna = dna.toUpperCase();
        String rna = dna.replace("T", "U");
        return rna;
    }
}
