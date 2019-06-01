public class GarbageValueExample {
    public static void main(String[] args){
        byte var1 = 125;
        int var2 = 125;
        for(int i=0;i<5;i++){
            var1++;
            var2++;
            // byte 변수는 127을 넘어선순간 최솟값인 -128부터 다시 저장
            System.out.print("var1 : " + var1 + '\t');
            System.out.println("var2 : " + var2);
        }
    }
}