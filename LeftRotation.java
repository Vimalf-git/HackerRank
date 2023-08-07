
/*Traditional way to solve*/
 Scanner sc=new Scanner(System.in);
        String[] d=sc.nextLine().split(" ");                
        String[] arr=sc.nextLine().split(" ");
        int len=Integer.parseInt(d[0]);
        int rot=Integer.parseInt(d[1]);
        //System.out.println(len+" "+rot);

        //String[] result=new String[len];
        for(int i=1;i<=rot;i++){
            String temp=arr[0];
            for(int j=0;j<len-1;j++){
                
                arr[j]=arr[j+1];
            }
            arr[len-1]=temp;
        }
        
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

/* Using effective algorithm*/

