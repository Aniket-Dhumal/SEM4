import java.util.*;
class AuthenticationException extends Exception
{
    public AuthenticationException(String message)

    {
        super(message);
    }
}
public class AuthenticationExDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String pwd;
        try
        {
            System.out.println("Enter Password ::");
            pwd = sc.nextLine();
            if(!pwd.equals("123"))
                throw new AuthenticationException("Incorrect password\nType correct password");
            else
                System.out.println("Welcome User !!!");
        }
        catch (AuthenticationException a)
        {
            System.out.println(a);
        }
	}
}