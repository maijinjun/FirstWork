import java.util.Scanner;

public class Fulijisuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double N=1;
		Scanner scanner=new Scanner(System.in);
		System.out.print("��Ҫ���㱾���밴3����0:");
		int num=scanner.nextInt();
		if(num==3){
			double money;
			float year=30;
			float total=3000000;
			double a=0.3;
			for(int j=1;j<=year;j++){
				N=(1+a)*N;
			}
			money=total/N;
			System.out.println("��Ҫ����"+money);
		}
		System.out.print("��ѡ��������(1)or��������(2):");
		int choose=scanner.nextInt();
		
		System.out.print("�����뱾��");
		double P=scanner.nextInt();
		System.out.print("���������ʣ�");
		double i=scanner.nextFloat();
		System.out.print("����ʱ�䣺");
		double n=scanner.nextFloat();
		
		if(choose==1){
			fuli(N, P, i, n);
		}
		else if(choose==2){
			danli(P, i);
		}
	    
	}

	private static void danli(double P, double i) {
		double G;       
        G=P+P*i;
        System.out.print("������ֵΪ��"+G);
	}

	private static void fuli(double N, double P, double i, double n) {
		for(int j=1;j<=n;j++){
			
			N=(1+i)*N;
		}
	    double F;
		F=P*N;
		System.out.print("������ֵΪ��"+F);
	}


}
