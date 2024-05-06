package practicecoding;

public class ReversingString {

    public static void main(String[] args) {
        String str = "Reverse this String";
        // 1st way to do it
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("1st way --> Reversed String: " + stringBuffer.reverse());

        //2nd way to do it
        char[] strCharArray = str.toCharArray();
        StringBuffer reverseString = new StringBuffer();

        for (int i = strCharArray.length - 1; i > -1; i--) {
            reverseString.append(strCharArray[i]);
        }
        System.out.println("2nd way --> Reversed String: " + reverseString);

        //3rd way to do it
        String reversed = str.chars().mapToObj(c -> (char) c).reduce("", (sa, c) -> c + sa, (s1, s2) -> s2 + s1);
        System.out.println("3rd way --> Reversed String: " + reversed);

        //Another way: Reversing String without disturbing its sequence
        String words[] = str.split(" ");
        StringBuilder strReversed = new StringBuilder();

        for(int i=0;i< words.length;i++){
            for(int j=words[i].length()-1;j>-1;j--){
                char [] wordsCharArray = words[i].toCharArray();
                strReversed.append(wordsCharArray[j]);
            }
            strReversed.append(" ");
        }
        System.out.print(strReversed);
    }
}
