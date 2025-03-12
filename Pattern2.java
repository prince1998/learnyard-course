class Pattern2{
    public static void main(String args[]){
        int space = 0;
        for (int i = 1; i <= 5;i++){
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=5;j++){
                System.out.print("*");
            }
            space+=1;
            System.out.println();
        }
    }
}