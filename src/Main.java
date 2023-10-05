public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"a", "ab", "c","az", "n", "b", "ac", "p", "r", "po", "pn", "h", "l", "nq", "j", "fr", "jb", "to", "s", "t", "u", "uv", "um", "y", "z", "x", "ww", "wf", "iu", "pe", "nk"};
        for (String str: stringArray){
            System.out.print(str + " ");
        }
        System.out.println();

        bubbleSwap(stringArray);
        for (String str: stringArray){
            System.out.print(str + " ");
        }
    }

    public static void bubbleSwap(String[] strings){
        boolean hasSwapped = true;
        int j = 0;

        while(hasSwapped){
            hasSwapped = false;
            for (int i = 0; i < strings.length - 1 - j; i++){
                if (strings[i].compareTo(strings[i+1]) > 0){
                    String temp = strings[i];
                    strings[i] = strings[i+1];
                    strings[i+1] = temp;
                    hasSwapped = true;
                }
            }
            j++;
        }
    }
}