class dfactor {
    public static void main(String args[]) {
        int arr[]=new int[100];
        int count=0;
        int variable = 24;
        for(int i=1; i<=24; i++) {
            if(variable%i==0) 
                arr[count++]=i;
        }
        
        for(int j=0; j<count; j++) {
            int key=arr[j];
            for(int k=j+1; k<count; k++) {
                if(arr[k]==(2*key))
                    System.out.print("("+key+","+arr[k]+") ");
            }
        }
    }
}
