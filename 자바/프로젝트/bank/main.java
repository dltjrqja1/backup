import java.util.*;

class Account{
    String name;
    final int ACCOUNT_NUMBER;
    int password;
    static int num = 1000;

    {
        ACCOUNT_NUMBER = num;
        num++;
    }

    void set_name(String name){ this.name = name; }
    void set_password(int password){ this.password = password; }
    String get_name(){ return this.name; }
    int get_account(){ return this.ACCOUNT_NUMBER; }
}

public class main{
    static Account[] accounts = new Account[100];
    static int num1 = 0;

    static void Make_Account(){
        Account tmp_account = new Account();
        System.out.print("이름을 입력하세요: ");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        tmp_account.set_name(name);
        //계좌 이름 정하기
        System.out.print("비밀번호를 입력하세요: ");
        Scanner sc2 = new Scanner(System.in);
        String ps_string = sc2.nextLine();
        int password = Integer.parseInt(ps_string);
        tmp_account.set_password(password);
        //계좌 비밀번호 정하기
        accounts[num1] = tmp_account;
        num1++;
    }

    static void View_Accounts(){
        int num = 0;
        while(accounts[num]!=null){
            System.out.println("num: "+num+"\t"+"계좌 번호: "+accounts[num].get_account()+"\t"+"이름: "+accounts[num].get_name());
            num++;
        }
    }

    public static void main(String[] args){
        out_loop:
        while(true){
            System.out.println("1.계좌 생성\t2.계좌 삭제\t3.송금\t4.입금\t5.출금\t6.계좌 목록 보기\t7.종료");
            System.out.print("input: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            switch(num){
                case 1:
                    Make_Account();//계좌 생성
                    System.out.println("계좌가 생성되었습니다.");
                    break;
                case 2:
                    //Delete_Account();//계좌 삭제
                    break;
                case 3:
                    //Remittance();//송금
                    break;
                case 4:
                    //Deposit();//입금
                    break;
                case 5:
                    //Withdraw();//출금
                    break;
                case 6:
                    View_Accounts();//모든 계좌 보기
                default:
                    break out_loop;//종료
            }
        }
    }
}
