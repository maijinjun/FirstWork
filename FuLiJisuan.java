import java.util.Scanner;

public class FuLiJisuan {
 @SuppressWarnings("resource")
static void main(String[] args) {
		// TODO �Զ����ɵķ������
		float F,P = 0,i=0,N=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����뱾��"+P);
		scanner.nextFloat();
		System.out.println("���������ʣ�"+i);
		scanner.nextFloat();
		System.out.println("���������ʻ�ȡʱ�����������"+N);
		scanner.nextFloat();
		for(int j=0;j<N;j++){
			N=(1+i)*N;
		}
		F=P*N;
		System.out.print("������ֵΪ��"+F);
			

	}

}
