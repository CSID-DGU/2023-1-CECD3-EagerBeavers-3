public class Main{  public static void main(String[] args) throws IOException {
    // use ((((((( sc ............... for input

   
    int n=sc.nextInt();

    int arr[]=new int[n];

    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    int swap=0;

    for(int i=0;i<n;i++){
      for(int j=0;j<i;j++){
        if(arr[i]<arr[j]){
           swap++; 
        }
      }
    }

    swap%=2;


    int m=sc.nextInt();

    for(int i=0;i<m;i++){

      int a=sc.nextInt(),b=sc.nextInt();
      swap+=((b-a)*((b-a)+1))/2;

      swap%=2;

      if(swap%2==0){System.out.println("even");}
      else{System.out.println("odd");}
    }


          
  }
}