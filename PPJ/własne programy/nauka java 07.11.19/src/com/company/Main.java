package com.company;

public class Main {
    public static void main(String[] args){
/*
	int[] tab={3,2,1,4,5};

		System.out.println(tab[0]);
		tab[0]=6;
		System.out.println(tab[0]);

		//tab[1]=tab[3]=tab[1]; //beeeeeee
		{
			int tmp = tab[1];
			tab[1]=tab[3];
			tab[3]=tmp;
		}

		int[] arr = new int[5];
		int arrCount=0;
		for(int i=0; i<3;i++){
			arr[i]=(int)(Math.random()*10);
			arrCount++;
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();

		for(int i=arrCount;i> 2;i--){
			arr[i]=arr[i-1];
		}
		arrCount++;
		arr[2]=2;

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();

		{
			int[] arrTmp = new int[arr.length*2];
			for(int i=0;i<arr.length;i++){
				arrTmp[i] = arr[i];
			}
			arr = arrTmp;

			for(int i=0;i<arrTmp.length;i++){
                System.out.print(arrTmp[i]+",");
            }
            System.out.println();
		}
*/
//===================================================

        int[] tab2=new int [10];

        for(int i=0;i<tab2.length;i++){
            tab2[i]=(int)(Math.random()*10);
        }
        for(int i=0;i<tab2.length;i++){
            System.out.print(tab2[i]+"," );
        }
        System.out.println();

        int maxIndex=0;
        for(int i=1;i<tab2.length;i++){
            if(tab2[maxIndex]<tab2[i])
                maxIndex=i;
        }
        System.out.println(maxIndex+" "+tab2[maxIndex]);

        for(int j=0;j<tab2.length;j++){
            int minIndex=j;
            for(int i=j+1;i<tab2.length;i++){
                if(tab2[minIndex]>tab2[i])
                	minIndex=i;

        //for(int j=0;j<tab2.length;j++){
        //	int minIndex=j;
        //	for(int i=j+1;i<tab2.length;i++){
      //  		if(tab2[minIndex]>tab2[i]) minIndex=i;
	//		}
		}

            }
            System.out.println(minIndex+" "+tab2[minIndex]);

            int tmp = tab2[j];
            tab2[j] = tab2[minIndex];
            tab2[minIndex]=tmp;
        }

        for(int i=0;i<tab2.length;i++){
            System.out.print(tab2[i]+",");
        }
        System.out.println();

//===========================================================
/*
    int[] tab3=new int[5];

	System.out.println("Bubble sort");
	for(int i=0;i<tab3.length;i++){
		tab3[i]=(int)(Math.random()*5);
	}
	for(int i=0;i<tab3.length;i++){
		System.out.print(tab3[i]+"," );
	}
	System.out.println();

		for(int i=0;i<tab3.length;i++){
			for(int j=0;j<tab3.length-i-1;j++){
				if(tab3[j]>tab3[j+1]){
					int tmp = tab3[j];
					tab3[j]=tab3[j+1];
					tab3[j+1]=tmp;
				}
			}
		}
		System.out.println("Bubble sort");
		for(int i=0;i<tab3.length;i++){
			System.out.print(tab3[i]+",");
		}
		System.out.println();
*/
    }
}