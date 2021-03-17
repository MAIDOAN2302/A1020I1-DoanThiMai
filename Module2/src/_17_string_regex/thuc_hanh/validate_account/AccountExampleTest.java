package _17_string_regex.thuc_hanh.validate_account;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] valiAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invaliAccount = new String[] { ".@", "12345", "1234_", "abcde" };


    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : valiAccount){
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account: invaliAccount){
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
