package String;

public class StringCompression {

    public static void main(String[] args) {
        char chars[] =  {'a','a','b','b','c','c','c'};

        char temp[] = new char[chars.length];
        for (int i = 0; i < temp.length; i++) temp[i] = chars[i];

        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == temp[i - 1]) cnt++;
           
            else {
                sb.append(temp[i - 1]);
                if (cnt > 1) sb.append(cnt);
                cnt = 1;
            }
        }

     
        sb.append(temp[temp.length - 1]);
        if (cnt > 1) sb.append(cnt);

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        // Return the length of compressed string
         System.out.println(sb.length());
    }
    
}
