class characters {
    public static void main(String args[]) {
        String str="hheeero";
        int max[]=new int[26];
        int count=0;
        int len=str.length();
        for(int i=0; i<len; i++) {
            char ch=str.charAt(i);
            max[ch-'a']++;            
        }
        for(int i=0;i<26;i++) {
            if(max[i]==0)
                continue;
            else {
                int j=97+i;
                System.out.println((char)j+" = "+max[i]);
            }
        }
        int largest=0;
        for(int i=0; i<26;i++) {
                if(max[i]>largest)
                    largest=max[i];
            }
        System.out.println(largest);
        int secondLargest =0;
        char secondLargestChar='\0';
        for(int i=0; i<26;i++) {
                if(max[i]==largest)
                    continue;
                else
                    if(max[i]>secondLargest) {
                        secondLargest=max[i];
                        int j=97+i;
                        secondLargestChar=(char)j;
                    }
            }s
        System.out.println(secondLargestChar+"="+secondLargest);
}
}