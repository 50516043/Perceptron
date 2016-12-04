/*�����l0.35,0.2�ł�
 * OR���Z�ł́A135�񂮂炢�Ŏ������邪
 * AND���Z�ɂ���Ǝ������Ȃ������`�����s�\
 * �����l0.8,0.6�ɂ����AND���Z�Ŏ�������悤�ɂȂ����B
 * */

package perceptron;

public class Perceptron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nu[] = {0.8, 0.6};
		Perceptron_lib plib = new Perceptron_lib(2, nu, 0.01, 0.5);


	//�w�K�f�[�^
		double input[][] = { {1,1}, {1,0}, {0,1}, {0,0}};
		double output[] = {1, 0, 0, 0};
		//�w�K
		int index;
		for(int i = 0; i < 200; i++){
			index = (int)(Math.random()*4);  //0~3�̗�������
			plib.getParameter(input[index], output[index]);
			System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
			
		}
		//���ʊm�F
		for(int i = 0; i < output.length; i++){
			if(plib.getOutput(input[i]) == output[i])
			System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
			else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		}
		System.out.println("Check : nu = "+nu[0]+", "+nu[1]);

		
	}

}