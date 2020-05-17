

public class Acronym {

    public static void main(String args[]) {


        // Logic:1

       /*
        String str="software development engineer test";
        String[] arry=str.split(" ");
        for (int i=0; i<=arry.length; i++){
            //char FirstLetter= arry[i].charAt(0);
            System.out.print(arry[i].toUpperCase().charAt(0));
        }

         */

        // Logic:2

        String str="indian space, ,research organization";
        //String pattern=/[a-zA-Z0-9&_\.-]/"5er5"
        StringBuilder sb = new StringBuilder();
        String[] words=str.split("[-_\\\\+]");

        for (String word:words) {
            sb.append(word.charAt(0));
        }
        System.out.println(sb.toString().toUpperCase());
    }


}
