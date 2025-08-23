class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n=1716 , count=0;
        while(n>0){
            int ld;
            ld=n%10;
            if(ld%2!=0){
                count++;
            }
            if(n==ld){
                System.out.println(ld);
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
