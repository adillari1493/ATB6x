package Exercise;

public class Ex11 {
    public static void main(String[] args) {
        String s1 = "Adil"; //String constant pool area
        String s2 = new String("Adil"); //OA

        //String is IMMUTABLE: Once created can't be changed..

        StringBuffer stringBuffer = new StringBuffer("Adil");
        stringBuffer.append(" Lari");

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append(" Singh");
    }
}
