class Main {
  public static void main(String[] args) {
    for (int i=0; i<200; i++){
      if (i%5==0){
        System.out.println("Zahl " + i + " is durch 5 teilbar!");
      }

      if (i%10==9){
        System.out.println("Zahl " + i +" endet auf 9!");
      }

      if ((i+(i+1))%3==0){
        System.out.println((i+1) + " und " + (i) + " addiert ergeben" + (i+i+1) + "und ERGEBNIS ist durch 3 teilbar");
      }
    }
  }
}