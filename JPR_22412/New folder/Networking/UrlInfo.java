import java.net.*; 
import java.util.*;   
public class UrlInfo{    
public static void main(String[] args){    
Scanner sc= new Scanner(System.in); 
System.out.print("Enter a URL: ");
String URL= sc.nextLine();

try{ 
URL url=new URL(URL);
String u=url.getHost();      
InetAddress ip=InetAddress.getByName(u);

System.out.println("IP Address: "+ip.getHostAddress());
System.out.println("Protocol: "+url.getProtocol());    
System.out.println("Host Name: "+url.getHost());    
System.out.println("Port Number: "+url.getPort());    
System.out.println("Default Port Number: "+url.getDefaultPort());    
System.out.println("Query String: "+url.getQuery());    
System.out.println("Path: "+url.getPath());    
System.out.println("File: "+url.getFile());    
  
}catch(Exception e){System.out.println(e);}    


}    
}   