public class test4 {
    public static void main(String[] args) {
        String [] st = {"pass2026","java","Admin123"};
        int cnt =0;
        for (String word : st){
            System.out.println("비밀번호는:"+word);
            System.out.println("비밀번호 길이는:"+word.length());
            if (word.length()>=6){
                System.out.println("길이 조건 통과");
                cnt ++;
            }
            else {
                System.out.println("길이 조건 미통과");
            }
            System.out.println(word.toUpperCase());
            System.out.println(word.toLowerCase());
            System.out.println(word.charAt(0));
        };
        System.out.println(cnt);
    }

}
