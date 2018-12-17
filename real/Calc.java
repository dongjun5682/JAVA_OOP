package real;

public class Calc {
	public String plus(String[] calc){
		String res = "";
		int a = Integer.parseInt(calc[0]);
		String op = calc[1];
		int b = Integer.parseInt(calc[2]);
		res =a+op+b+"="+(a+b);
		return res;
	}
	public String minus(String[] calc){
		String res = "";
		int a = Integer.parseInt(calc[0]);
		String op = calc[1];
		int b = Integer.parseInt(calc[2]);
		res =a+op+b+"="+(a-b);
		return res;
	}
	public String multi(String[] calc){
		String res ="";
		int a = Integer.parseInt(calc[0]);
		String op = calc[1];
		int b = Integer.parseInt(calc[2]);
		res =a+op+b+"="+(a*b);
		return res;
	}
	public String divid(String[] calc){
		String res = "";
		int a = Integer.parseInt(calc[0]);
		String op = calc[1];
		int b = Integer.parseInt(calc[2]);
		res =a+op+b+"="+(a/b);
		return res;
	}
	public String percent(String[] calc){
		String res = "";
		int a = Integer.parseInt(calc[0]);
		String op = calc[1];
		int b = Integer.parseInt(calc[2]);
		res =a+op+b+"="+(a%b);
		return res;
	}
	public String gugudan(String[] dan){
		String res = "";
		for (int i = 0; i < dan.length; i++) {

		}
		return res;
	}
}
